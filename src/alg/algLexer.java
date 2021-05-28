// Generated from C:\Users\sopos\IdeaProjects\Project2Final\algLexer.g4 by ANTLR 4.9.1
package alg;
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
		EQUAL_DIF=52, COMPARATOR=53, E_LOGICO=54, OU_LOGICO=55, D_MAIORQ=56, WS=57, 
		COMMENTS=58, ARG1=59;
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
			"E_LOGICO", "OU_LOGICO", "D_MAIORQ", "WS", "COMMENTS", "ARG1"
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
			"E_LOGICO", "OU_LOGICO", "D_MAIORQ", "WS", "COMMENTS", "ARG1"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\7\33\u0108\n\33\f\33\16\33\u010b\13\33\3\33\3\33\5\33"+
		"\u010f\n\33\3\33\3\33\3\34\3\34\3\34\3\34\6\34\u0117\n\34\r\34\16\34\u0118"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u0129"+
		"\n \f \16 \u012c\13 \3!\3!\3\"\3\"\5\"\u0132\n\"\3#\3#\3$\3$\3$\7$\u0139"+
		"\n$\f$\16$\u013c\13$\5$\u013e\n$\3%\3%\3%\6%\u0143\n%\r%\16%\u0144\3&"+
		"\3&\3&\6&\u014a\n&\r&\16&\u014b\5&\u014e\n&\3&\3&\3&\5&\u0153\n&\3&\6"+
		"&\u0156\n&\r&\16&\u0157\5&\u015a\n&\3\'\3\'\6\'\u015e\n\'\r\'\16\'\u015f"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0182\n\65"+
		"\3\66\3\66\3\66\3\66\5\66\u0188\n\66\3\67\3\67\3\67\38\38\38\39\39\39"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\7;\u019b\n;\f;\16;\u019e\13;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\6<\u01a9\n<\r<\16<\u01aa\3<\3<\7<\u01af\n<\f<\16<\u01b2\13"+
		"<\3<\3<\7<\u01b6\n<\f<\16<\u01b9\13<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\6<"+
		"\u01c5\n<\r<\16<\u01c6\3<\3<\3<\3<\3<\6\u0109\u0118\u015f\u019c\2=\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=\3\2\f\4\2\62;aa\4\2C\\c|\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2AA\u0080"+
		"\u0080\5\2\'\',,\61\61\5\2\13\f\17\17\"\"\3\2\f\f\2\u01e2\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5}\3\2\2\2\7\u0082"+
		"\3\2\2\2\t\u0088\3\2\2\2\13\u008f\3\2\2\2\r\u0094\3\2\2\2\17\u009b\3\2"+
		"\2\2\21\u00a0\3\2\2\2\23\u00a4\3\2\2\2\25\u00a9\3\2\2\2\27\u00af\3\2\2"+
		"\2\31\u00b5\3\2\2\2\33\u00b8\3\2\2\2\35\u00c0\3\2\2\2\37\u00c6\3\2\2\2"+
		"!\u00ce\3\2\2\2#\u00d5\3\2\2\2%\u00d8\3\2\2\2\'\u00dd\3\2\2\2)\u00e2\3"+
		"\2\2\2+\u00e8\3\2\2\2-\u00f0\3\2\2\2/\u00f5\3\2\2\2\61\u00fa\3\2\2\2\63"+
		"\u00fe\3\2\2\2\65\u0103\3\2\2\2\67\u0112\3\2\2\29\u011f\3\2\2\2;\u0121"+
		"\3\2\2\2=\u0123\3\2\2\2?\u0125\3\2\2\2A\u012d\3\2\2\2C\u0131\3\2\2\2E"+
		"\u0133\3\2\2\2G\u013d\3\2\2\2I\u013f\3\2\2\2K\u0146\3\2\2\2M\u015b\3\2"+
		"\2\2O\u0163\3\2\2\2Q\u0165\3\2\2\2S\u0167\3\2\2\2U\u0169\3\2\2\2W\u016b"+
		"\3\2\2\2Y\u016d\3\2\2\2[\u016f\3\2\2\2]\u0171\3\2\2\2_\u0173\3\2\2\2a"+
		"\u0175\3\2\2\2c\u0177\3\2\2\2e\u0179\3\2\2\2g\u017b\3\2\2\2i\u0181\3\2"+
		"\2\2k\u0187\3\2\2\2m\u0189\3\2\2\2o\u018c\3\2\2\2q\u018f\3\2\2\2s\u0192"+
		"\3\2\2\2u\u0196\3\2\2\2w\u01a3\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|\4\3"+
		"\2\2\2}~\7d\2\2~\177\7q\2\2\177\u0080\7q\2\2\u0080\u0081\7n\2\2\u0081"+
		"\6\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7n\2\2\u0084\u0085\7q\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\b\3\2\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2"+
		"\u008d\u008e\7i\2\2\u008e\n\3\2\2\2\u008f\u0090\7x\2\2\u0090\u0091\7q"+
		"\2\2\u0091\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093\f\3\2\2\2\u0094\u0095"+
		"\7u\2\2\u0095\u0096\7k\2\2\u0096\u0097\7|\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7q\2\2\u0099\u009a\7h\2\2\u009a\16\3\2\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7w\2\2\u009d\u009e\7n\2\2\u009e\u009f\7n\2\2\u009f\20\3\2\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7i\2\2\u00a3\22\3\2\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\24\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7"+
		"n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\26\3\2\2\2\u00af\u00b0"+
		"\7y\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\32\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7{\2\2"+
		"\u00bf\34\3\2\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7"+
		"c\2\2\u00c3\u00c4\7x\2\2\u00c4\u00c5\7g\2\2\u00c5\36\3\2\2\2\u00c6\u00c7"+
		"\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7v\2\2\u00cd \3\2\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7w\2\2"+
		"\u00d2\u00d3\7t\2\2\u00d3\u00d4\7p\2\2\u00d4\"\3\2\2\2\u00d5\u00d6\7k"+
		"\2\2\u00d6\u00d7\7h\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7j\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc&\3\2\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2\u00e1"+
		"(\3\2\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7k\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6\u00e7\7g\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7y\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7n\2\2\u00ee\u00ef\7p\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7^\2"+
		"\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\27\2\2\u00f4."+
		"\3\2\2\2\u00f5\u00f6\7^\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\b\30\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\3\2\2"+
		"\2\u00fc\u00fd\b\31\2\2\u00fd\62\3\2\2\2\u00fe\u00ff\7^\2\2\u00ff\u0100"+
		"\7v\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\32\2\2\u0102\64\3\2\2\2\u0103"+
		"\u0104\7%\2\2\u0104\u0105\7%\2\2\u0105\u0109\3\2\2\2\u0106\u0108\13\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010e\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010f\5-"+
		"\27\2\u010d\u010f\5/\30\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b\33\2\2\u0111\66\3\2\2\2\u0112\u0113\7*\2"+
		"\2\u0113\u0114\7,\2\2\u0114\u0116\3\2\2\2\u0115\u0117\13\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c\7+\2\2\u011c\u011d\3\2\2"+
		"\2\u011d\u011e\b\34\2\2\u011e8\3\2\2\2\u011f\u0120\7.\2\2\u0120:\3\2\2"+
		"\2\u0121\u0122\7g\2\2\u0122<\3\2\2\2\u0123\u0124\7=\2\2\u0124>\3\2\2\2"+
		"\u0125\u012a\5C\"\2\u0126\u0129\5C\"\2\u0127\u0129\t\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b@\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5C\"\2\u012e"+
		"B\3\2\2\2\u012f\u0132\t\3\2\2\u0130\u0132\5E#\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132D\3\2\2\2\u0133\u0134\4\u00a2\u0101\2\u0134F\3\2\2"+
		"\2\u0135\u013e\7\62\2\2\u0136\u013a\t\4\2\2\u0137\u0139\t\5\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0135\3\2\2\2\u013d"+
		"\u0136\3\2\2\2\u013eH\3\2\2\2\u013f\u0140\5G$\2\u0140\u0142\7\60\2\2\u0141"+
		"\u0143\t\5\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145J\3\2\2\2\u0146\u014d\t\5\2\2\u0147\u0149"+
		"\7\60\2\2\u0148\u014a\t\5\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u0147"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0159\3\2\2\2\u014f\u0152\t\6\2\2\u0150"+
		"\u0153\t\7\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2"+
		"\2\2\u0153\u0155\3\2\2\2\u0154\u0156\t\5\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u014f\3\2\2\2\u0159\u015a\3\2\2\2\u015aL\3\2\2\2\u015b\u015d"+
		"\7)\2\2\u015c\u015e\4\3\1\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7)"+
		"\2\2\u0162N\3\2\2\2\u0163\u0164\7?\2\2\u0164P\3\2\2\2\u0165\u0166\7>\2"+
		"\2\u0166R\3\2\2\2\u0167\u0168\7@\2\2\u0168T\3\2\2\2\u0169\u016a\7B\2\2"+
		"\u016aV\3\2\2\2\u016b\u016c\7}\2\2\u016cX\3\2\2\2\u016d\u016e\7\177\2"+
		"\2\u016eZ\3\2\2\2\u016f\u0170\7*\2\2\u0170\\\3\2\2\2\u0171\u0172\7+\2"+
		"\2\u0172^\3\2\2\2\u0173\u0174\7]\2\2\u0174`\3\2\2\2\u0175\u0176\7_\2\2"+
		"\u0176b\3\2\2\2\u0177\u0178\t\b\2\2\u0178d\3\2\2\2\u0179\u017a\t\t\2\2"+
		"\u017af\3\2\2\2\u017b\u017c\t\7\2\2\u017ch\3\2\2\2\u017d\u017e\7?\2\2"+
		"\u017e\u0182\7?\2\2\u017f\u0180\7#\2\2\u0180\u0182\7?\2\2\u0181\u017d"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0182j\3\2\2\2\u0183\u0184\7@\2\2\u0184\u0188"+
		"\7?\2\2\u0185\u0186\7>\2\2\u0186\u0188\7?\2\2\u0187\u0183\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188l\3\2\2\2\u0189\u018a\7(\2\2\u018a\u018b\7(\2\2\u018b"+
		"n\3\2\2\2\u018c\u018d\7~\2\2\u018d\u018e\7~\2\2\u018ep\3\2\2\2\u018f\u0190"+
		"\7@\2\2\u0190\u0191\7@\2\2\u0191r\3\2\2\2\u0192\u0193\t\n\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\b:\2\2\u0195t\3\2\2\2\u0196\u0197\7\61\2\2\u0197"+
		"\u0198\7\61\2\2\u0198\u019c\3\2\2\2\u0199\u019b\n\13\2\2\u019a\u0199\3"+
		"\2\2\2\u019b\u019e\3\2\2\2\u019c\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7\f\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\b;\2\2\u01a2v\3\2\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5"+
		"\7p\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a9\7\"\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b0\7p\2\2\u01ad\u01af\7\"\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b7\7.\2\2\u01b4"+
		"\u01b6\7\"\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bb\7>\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd\7v\2\2\u01bd\u01be\7t\2\2"+
		"\u01be\u01bf\7k\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7i\2\2\u01c1\u01c2"+
		"\7@\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\7\"\2\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb\7i\2\2\u01cb\u01cc"+
		"\7u\2\2\u01ccx\3\2\2\2\31\2\u0109\u010e\u0118\u0128\u012a\u0131\u013a"+
		"\u013d\u0144\u014b\u014d\u0152\u0157\u0159\u015f\u0181\u0187\u019c\u01aa"+
		"\u01b0\u01b7\u01c6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}