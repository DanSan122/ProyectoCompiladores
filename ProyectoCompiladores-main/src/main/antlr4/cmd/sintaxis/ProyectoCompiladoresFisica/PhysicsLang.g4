grammar PhysicsLang;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}

@parser::members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

funcion: FUNCION ID LLAVE_OPEN sentence* LLAVE_CLOSE;
sentence: variable_declativa | variable_asignacion | mostrar | calcular_mru;
variable_declativa: (VARIABLE | ENTERO_DECL) ID FIN
    {symbolTable.put($ID.text, 0);};
variable_asignacion: ID ASIGNAR exprecion FIN
    {symbolTable.put($ID.text, (int)$exprecion.value);};
mostrar: MOSTRAR exprecion FIN
    {System.out.println((int)$exprecion.value);};

exprecion returns [int value]: 
    t1=jerarOPE {$value = (int)$t1.value;}
    (SUMA t2=jerarOPE {$value = $value + (int)$t2.value;}
     | MENOS t2=jerarOPE {$value = $value - (int)$t2.value;}
     )*;

jerarOPE returns [int value]: 
    t1=termino {$value = (int)$t1.value;}
    (MULTIPLICACION t2=termino {$value = $value * (int)$t2.value;}
     | DIVICION t2=termino {$value = $value / (int)$t2.value;}
     | POTENCIA t2=termino {$value = (int)Math.pow($value, (int)$t2.value);}
     )*
     ;        
termino returns [int value]: 
    ENTERO {$value = Integer.parseInt($ENTERO.text);}
    | ID {$value = (int)symbolTable.get($ID.text);}
    | PAR_OPEN exprecion {$value = $exprecion.value;} PAR_CLOSE
    ;

calcular_mru: 
    // Calcular la distancia
    MRU ID ASIGNAR DISTANCIA PAR_OPEN velocidad=exprecion COMA tiempo=exprecion PAR_CLOSE FIN
    {
        int dist = (int)$velocidad * (int)$tiempo;
        symbolTable.put($ID.text, dist);
        symbolTable.put($ID.text + "_velocidad", (int)$velocidad);
        symbolTable.put($ID.text + "_tiempo", (int)$tiempo);
    }
    
    
 // Calcular la velocidad
    | MRU ID ASIGNAR VELOCIDAD PAR_OPEN distancia=exprecion COMA tiempo=exprecion PAR_CLOSE FIN
    {
        int vel = (int)$distancia / (int)$tiempo;
        
        symbolTable.put($ID.text, vel);
        
        symbolTable.put($ID.text + "_distancia", (int)$distancia);
        symbolTable.put($ID.text + "_tiempo", (int)$tiempo);
    } ;

MRU: 'mru'; 
FUNCION : 'funcion';
VARIABLE : 'variable';
MOSTRAR: 'mostrar';
//distancia, velocidad y tiempo
DISTANCIA: 'distancia';
VELOCIDAD: 'velocidad';
TIEMPO: 'tiempo';

FOR: 'for';

COMA : ',';
ENTERO_DECL : 'entero';

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
LLAVE_OPEN: '{';
LLAVE_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

FIN: ';';

ID  :   [a-zA-Z_][a-zA-Z0-9_]* ;
ENTERO :   [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;