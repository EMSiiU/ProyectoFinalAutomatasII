from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker, Token
from grammar.ExprLexer import ExprLexer
from grammar.ExprParser import ExprParser
from analizadores.mi_listener import MiListener

class ErroresSemanticos:
    def __init__(self):
        self.lista = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg,
            "token_ofensivo": offendingSymbol.text if offendingSymbol else None
        })

class AnalizadorSemantico:
    def __init__(self):
        self.lexer = None
        self.tokens = None
        self.parser = None
        self.arbol = None
        self.listener = None
        self.errores = ErroresSemanticos()

    def analizar(self, codigo: str):
        # Convertimos el codigo en una entrada para ANTLR
        entrada = InputStream(codigo)

        # Creamos el lexer y el flujo de tokens
        self.lexer = ExprLexer(entrada)

        # Quitamos los errores normales de ANTLR
        self.lexer.removeErrorListeners() 

        self.lexer.addErrorListener(ErroresSemanticos())

        self.tokens = CommonTokenStream(self.lexer)

        # Creamos el parser y el arbol de parseo
        self.parser = ExprParser(self.tokens)
        self.arbol = self.parser.programa()
        # Creamos el listener y caminamos el arbol
        self.listener = MiListener()          # reinicia el listener en cada análisis
        walker = ParseTreeWalker()
        # Caminamos el arbol con el listener para capturar errores semanticos
        walker.walk(self.listener, self.arbol)

        return self.listener.errores

    def obtener_tokens(self):

        # Creamos una lista vacia
        resultado = []

        # Recorremos todos los tokens
        for token in self.tokens.tokens:

            # Saltamos EOF porque es el fin del archivo
            if token.type == Token.EOF:

                # Continuamos con el siguiente token
                continue

            # Obtenemos el nombre del token
            nombre_token = self.lexer.symbolicNames[token.type]

            # Agregamos el token a la lista
            resultado.append({
                "lexema": token.text,
                "token": nombre_token,
                "tipo": token.type,
                "linea": token.line,
                "columna": token.column
            })

            return resultado
    
    def obtener_errores(self):

        # Retornamos la lista de errores
        return self.errores.lista