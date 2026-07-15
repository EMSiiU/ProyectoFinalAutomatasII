import streamlit as st
from validadores.archivo import Archivo
from analizadores.analizador_lexico import AnalizadorLexico
from analizadores.analizador_sintactico import AnalizadorSintactico
from analizadores.analizador_semantico import AnalizadorSemantico


class App:

    def __init__(self):
        st.set_page_config(page_title="Poyecto", layout="wide")
        self.analizador_lexico = AnalizadorLexico()
        self.analizador_sintactico = AnalizadorSintactico()
        self.analizador_semantico = AnalizadorSemantico()

    def ejecutar(self):
        st.title("Proyecto Lenguajes y Automatas II")
        st.write("Analizador Lexico y Sintactico con ANTLR y Streamlit")
        st.write("Sube un archivo `.java` para ver tokens, errores lexicos y sintacticos.")

        archivo_subido = st.file_uploader("Selecciona tu archivo", type=["java"])

        if archivo_subido is None:
            st.info("Primero sube un archivo .java")
            return

        archivo = Archivo(archivo_subido)

        if not archivo.es_java():
            st.error("El archivo debe ser .java")
            return

        codigo = archivo.leer()
        info = archivo.obtener_info()

        st.subheader("Informacion del archivo")
        st.write("Nombre:", info["nombre"])
        st.write("Extension:", info["extension"])

        st.subheader("Codigo original")
        st.code(codigo, language="text")

        # ---------- Fase lexica ----------
        self.analizador_lexico.analizar(codigo)

        tokens = self.analizador_lexico.obtener_tokens()
        errores_lexicos = self.analizador_lexico.obtener_errores()

        st.subheader("Tokens")

        if len(tokens) == 0:
            st.warning("No se encontraron tokens")
        else:
            st.dataframe(tokens, use_container_width=True)

        st.subheader("Errores lexicos")

        if len(errores_lexicos) == 0:
            st.success("No hay errores lexicos")
        else:
            st.dataframe(errores_lexicos, use_container_width=True)

        # Fase sintactica
        if len(errores_lexicos) > 0:
            st.info("Se omite el analisis sintactico porque hay errores lexicos.")
            return

        st.subheader("Analisis sintactico")


        self.analizador_sintactico.analizar(self.analizador_lexico.tokens)
        errores_sintacticos = self.analizador_sintactico.obtener_errores()

        if len(errores_sintacticos) == 0:
            st.success("No hay errores sintacticos")
            with st.expander("Ver arbol sintactico"):
                st.text(self.analizador_sintactico.obtener_arbol_texto())
        else:
            st.error("Se encontraron errores sintacticos")
            st.dataframe(errores_sintacticos, use_container_width=True)

        # Fase semantica
        if len(errores_sintacticos) > 0:
            st.info("Se omite el analisis semantico porque hay errores sintacticos.")
            return

        st.subheader("Analisis semantico")
        resultados_semanticos = self.analizador_semantico.analizar(codigo)

        if len(resultados_semanticos) == 0:
            st.success("No hay errores semanticos")
        else:
            st.error("Se encontraron errores semanticos")
            st.dataframe(resultados_semanticos, use_container_width=True)

        


if __name__ == "__main__":
    app = App()
    app.ejecutar()