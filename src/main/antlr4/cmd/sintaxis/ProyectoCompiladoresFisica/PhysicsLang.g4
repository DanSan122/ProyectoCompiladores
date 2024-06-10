grammar PhysicsLang;

start
:
	'hello' 'world'
;
prog:   stat+ ;

stat:   'crear' 'variable' ID ('es' expr)? ';'          # CrearVariable
    |   ID '=' expr ';'                                # Asignacion
    |   'mostrar' ID ';'                               # MostrarVariable
    ;

expr:   expr ('*'|'/') expr       # Multiplicacion
    |   expr ('+'|'-') expr       # Suma
    |   INT                       # Int
    |   ID                        # Id
    ;

ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;