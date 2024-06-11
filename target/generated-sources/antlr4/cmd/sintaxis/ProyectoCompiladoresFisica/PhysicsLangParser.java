// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;

	import java.util.Map;//para usarlos en members
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PhysicsLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MRU=1, FUNCION=2, VARIABLE=3, MOSTRAR=4, FOR=5, ENTERO_DECL=6, SUMA=7, 
		MENOS=8, MULTIPLICACION=9, DIVICION=10, POTENCIA=11, AND=12, OR=13, NOT=14, 
		GT=15, LT=16, GEQ=17, LEQ=18, EQ=19, NEQ=20, ASIGNAR=21, LLAVE_OPEN=22, 
		LLAVE_CLOSE=23, PAR_OPEN=24, PAR_CLOSE=25, FIN=26, ID=27, ENTERO=28, WS=29;
	public static final int
		RULE_funcion = 0, RULE_sentence = 1, RULE_variable_declativa = 2, RULE_variable_asignacion = 3, 
		RULE_mostrar = 4, RULE_exprecion = 5, RULE_jerarOPE = 6, RULE_termino = 7;
	public static final String[] ruleNames = {
		"funcion", "sentence", "variable_declativa", "variable_asignacion", "mostrar", 
		"exprecion", "jerarOPE", "termino"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mru'", "'funcion'", "'variable'", "'mostrar'", "'for'", "'entero'", 
		"'+'", "'-'", "'*'", "'/'", "'^'", "'&&'", "'||'", "'!'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MRU", "FUNCION", "VARIABLE", "MOSTRAR", "FOR", "ENTERO_DECL", "SUMA", 
		"MENOS", "MULTIPLICACION", "DIVICION", "POTENCIA", "AND", "OR", "NOT", 
		"GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASIGNAR", "LLAVE_OPEN", "LLAVE_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "FIN", "ID", "ENTERO", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PhysicsLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	//atributos 
		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public PhysicsLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(PhysicsLangParser.FUNCION, 0); }
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode LLAVE_OPEN() { return getToken(PhysicsLangParser.LLAVE_OPEN, 0); }
		public TerminalNode LLAVE_CLOSE() { return getToken(PhysicsLangParser.LLAVE_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(FUNCION);
			setState(17);
			match(ID);
			setState(18);
			match(LLAVE_OPEN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << ID))) != 0)) {
				{
				{
				setState(19);
				sentence();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(LLAVE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				variable_asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				mostrar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declativaContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public TerminalNode VARIABLE() { return getToken(PhysicsLangParser.VARIABLE, 0); }
		public TerminalNode ENTERO_DECL() { return getToken(PhysicsLangParser.ENTERO_DECL, 0); }
		public Variable_declativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterVariable_declativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitVariable_declativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitVariable_declativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declativaContext variable_declativa() throws RecognitionException {
		Variable_declativaContext _localctx = new Variable_declativaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==ENTERO_DECL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(33);
			((Variable_declativaContext)_localctx).ID = match(ID);
			setState(34);
			match(FIN);
			symbolTable.put((((Variable_declativaContext)_localctx).ID!=null?((Variable_declativaContext)_localctx).ID.getText():null),0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_asignacionContext extends ParserRuleContext {
		public Token ID;
		public ExprecionContext exprecion;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(PhysicsLangParser.ASIGNAR, 0); }
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Variable_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterVariable_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitVariable_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitVariable_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_asignacionContext variable_asignacion() throws RecognitionException {
		Variable_asignacionContext _localctx = new Variable_asignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((Variable_asignacionContext)_localctx).ID = match(ID);
			setState(38);
			match(ASIGNAR);
			setState(39);
			((Variable_asignacionContext)_localctx).exprecion = exprecion();
			setState(40);
			match(FIN);
			symbolTable.put((((Variable_asignacionContext)_localctx).ID!=null?((Variable_asignacionContext)_localctx).ID.getText():null),((Variable_asignacionContext)_localctx).exprecion.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MostrarContext extends ParserRuleContext {
		public ExprecionContext exprecion;
		public TerminalNode MOSTRAR() { return getToken(PhysicsLangParser.MOSTRAR, 0); }
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(MOSTRAR);
			setState(44);
			((MostrarContext)_localctx).exprecion = exprecion();
			setState(45);
			match(FIN);
			System.out.println(((MostrarContext)_localctx).exprecion.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprecionContext extends ParserRuleContext {
		public Object value;
		public JerarOPEContext t1;
		public JerarOPEContext t2;
		public List<JerarOPEContext> jerarOPE() {
			return getRuleContexts(JerarOPEContext.class);
		}
		public JerarOPEContext jerarOPE(int i) {
			return getRuleContext(JerarOPEContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(PhysicsLangParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(PhysicsLangParser.SUMA, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(PhysicsLangParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(PhysicsLangParser.MENOS, i);
		}
		public ExprecionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprecion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterExprecion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitExprecion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitExprecion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprecionContext exprecion() throws RecognitionException {
		ExprecionContext _localctx = new ExprecionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprecion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((ExprecionContext)_localctx).t1 = jerarOPE();
			((ExprecionContext)_localctx).value = (int)((ExprecionContext)_localctx).t1.value;
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==MENOS) {
				{
				setState(58);
				switch (_input.LA(1)) {
				case SUMA:
					{
					setState(50);
					match(SUMA);
					setState(51);
					((ExprecionContext)_localctx).t2 = jerarOPE();
					((ExprecionContext)_localctx).value = (int)_localctx.value +(int)((ExprecionContext)_localctx).t2.value;
					}
					break;
				case MENOS:
					{
					setState(54);
					match(MENOS);
					setState(55);
					((ExprecionContext)_localctx).t2 = jerarOPE();
					((ExprecionContext)_localctx).value = (int)_localctx.value -(int)((ExprecionContext)_localctx).t2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JerarOPEContext extends ParserRuleContext {
		public Object value;
		public TerminoContext t1;
		public TerminoContext t2;
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> MULTIPLICACION() { return getTokens(PhysicsLangParser.MULTIPLICACION); }
		public TerminalNode MULTIPLICACION(int i) {
			return getToken(PhysicsLangParser.MULTIPLICACION, i);
		}
		public List<TerminalNode> DIVICION() { return getTokens(PhysicsLangParser.DIVICION); }
		public TerminalNode DIVICION(int i) {
			return getToken(PhysicsLangParser.DIVICION, i);
		}
		public List<TerminalNode> POTENCIA() { return getTokens(PhysicsLangParser.POTENCIA); }
		public TerminalNode POTENCIA(int i) {
			return getToken(PhysicsLangParser.POTENCIA, i);
		}
		public JerarOPEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jerarOPE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterJerarOPE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitJerarOPE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitJerarOPE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JerarOPEContext jerarOPE() throws RecognitionException {
		JerarOPEContext _localctx = new JerarOPEContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jerarOPE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((JerarOPEContext)_localctx).t1 = termino();
			((JerarOPEContext)_localctx).value = (int)((JerarOPEContext)_localctx).t1.value;
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVICION) | (1L << POTENCIA))) != 0)) {
				{
				setState(77);
				switch (_input.LA(1)) {
				case MULTIPLICACION:
					{
					setState(65);
					match(MULTIPLICACION);
					setState(66);
					((JerarOPEContext)_localctx).t2 = termino();
					((JerarOPEContext)_localctx).value = (int)_localctx.value *(int)((JerarOPEContext)_localctx).t2.value;
					}
					break;
				case DIVICION:
					{
					setState(69);
					match(DIVICION);
					setState(70);
					((JerarOPEContext)_localctx).t2 = termino();
					((JerarOPEContext)_localctx).value = (int)_localctx.value /(int)((JerarOPEContext)_localctx).t2.value;
					}
					break;
				case POTENCIA:
					{
					setState(73);
					match(POTENCIA);
					setState(74);
					((JerarOPEContext)_localctx).t2 = termino();
					((JerarOPEContext)_localctx).value = (int)Math.pow((int)_localctx.value, (int)((JerarOPEContext)_localctx).t2.value);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminoContext extends ParserRuleContext {
		public Object value;
		public Token ENTERO;
		public Token ID;
		public ExprecionContext exprecion;
		public TerminalNode ENTERO() { return getToken(PhysicsLangParser.ENTERO, 0); }
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhysicsLangVisitor ) return ((PhysicsLangVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termino);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((TerminoContext)_localctx).ENTERO = match(ENTERO);
				((TerminoContext)_localctx).value =  Integer.parseInt((((TerminoContext)_localctx).ENTERO!=null?((TerminoContext)_localctx).ENTERO.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((TerminoContext)_localctx).ID = match(ID);
				((TerminoContext)_localctx).value =  symbolTable.get((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(PAR_OPEN);
				setState(87);
				((TerminoContext)_localctx).exprecion = exprecion();
				((TerminoContext)_localctx).value =  ((TerminoContext)_localctx).exprecion.value;
				setState(89);
				match(PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\4\2\5\5\b"+
		"\ba\2\22\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b\'\3\2\2\2\n-\3\2\2\2\f\62\3"+
		"\2\2\2\16A\3\2\2\2\20]\3\2\2\2\22\23\7\4\2\2\23\24\7\35\2\2\24\30\7\30"+
		"\2\2\25\27\5\4\3\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2"+
		"\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\31\2\2\34\3\3\2\2\2\35!\5\6\4"+
		"\2\36!\5\b\5\2\37!\5\n\6\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2!\5\3\2"+
		"\2\2\"#\t\2\2\2#$\7\35\2\2$%\7\34\2\2%&\b\4\1\2&\7\3\2\2\2\'(\7\35\2\2"+
		"()\7\27\2\2)*\5\f\7\2*+\7\34\2\2+,\b\5\1\2,\t\3\2\2\2-.\7\6\2\2./\5\f"+
		"\7\2/\60\7\34\2\2\60\61\b\6\1\2\61\13\3\2\2\2\62\63\5\16\b\2\63>\b\7\1"+
		"\2\64\65\7\t\2\2\65\66\5\16\b\2\66\67\b\7\1\2\67=\3\2\2\289\7\n\2\29:"+
		"\5\16\b\2:;\b\7\1\2;=\3\2\2\2<\64\3\2\2\2<8\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\r\3\2\2\2@>\3\2\2\2AB\5\20\t\2BQ\b\b\1\2CD\7\13\2\2DE\5"+
		"\20\t\2EF\b\b\1\2FP\3\2\2\2GH\7\f\2\2HI\5\20\t\2IJ\b\b\1\2JP\3\2\2\2K"+
		"L\7\r\2\2LM\5\20\t\2MN\b\b\1\2NP\3\2\2\2OC\3\2\2\2OG\3\2\2\2OK\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2SQ\3\2\2\2TU\7\36\2\2U^\b\t"+
		"\1\2VW\7\35\2\2W^\b\t\1\2XY\7\32\2\2YZ\5\f\7\2Z[\b\t\1\2[\\\7\33\2\2\\"+
		"^\3\2\2\2]T\3\2\2\2]V\3\2\2\2]X\3\2\2\2^\21\3\2\2\2\t\30 <>OQ]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}