grammar PhysicsLang;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}

@parser::members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

funcion: FUNCION ID LLAVE_OPEN 
        sentence*
        LLAVE_CLOSE
        | MRU ID LLAVE_OPEN 
        mru_sentence*
        LLAVE_CLOSE
        | MRUV ID LLAVE_OPEN 
        mruv_sentence*
        LLAVE_CLOSE
        | CAIDA_LIBRE ID LLAVE_OPEN 
        caida_libre_sentence*
        LLAVE_CLOSE
        | SEGUNDA_LEY_NEWTON ID LLAVE_OPEN 
        segunda_ley_newton_sentence*
        LLAVE_CLOSE
        | DENSIDAD ID LLAVE_OPEN 
        densidad_sentence*
        LLAVE_CLOSE
        | LEY_OHM ID LLAVE_OPEN 
        ley_ohm_sentence*
        LLAVE_CLOSE;

sentence: variable_declativa | variable_asignacion | mostrar ;

variable_declativa: (VARIABLE | ENTERO_DECL | DOUBLE_DECL) ID FIN
                    {
                        if ($VARIABLE != null || $ENTERO_DECL != null) {
                            symbolTable.put($ID.text, 0);
                        } else {
                            symbolTable.put($ID.text, 0.0);
                        }
                    };

variable_asignacion: ID ASIGNAR exprecion FIN
                    {symbolTable.put($ID.text, $exprecion.value);};

mostrar: MOSTRAR exprecion FIN
        {System.out.println($exprecion.value);};

mru_sentence: variable_declativa | variable_asignacion | calcular_mru | mostrar ;

calcular_mru: MRU_CALC PAR_OPEN param1=exprecion COMA param2=exprecion COMA param3=ID PAR_CLOSE FIN
    {
        String param3Name = $param3.text;
        if (param3Name.equals("distancia")) {
            int dist = (int)$param1.value * (int)$param2.value;
            symbolTable.put(param3Name, dist);
            System.out.println("Distancia = " + dist);
        } else if (param3Name.equals("velocidad")) {
            int velocidad = (int)$param1.value / (int)$param2.value;
            symbolTable.put(param3Name, velocidad);
            System.out.println("Velocidad = " + velocidad);
        } else if (param3Name.equals("tiempo")) {
            int tiempo = (int)$param1.value / (int)$param2.value;
            symbolTable.put(param3Name, tiempo);
            System.out.println("Tiempo = " + tiempo);
        } else {
            System.err.println("Error: Parámetro desconocido " + param3Name);
        }
    };

mruv_sentence: variable_declativa | variable_asignacion | calcular_mruv | mostrar ;

calcular_mruv: MRUV_CALC PAR_OPEN param1=exprecion COMA param2=exprecion COMA param3=ID PAR_CLOSE FIN
    {
        String param3Name = $param3.text;
        if (param3Name.equals("distancia")) {
            int dist = (int)$param1.value * (int)$param2.value + (int)(0.5 * (int)$param1.value * Math.pow((int)$param2.value, 2));
            symbolTable.put(param3Name, dist);
            System.out.println("Distancia = " + dist);
        } else {
            System.err.println("Error: Parámetro desconocido " + param3Name);
        }
    };

caida_libre_sentence: variable_declativa | variable_asignacion | calcular_caida_libre | mostrar ;

calcular_caida_libre: CAIDA_LIBRE_CALC PAR_OPEN param1=exprecion COMA param2=ID PAR_CLOSE FIN
    {
        String param2Name = $param2.text;
        if (param2Name.equals("altura")) {
            double g = 9.8;
            double altura = 0.5 * g * Math.pow((int)$param1.value, 2);
            symbolTable.put(param2Name, altura);
            System.out.println("Altura = " + altura);
        } else {
            System.err.println("Error: Parámetro desconocido " + param2Name);
        }
    };

segunda_ley_newton_sentence: variable_declativa | variable_asignacion | calcular_segunda_ley_newton | mostrar ;

calcular_segunda_ley_newton: SEGUNDA_LEY_NEWTON_CALC PAR_OPEN param1=exprecion COMA param2=exprecion COMA param3=ID PAR_CLOSE FIN
    {
        String param3Name = $param3.text;
        if (param3Name.equals("fuerza")) {
            int fuerza = (int)$param1.value * (int)$param2.value;
            symbolTable.put(param3Name, fuerza);
            System.out.println("Fuerza = " + fuerza);
        } else {
            System.err.println("Error: Parámetro desconocido " + param3Name);
        }
    };

densidad_sentence: variable_declativa | variable_asignacion | calcular_densidad | mostrar ;

calcular_densidad: DENSIDAD_CALC PAR_OPEN param1=exprecion COMA param2=exprecion COMA param3=ID PAR_CLOSE FIN
    {
        String param3Name = $param3.text;
        if (param3Name.equals("densidad1")) {
            double densidad = ((Number)$param1.value).doubleValue() / ((Number)$param2.value).doubleValue();
            symbolTable.put(param3Name, densidad);
            System.out.println("Densidad = " + densidad);
        } else {
            System.err.println("Error: Parámetro desconocido " + param3Name);
        }
    };
    
ley_ohm_sentence: variable_declativa | variable_asignacion | calcular_ley_ohm | mostrar ;

calcular_ley_ohm: LEY_OHM_CALC PAR_OPEN param1=exprecion COMA param2=exprecion COMA param3=ID PAR_CLOSE FIN
    {
        String param3Name = $param3.text;
        if (param3Name.equals("resistencia")) {
            double resistencia = ((Number)$param1.value).doubleValue() / ((Number)$param2.value).doubleValue();
            symbolTable.put(param3Name, resistencia);
            System.out.println("Resistencia = " + resistencia);
        } else if (param3Name.equals("voltaje")) {
            double voltaje = ((Number)$param1.value).doubleValue() * ((Number)$param2.value).doubleValue();
            symbolTable.put(param3Name, voltaje);
            System.out.println("Voltaje = " + voltaje);
        } else if (param3Name.equals("corriente")) {
            double corriente = ((Number)$param1.value).doubleValue() / ((Number)$param2.value).doubleValue();
            symbolTable.put(param3Name, corriente);
            System.out.println("Corriente = " + corriente);
        } else {
            System.err.println("Error: Parámetro desconocido " + param3Name);
        }
    };

exprecion returns [Object value]: 
        t1=jerarOPE {$value = $t1.value;}
        (SUMA t2=jerarOPE{$value = ((Number)$value).doubleValue() + ((Number)$t2.value).doubleValue();}
        | MENOS t2=jerarOPE{$value = ((Number)$value).doubleValue() - ((Number)$t2.value).doubleValue();}
        )*;

jerarOPE returns [Object value]: t1=termino {$value = $t1.value;}
        (MULTIPLICACION t2=termino{$value = ((Number)$value).doubleValue() * ((Number)$t2.value).doubleValue();}
        | DIVICION t2=termino{$value = ((Number)$value).doubleValue() / ((Number)$t2.value).doubleValue();}
        | POTENCIA t2=termino{$value = Math.pow(((Number)$value).doubleValue(), ((Number)$t2.value).doubleValue());})*
        ;       

termino returns [Object value]: 
        ENTERO {$value= Integer.parseInt($ENTERO.text); }
        | DOUBLE {$value= Double.parseDouble($DOUBLE.text); }
        | ID{
            if (symbolTable.get($ID.text) instanceof Integer) {
                $value = (Integer)symbolTable.get($ID.text);
            } else if (symbolTable.get($ID.text) instanceof Double) {
                $value = (Double)symbolTable.get($ID.text);
            }
        }
        | PAR_OPEN exprecion {$value = $exprecion.value;} PAR_CLOSE
        ;

FUNCION : 'funcion';
MRU: 'mru'; 
MRUV: 'mruv';
CAIDA_LIBRE: 'caida_libre';
SEGUNDA_LEY_NEWTON: 'segunda_ley_newton';
DENSIDAD: 'densidad';
LEY_OHM: 'ley_ohm';

MRU_CALC: 'calcular_mru';
MRUV_CALC: 'calcular_mruv';
CAIDA_LIBRE_CALC: 'calcular_caida_libre';
SEGUNDA_LEY_NEWTON_CALC: 'calcular_segunda_ley_newton';
DENSIDAD_CALC: 'calcular_densidad';
LEY_OHM_CALC: 'calcular_ley_ohm';

VARIABLE : 'variable';
MOSTRAR: 'mostrar';

ENTERO_DECL : 'entero';
DOUBLE_DECL : 'double';

SUMA: '+';
MENOS: '-';
MULTIPLICACION: '*';
DIVICION: '/';
POTENCIA: '^';

ASIGNAR: '=';
LLAVE_OPEN: '{';
LLAVE_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';
COMA: ',';
FIN: ';';

ID  :   [a-zA-Z_][a-zA-Z0-9_]* ;
ENTERO :   [0-9]+ ;
DOUBLE :   [0-9]+'.'[0-9]+ ;
WS  : [ \t\r\n]+ -> skip;

