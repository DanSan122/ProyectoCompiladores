grammar PhysicsLang;

start: 'hello' 'world';
FUNCION : 'funcion';
VARIABLE : 'variable';
MOSTRAR: 'mostrar';

SUMA: '+';
MENOS: '-';
MULTIPLICACION: '*';
DIVICION: '/';
POTENCIA: '^';

AND : '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASIGNAR: '=';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

ID  :   [a-zA-Z_][a-zA-Z0-9_]* ;
INT :   [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;