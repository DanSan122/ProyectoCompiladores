// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PhysicsLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MRU=1, FUNCION=2, VARIABLE=3, MOSTRAR=4, FOR=5, ENTERO_DECL=6, SUMA=7, 
		MENOS=8, MULTIPLICACION=9, DIVICION=10, POTENCIA=11, AND=12, OR=13, NOT=14, 
		GT=15, LT=16, GEQ=17, LEQ=18, EQ=19, NEQ=20, ASIGNAR=21, LLAVE_OPEN=22, 
		LLAVE_CLOSE=23, PAR_OPEN=24, PAR_CLOSE=25, FIN=26, ID=27, ENTERO=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MRU", "FUNCION", "VARIABLE", "MOSTRAR", "FOR", "ENTERO_DECL", "SUMA", 
		"MENOS", "MULTIPLICACION", "DIVICION", "POTENCIA", "AND", "OR", "NOT", 
		"GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASIGNAR", "LLAVE_OPEN", "LLAVE_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "FIN", "ID", "ENTERO", "WS"
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


	public PhysicsLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PhysicsLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\7\34\u0096\n\34\f\34\16\34\u0099\13\34\3\35"+
		"\6\35\u009c\n\35\r\35\16\35\u009d\3\36\6\36\u00a1\n\36\r\36\16\36\u00a2"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7I\3\2\2\2\tR\3\2\2\2\13Z\3\2"+
		"\2\2\r^\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27m\3"+
		"\2\2\2\31o\3\2\2\2\33r\3\2\2\2\35u\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2"+
		"\2\2%~\3\2\2\2\'\u0081\3\2\2\2)\u0084\3\2\2\2+\u0087\3\2\2\2-\u0089\3"+
		"\2\2\2/\u008b\3\2\2\2\61\u008d\3\2\2\2\63\u008f\3\2\2\2\65\u0091\3\2\2"+
		"\2\67\u0093\3\2\2\29\u009b\3\2\2\2;\u00a0\3\2\2\2=>\7o\2\2>?\7t\2\2?@"+
		"\7w\2\2@\4\3\2\2\2AB\7h\2\2BC\7w\2\2CD\7p\2\2DE\7e\2\2EF\7k\2\2FG\7q\2"+
		"\2GH\7p\2\2H\6\3\2\2\2IJ\7x\2\2JK\7c\2\2KL\7t\2\2LM\7k\2\2MN\7c\2\2NO"+
		"\7d\2\2OP\7n\2\2PQ\7g\2\2Q\b\3\2\2\2RS\7o\2\2ST\7q\2\2TU\7u\2\2UV\7v\2"+
		"\2VW\7t\2\2WX\7c\2\2XY\7t\2\2Y\n\3\2\2\2Z[\7h\2\2[\\\7q\2\2\\]\7t\2\2"+
		"]\f\3\2\2\2^_\7g\2\2_`\7p\2\2`a\7v\2\2ab\7g\2\2bc\7t\2\2cd\7q\2\2d\16"+
		"\3\2\2\2ef\7-\2\2f\20\3\2\2\2gh\7/\2\2h\22\3\2\2\2ij\7,\2\2j\24\3\2\2"+
		"\2kl\7\61\2\2l\26\3\2\2\2mn\7`\2\2n\30\3\2\2\2op\7(\2\2pq\7(\2\2q\32\3"+
		"\2\2\2rs\7~\2\2st\7~\2\2t\34\3\2\2\2uv\7#\2\2v\36\3\2\2\2wx\7@\2\2x \3"+
		"\2\2\2yz\7>\2\2z\"\3\2\2\2{|\7@\2\2|}\7?\2\2}$\3\2\2\2~\177\7>\2\2\177"+
		"\u0080\7?\2\2\u0080&\3\2\2\2\u0081\u0082\7?\2\2\u0082\u0083\7?\2\2\u0083"+
		"(\3\2\2\2\u0084\u0085\7#\2\2\u0085\u0086\7?\2\2\u0086*\3\2\2\2\u0087\u0088"+
		"\7?\2\2\u0088,\3\2\2\2\u0089\u008a\7}\2\2\u008a.\3\2\2\2\u008b\u008c\7"+
		"\177\2\2\u008c\60\3\2\2\2\u008d\u008e\7*\2\2\u008e\62\3\2\2\2\u008f\u0090"+
		"\7+\2\2\u0090\64\3\2\2\2\u0091\u0092\7=\2\2\u0092\66\3\2\2\2\u0093\u0097"+
		"\t\2\2\2\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u00988\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e:\3\2\2\2\u009f\u00a1\t\5\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\36\2\2\u00a5<\3\2\2\2\6\2\u0097"+
		"\u009d\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}