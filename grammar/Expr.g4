grammar Expr;

//  FASE SINTÁCTICA
programa: tipoDecl+ EOF;

tipoDecl: claseDecl| interfaceDecl;

claseDecl: modificador* CLASS IDT(EXTENDS IDT)?(IMPLEMENTS IDT (COMA IDT)*)?LLA_1 miembroClase* LLA_2;

interfaceDecl: modificador* INTERFACE IDT(EXTENDS IDT (COMA IDT)*)?LLA_1 miembroInterfaz* LLA_2;

miembroInterfaz: tipo IDT PAR_1 listaParametros? PAR_2 PUNTO_COMA
    | modificador* tipo declaradorVariable PUNTO_COMA;

miembroClase: atributoDecl| constructorDecl| metodoDecl| claseDecl;

modificador: PUBLIC | PRIVATE | PROTECTED| STATIC | FINAL | ABSTRACT| SYNCHRONIZED | VOLATILE | TRANSIENT | NATIVE | STRICTFP;

tipo: (BYTE|SHORT|INT|LONG|FLOAT|DOUBLE|CHAR|BOOLEAN|STRING|IDT) (COR_1 COR_2)*;

atributoDecl: modificador* tipo declaradorVariable (COMA declaradorVariable)* PUNTO_COMA;

declaradorVariable: IDT (ASIGNACION expr)?;

constructorDecl: modificador* IDT PAR_1 listaParametros? PAR_2 bloque;

metodoDecl: modificador* (tipo | VOID) IDT PAR_1 listaParametros? PAR_2 (THROWS IDT (COMA IDT)*)?(bloque | PUNTO_COMA);

listaParametros: parametro (COMA parametro)*;

parametro: tipo IDT;

bloque: LLA_1 sentencia* LLA_2;

sentencia: bloque
    | declaracionVariable   
    | sentenciaIf
    | sentenciaFor
    | sentenciaWhile
    | sentenciaDoWhile
    | sentenciaTry
    | sentenciaReturn
    | BREAK PUNTO_COMA
    | CONTINUE PUNTO_COMA
    | THROW expr PUNTO_COMA
    | sentenciaExpr
    | PUNTO_COMA;

declaracionVariable: tipo declaradorVariable (COMA declaradorVariable)* PUNTO_COMA;

sentenciaIf: IF PAR_1 expr PAR_2 sentencia (ELSE sentencia)?;

sentenciaFor: FOR PAR_1 forInit? PUNTO_COMA expr? PUNTO_COMA expr? PAR_2 sentencia;

forInit: declaracionVariable| expr (COMA expr)*;

sentenciaWhile: WHILE PAR_1 expr PAR_2 sentencia;

sentenciaDoWhile: DO sentencia WHILE PAR_1 expr PAR_2 PUNTO_COMA;

sentenciaTry: TRY bloque catchClause* (FINALLY bloque)?;

catchClause: CATCH PAR_1 tipo IDT PAR_2 bloque;

sentenciaReturn: RETURN expr? PUNTO_COMA;

sentenciaExpr: expr PUNTO_COMA;

expr: 
    SYSTEM PUNTO OUT PUNTO PRINTLN PAR_1 expr? PAR_2      # Println
    | expr PUNTO IDT PAR_1 listaArgs? PAR_2               # LlamadaMetodo  
    | expr PUNTO IDT                                      # AccesoAtributo  
    | NEW IDT PAR_1 listaArgs? PAR_2                      # InstanciacionObjeto 
    | expr COR_1 expr COR_2                               # AccesoArreglo 
    | expr (INCREMENTO | DECREMENTO)                      # IncrementoDecremento  
    | (INCREMENTO | DECREMENTO) expr                      # PreIncrementoPreDecremento  
    | (MAS | MENOS | NOT) expr                            # OperadoresUnarios
    | expr (POR | ENTRE | MODULO) expr                    # MulDivMod  
    | expr (MAS | MENOS) expr                             # SumaResta  
    | expr (MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL) expr # Relacionales
    | expr (IGUAL | DIFERENTE) expr                         # Igualdad 
    | expr AND expr                                         # And 
    | expr OR expr                                          # Or 
    | expr TERNARIO expr DOS_PUNTOS expr                    # Ternario 
    | <assoc=right> expr ASIGNACION expr                    # Asignacion  
    | PAR_1 expr PAR_2                                      # Parentesis 
    | THIS                                                  # This  
    | SUPER                                                 # Super  
    | IDT PAR_1 listaArgs? PAR_2                            # LlamadaMetodoSinObjeto 
    | IDT                                                   # AccesoAtributoSinObjeto  
    | literal                                               # ExprLiteral
    ;

listaArgs: expr (COMA expr)*;

literal: ENTERO| DECIMAL| CADENA| (TRUE | FALSE)| NULL;



// FASE LEXICA
/* PALABRAS RESERVADAS */
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';

STATIC: 'static';
FINAL: 'final';
ABSTRACT: 'abstract';
SYNCHRONIZED: 'synchronized';
VOLATILE: 'volatile';
TRANSIENT: 'transient';
NATIVE : 'native';
STRICTFP: 'strictfp';

VOID: 'void';
CLASS: 'class';
SYSTEM: 'System';
OUT: 'out';
PRINTLN: 'println';
DEFAULT: 'default';
THIS: 'this';

//tipos de datos
STRING: 'String';
BYTE: 'byte';
SHORT: 'short';
INT: 'int';
LONG: 'long';
FLOAT: 'float';
DOUBLE: 'double';
CHAR: 'char';
BOOLEAN: 'boolean';

//CONTROL DE FLUJO
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
FOR: 'for';
WHILE: 'while';
DO: 'do';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
ELSE_IF: 'else if';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

INTERFACE: 'interface';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
NEW: 'new';
SUPER: 'super';
INSTANCEOF: 'instanceof';
ENUM: 'enum';

TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
THROW: 'throw';
THROWS: 'throws';

PACKAGE: 'package';
IMPORT: 'import';

ASSERT: 'assert';

//IDENTIFICADORES, LITERALES
IDT: [a-zA-Z_$] [a-zA-Z0-9_$]*;
ENTERO: [0-9]+;
DECIMAL: [0-9]+ '.' [0-9]+;
CARACTER: '\'' ~['\r\n] '\'' ;
CADENA: '"' ~["\r\n]* '"';

//OPERADORES MATEMATICOS
ASIGNACION: '=';
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
MODULO: '%';

//OPERADORES LOGICOS
AND: '&&';
OR: '||';
NOT: '!';

//OPERADORES RELACIONALES
MAYOR: '>';
MAYOR_IGUAL: '>=';
MENOR: '<';
MENOR_IGUAL: '<=';
IGUAL: '==';
DIFERENTE: '!=';

INCREMENTO: '++';
DECREMENTO: '--';

TERNARIO: '?';

// DELIMITADORES
PAR_1: '(';
PAR_2: ')';
COR_1: '[';
COR_2: ']';
LLA_1: '{';
LLA_2: '}';

PUNTO_COMA: ';';
PUNTO: '.';
COMA: ',';
DOS_PUNTOS: ':';

//ARROBA: '@';

COMENTARIO_LINEA: '//' ~[\r\n]* -> skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;

WS: [ \t\r\n]+ -> skip;
