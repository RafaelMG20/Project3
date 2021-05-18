// Generated from C:/Users/sopos/IdeaProjects/Project2Final\algLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, BOOL=2, FLOAT=3, STRING=4, VOID=5, SIZEOF=6, NULL=7, ALG=8, TRUE=9, 
		FALSE=10, WHILE=11, DO=12, FINALLY=13, LEAVE=14, RESTART=15, RETURN=16, 
		IF=17, THEN=18, ELSE=19, WRITE=20, WRITELN=21, CHANGE_LINE=22, CARRIAGE_RETURN=23, 
		SPACE=24, TABULACAO_HORIZONTAL=25, COMMENT_E=26, COMMENT_O=27, VIRGULA=28, 
		E=29, PONTO_VIRGULA=30, IDENT=31, ID=32, LETTER=33, LATIN1=34, LITERAL_INTEIRO=35, 
		LITERAL_DECIMAL=36, LITERAL_EXPONENCIAL=37, CADEIA_CARACTERES=38, EQUAL=39, 
		MENORQ=40, MAIORQ=41, AT_SIGN=42, L_BRACE=43, R_BRACE=44, LP=45, RP=46, 
		INDEX_POINT_L=47, INDEX_POINT_R=48, IDEY=49, MULT_DIV=50, SOMA_SUB=51, 
		EQUAL_DIF=52, COMPARATOR=53, E_LOGICO=54, OU_LOGICO=55, D_MAIORQ=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", "TRUE", 
			"FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", "IF", 
			"THEN", "ELSE", "WRITE", "WRITELN", "CHANGE_LINE", "CARRIAGE_RETURN", 
			"SPACE", "TABULACAO_HORIZONTAL", "COMMENT_E", "COMMENT_O", "VIRGULA", 
			"E", "PONTO_VIRGULA", "IDENT", "ID", "LETTER", "LATIN1", "LITERAL_INTEIRO", 
			"LITERAL_DECIMAL", "LITERAL_EXPONENCIAL", "CADEIA_CARACTERES", "EQUAL", 
			"MENORQ", "MAIORQ", "AT_SIGN", "L_BRACE", "R_BRACE", "LP", "RP", "INDEX_POINT_L", 
			"INDEX_POINT_R", "IDEY", "MULT_DIV", "SOMA_SUB", "EQUAL_DIF", "COMPARATOR", 
			"E_LOGICO", "OU_LOGICO", "D_MAIORQ", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'float'", "'string'", "'void'", "'sizeof'", 
			"'null'", "'alg'", "'true'", "'false'", "'while'", "'do'", "'finally'", 
			"'leave'", "'restart'", "'return'", "'if'", "'then'", "'else'", "'write'", 
			"'writeln'", "'\\n'", "'\\r'", "' '", "'\\t'", null, null, "','", "'e'", 
			"';'", null, null, null, null, null, null, null, null, "'='", "'<'", 
			"'>'", "'@'", "'{'", "'}'", "'('", "')'", "'['", "']'", null, null, null, 
			null, null, "'&&'", "'||'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", 
			"TRUE", "FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", 
			"IF", "THEN", "ELSE", "WRITE", "WRITELN", "CHANGE_LINE", "CARRIAGE_RETURN", 
			"SPACE", "TABULACAO_HORIZONTAL", "COMMENT_E", "COMMENT_O", "VIRGULA", 
			"E", "PONTO_VIRGULA", "IDENT", "ID", "LETTER", "LATIN1", "LITERAL_INTEIRO", 
			"LITERAL_DECIMAL", "LITERAL_EXPONENCIAL", "CADEIA_CARACTERES", "EQUAL", 
			"MENORQ", "MAIORQ", "AT_SIGN", "L_BRACE", "R_BRACE", "LP", "RP", "INDEX_POINT_L", 
			"INDEX_POINT_R", "IDEY", "MULT_DIV", "SOMA_SUB", "EQUAL_DIF", "COMPARATOR", 
			"E_LOGICO", "OU_LOGICO", "D_MAIORQ", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public algLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "algLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0192\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\7\33\u0104\n\33\f\33\16\33\u0107\13\33\3\33\3\33\5\33\u010b\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\6\34\u0113\n\34\r\34\16\34\u0114\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u0125\n "+
		"\f \16 \u0128\13 \3!\3!\3\"\3\"\5\"\u012e\n\"\3#\3#\3$\3$\3$\7$\u0135"+
		"\n$\f$\16$\u0138\13$\5$\u013a\n$\3%\3%\3%\6%\u013f\n%\r%\16%\u0140\3&"+
		"\3&\3&\6&\u0146\n&\r&\16&\u0147\5&\u014a\n&\3&\3&\3&\5&\u014f\n&\3&\6"+
		"&\u0152\n&\r&\16&\u0153\5&\u0156\n&\3\'\3\'\6\'\u015a\n\'\r\'\16\'\u015b"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u017e\n\65"+
		"\3\66\3\66\3\66\3\66\5\66\u0184\n\66\3\67\3\67\3\67\38\38\38\39\39\39"+
		"\3:\3:\3:\3:\4\u0105\u0114\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2\13\4\2\62;aa\4\2C\\c|\3\2\63;\3\2"+
		"\62;\4\2GGgg\4\2--//\4\2AA\u0080\u0080\5\2\'\',,\61\61\5\2\13\f\17\17"+
		"\"\"\2\u01a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5y\3\2\2\2\7"+
		"~\3\2\2\2\t\u0084\3\2\2\2\13\u008b\3\2\2\2\r\u0090\3\2\2\2\17\u0097\3"+
		"\2\2\2\21\u009c\3\2\2\2\23\u00a0\3\2\2\2\25\u00a5\3\2\2\2\27\u00ab\3\2"+
		"\2\2\31\u00b1\3\2\2\2\33\u00b4\3\2\2\2\35\u00bc\3\2\2\2\37\u00c2\3\2\2"+
		"\2!\u00ca\3\2\2\2#\u00d1\3\2\2\2%\u00d4\3\2\2\2\'\u00d9\3\2\2\2)\u00de"+
		"\3\2\2\2+\u00e4\3\2\2\2-\u00ec\3\2\2\2/\u00f1\3\2\2\2\61\u00f6\3\2\2\2"+
		"\63\u00fa\3\2\2\2\65\u00ff\3\2\2\2\67\u010e\3\2\2\29\u011b\3\2\2\2;\u011d"+
		"\3\2\2\2=\u011f\3\2\2\2?\u0121\3\2\2\2A\u0129\3\2\2\2C\u012d\3\2\2\2E"+
		"\u012f\3\2\2\2G\u0139\3\2\2\2I\u013b\3\2\2\2K\u0142\3\2\2\2M\u0157\3\2"+
		"\2\2O\u015f\3\2\2\2Q\u0161\3\2\2\2S\u0163\3\2\2\2U\u0165\3\2\2\2W\u0167"+
		"\3\2\2\2Y\u0169\3\2\2\2[\u016b\3\2\2\2]\u016d\3\2\2\2_\u016f\3\2\2\2a"+
		"\u0171\3\2\2\2c\u0173\3\2\2\2e\u0175\3\2\2\2g\u0177\3\2\2\2i\u017d\3\2"+
		"\2\2k\u0183\3\2\2\2m\u0185\3\2\2\2o\u0188\3\2\2\2q\u018b\3\2\2\2s\u018e"+
		"\3\2\2\2uv\7k\2\2vw\7p\2\2wx\7v\2\2x\4\3\2\2\2yz\7d\2\2z{\7q\2\2{|\7q"+
		"\2\2|}\7n\2\2}\6\3\2\2\2~\177\7h\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2"+
		"\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083\b\3\2\2\2\u0084\u0085\7"+
		"u\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7i\2\2\u008a\n\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d"+
		"\7q\2\2\u008d\u008e\7k\2\2\u008e\u008f\7f\2\2\u008f\f\3\2\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7k\2\2\u0092\u0093\7|\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7h\2\2\u0096\16\3\2\2\2\u0097\u0098\7p\2\2\u0098"+
		"\u0099\7w\2\2\u0099\u009a\7n\2\2\u009a\u009b\7n\2\2\u009b\20\3\2\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7n\2\2\u009e\u009f\7i\2\2\u009f\22\3\2\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\24\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7"+
		"n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa\26\3\2\2\2\u00ab\u00ac"+
		"\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\32\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7{\2\2"+
		"\u00bb\34\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7"+
		"c\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7g\2\2\u00c1\36\3\2\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7v\2\2\u00c9 \3\2\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7w\2\2"+
		"\u00ce\u00cf\7t\2\2\u00cf\u00d0\7p\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7k"+
		"\2\2\u00d2\u00d3\7h\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7j\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8&\3\2\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"(\3\2\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7y\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7n\2\2\u00ea\u00eb\7p\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7^\2"+
		"\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\27\2\2\u00f0."+
		"\3\2\2\2\u00f1\u00f2\7^\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\30\2\2\u00f5\60\3\2\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\3\2\2"+
		"\2\u00f8\u00f9\b\31\2\2\u00f9\62\3\2\2\2\u00fa\u00fb\7^\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\32\2\2\u00fe\64\3\2\2\2\u00ff"+
		"\u0100\7%\2\2\u0100\u0101\7%\2\2\u0101\u0105\3\2\2\2\u0102\u0104\13\2"+
		"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u010a\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\5-"+
		"\27\2\u0109\u010b\5/\30\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b\33\2\2\u010d\66\3\2\2\2\u010e\u010f\7*\2"+
		"\2\u010f\u0110\7,\2\2\u0110\u0112\3\2\2\2\u0111\u0113\13\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\7,\2\2\u0117\u0118\7+\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\u011a\b\34\2\2\u011a8\3\2\2\2\u011b\u011c\7.\2\2\u011c:\3\2\2"+
		"\2\u011d\u011e\7g\2\2\u011e<\3\2\2\2\u011f\u0120\7=\2\2\u0120>\3\2\2\2"+
		"\u0121\u0126\5C\"\2\u0122\u0125\5C\"\2\u0123\u0125\t\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127@\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5C\"\2\u012a"+
		"B\3\2\2\2\u012b\u012e\t\3\2\2\u012c\u012e\5E#\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012eD\3\2\2\2\u012f\u0130\4\u00a2\u0101\2\u0130F\3\2\2"+
		"\2\u0131\u013a\7\62\2\2\u0132\u0136\t\4\2\2\u0133\u0135\t\5\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u0131\3\2\2\2\u0139"+
		"\u0132\3\2\2\2\u013aH\3\2\2\2\u013b\u013c\5G$\2\u013c\u013e\7\60\2\2\u013d"+
		"\u013f\t\5\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141J\3\2\2\2\u0142\u0149\t\5\2\2\u0143\u0145"+
		"\7\60\2\2\u0144\u0146\t\5\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0143"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0155\3\2\2\2\u014b\u014e\t\6\2\2\u014c"+
		"\u014f\t\7\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u0152\t\5\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u014b\3\2\2\2\u0155\u0156\3\2\2\2\u0156L\3\2\2\2\u0157\u0159"+
		"\7)\2\2\u0158\u015a\4\3\1\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7)"+
		"\2\2\u015eN\3\2\2\2\u015f\u0160\7?\2\2\u0160P\3\2\2\2\u0161\u0162\7>\2"+
		"\2\u0162R\3\2\2\2\u0163\u0164\7@\2\2\u0164T\3\2\2\2\u0165\u0166\7B\2\2"+
		"\u0166V\3\2\2\2\u0167\u0168\7}\2\2\u0168X\3\2\2\2\u0169\u016a\7\177\2"+
		"\2\u016aZ\3\2\2\2\u016b\u016c\7*\2\2\u016c\\\3\2\2\2\u016d\u016e\7+\2"+
		"\2\u016e^\3\2\2\2\u016f\u0170\7]\2\2\u0170`\3\2\2\2\u0171\u0172\7_\2\2"+
		"\u0172b\3\2\2\2\u0173\u0174\t\b\2\2\u0174d\3\2\2\2\u0175\u0176\t\t\2\2"+
		"\u0176f\3\2\2\2\u0177\u0178\t\7\2\2\u0178h\3\2\2\2\u0179\u017a\7?\2\2"+
		"\u017a\u017e\7?\2\2\u017b\u017c\7#\2\2\u017c\u017e\7?\2\2\u017d\u0179"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017ej\3\2\2\2\u017f\u0180\7@\2\2\u0180\u0184"+
		"\7?\2\2\u0181\u0182\7>\2\2\u0182\u0184\7?\2\2\u0183\u017f\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184l\3\2\2\2\u0185\u0186\7(\2\2\u0186\u0187\7(\2\2\u0187"+
		"n\3\2\2\2\u0188\u0189\7~\2\2\u0189\u018a\7~\2\2\u018ap\3\2\2\2\u018b\u018c"+
		"\7@\2\2\u018c\u018d\7@\2\2\u018dr\3\2\2\2\u018e\u018f\t\n\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\b:\2\2\u0191t\3\2\2\2\24\2\u0105\u010a\u0114\u0124"+
		"\u0126\u012d\u0136\u0139\u0140\u0147\u0149\u014e\u0153\u0155\u015b\u017d"+
		"\u0183\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}