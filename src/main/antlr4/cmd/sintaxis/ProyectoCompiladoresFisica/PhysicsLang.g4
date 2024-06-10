grammar PhysicsLang;

@parser::header {
	import java.util.Map;//para usarlos en members
	import java.util.HashMap;
}

@parser::members {//atributos 
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

funcion: FUNCION ID LLAVE_OPEN 
		sentence*
		LLAVE_CLOSE;
sentence: variable_declativa | variable_asignacion | mostrar;
variable_declativa: VARIABLE ID FIN
					{symbolTable.put($ID.text,0);};
variable_asignacion: ID ASIGNAR exprecion FIN
					{symbolTable.put($ID.text,$exprecion.value);};
mostrar: MOSTRAR exprecion FIN
		{System.out.println($exprecion.value);};
/*mru: MRU ID BRACKET_OPEN
	 sentenceMRU*
	 BRACKET_CLOSE;
//sentenceMRU : ;*/
exprecion returns [Object value]: 
		t1=jerarOPE {$value =(int)$t1.value;}
		(SUMA t2=jerarOPE{$value=(int)$value +(int)$t2.value;}
		| MENOS t2=jerarOPE{$value=(int)$value -(int)$t2.value;}
		)*;
jerarOPE returns [Object value]: t1=termino {$value =(int)$t1.value;}
		(MULTIPLICACION t2=termino{$value=(int)$value *(int)$t2.value;}
		|DIVICION t2=termino{$value=(int)$value /(int)$t2.value;}
		| POTENCIA t2=termino{$value=(int)Math.pow((int)$value, (int)$t2.value);})*
		;		
termino returns [Object value]: 
		ENTERO {$value= Integer.parseInt($ENTERO.text); }//lexema(instancia token)para almacenar el tipo de variable
		| ID{$value= symbolTable.get($ID.text);}
		| PAR_OPEN exprecion {$value = $exprecion.value;} PAR_CLOSE
		;

FOR: 'for';
MRU: 'mru'; 
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
LLAVE_OPEN: '{';
LLAVE_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

FIN: ';';

ID  :   [a-zA-Z_][a-zA-Z0-9_]* ;
ENTERO :   [0-9]+ ;
WS  : [ \t\r\n]+ -> skip;

