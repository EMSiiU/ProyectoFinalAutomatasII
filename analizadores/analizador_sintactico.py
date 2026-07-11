import os
import sys
from pathlib import Path

ROOT_DIR = Path(__file__).resolve().parents[1]
if str(ROOT_DIR) not in sys.path:
    sys.path.insert(0, str(ROOT_DIR))

from antlr4 import CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener

from grammar.ExprLexer import ExprLexer
from grammar.ExprParser import ExprParser


# Clase para guardar errores sintacticos
class ErroresSintacticos(ErrorListener):

    def __init__(self):
        self.lista = []

    # Metodo que ANTLR ejecuta cuando encuentra un error sintactico
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg,
            "token_ofensivo": offendingSymbol.text if offendingSymbol else None
        })


class AnalizadorSintactico:

    def __init__(self):
        self.parser = None
        self.arbol = None
        self.errores = ErroresSintacticos()

    # Recibe el flujo de tokens ya generado por el AnalizadorLexico
    def analizar(self, tokens):
        self.parser = ExprParser(tokens)

        # Quitamos el manejo de errores por defecto (que solo imprime en consola)
        self.parser.removeErrorListeners()
        self.parser.addErrorListener(self.errores)

        # 'programa' es la regla inicial definida en el .g4
        self.arbol = self.parser.programa()

    def obtener_errores(self):
        return self.errores.lista

    def obtener_arbol_texto(self):
        if self.arbol is None:
            return ""
        return self.arbol.toStringTree(recog=self.parser)