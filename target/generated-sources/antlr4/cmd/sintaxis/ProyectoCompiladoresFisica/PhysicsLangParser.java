// Generated from PhysicsLang.g4 by ANTLR 4.4
package cmd.sintaxis.ProyectoCompiladoresFisica;

    import java.util.Map;
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCION=1, MRU=2, MRUV=3, CAIDA_LIBRE=4, SEGUNDA_LEY_NEWTON=5, DENSIDAD=6, 
		LEY_OHM=7, MRU_CALC=8, MRUV_CALC=9, CAIDA_LIBRE_CALC=10, SEGUNDA_LEY_NEWTON_CALC=11, 
		DENSIDAD_CALC=12, LEY_OHM_CALC=13, VARIABLE=14, MOSTRAR=15, ENTERO_DECL=16, 
		DOUBLE_DECL=17, SUMA=18, MENOS=19, MULTIPLICACION=20, DIVICION=21, POTENCIA=22, 
		ASIGNAR=23, LLAVE_OPEN=24, LLAVE_CLOSE=25, PAR_OPEN=26, PAR_CLOSE=27, 
		COMA=28, FIN=29, ID=30, ENTERO=31, DOUBLE=32, WS=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'funcion'", "'mru'", "'mruv'", "'caida_libre'", "'segunda_ley_newton'", 
		"'densidad'", "'ley_ohm'", "'calcular_mru'", "'calcular_mruv'", "'calcular_caida_libre'", 
		"'calcular_segunda_ley_newton'", "'calcular_densidad'", "'calcular_ley_ohm'", 
		"'variable'", "'mostrar'", "'entero'", "'double'", "'+'", "'-'", "'*'", 
		"'/'", "'^'", "'='", "'{'", "'}'", "'('", "')'", "','", "';'", "ID", "ENTERO", 
		"DOUBLE", "WS"
	};
	public static final int
		RULE_funcion = 0, RULE_sentence = 1, RULE_variable_declativa = 2, RULE_variable_asignacion = 3, 
		RULE_mostrar = 4, RULE_mru_sentence = 5, RULE_calcular_mru = 6, RULE_mruv_sentence = 7, 
		RULE_calcular_mruv = 8, RULE_caida_libre_sentence = 9, RULE_calcular_caida_libre = 10, 
		RULE_segunda_ley_newton_sentence = 11, RULE_calcular_segunda_ley_newton = 12, 
		RULE_densidad_sentence = 13, RULE_calcular_densidad = 14, RULE_ley_ohm_sentence = 15, 
		RULE_calcular_ley_ohm = 16, RULE_exprecion = 17, RULE_jerarOPE = 18, RULE_termino = 19;
	public static final String[] ruleNames = {
		"funcion", "sentence", "variable_declativa", "variable_asignacion", "mostrar", 
		"mru_sentence", "calcular_mru", "mruv_sentence", "calcular_mruv", "caida_libre_sentence", 
		"calcular_caida_libre", "segunda_ley_newton_sentence", "calcular_segunda_ley_newton", 
		"densidad_sentence", "calcular_densidad", "ley_ohm_sentence", "calcular_ley_ohm", 
		"exprecion", "jerarOPE", "termino"
	};

	@Override
	public String getGrammarFileName() { return "PhysicsLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Object> symbolTable = new HashMap<String, Object>();

	public PhysicsLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FuncionContext extends ParserRuleContext {
		public List<Mruv_sentenceContext> mruv_sentence() {
			return getRuleContexts(Mruv_sentenceContext.class);
		}
		public TerminalNode LEY_OHM() { return getToken(PhysicsLangParser.LEY_OHM, 0); }
		public List<Ley_ohm_sentenceContext> ley_ohm_sentence() {
			return getRuleContexts(Ley_ohm_sentenceContext.class);
		}
		public Densidad_sentenceContext densidad_sentence(int i) {
			return getRuleContext(Densidad_sentenceContext.class,i);
		}
		public List<Segunda_ley_newton_sentenceContext> segunda_ley_newton_sentence() {
			return getRuleContexts(Segunda_ley_newton_sentenceContext.class);
		}
		public Segunda_ley_newton_sentenceContext segunda_ley_newton_sentence(int i) {
			return getRuleContext(Segunda_ley_newton_sentenceContext.class,i);
		}
		public Ley_ohm_sentenceContext ley_ohm_sentence(int i) {
			return getRuleContext(Ley_ohm_sentenceContext.class,i);
		}
		public TerminalNode LLAVE_CLOSE() { return getToken(PhysicsLangParser.LLAVE_CLOSE, 0); }
		public List<Densidad_sentenceContext> densidad_sentence() {
			return getRuleContexts(Densidad_sentenceContext.class);
		}
		public TerminalNode MRUV() { return getToken(PhysicsLangParser.MRUV, 0); }
		public List<Caida_libre_sentenceContext> caida_libre_sentence() {
			return getRuleContexts(Caida_libre_sentenceContext.class);
		}
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public Mruv_sentenceContext mruv_sentence(int i) {
			return getRuleContext(Mruv_sentenceContext.class,i);
		}
		public TerminalNode SEGUNDA_LEY_NEWTON() { return getToken(PhysicsLangParser.SEGUNDA_LEY_NEWTON, 0); }
		public Mru_sentenceContext mru_sentence(int i) {
			return getRuleContext(Mru_sentenceContext.class,i);
		}
		public Caida_libre_sentenceContext caida_libre_sentence(int i) {
			return getRuleContext(Caida_libre_sentenceContext.class,i);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode MRU() { return getToken(PhysicsLangParser.MRU, 0); }
		public TerminalNode FUNCION() { return getToken(PhysicsLangParser.FUNCION, 0); }
		public List<Mru_sentenceContext> mru_sentence() {
			return getRuleContexts(Mru_sentenceContext.class);
		}
		public TerminalNode DENSIDAD() { return getToken(PhysicsLangParser.DENSIDAD, 0); }
		public TerminalNode LLAVE_OPEN() { return getToken(PhysicsLangParser.LLAVE_OPEN, 0); }
		public TerminalNode CAIDA_LIBRE() { return getToken(PhysicsLangParser.CAIDA_LIBRE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
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
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_funcion);
		int _la;
		try {
			setState(110);
			switch (_input.LA(1)) {
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match(FUNCION);
				setState(41); match(ID);
				setState(42); match(LLAVE_OPEN);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(43); sentence();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49); match(LLAVE_CLOSE);
				}
				break;
			case MRU:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(MRU);
				setState(51); match(ID);
				setState(52); match(LLAVE_OPEN);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MRU_CALC) | (1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(53); mru_sentence();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59); match(LLAVE_CLOSE);
				}
				break;
			case MRUV:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); match(MRUV);
				setState(61); match(ID);
				setState(62); match(LLAVE_OPEN);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MRUV_CALC) | (1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(63); mruv_sentence();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69); match(LLAVE_CLOSE);
				}
				break;
			case CAIDA_LIBRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); match(CAIDA_LIBRE);
				setState(71); match(ID);
				setState(72); match(LLAVE_OPEN);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAIDA_LIBRE_CALC) | (1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(73); caida_libre_sentence();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79); match(LLAVE_CLOSE);
				}
				break;
			case SEGUNDA_LEY_NEWTON:
				enterOuterAlt(_localctx, 5);
				{
				setState(80); match(SEGUNDA_LEY_NEWTON);
				setState(81); match(ID);
				setState(82); match(LLAVE_OPEN);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEGUNDA_LEY_NEWTON_CALC) | (1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(83); segunda_ley_newton_sentence();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89); match(LLAVE_CLOSE);
				}
				break;
			case DENSIDAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(90); match(DENSIDAD);
				setState(91); match(ID);
				setState(92); match(LLAVE_OPEN);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DENSIDAD_CALC) | (1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(93); densidad_sentence();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99); match(LLAVE_CLOSE);
				}
				break;
			case LEY_OHM:
				enterOuterAlt(_localctx, 7);
				{
				setState(100); match(LEY_OHM);
				setState(101); match(ID);
				setState(102); match(LLAVE_OPEN);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEY_OHM_CALC) | (1L << VARIABLE) | (1L << MOSTRAR) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL) | (1L << ID))) != 0)) {
					{
					{
					setState(103); ley_ohm_sentence();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109); match(LLAVE_CLOSE);
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

	public static class SentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
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
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); variable_asignacion();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(114); mostrar();
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
		public Token VARIABLE;
		public Token ENTERO_DECL;
		public Token ID;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode DOUBLE_DECL() { return getToken(PhysicsLangParser.DOUBLE_DECL, 0); }
		public TerminalNode VARIABLE() { return getToken(PhysicsLangParser.VARIABLE, 0); }
		public TerminalNode ENTERO_DECL() { return getToken(PhysicsLangParser.ENTERO_DECL, 0); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
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
	}

	public final Variable_declativaContext variable_declativa() throws RecognitionException {
		Variable_declativaContext _localctx = new Variable_declativaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << ENTERO_DECL) | (1L << DOUBLE_DECL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(118); ((Variable_declativaContext)_localctx).ID = match(ID);
			setState(119); match(FIN);

			                        if (((Variable_declativaContext)_localctx).VARIABLE != null || ((Variable_declativaContext)_localctx).ENTERO_DECL != null) {
			                            symbolTable.put((((Variable_declativaContext)_localctx).ID!=null?((Variable_declativaContext)_localctx).ID.getText():null), 0);
			                        } else {
			                            symbolTable.put((((Variable_declativaContext)_localctx).ID!=null?((Variable_declativaContext)_localctx).ID.getText():null), 0.0);
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

	public static class Variable_asignacionContext extends ParserRuleContext {
		public Token ID;
		public ExprecionContext exprecion;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode ASIGNAR() { return getToken(PhysicsLangParser.ASIGNAR, 0); }
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
	}

	public final Variable_asignacionContext variable_asignacion() throws RecognitionException {
		Variable_asignacionContext _localctx = new Variable_asignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); ((Variable_asignacionContext)_localctx).ID = match(ID);
			setState(123); match(ASIGNAR);
			setState(124); ((Variable_asignacionContext)_localctx).exprecion = exprecion();
			setState(125); match(FIN);
			symbolTable.put((((Variable_asignacionContext)_localctx).ID!=null?((Variable_asignacionContext)_localctx).ID.getText():null), ((Variable_asignacionContext)_localctx).exprecion.value);
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
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode MOSTRAR() { return getToken(PhysicsLangParser.MOSTRAR, 0); }
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
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(MOSTRAR);
			setState(129); ((MostrarContext)_localctx).exprecion = exprecion();
			setState(130); match(FIN);
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

	public static class Mru_sentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Calcular_mruContext calcular_mru() {
			return getRuleContext(Calcular_mruContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Mru_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mru_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterMru_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitMru_sentence(this);
		}
	}

	public final Mru_sentenceContext mru_sentence() throws RecognitionException {
		Mru_sentenceContext _localctx = new Mru_sentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mru_sentence);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); variable_asignacion();
				}
				break;
			case MRU_CALC:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); calcular_mru();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); mostrar();
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

	public static class Calcular_mruContext extends ParserRuleContext {
		public ExprecionContext param1;
		public ExprecionContext param2;
		public Token param3;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public ExprecionContext exprecion(int i) {
			return getRuleContext(ExprecionContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(PhysicsLangParser.COMA, i);
		}
		public List<ExprecionContext> exprecion() {
			return getRuleContexts(ExprecionContext.class);
		}
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public TerminalNode MRU_CALC() { return getToken(PhysicsLangParser.MRU_CALC, 0); }
		public List<TerminalNode> COMA() { return getTokens(PhysicsLangParser.COMA); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Calcular_mruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular_mru; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCalcular_mru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCalcular_mru(this);
		}
	}

	public final Calcular_mruContext calcular_mru() throws RecognitionException {
		Calcular_mruContext _localctx = new Calcular_mruContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_calcular_mru);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(MRU_CALC);
			setState(140); match(PAR_OPEN);
			setState(141); ((Calcular_mruContext)_localctx).param1 = exprecion();
			setState(142); match(COMA);
			setState(143); ((Calcular_mruContext)_localctx).param2 = exprecion();
			setState(144); match(COMA);
			setState(145); ((Calcular_mruContext)_localctx).param3 = match(ID);
			setState(146); match(PAR_CLOSE);
			setState(147); match(FIN);

			        String param3Name = (((Calcular_mruContext)_localctx).param3!=null?((Calcular_mruContext)_localctx).param3.getText():null);
			        if (param3Name.equals("distancia")) {
			            int dist = (int)((Calcular_mruContext)_localctx).param1.value * (int)((Calcular_mruContext)_localctx).param2.value;
			            symbolTable.put(param3Name, dist);
			            System.out.println("Distancia = " + dist);
			        } else if (param3Name.equals("velocidad")) {
			            int velocidad = (int)((Calcular_mruContext)_localctx).param1.value / (int)((Calcular_mruContext)_localctx).param2.value;
			            symbolTable.put(param3Name, velocidad);
			            System.out.println("Velocidad = " + velocidad);
			        } else if (param3Name.equals("tiempo")) {
			            int tiempo = (int)((Calcular_mruContext)_localctx).param1.value / (int)((Calcular_mruContext)_localctx).param2.value;
			            symbolTable.put(param3Name, tiempo);
			            System.out.println("Tiempo = " + tiempo);
			        } else {
			            System.err.println("Error: Parámetro desconocido " + param3Name);
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

	public static class Mruv_sentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Calcular_mruvContext calcular_mruv() {
			return getRuleContext(Calcular_mruvContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Mruv_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mruv_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterMruv_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitMruv_sentence(this);
		}
	}

	public final Mruv_sentenceContext mruv_sentence() throws RecognitionException {
		Mruv_sentenceContext _localctx = new Mruv_sentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mruv_sentence);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); variable_asignacion();
				}
				break;
			case MRUV_CALC:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); calcular_mruv();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(153); mostrar();
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

	public static class Calcular_mruvContext extends ParserRuleContext {
		public ExprecionContext param1;
		public ExprecionContext param2;
		public Token param3;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public TerminalNode MRUV_CALC() { return getToken(PhysicsLangParser.MRUV_CALC, 0); }
		public ExprecionContext exprecion(int i) {
			return getRuleContext(ExprecionContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(PhysicsLangParser.COMA, i);
		}
		public List<ExprecionContext> exprecion() {
			return getRuleContexts(ExprecionContext.class);
		}
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public List<TerminalNode> COMA() { return getTokens(PhysicsLangParser.COMA); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Calcular_mruvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular_mruv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCalcular_mruv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCalcular_mruv(this);
		}
	}

	public final Calcular_mruvContext calcular_mruv() throws RecognitionException {
		Calcular_mruvContext _localctx = new Calcular_mruvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_calcular_mruv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(MRUV_CALC);
			setState(157); match(PAR_OPEN);
			setState(158); ((Calcular_mruvContext)_localctx).param1 = exprecion();
			setState(159); match(COMA);
			setState(160); ((Calcular_mruvContext)_localctx).param2 = exprecion();
			setState(161); match(COMA);
			setState(162); ((Calcular_mruvContext)_localctx).param3 = match(ID);
			setState(163); match(PAR_CLOSE);
			setState(164); match(FIN);

			        String param3Name = (((Calcular_mruvContext)_localctx).param3!=null?((Calcular_mruvContext)_localctx).param3.getText():null);
			        if (param3Name.equals("distancia")) {
			            int dist = (int)((Calcular_mruvContext)_localctx).param1.value * (int)((Calcular_mruvContext)_localctx).param2.value + (int)(0.5 * (int)((Calcular_mruvContext)_localctx).param1.value * Math.pow((int)((Calcular_mruvContext)_localctx).param2.value, 2));
			            symbolTable.put(param3Name, dist);
			            System.out.println("Distancia = " + dist);
			        } else {
			            System.err.println("Error: Parámetro desconocido " + param3Name);
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

	public static class Caida_libre_sentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Calcular_caida_libreContext calcular_caida_libre() {
			return getRuleContext(Calcular_caida_libreContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Caida_libre_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caida_libre_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCaida_libre_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCaida_libre_sentence(this);
		}
	}

	public final Caida_libre_sentenceContext caida_libre_sentence() throws RecognitionException {
		Caida_libre_sentenceContext _localctx = new Caida_libre_sentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_caida_libre_sentence);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(168); variable_asignacion();
				}
				break;
			case CAIDA_LIBRE_CALC:
				enterOuterAlt(_localctx, 3);
				{
				setState(169); calcular_caida_libre();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(170); mostrar();
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

	public static class Calcular_caida_libreContext extends ParserRuleContext {
		public ExprecionContext param1;
		public Token param2;
		public TerminalNode CAIDA_LIBRE_CALC() { return getToken(PhysicsLangParser.CAIDA_LIBRE_CALC, 0); }
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public TerminalNode COMA() { return getToken(PhysicsLangParser.COMA, 0); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Calcular_caida_libreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular_caida_libre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCalcular_caida_libre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCalcular_caida_libre(this);
		}
	}

	public final Calcular_caida_libreContext calcular_caida_libre() throws RecognitionException {
		Calcular_caida_libreContext _localctx = new Calcular_caida_libreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_calcular_caida_libre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(CAIDA_LIBRE_CALC);
			setState(174); match(PAR_OPEN);
			setState(175); ((Calcular_caida_libreContext)_localctx).param1 = exprecion();
			setState(176); match(COMA);
			setState(177); ((Calcular_caida_libreContext)_localctx).param2 = match(ID);
			setState(178); match(PAR_CLOSE);
			setState(179); match(FIN);

			        String param2Name = (((Calcular_caida_libreContext)_localctx).param2!=null?((Calcular_caida_libreContext)_localctx).param2.getText():null);
			        if (param2Name.equals("altura")) {
			            double g = 9.8;
			            double altura = 0.5 * g * Math.pow((int)((Calcular_caida_libreContext)_localctx).param1.value, 2);
			            symbolTable.put(param2Name, altura);
			            System.out.println("Altura = " + altura);
			        } else {
			            System.err.println("Error: Parámetro desconocido " + param2Name);
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

	public static class Segunda_ley_newton_sentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Calcular_segunda_ley_newtonContext calcular_segunda_ley_newton() {
			return getRuleContext(Calcular_segunda_ley_newtonContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Segunda_ley_newton_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segunda_ley_newton_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterSegunda_ley_newton_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitSegunda_ley_newton_sentence(this);
		}
	}

	public final Segunda_ley_newton_sentenceContext segunda_ley_newton_sentence() throws RecognitionException {
		Segunda_ley_newton_sentenceContext _localctx = new Segunda_ley_newton_sentenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_segunda_ley_newton_sentence);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); variable_asignacion();
				}
				break;
			case SEGUNDA_LEY_NEWTON_CALC:
				enterOuterAlt(_localctx, 3);
				{
				setState(184); calcular_segunda_ley_newton();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(185); mostrar();
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

	public static class Calcular_segunda_ley_newtonContext extends ParserRuleContext {
		public ExprecionContext param1;
		public ExprecionContext param2;
		public Token param3;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public ExprecionContext exprecion(int i) {
			return getRuleContext(ExprecionContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(PhysicsLangParser.COMA, i);
		}
		public List<ExprecionContext> exprecion() {
			return getRuleContexts(ExprecionContext.class);
		}
		public TerminalNode SEGUNDA_LEY_NEWTON_CALC() { return getToken(PhysicsLangParser.SEGUNDA_LEY_NEWTON_CALC, 0); }
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public List<TerminalNode> COMA() { return getTokens(PhysicsLangParser.COMA); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Calcular_segunda_ley_newtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular_segunda_ley_newton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCalcular_segunda_ley_newton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCalcular_segunda_ley_newton(this);
		}
	}

	public final Calcular_segunda_ley_newtonContext calcular_segunda_ley_newton() throws RecognitionException {
		Calcular_segunda_ley_newtonContext _localctx = new Calcular_segunda_ley_newtonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_calcular_segunda_ley_newton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(SEGUNDA_LEY_NEWTON_CALC);
			setState(189); match(PAR_OPEN);
			setState(190); ((Calcular_segunda_ley_newtonContext)_localctx).param1 = exprecion();
			setState(191); match(COMA);
			setState(192); ((Calcular_segunda_ley_newtonContext)_localctx).param2 = exprecion();
			setState(193); match(COMA);
			setState(194); ((Calcular_segunda_ley_newtonContext)_localctx).param3 = match(ID);
			setState(195); match(PAR_CLOSE);
			setState(196); match(FIN);

			        String param3Name = (((Calcular_segunda_ley_newtonContext)_localctx).param3!=null?((Calcular_segunda_ley_newtonContext)_localctx).param3.getText():null);
			        if (param3Name.equals("fuerza")) {
			            int fuerza = (int)((Calcular_segunda_ley_newtonContext)_localctx).param1.value * (int)((Calcular_segunda_ley_newtonContext)_localctx).param2.value;
			            symbolTable.put(param3Name, fuerza);
			            System.out.println("Fuerza = " + fuerza);
			        } else {
			            System.err.println("Error: Parámetro desconocido " + param3Name);
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

	public static class Densidad_sentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Calcular_densidadContext calcular_densidad() {
			return getRuleContext(Calcular_densidadContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Densidad_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_densidad_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterDensidad_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitDensidad_sentence(this);
		}
	}

	public final Densidad_sentenceContext densidad_sentence() throws RecognitionException {
		Densidad_sentenceContext _localctx = new Densidad_sentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_densidad_sentence);
		try {
			setState(203);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); variable_asignacion();
				}
				break;
			case DENSIDAD_CALC:
				enterOuterAlt(_localctx, 3);
				{
				setState(201); calcular_densidad();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(202); mostrar();
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

	public static class Calcular_densidadContext extends ParserRuleContext {
		public ExprecionContext param1;
		public ExprecionContext param2;
		public Token param3;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public ExprecionContext exprecion(int i) {
			return getRuleContext(ExprecionContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(PhysicsLangParser.COMA, i);
		}
		public List<ExprecionContext> exprecion() {
			return getRuleContexts(ExprecionContext.class);
		}
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public TerminalNode DENSIDAD_CALC() { return getToken(PhysicsLangParser.DENSIDAD_CALC, 0); }
		public List<TerminalNode> COMA() { return getTokens(PhysicsLangParser.COMA); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Calcular_densidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular_densidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCalcular_densidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCalcular_densidad(this);
		}
	}

	public final Calcular_densidadContext calcular_densidad() throws RecognitionException {
		Calcular_densidadContext _localctx = new Calcular_densidadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_calcular_densidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(DENSIDAD_CALC);
			setState(206); match(PAR_OPEN);
			setState(207); ((Calcular_densidadContext)_localctx).param1 = exprecion();
			setState(208); match(COMA);
			setState(209); ((Calcular_densidadContext)_localctx).param2 = exprecion();
			setState(210); match(COMA);
			setState(211); ((Calcular_densidadContext)_localctx).param3 = match(ID);
			setState(212); match(PAR_CLOSE);
			setState(213); match(FIN);

			        String param3Name = (((Calcular_densidadContext)_localctx).param3!=null?((Calcular_densidadContext)_localctx).param3.getText():null);
			        if (param3Name.equals("densidad1")) {
			            double densidad = ((Number)((Calcular_densidadContext)_localctx).param1.value).doubleValue() / ((Number)((Calcular_densidadContext)_localctx).param2.value).doubleValue();
			            symbolTable.put(param3Name, densidad);
			            System.out.println("Densidad = " + densidad);
			        } else {
			            System.err.println("Error: Parámetro desconocido " + param3Name);
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

	public static class Ley_ohm_sentenceContext extends ParserRuleContext {
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Calcular_ley_ohmContext calcular_ley_ohm() {
			return getRuleContext(Calcular_ley_ohmContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public Variable_declativaContext variable_declativa() {
			return getRuleContext(Variable_declativaContext.class,0);
		}
		public Ley_ohm_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ley_ohm_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterLey_ohm_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitLey_ohm_sentence(this);
		}
	}

	public final Ley_ohm_sentenceContext ley_ohm_sentence() throws RecognitionException {
		Ley_ohm_sentenceContext _localctx = new Ley_ohm_sentenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ley_ohm_sentence);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case VARIABLE:
			case ENTERO_DECL:
			case DOUBLE_DECL:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); variable_declativa();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); variable_asignacion();
				}
				break;
			case LEY_OHM_CALC:
				enterOuterAlt(_localctx, 3);
				{
				setState(218); calcular_ley_ohm();
				}
				break;
			case MOSTRAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(219); mostrar();
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

	public static class Calcular_ley_ohmContext extends ParserRuleContext {
		public ExprecionContext param1;
		public ExprecionContext param2;
		public Token param3;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public ExprecionContext exprecion(int i) {
			return getRuleContext(ExprecionContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(PhysicsLangParser.COMA, i);
		}
		public List<ExprecionContext> exprecion() {
			return getRuleContexts(ExprecionContext.class);
		}
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public TerminalNode LEY_OHM_CALC() { return getToken(PhysicsLangParser.LEY_OHM_CALC, 0); }
		public List<TerminalNode> COMA() { return getTokens(PhysicsLangParser.COMA); }
		public TerminalNode FIN() { return getToken(PhysicsLangParser.FIN, 0); }
		public Calcular_ley_ohmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcular_ley_ohm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).enterCalcular_ley_ohm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhysicsLangListener ) ((PhysicsLangListener)listener).exitCalcular_ley_ohm(this);
		}
	}

	public final Calcular_ley_ohmContext calcular_ley_ohm() throws RecognitionException {
		Calcular_ley_ohmContext _localctx = new Calcular_ley_ohmContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_calcular_ley_ohm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(LEY_OHM_CALC);
			setState(223); match(PAR_OPEN);
			setState(224); ((Calcular_ley_ohmContext)_localctx).param1 = exprecion();
			setState(225); match(COMA);
			setState(226); ((Calcular_ley_ohmContext)_localctx).param2 = exprecion();
			setState(227); match(COMA);
			setState(228); ((Calcular_ley_ohmContext)_localctx).param3 = match(ID);
			setState(229); match(PAR_CLOSE);
			setState(230); match(FIN);

			        String param3Name = (((Calcular_ley_ohmContext)_localctx).param3!=null?((Calcular_ley_ohmContext)_localctx).param3.getText():null);
			        if (param3Name.equals("resistencia")) {
			            double resistencia = ((Number)((Calcular_ley_ohmContext)_localctx).param1.value).doubleValue() / ((Number)((Calcular_ley_ohmContext)_localctx).param2.value).doubleValue();
			            symbolTable.put(param3Name, resistencia);
			            System.out.println("Resistencia = " + resistencia);
			        } else if (param3Name.equals("voltaje")) {
			            double voltaje = ((Number)((Calcular_ley_ohmContext)_localctx).param1.value).doubleValue() * ((Number)((Calcular_ley_ohmContext)_localctx).param2.value).doubleValue();
			            symbolTable.put(param3Name, voltaje);
			            System.out.println("Voltaje = " + voltaje);
			        } else if (param3Name.equals("corriente")) {
			            double corriente = ((Number)((Calcular_ley_ohmContext)_localctx).param1.value).doubleValue() / ((Number)((Calcular_ley_ohmContext)_localctx).param2.value).doubleValue();
			            symbolTable.put(param3Name, corriente);
			            System.out.println("Corriente = " + corriente);
			        } else {
			            System.err.println("Error: Parámetro desconocido " + param3Name);
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

	public static class ExprecionContext extends ParserRuleContext {
		public Object value;
		public JerarOPEContext t1;
		public JerarOPEContext t2;
		public TerminalNode SUMA(int i) {
			return getToken(PhysicsLangParser.SUMA, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(PhysicsLangParser.MENOS); }
		public JerarOPEContext jerarOPE(int i) {
			return getRuleContext(JerarOPEContext.class,i);
		}
		public TerminalNode MENOS(int i) {
			return getToken(PhysicsLangParser.MENOS, i);
		}
		public List<TerminalNode> SUMA() { return getTokens(PhysicsLangParser.SUMA); }
		public List<JerarOPEContext> jerarOPE() {
			return getRuleContexts(JerarOPEContext.class);
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
	}

	public final ExprecionContext exprecion() throws RecognitionException {
		ExprecionContext _localctx = new ExprecionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprecion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); ((ExprecionContext)_localctx).t1 = jerarOPE();
			((ExprecionContext)_localctx).value =  ((ExprecionContext)_localctx).t1.value;
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==MENOS) {
				{
				setState(243);
				switch (_input.LA(1)) {
				case SUMA:
					{
					setState(235); match(SUMA);
					setState(236); ((ExprecionContext)_localctx).t2 = jerarOPE();
					((ExprecionContext)_localctx).value =  ((Number)_localctx.value).doubleValue() + ((Number)((ExprecionContext)_localctx).t2.value).doubleValue();
					}
					break;
				case MENOS:
					{
					setState(239); match(MENOS);
					setState(240); ((ExprecionContext)_localctx).t2 = jerarOPE();
					((ExprecionContext)_localctx).value =  ((Number)_localctx.value).doubleValue() - ((Number)((ExprecionContext)_localctx).t2.value).doubleValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(247);
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
		public TerminalNode MULTIPLICACION(int i) {
			return getToken(PhysicsLangParser.MULTIPLICACION, i);
		}
		public List<TerminalNode> MULTIPLICACION() { return getTokens(PhysicsLangParser.MULTIPLICACION); }
		public List<TerminalNode> POTENCIA() { return getTokens(PhysicsLangParser.POTENCIA); }
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminalNode POTENCIA(int i) {
			return getToken(PhysicsLangParser.POTENCIA, i);
		}
		public List<TerminalNode> DIVICION() { return getTokens(PhysicsLangParser.DIVICION); }
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public TerminalNode DIVICION(int i) {
			return getToken(PhysicsLangParser.DIVICION, i);
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
	}

	public final JerarOPEContext jerarOPE() throws RecognitionException {
		JerarOPEContext _localctx = new JerarOPEContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jerarOPE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); ((JerarOPEContext)_localctx).t1 = termino();
			((JerarOPEContext)_localctx).value =  ((JerarOPEContext)_localctx).t1.value;
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVICION) | (1L << POTENCIA))) != 0)) {
				{
				setState(262);
				switch (_input.LA(1)) {
				case MULTIPLICACION:
					{
					setState(250); match(MULTIPLICACION);
					setState(251); ((JerarOPEContext)_localctx).t2 = termino();
					((JerarOPEContext)_localctx).value =  ((Number)_localctx.value).doubleValue() * ((Number)((JerarOPEContext)_localctx).t2.value).doubleValue();
					}
					break;
				case DIVICION:
					{
					setState(254); match(DIVICION);
					setState(255); ((JerarOPEContext)_localctx).t2 = termino();
					((JerarOPEContext)_localctx).value =  ((Number)_localctx.value).doubleValue() / ((Number)((JerarOPEContext)_localctx).t2.value).doubleValue();
					}
					break;
				case POTENCIA:
					{
					setState(258); match(POTENCIA);
					setState(259); ((JerarOPEContext)_localctx).t2 = termino();
					((JerarOPEContext)_localctx).value =  Math.pow(((Number)_localctx.value).doubleValue(), ((Number)((JerarOPEContext)_localctx).t2.value).doubleValue());
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(266);
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
		public Token DOUBLE;
		public Token ID;
		public ExprecionContext exprecion;
		public TerminalNode ID() { return getToken(PhysicsLangParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(PhysicsLangParser.PAR_CLOSE, 0); }
		public ExprecionContext exprecion() {
			return getRuleContext(ExprecionContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(PhysicsLangParser.PAR_OPEN, 0); }
		public TerminalNode DOUBLE() { return getToken(PhysicsLangParser.DOUBLE, 0); }
		public TerminalNode ENTERO() { return getToken(PhysicsLangParser.ENTERO, 0); }
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
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termino);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); ((TerminoContext)_localctx).ENTERO = match(ENTERO);
				((TerminoContext)_localctx).value =  Integer.parseInt((((TerminoContext)_localctx).ENTERO!=null?((TerminoContext)_localctx).ENTERO.getText():null)); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); ((TerminoContext)_localctx).DOUBLE = match(DOUBLE);
				((TerminoContext)_localctx).value =  Double.parseDouble((((TerminoContext)_localctx).DOUBLE!=null?((TerminoContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(271); ((TerminoContext)_localctx).ID = match(ID);

				            if (symbolTable.get((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null)) instanceof Integer) {
				                ((TerminoContext)_localctx).value =  (Integer)symbolTable.get((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null));
				            } else if (symbolTable.get((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null)) instanceof Double) {
				                ((TerminoContext)_localctx).value =  (Double)symbolTable.get((((TerminoContext)_localctx).ID!=null?((TerminoContext)_localctx).ID.getText():null));
				            }
				        
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(273); match(PAR_OPEN);
				setState(274); ((TerminoContext)_localctx).exprecion = exprecion();
				((TerminoContext)_localctx).value =  ((TerminoContext)_localctx).exprecion.value;
				setState(276); match(PAR_CLOSE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u011b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\2\3\2\7\2a\n\2\f"+
		"\2\16\2d\13\2\3\2\3\2\3\2\3\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\5\2q\n\2"+
		"\3\3\3\3\3\3\5\3v\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00bd\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00ce"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f6"+
		"\n\23\f\23\16\23\u00f9\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0119\n\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\4\2\20\20"+
		"\22\23\u012f\2p\3\2\2\2\4u\3\2\2\2\6w\3\2\2\2\b|\3\2\2\2\n\u0082\3\2\2"+
		"\2\f\u008b\3\2\2\2\16\u008d\3\2\2\2\20\u009c\3\2\2\2\22\u009e\3\2\2\2"+
		"\24\u00ad\3\2\2\2\26\u00af\3\2\2\2\30\u00bc\3\2\2\2\32\u00be\3\2\2\2\34"+
		"\u00cd\3\2\2\2\36\u00cf\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00eb"+
		"\3\2\2\2&\u00fa\3\2\2\2(\u0118\3\2\2\2*+\7\3\2\2+,\7 \2\2,\60\7\32\2\2"+
		"-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2"+
		"\2\62\60\3\2\2\2\63q\7\33\2\2\64\65\7\4\2\2\65\66\7 \2\2\66:\7\32\2\2"+
		"\679\5\f\7\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2"+
		"\2\2=q\7\33\2\2>?\7\5\2\2?@\7 \2\2@D\7\32\2\2AC\5\20\t\2BA\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2Gq\7\33\2\2HI\7\6\2\2IJ"+
		"\7 \2\2JN\7\32\2\2KM\5\24\13\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PN\3\2\2\2Qq\7\33\2\2RS\7\7\2\2ST\7 \2\2TX\7\32\2\2UW\5\30\r"+
		"\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[q\7\33"+
		"\2\2\\]\7\b\2\2]^\7 \2\2^b\7\32\2\2_a\5\34\17\2`_\3\2\2\2ad\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2eq\7\33\2\2fg\7\t\2\2gh\7 \2\2h"+
		"l\7\32\2\2ik\5 \21\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2oq\7\33\2\2p*\3\2\2\2p\64\3\2\2\2p>\3\2\2\2pH\3\2\2\2pR\3\2"+
		"\2\2p\\\3\2\2\2pf\3\2\2\2q\3\3\2\2\2rv\5\6\4\2sv\5\b\5\2tv\5\n\6\2ur\3"+
		"\2\2\2us\3\2\2\2ut\3\2\2\2v\5\3\2\2\2wx\t\2\2\2xy\7 \2\2yz\7\37\2\2z{"+
		"\b\4\1\2{\7\3\2\2\2|}\7 \2\2}~\7\31\2\2~\177\5$\23\2\177\u0080\7\37\2"+
		"\2\u0080\u0081\b\5\1\2\u0081\t\3\2\2\2\u0082\u0083\7\21\2\2\u0083\u0084"+
		"\5$\23\2\u0084\u0085\7\37\2\2\u0085\u0086\b\6\1\2\u0086\13\3\2\2\2\u0087"+
		"\u008c\5\6\4\2\u0088\u008c\5\b\5\2\u0089\u008c\5\16\b\2\u008a\u008c\5"+
		"\n\6\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\r\3\2\2\2\u008d\u008e\7\n\2\2\u008e\u008f\7\34\2"+
		"\2\u008f\u0090\5$\23\2\u0090\u0091\7\36\2\2\u0091\u0092\5$\23\2\u0092"+
		"\u0093\7\36\2\2\u0093\u0094\7 \2\2\u0094\u0095\7\35\2\2\u0095\u0096\7"+
		"\37\2\2\u0096\u0097\b\b\1\2\u0097\17\3\2\2\2\u0098\u009d\5\6\4\2\u0099"+
		"\u009d\5\b\5\2\u009a\u009d\5\22\n\2\u009b\u009d\5\n\6\2\u009c\u0098\3"+
		"\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\21\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\5$\23"+
		"\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\36\2\2\u00a4"+
		"\u00a5\7 \2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\7\37\2\2\u00a7\u00a8\b"+
		"\n\1\2\u00a8\23\3\2\2\2\u00a9\u00ae\5\6\4\2\u00aa\u00ae\5\b\5\2\u00ab"+
		"\u00ae\5\26\f\2\u00ac\u00ae\5\n\6\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\25\3\2\2\2\u00af"+
		"\u00b0\7\f\2\2\u00b0\u00b1\7\34\2\2\u00b1\u00b2\5$\23\2\u00b2\u00b3\7"+
		"\36\2\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7\37\2\2\u00b6"+
		"\u00b7\b\f\1\2\u00b7\27\3\2\2\2\u00b8\u00bd\5\6\4\2\u00b9\u00bd\5\b\5"+
		"\2\u00ba\u00bd\5\32\16\2\u00bb\u00bd\5\n\6\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\31\3\2\2"+
		"\2\u00be\u00bf\7\r\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5$\23\2\u00c1"+
		"\u00c2\7\36\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\7"+
		" \2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00c8\b\16\1\2\u00c8"+
		"\33\3\2\2\2\u00c9\u00ce\5\6\4\2\u00ca\u00ce\5\b\5\2\u00cb\u00ce\5\36\20"+
		"\2\u00cc\u00ce\5\n\6\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0\7\16\2\2\u00d0"+
		"\u00d1\7\34\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7\36\2\2\u00d3\u00d4\5"+
		"$\23\2\u00d4\u00d5\7\36\2\2\u00d5\u00d6\7 \2\2\u00d6\u00d7\7\35\2\2\u00d7"+
		"\u00d8\7\37\2\2\u00d8\u00d9\b\20\1\2\u00d9\37\3\2\2\2\u00da\u00df\5\6"+
		"\4\2\u00db\u00df\5\b\5\2\u00dc\u00df\5\"\22\2\u00dd\u00df\5\n\6\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df!\3\2\2\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2\7\34\2\2\u00e2\u00e3"+
		"\5$\23\2\u00e3\u00e4\7\36\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7\36\2\2"+
		"\u00e6\u00e7\7 \2\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00ea"+
		"\b\22\1\2\u00ea#\3\2\2\2\u00eb\u00ec\5&\24\2\u00ec\u00f7\b\23\1\2\u00ed"+
		"\u00ee\7\24\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\b\23\1\2\u00f0\u00f6\3"+
		"\2\2\2\u00f1\u00f2\7\25\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\b\23\1\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8%\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u00fb\5(\25\2\u00fb\u010a\b\24\1\2\u00fc\u00fd\7\26\2\2"+
		"\u00fd\u00fe\5(\25\2\u00fe\u00ff\b\24\1\2\u00ff\u0109\3\2\2\2\u0100\u0101"+
		"\7\27\2\2\u0101\u0102\5(\25\2\u0102\u0103\b\24\1\2\u0103\u0109\3\2\2\2"+
		"\u0104\u0105\7\30\2\2\u0105\u0106\5(\25\2\u0106\u0107\b\24\1\2\u0107\u0109"+
		"\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0104\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\'\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010e\7!\2\2\u010e\u0119\b\25\1\2\u010f\u0110"+
		"\7\"\2\2\u0110\u0119\b\25\1\2\u0111\u0112\7 \2\2\u0112\u0119\b\25\1\2"+
		"\u0113\u0114\7\34\2\2\u0114\u0115\5$\23\2\u0115\u0116\b\25\1\2\u0116\u0117"+
		"\7\35\2\2\u0117\u0119\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u010f\3\2\2\2"+
		"\u0118\u0111\3\2\2\2\u0118\u0113\3\2\2\2\u0119)\3\2\2\2\26\60:DNXblpu"+
		"\u008b\u009c\u00ad\u00bc\u00cd\u00de\u00f5\u00f7\u0108\u010a\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}