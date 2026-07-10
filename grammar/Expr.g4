grammar Expr;

root: expr EOF ;
expr: EOF;    

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

ARROBA: '@';

COMENTARIO_LINEA: '//' ~[\r\n]* -> skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;

WS: [ \t\r\n]+ -> skip;

ERROR_TOKEN: . ;