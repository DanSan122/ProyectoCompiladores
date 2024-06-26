// Generated from PhysicsLang.g4 by ANTLR 4.4
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'"
	};
	public static final String[] ruleNames = {
		"FUNCION", "MRU", "MRUV", "CAIDA_LIBRE", "SEGUNDA_LEY_NEWTON", "DENSIDAD", 
		"LEY_OHM", "MRU_CALC", "MRUV_CALC", "CAIDA_LIBRE_CALC", "SEGUNDA_LEY_NEWTON_CALC", 
		"DENSIDAD_CALC", "LEY_OHM_CALC", "VARIABLE", "MOSTRAR", "ENTERO_DECL", 
		"DOUBLE_DECL", "SUMA", "MENOS", "MULTIPLICACION", "DIVICION", "POTENCIA", 
		"ASIGNAR", "LLAVE_OPEN", "LLAVE_CLOSE", "PAR_OPEN", "PAR_CLOSE", "COMA", 
		"FIN", "ID", "ENTERO", "DOUBLE", "WS"
	};


	public PhysicsLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PhysicsLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u012f"+
		"\n\37\f\37\16\37\u0132\13\37\3 \6 \u0135\n \r \16 \u0136\3!\6!\u013a\n"+
		"!\r!\16!\u013b\3!\3!\6!\u0140\n!\r!\16!\u0141\3\"\6\"\u0145\n\"\r\"\16"+
		"\"\u0146\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;"+
		"\5\2\13\f\17\17\"\"\u014e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\3E\3\2\2\2\5M\3\2\2\2\7Q\3\2\2\2\tV\3\2\2\2\13b\3\2\2\2\ru\3\2\2"+
		"\2\17~\3\2\2\2\21\u0086\3\2\2\2\23\u0093\3\2\2\2\25\u00a1\3\2\2\2\27\u00b6"+
		"\3\2\2\2\31\u00d2\3\2\2\2\33\u00e4\3\2\2\2\35\u00f5\3\2\2\2\37\u00fe\3"+
		"\2\2\2!\u0106\3\2\2\2#\u010d\3\2\2\2%\u0114\3\2\2\2\'\u0116\3\2\2\2)\u0118"+
		"\3\2\2\2+\u011a\3\2\2\2-\u011c\3\2\2\2/\u011e\3\2\2\2\61\u0120\3\2\2\2"+
		"\63\u0122\3\2\2\2\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012a"+
		"\3\2\2\2=\u012c\3\2\2\2?\u0134\3\2\2\2A\u0139\3\2\2\2C\u0144\3\2\2\2E"+
		"F\7h\2\2FG\7w\2\2GH\7p\2\2HI\7e\2\2IJ\7k\2\2JK\7q\2\2KL\7p\2\2L\4\3\2"+
		"\2\2MN\7o\2\2NO\7t\2\2OP\7w\2\2P\6\3\2\2\2QR\7o\2\2RS\7t\2\2ST\7w\2\2"+
		"TU\7x\2\2U\b\3\2\2\2VW\7e\2\2WX\7c\2\2XY\7k\2\2YZ\7f\2\2Z[\7c\2\2[\\\7"+
		"a\2\2\\]\7n\2\2]^\7k\2\2^_\7d\2\2_`\7t\2\2`a\7g\2\2a\n\3\2\2\2bc\7u\2"+
		"\2cd\7g\2\2de\7i\2\2ef\7w\2\2fg\7p\2\2gh\7f\2\2hi\7c\2\2ij\7a\2\2jk\7"+
		"n\2\2kl\7g\2\2lm\7{\2\2mn\7a\2\2no\7p\2\2op\7g\2\2pq\7y\2\2qr\7v\2\2r"+
		"s\7q\2\2st\7p\2\2t\f\3\2\2\2uv\7f\2\2vw\7g\2\2wx\7p\2\2xy\7u\2\2yz\7k"+
		"\2\2z{\7f\2\2{|\7c\2\2|}\7f\2\2}\16\3\2\2\2~\177\7n\2\2\177\u0080\7g\2"+
		"\2\u0080\u0081\7{\2\2\u0081\u0082\7a\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7j\2\2\u0084\u0085\7o\2\2\u0085\20\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7n\2\2\u0089\u008a\7e\2\2\u008a\u008b\7w\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e\u008f\7a\2\2"+
		"\u008f\u0090\7o\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\22\3\2"+
		"\2\2\u0093\u0094\7e\2\2\u0094\u0095\7c\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7e\2\2\u0097\u0098\7w\2\2\u0098\u0099\7n\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7a\2\2\u009c\u009d\7o\2\2\u009d\u009e\7t\2\2"+
		"\u009e\u009f\7w\2\2\u009f\u00a0\7x\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7"+
		"e\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6"+
		"\7w\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7a\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7k\2\2"+
		"\u00ad\u00ae\7f\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7a\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7n\2\2"+
		"\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7i\2\2\u00c2\u00c3\7w\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7a\2\2"+
		"\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7{\2\2\u00ca\u00cb"+
		"\7a\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7y\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\30\3\2\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7e\2\2"+
		"\u00d6\u00d7\7w\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7a\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"\u00de\7p\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7f\2\2"+
		"\u00e1\u00e2\7c\2\2\u00e2\u00e3\7f\2\2\u00e3\32\3\2\2\2\u00e4\u00e5\7"+
		"e\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7w\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\u00ed\7a\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7{\2\2"+
		"\u00f0\u00f1\7a\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4"+
		"\7o\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7x\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7d\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd\36\3\2\2\2\u00fe\u00ff\7o\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2"+
		"\u0103\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105 \3\2\2\2\u0106\u0107\7g\2"+
		"\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a\u010b"+
		"\7t\2\2\u010b\u010c\7q\2\2\u010c\"\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7w\2\2\u0110\u0111\7d\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7g\2\2\u0113$\3\2\2\2\u0114\u0115\7-\2\2\u0115&\3\2\2\2\u0116\u0117"+
		"\7/\2\2\u0117(\3\2\2\2\u0118\u0119\7,\2\2\u0119*\3\2\2\2\u011a\u011b\7"+
		"\61\2\2\u011b,\3\2\2\2\u011c\u011d\7`\2\2\u011d.\3\2\2\2\u011e\u011f\7"+
		"?\2\2\u011f\60\3\2\2\2\u0120\u0121\7}\2\2\u0121\62\3\2\2\2\u0122\u0123"+
		"\7\177\2\2\u0123\64\3\2\2\2\u0124\u0125\7*\2\2\u0125\66\3\2\2\2\u0126"+
		"\u0127\7+\2\2\u01278\3\2\2\2\u0128\u0129\7.\2\2\u0129:\3\2\2\2\u012a\u012b"+
		"\7=\2\2\u012b<\3\2\2\2\u012c\u0130\t\2\2\2\u012d\u012f\t\3\2\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		">\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\t\4\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137@\3"+
		"\2\2\2\u0138\u013a\t\4\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\7\60"+
		"\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142B\3\2\2\2\u0143\u0145\t\5\2\2"+
		"\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b\"\2\2\u0149D\3\2\2\2\b\2\u0130"+
		"\u0136\u013b\u0141\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}