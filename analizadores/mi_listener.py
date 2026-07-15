from grammar.ExprListener import ExprListener
from grammar.ExprParser import ExprParser

class MiListener(ExprListener):
    def __init__(self):
        self.resultados = []          # trazas (opcional, para depurar)
        self.errores = []             # errores semánticos reales
        self.tabla_simbolos = {}      # nombre -> tipo declarado

    # --- DECLARACIONES: registran variables en la tabla de símbolos ---

    def exitDeclaradorVariable(self, ctx: ExprParser.DeclaradorVariableContext):
        # declaradorVariable: IDT (ASIGNACION expr)?
        # Cubre tanto atributos de clase como variables locales
        nombre = ctx.IDT().getText()
        # El tipo real viene del padre (atributoDecl o declaracionVariable),
        # aquí lo dejamos genérico; si quieres el tipo exacto hay que subir
        # al ctx.parentCtx y leer su regla `tipo`.
        if nombre in self.tabla_simbolos:
            self.errores.append({
                "linea": ctx.start.line,
                "mensaje": f"Variable '{nombre}' ya fue declarada",
                "codigo": ctx.getText()
            })
        else:
            self.tabla_simbolos[nombre] = True
        self.resultados.append(ctx.getText())

    def exitParametro(self, ctx: ExprParser.ParametroContext):
        # parametro: tipo IDT
        nombre = ctx.IDT().getText()
        self.tabla_simbolos[nombre] = True

    # --- USO DE VARIABLES: valida contra la tabla de símbolos ---

    def exitAccesoAtributoSinObjeto(self, ctx: ExprParser.AccesoAtributoSinObjetoContext):
        nombre = ctx.IDT().getText()
        if nombre not in self.tabla_simbolos:
            self.errores.append({
                "linea": ctx.start.line,
                "mensaje": f"Variable '{nombre}' usada sin declarar",
                "codigo": ctx.getText()
            })

    # --- ASIGNACIÓN: valida que el lado izquierdo exista ---

    def exitAsignacion(self, ctx: ExprParser.AsignacionContext):
        # expr ASIGNACION expr  ->  ctx.expr(0) es el lado izquierdo
        lado_izq = ctx.expr(0)
        nombre = lado_izq.getText()
        if nombre not in self.tabla_simbolos:
            self.errores.append({
                "linea": ctx.start.line,
                "mensaje": f"Asignación a variable '{nombre}' no declarada",
                "codigo": ctx.getText()
            })
        self.resultados.append(ctx.getText())

    # --- COMPARACIÓN: solo para trazas/depuración por ahora ---

    def exitComparacion(self, ctx: ExprParser.ComparacionContext):
        self.resultados.append(ctx.getText())