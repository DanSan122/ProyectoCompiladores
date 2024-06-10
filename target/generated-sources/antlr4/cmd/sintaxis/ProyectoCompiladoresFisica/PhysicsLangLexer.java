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
		FOR=1, MRU=2, FUNCION=3, VARIABLE=4, MOSTRAR=5, SUMA=6, MENOS=7, MULTIPLICACION=8, 
		DIVICION=9, POTENCIA=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, 
		LEQ=17, EQ=18, NEQ=19, ASIGNAR=20, LLAVE_OPEN=21, LLAVE_CLOSE=22, PAR_OPEN=23, 
		PAR_CLOSE=24, FIN=25, ID=26, ENTERO=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FOR", "MRU", "FUNCION", "VARIABLE", "MOSTRAR", "SUMA", "MENOS", "MULTIPLICACION", 
		"DIVICION", "POTENCIA", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", 
		"EQ", "NEQ", "ASIGNAR", "LLAVE_OPEN", "LLAVE_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
		"FIN", "ID", "ENTERO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'for'", "'mru'", "'funcion'", "'variable'", "'mostrar'", "'+'", 
		"'-'", "'*'", "'/'", "'^'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FOR", "MRU", "FUNCION", "VARIABLE", "MOSTRAR", "SUMA", "MENOS", 
		"MULTIPLICACION", "DIVICION", "POTENCIA", "AND", "OR", "NOT", "GT", "LT", 
		"GEQ", "LEQ", "EQ", "NEQ", "ASIGNAR", "LLAVE_OPEN", "LLAVE_CLOSE", "PAR_OPEN", 
		"PAR_CLOSE", "FIN", "ID", "ENTERO", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u008d\n\33"+
		"\f\33\16\33\u0090\13\33\3\34\6\34\u0093\n\34\r\34\16\34\u0094\3\35\6\35"+
		"\u0098\n\35\r\35\16\35\u0099\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\6\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\3\2\62;\5\2\13\f\17\17\"\"\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5?\3\2\2\2\7C\3\2\2\2\tK\3\2"+
		"\2\2\13T\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25d\3"+
		"\2\2\2\27f\3\2\2\2\31i\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3"+
		"\2\2\2#u\3\2\2\2%x\3\2\2\2\'{\3\2\2\2)~\3\2\2\2+\u0080\3\2\2\2-\u0082"+
		"\3\2\2\2/\u0084\3\2\2\2\61\u0086\3\2\2\2\63\u0088\3\2\2\2\65\u008a\3\2"+
		"\2\2\67\u0092\3\2\2\29\u0097\3\2\2\2;<\7h\2\2<=\7q\2\2=>\7t\2\2>\4\3\2"+
		"\2\2?@\7o\2\2@A\7t\2\2AB\7w\2\2B\6\3\2\2\2CD\7h\2\2DE\7w\2\2EF\7p\2\2"+
		"FG\7e\2\2GH\7k\2\2HI\7q\2\2IJ\7p\2\2J\b\3\2\2\2KL\7x\2\2LM\7c\2\2MN\7"+
		"t\2\2NO\7k\2\2OP\7c\2\2PQ\7d\2\2QR\7n\2\2RS\7g\2\2S\n\3\2\2\2TU\7o\2\2"+
		"UV\7q\2\2VW\7u\2\2WX\7v\2\2XY\7t\2\2YZ\7c\2\2Z[\7t\2\2[\f\3\2\2\2\\]\7"+
		"-\2\2]\16\3\2\2\2^_\7/\2\2_\20\3\2\2\2`a\7,\2\2a\22\3\2\2\2bc\7\61\2\2"+
		"c\24\3\2\2\2de\7`\2\2e\26\3\2\2\2fg\7(\2\2gh\7(\2\2h\30\3\2\2\2ij\7~\2"+
		"\2jk\7~\2\2k\32\3\2\2\2lm\7#\2\2m\34\3\2\2\2no\7@\2\2o\36\3\2\2\2pq\7"+
		">\2\2q \3\2\2\2rs\7@\2\2st\7?\2\2t\"\3\2\2\2uv\7>\2\2vw\7?\2\2w$\3\2\2"+
		"\2xy\7?\2\2yz\7?\2\2z&\3\2\2\2{|\7#\2\2|}\7?\2\2}(\3\2\2\2~\177\7?\2\2"+
		"\177*\3\2\2\2\u0080\u0081\7}\2\2\u0081,\3\2\2\2\u0082\u0083\7\177\2\2"+
		"\u0083.\3\2\2\2\u0084\u0085\7*\2\2\u0085\60\3\2\2\2\u0086\u0087\7+\2\2"+
		"\u0087\62\3\2\2\2\u0088\u0089\7=\2\2\u0089\64\3\2\2\2\u008a\u008e\t\2"+
		"\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\66\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0091\u0093\t\4\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u00958\3\2\2\2\u0096\u0098\t\5\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\35\2\2\u009c:\3\2\2\2\6\2\u008e"+
		"\u0094\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}