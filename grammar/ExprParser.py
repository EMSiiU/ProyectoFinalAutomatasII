# Generated from ./grammar/Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,93,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,0,
        7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,
        8,5,0,0,1,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'private'", "'protected'", 
                     "'static'", "'final'", "'abstract'", "'synchronized'", 
                     "'volatile'", "'transient'", "'native'", "'strictfp'", 
                     "'void'", "'class'", "'System'", "'out'", "'println'", 
                     "'default'", "'this'", "'String'", "'byte'", "'short'", 
                     "'int'", "'long'", "'float'", "'double'", "'char'", 
                     "'boolean'", "'if'", "'else'", "'switch'", "'case'", 
                     "'for'", "'while'", "'do'", "'break'", "'continue'", 
                     "'return'", "'else if'", "'true'", "'false'", "'null'", 
                     "'interface'", "'extends'", "'implements'", "'new'", 
                     "'super'", "'instanceof'", "'enum'", "'try'", "'catch'", 
                     "'finally'", "'throw'", "'throws'", "'package'", "'import'", 
                     "'assert'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", 
                     "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", 
                     "'=='", "'!='", "'++'", "'--'", "'?'", "'('", "')'", 
                     "'['", "']'", "'{'", "'}'", "';'", "'.'", "','", "':'", 
                     "'@'" ]

    symbolicNames = [ "<INVALID>", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", 
                      "FINAL", "ABSTRACT", "SYNCHRONIZED", "VOLATILE", "TRANSIENT", 
                      "NATIVE", "STRICTFP", "VOID", "CLASS", "SYSTEM", "OUT", 
                      "PRINTLN", "DEFAULT", "THIS", "STRING", "BYTE", "SHORT", 
                      "INT", "LONG", "FLOAT", "DOUBLE", "CHAR", "BOOLEAN", 
                      "IF", "ELSE", "SWITCH", "CASE", "FOR", "WHILE", "DO", 
                      "BREAK", "CONTINUE", "RETURN", "ELSE_IF", "TRUE", 
                      "FALSE", "NULL", "INTERFACE", "EXTENDS", "IMPLEMENTS", 
                      "NEW", "SUPER", "INSTANCEOF", "ENUM", "TRY", "CATCH", 
                      "FINALLY", "THROW", "THROWS", "PACKAGE", "IMPORT", 
                      "ASSERT", "IDT", "ENTERO", "DECIMAL", "CADENA", "ASIGNACION", 
                      "MAS", "MENOS", "POR", "ENTRE", "MODULO", "AND", "OR", 
                      "NOT", "MAYOR", "MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", 
                      "IGUAL", "DIFERENTE", "INCREMENTO", "DECREMENTO", 
                      "TERNARIO", "PAR_1", "PAR_2", "COR_1", "COR_2", "LLA_1", 
                      "LLA_2", "PUNTO_COMA", "PUNTO", "COMA", "DOS_PUNTOS", 
                      "ARROBA", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
                      "WS", "ERROR_TOKEN" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PUBLIC=1
    PRIVATE=2
    PROTECTED=3
    STATIC=4
    FINAL=5
    ABSTRACT=6
    SYNCHRONIZED=7
    VOLATILE=8
    TRANSIENT=9
    NATIVE=10
    STRICTFP=11
    VOID=12
    CLASS=13
    SYSTEM=14
    OUT=15
    PRINTLN=16
    DEFAULT=17
    THIS=18
    STRING=19
    BYTE=20
    SHORT=21
    INT=22
    LONG=23
    FLOAT=24
    DOUBLE=25
    CHAR=26
    BOOLEAN=27
    IF=28
    ELSE=29
    SWITCH=30
    CASE=31
    FOR=32
    WHILE=33
    DO=34
    BREAK=35
    CONTINUE=36
    RETURN=37
    ELSE_IF=38
    TRUE=39
    FALSE=40
    NULL=41
    INTERFACE=42
    EXTENDS=43
    IMPLEMENTS=44
    NEW=45
    SUPER=46
    INSTANCEOF=47
    ENUM=48
    TRY=49
    CATCH=50
    FINALLY=51
    THROW=52
    THROWS=53
    PACKAGE=54
    IMPORT=55
    ASSERT=56
    IDT=57
    ENTERO=58
    DECIMAL=59
    CADENA=60
    ASIGNACION=61
    MAS=62
    MENOS=63
    POR=64
    ENTRE=65
    MODULO=66
    AND=67
    OR=68
    NOT=69
    MAYOR=70
    MAYOR_IGUAL=71
    MENOR=72
    MENOR_IGUAL=73
    IGUAL=74
    DIFERENTE=75
    INCREMENTO=76
    DECREMENTO=77
    TERNARIO=78
    PAR_1=79
    PAR_2=80
    COR_1=81
    COR_2=82
    LLA_1=83
    LLA_2=84
    PUNTO_COMA=85
    PUNTO=86
    COMA=87
    DOS_PUNTOS=88
    ARROBA=89
    COMENTARIO_LINEA=90
    COMENTARIO_BLOQUE=91
    WS=92
    ERROR_TOKEN=93

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





