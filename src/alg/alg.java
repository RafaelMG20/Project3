// Generated from C:/Users/sopos/IdeaProjects/Project2Final\alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alg extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		N=1, ARGUM=2, INT=3, BOOL=4, FLOAT=5, STRING=6, VOID=7, SIZEOF=8, NULL=9, 
		ALG=10, TRUE=11, FALSE=12, WHILE=13, DO=14, FINALLY=15, LEAVE=16, RESTART=17, 
		RETURN=18, IF=19, THEN=20, ELSE=21, WRITE=22, WRITELN=23, CHANGE_LINE=24, 
		CARRIAGE_RETURN=25, SPACE=26, TABULACAO_HORIZONTAL=27, COMMENT_E=28, COMMENT_O=29, 
		VIRGULA=30, E=31, PONTO_VIRGULA=32, IDENT=33, ID=34, LETTER=35, LATIN1=36, 
		LITERAL_INTEIRO=37, LITERAL_DECIMAL=38, LITERAL_EXPONENCIAL=39, CADEIA_CARACTERES=40, 
		EQUAL=41, MENORQ=42, MAIORQ=43, AT_SIGN=44, L_BRACE=45, R_BRACE=46, LP=47, 
		RP=48, INDEX_POINT_L=49, INDEX_POINT_R=50, IDEY=51, MULT_DIV=52, SOMA_SUB=53, 
		EQUAL_DIF=54, COMPARATOR=55, E_LOGICO=56, OU_LOGICO=57, D_MAIORQ=58, WS=59, 
		COMMENTS=60;
	public static final int
		RULE_programa = 0, RULE_fcall = 1, RULE_functionSpecial = 2, RULE_expr = 3, 
		RULE_exprList = 4, RULE_equals = 5, RULE_inteiro = 6, RULE_inteiros = 7, 
		RULE_booleano = 8, RULE_booleanos = 9, RULE_real = 10, RULE_reais = 11, 
		RULE_equals_string = 12, RULE_cadeia_caracteres = 13, RULE_cadeias_caracteres = 14, 
		RULE_ponteiro_inteiro = 15, RULE_ponteiro_real = 16, RULE_ponteiro_cadeia = 17, 
		RULE_op_paranteses = 18, RULE_op_pointer = 19, RULE_ide = 20, RULE_idy = 21, 
		RULE_comparations = 22, RULE_logics = 23, RULE_expressions_list = 24, 
		RULE_expressions_list2 = 25, RULE_arg = 26, RULE_args = 27, RULE_function_declare = 28, 
		RULE_type = 29, RULE_body = 30, RULE_body2 = 31, RULE_prologo = 32, RULE_epilogo = 33, 
		RULE_function = 34, RULE_function_invocate = 35, RULE_ctrl_instruct = 36, 
		RULE_attributes = 37, RULE_instructions = 38, RULE_if_cond = 39, RULE_loop = 40, 
		RULE_sub_block = 41, RULE_variable = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "fcall", "functionSpecial", "expr", "exprList", "equals", 
			"inteiro", "inteiros", "booleano", "booleanos", "real", "reais", "equals_string", 
			"cadeia_caracteres", "cadeias_caracteres", "ponteiro_inteiro", "ponteiro_real", 
			"ponteiro_cadeia", "op_paranteses", "op_pointer", "ide", "idy", "comparations", 
			"logics", "expressions_list", "expressions_list2", "arg", "args", "function_declare", 
			"type", "body", "body2", "prologo", "epilogo", "function", "function_invocate", 
			"ctrl_instruct", "attributes", "instructions", "if_cond", "loop", "sub_block", 
			"variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'n'", "'args'", "'int'", "'bool'", "'float'", "'string'", "'void'", 
			"'sizeof'", "'null'", "'alg'", "'true'", "'false'", "'while'", "'do'", 
			"'finally'", "'leave'", "'restart'", "'return'", "'if'", "'then'", "'else'", 
			"'write'", "'writeln'", "'\\n'", "'\\r'", "' '", "'\\t'", null, null, 
			"','", "'e'", "';'", null, null, null, null, null, null, null, null, 
			"'='", "'<'", "'>'", "'@'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			null, null, null, null, null, "'&&'", "'||'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "N", "ARGUM", "INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", 
			"NULL", "ALG", "TRUE", "FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", 
			"RETURN", "IF", "THEN", "ELSE", "WRITE", "WRITELN", "CHANGE_LINE", "CARRIAGE_RETURN", 
			"SPACE", "TABULACAO_HORIZONTAL", "COMMENT_E", "COMMENT_O", "VIRGULA", 
			"E", "PONTO_VIRGULA", "IDENT", "ID", "LETTER", "LATIN1", "LITERAL_INTEIRO", 
			"LITERAL_DECIMAL", "LITERAL_EXPONENCIAL", "CADEIA_CARACTERES", "EQUAL", 
			"MENORQ", "MAIORQ", "AT_SIGN", "L_BRACE", "R_BRACE", "LP", "RP", "INDEX_POINT_L", 
			"INDEX_POINT_R", "IDEY", "MULT_DIV", "SOMA_SUB", "EQUAL_DIF", "COMPARATOR", 
			"E_LOGICO", "OU_LOGICO", "D_MAIORQ", "WS", "COMMENTS"
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

	@Override
	public String getGrammarFileName() { return "alg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alg(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(alg.EOF, 0); }
		public List<FunctionSpecialContext> functionSpecial() {
			return getRuleContexts(FunctionSpecialContext.class);
		}
		public FunctionSpecialContext functionSpecial(int i) {
			return getRuleContext(FunctionSpecialContext.class,i);
		}
		public List<FcallContext> fcall() {
			return getRuleContexts(FcallContext.class);
		}
		public FcallContext fcall(int i) {
			return getRuleContext(FcallContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					functionSpecial();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					fcall();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					variable();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << MENORQ))) != 0)) {
				{
				{
				setState(104);
				function();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(EOF);
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

	public static class FcallContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(alg.IF, 0); }
		public Expressions_listContext expressions_list() {
			return getRuleContext(Expressions_listContext.class,0);
		}
		public TerminalNode THEN() { return getToken(alg.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(alg.ELSE, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public FcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FcallContext fcall() throws RecognitionException {
		FcallContext _localctx = new FcallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fcall);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(IF);
				setState(113);
				expressions_list();
				setState(114);
				match(THEN);
				setState(115);
				instructions();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(116);
					match(ELSE);
					setState(117);
					instructions();
					}
				}

				notifyErrorListeners("Missing parenteses");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(IF);
				setState(123);
				match(LP);
				setState(124);
				expressions_list();
				setState(125);
				match(RP);
				setState(126);
				instructions();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(127);
					match(ELSE);
					setState(128);
					instructions();
					}
				}

				notifyErrorListeners("Missing 'then'condition");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				function_invocate();
				notifyErrorListeners("Missing closing ';'");
				}
				break;
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

	public static class FunctionSpecialContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(alg.INT); }
		public TerminalNode INT(int i) {
			return getToken(alg.INT, i);
		}
		public TerminalNode ALG() { return getToken(alg.ALG, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode N() { return getToken(alg.N, 0); }
		public TerminalNode VIRGULA() { return getToken(alg.VIRGULA, 0); }
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TerminalNode ARGUM() { return getToken(alg.ARGUM, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionSpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunctionSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunctionSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunctionSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecialContext functionSpecial() throws RecognitionException {
		FunctionSpecialContext _localctx = new FunctionSpecialContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionSpecial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(INT);
			setState(139);
			match(ALG);
			setState(140);
			match(LP);
			setState(141);
			match(INT);
			setState(142);
			match(N);
			setState(143);
			match(VIRGULA);
			setState(144);
			match(MENORQ);
			setState(145);
			match(STRING);
			setState(146);
			match(MAIORQ);
			setState(147);
			match(ARGUM);
			setState(148);
			match(RP);
			setState(149);
			body();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(alg.ID, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesesContext extends ExprContext {
		public Op_parantesesContext op_paranteses() {
			return getRuleContext(Op_parantesesContext.class,0);
		}
		public ParentesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitParenteses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdBoolPointContext extends ExprContext {
		public IdyContext idy() {
			return getRuleContext(IdyContext.class,0);
		}
		public IdBoolPointContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIdBoolPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIdBoolPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIdBoolPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT_DIV() { return getToken(alg.MULT_DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SOMA_SUB() { return getToken(alg.SOMA_SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointerContext extends ExprContext {
		public Op_pointerContext op_pointer() {
			return getRuleContext(Op_pointerContext.class,0);
		}
		public PointerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode LITERAL_INTEIRO() { return getToken(alg.LITERAL_INTEIRO, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PointIndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public PointIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPointIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPointIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPointIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode LITERAL_DECIMAL() { return getToken(alg.LITERAL_DECIMAL, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public IdeContext ide() {
			return getRuleContext(IdeContext.class,0);
		}
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncInvContext extends ExprContext {
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public FuncInvContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFuncInv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFuncInv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFuncInv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				match(ID);
				setState(153);
				match(LP);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					setState(154);
					exprList();
					}
				}

				setState(157);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(LP);
				setState(159);
				expr(0);
				setState(160);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new FuncInvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				function_invocate();
				}
				break;
			case 4:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				op_paranteses();
				}
				break;
			case 5:
				{
				_localctx = new PointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				op_pointer();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(IDENT);
				}
				break;
			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(LITERAL_INTEIRO);
				}
				break;
			case 8:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(LITERAL_DECIMAL);
				}
				break;
			case 9:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				ide();
				}
				break;
			case 10:
				{
				_localctx = new IdBoolPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				idy();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						{
						setState(173);
						match(MULT_DIV);
						}
						setState(174);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(176);
						match(SOMA_SUB);
						}
						setState(177);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new PointIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(179);
						match(INDEX_POINT_L);
						setState(180);
						expr(0);
						setState(181);
						match(INDEX_POINT_R);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expr(0);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(189);
				match(VIRGULA);
				setState(190);
				expr(0);
				}
				}
				setState(195);
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

	public static class EqualsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equals);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(196);
				match(EQUAL);
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(197);
					function_invocate();
					}
					break;
				case 2:
					{
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(198);
						expr(0);
						}
						}
						setState(201); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0) );
					}
					break;
				}
				}
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InteiroContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public TerminalNode LITERAL_INTEIRO() { return getToken(alg.LITERAL_INTEIRO, 0); }
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(208);
				match(INT);
				}
			}

			setState(211);
			match(IDENT);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(212);
				match(INDEX_POINT_L);
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				match(INDEX_POINT_R);
				}
			}

			setState(217);
			equals();
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

	public static class InteirosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public InteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInteiros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInteiros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteirosContext inteiros() throws RecognitionException {
		InteirosContext _localctx = new InteirosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inteiros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(INT);
			setState(220);
			match(IDENT);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(221);
				match(VIRGULA);
				setState(222);
				match(IDENT);
				}
				}
				setState(227);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(228);
				match(BOOL);
				}
			}

			setState(231);
			match(IDENT);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(232);
				match(EQUAL);
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
					{
					setState(233);
					match(TRUE);
					}
					break;
				case FALSE:
					{
					setState(234);
					match(FALSE);
					}
					break;
				case SIZEOF:
				case WRITE:
				case WRITELN:
				case IDENT:
				case AT_SIGN:
					{
					setState(235);
					function_invocate();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class BooleanosContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public BooleanosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBooleanos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBooleanos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBooleanos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanosContext booleanos() throws RecognitionException {
		BooleanosContext _localctx = new BooleanosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(BOOL);
			setState(241);
			match(IDENT);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(242);
				match(VIRGULA);
				setState(243);
				match(IDENT);
				}
				}
				setState(248);
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

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public TerminalNode LITERAL_INTEIRO() { return getToken(alg.LITERAL_INTEIRO, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FLOAT) {
				{
				setState(249);
				match(FLOAT);
				}
			}

			setState(252);
			match(IDENT);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(253);
				match(INDEX_POINT_L);
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				match(INDEX_POINT_R);
				}
			}

			setState(258);
			equals();
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

	public static class ReaisContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public ReaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterReais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitReais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitReais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReaisContext reais() throws RecognitionException {
		ReaisContext _localctx = new ReaisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_reais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FLOAT);
			setState(261);
			match(IDENT);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(262);
				match(VIRGULA);
				setState(263);
				match(IDENT);
				}
				}
				setState(268);
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

	public static class Equals_stringContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public TerminalNode CADEIA_CARACTERES() { return getToken(alg.CADEIA_CARACTERES, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public Equals_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterEquals_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitEquals_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitEquals_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equals_stringContext equals_string() throws RecognitionException {
		Equals_stringContext _localctx = new Equals_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equals_string);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(EQUAL);
				setState(270);
				match(CADEIA_CARACTERES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(EQUAL);
				setState(272);
				function_invocate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class Cadeia_caracteresContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public Equals_stringContext equals_string() {
			return getRuleContext(Equals_stringContext.class,0);
		}
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public TerminalNode LITERAL_INTEIRO() { return getToken(alg.LITERAL_INTEIRO, 0); }
		public Cadeia_caracteresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadeia_caracteres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterCadeia_caracteres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitCadeia_caracteres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitCadeia_caracteres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cadeia_caracteresContext cadeia_caracteres() throws RecognitionException {
		Cadeia_caracteresContext _localctx = new Cadeia_caracteresContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cadeia_caracteres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(276);
				match(STRING);
				}
			}

			setState(279);
			match(IDENT);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(280);
				match(INDEX_POINT_L);
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(282);
				match(INDEX_POINT_R);
				}
			}

			setState(285);
			equals_string();
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

	public static class Cadeias_caracteresContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public Cadeias_caracteresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadeias_caracteres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterCadeias_caracteres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitCadeias_caracteres(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitCadeias_caracteres(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cadeias_caracteresContext cadeias_caracteres() throws RecognitionException {
		Cadeias_caracteresContext _localctx = new Cadeias_caracteresContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cadeias_caracteres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(STRING);
			setState(288);
			match(IDENT);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(289);
				match(VIRGULA);
				setState(290);
				match(IDENT);
				}
				}
				setState(295);
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

	public static class Ponteiro_inteiroContext extends ParserRuleContext {
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ponteiro_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiro_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPonteiro_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPonteiro_inteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPonteiro_inteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ponteiro_inteiroContext ponteiro_inteiro() throws RecognitionException {
		Ponteiro_inteiroContext _localctx = new Ponteiro_inteiroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ponteiro_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(MENORQ);
			setState(297);
			match(INT);
			setState(298);
			match(MAIORQ);
			setState(299);
			match(IDENT);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(300);
				match(EQUAL);
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(301);
					function_invocate();
					}
					break;
				case 2:
					{
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(302);
						expr(0);
						}
						}
						setState(307);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(308);
					match(NULL);
					}
					break;
				case 4:
					{
					{
					setState(309);
					match(INDEX_POINT_L);
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(310);
						expr(0);
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(316);
					match(INDEX_POINT_R);
					}
					}
					break;
				}
				}
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

	public static class Ponteiro_realContext extends ParserRuleContext {
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ponteiro_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiro_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPonteiro_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPonteiro_real(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPonteiro_real(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ponteiro_realContext ponteiro_real() throws RecognitionException {
		Ponteiro_realContext _localctx = new Ponteiro_realContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ponteiro_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(MENORQ);
			setState(322);
			match(FLOAT);
			setState(323);
			match(MAIORQ);
			setState(324);
			match(IDENT);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(325);
				match(EQUAL);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(326);
					function_invocate();
					}
					break;
				case 2:
					{
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(327);
						expr(0);
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(333);
					match(NULL);
					}
					break;
				case 4:
					{
					{
					setState(334);
					match(INDEX_POINT_L);
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(335);
						expr(0);
						}
						}
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(341);
					match(INDEX_POINT_R);
					}
					}
					break;
				}
				}
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

	public static class Ponteiro_cadeiaContext extends ParserRuleContext {
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public TerminalNode CADEIA_CARACTERES() { return getToken(alg.CADEIA_CARACTERES, 0); }
		public Function_invocateContext function_invocate() {
			return getRuleContext(Function_invocateContext.class,0);
		}
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ponteiro_cadeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiro_cadeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPonteiro_cadeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPonteiro_cadeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPonteiro_cadeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ponteiro_cadeiaContext ponteiro_cadeia() throws RecognitionException {
		Ponteiro_cadeiaContext _localctx = new Ponteiro_cadeiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ponteiro_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(MENORQ);
			setState(347);
			match(STRING);
			setState(348);
			match(MAIORQ);
			setState(349);
			match(IDENT);
			{
			setState(350);
			match(EQUAL);
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA_CARACTERES:
				{
				setState(351);
				match(CADEIA_CARACTERES);
				}
				break;
			case SIZEOF:
			case WRITE:
			case WRITELN:
			case IDENT:
			case AT_SIGN:
				{
				setState(352);
				function_invocate();
				}
				break;
			case NULL:
				{
				setState(353);
				match(NULL);
				}
				break;
			case INDEX_POINT_L:
				{
				{
				setState(354);
				match(INDEX_POINT_L);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					{
					setState(355);
					expr(0);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(INDEX_POINT_R);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Op_parantesesContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op_parantesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_paranteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterOp_paranteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitOp_paranteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitOp_paranteses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_parantesesContext op_paranteses() throws RecognitionException {
		Op_parantesesContext _localctx = new Op_parantesesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_paranteses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LP);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(365);
				expr(0);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(371);
			match(RP);
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

	public static class Op_pointerContext extends ParserRuleContext {
		public TerminalNode INDEX_POINT_L() { return getToken(alg.INDEX_POINT_L, 0); }
		public TerminalNode INDEX_POINT_R() { return getToken(alg.INDEX_POINT_R, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterOp_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitOp_pointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitOp_pointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_pointerContext op_pointer() throws RecognitionException {
		Op_pointerContext _localctx = new Op_pointerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(INDEX_POINT_L);
			{
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(374);
				expr(0);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(380);
			match(INDEX_POINT_R);
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

	public static class IdeContext extends ParserRuleContext {
		public TerminalNode SOMA_SUB() { return getToken(alg.SOMA_SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdeContext ide() throws RecognitionException {
		IdeContext _localctx = new IdeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(SOMA_SUB);
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(383);
				expr(0);
				}
				break;
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

	public static class IdyContext extends ParserRuleContext {
		public TerminalNode IDEY() { return getToken(alg.IDEY, 0); }
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public IdyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIdy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIdy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIdy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdyContext idy() throws RecognitionException {
		IdyContext _localctx = new IdyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(IDEY);
			setState(387);
			match(IDENT);
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

	public static class ComparationsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TerminalNode EQUAL_DIF() { return getToken(alg.EQUAL_DIF, 0); }
		public TerminalNode COMPARATOR() { return getToken(alg.COMPARATOR, 0); }
		public ComparationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterComparations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitComparations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitComparations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparationsContext comparations() throws RecognitionException {
		ComparationsContext _localctx = new ComparationsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comparations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			expr(0);
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQ) | (1L << MAIORQ) | (1L << EQUAL_DIF) | (1L << COMPARATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			expr(0);
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

	public static class LogicsContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public TerminalNode EQUAL_DIF() { return getToken(alg.EQUAL_DIF, 0); }
		public TerminalNode E_LOGICO() { return getToken(alg.E_LOGICO, 0); }
		public TerminalNode OU_LOGICO() { return getToken(alg.OU_LOGICO, 0); }
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterLogics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitLogics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitLogics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicsContext logics() throws RecognitionException {
		LogicsContext _localctx = new LogicsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(LP);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(394);
				expr(0);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(401);
				expr(0);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(407);
			match(RP);
			setState(408);
			match(EQUAL_DIF);
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Expressions_listContext extends ParserRuleContext {
		public ComparationsContext comparations() {
			return getRuleContext(ComparationsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(alg.PONTO_VIRGULA, 0); }
		public Expressions_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterExpressions_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitExpressions_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitExpressions_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressions_listContext expressions_list() throws RecognitionException {
		Expressions_listContext _localctx = new Expressions_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressions_list);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				comparations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(412);
				expr(0);
				setState(413);
				match(PONTO_VIRGULA);
				}
				}
				break;
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

	public static class Expressions_list2Context extends ParserRuleContext {
		public ComparationsContext comparations() {
			return getRuleContext(ComparationsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CADEIA_CARACTERES() { return getToken(alg.CADEIA_CARACTERES, 0); }
		public Expressions_list2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions_list2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterExpressions_list2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitExpressions_list2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitExpressions_list2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressions_list2Context expressions_list2() throws RecognitionException {
		Expressions_list2Context _localctx = new Expressions_list2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_expressions_list2);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				comparations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(CADEIA_CARACTERES);
				}
				break;
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

	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			type();
			setState(423);
			match(IDENT);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			arg();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(426);
				match(VIRGULA);
				setState(427);
				arg();
				}
				}
				setState(432);
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

	public static class Function_declareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declareContext function_declare() throws RecognitionException {
		Function_declareContext _localctx = new Function_declareContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_function_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			type();
			setState(434);
			match(IDENT);
			setState(435);
			match(LP);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << MENORQ))) != 0)) {
				{
				setState(436);
				args();
				}
			}

			setState(439);
			match(RP);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode VOID() { return getToken(alg.VOID, 0); }
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(441);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(442);
				match(FLOAT);
				}
				break;
			case BOOL:
				{
				setState(443);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(444);
				match(STRING);
				}
				break;
			case VOID:
				{
				setState(445);
				match(VOID);
				}
				break;
			case MENORQ:
				{
				{
				setState(446);
				match(MENORQ);
				setState(447);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				match(MAIORQ);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(alg.L_BRACE, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(alg.R_BRACE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_invocateContext> function_invocate() {
			return getRuleContexts(Function_invocateContext.class);
		}
		public Function_invocateContext function_invocate(int i) {
			return getRuleContext(Function_invocateContext.class,i);
		}
		public List<TerminalNode> PONTO_VIRGULA() { return getTokens(alg.PONTO_VIRGULA); }
		public TerminalNode PONTO_VIRGULA(int i) {
			return getToken(alg.PONTO_VIRGULA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(L_BRACE);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(452);
						variable();
						}
						break;
					case 2:
						{
						setState(453);
						function_invocate();
						setState(454);
						match(PONTO_VIRGULA);
						}
						break;
					case 3:
						{
						setState(456);
						instructions();
						}
						break;
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(462);
			instructions();
			setState(463);
			match(R_BRACE);
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

	public static class Body2Context extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(alg.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(alg.R_BRACE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_invocateContext> function_invocate() {
			return getRuleContexts(Function_invocateContext.class);
		}
		public Function_invocateContext function_invocate(int i) {
			return getRuleContext(Function_invocateContext.class,i);
		}
		public List<TerminalNode> PONTO_VIRGULA() { return getTokens(alg.PONTO_VIRGULA); }
		public TerminalNode PONTO_VIRGULA(int i) {
			return getToken(alg.PONTO_VIRGULA, i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Body2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBody2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBody2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body2Context body2() throws RecognitionException {
		Body2Context _localctx = new Body2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_body2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(L_BRACE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << SIZEOF) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << MENORQ) | (1L << AT_SIGN) | (1L << L_BRACE) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(466);
					variable();
					}
					break;
				case 2:
					{
					setState(467);
					function_invocate();
					setState(468);
					match(PONTO_VIRGULA);
					}
					break;
				case 3:
					{
					setState(470);
					instructions();
					}
					break;
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(R_BRACE);
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

	public static class PrologoContext extends ParserRuleContext {
		public TerminalNode AT_SIGN() { return getToken(alg.AT_SIGN, 0); }
		public Body2Context body2() {
			return getRuleContext(Body2Context.class,0);
		}
		public PrologoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prologo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPrologo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPrologo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPrologo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologoContext prologo() throws RecognitionException {
		PrologoContext _localctx = new PrologoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prologo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(AT_SIGN);
			setState(479);
			body2();
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

	public static class EpilogoContext extends ParserRuleContext {
		public TerminalNode D_MAIORQ() { return getToken(alg.D_MAIORQ, 0); }
		public Body2Context body2() {
			return getRuleContext(Body2Context.class,0);
		}
		public EpilogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epilogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterEpilogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitEpilogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitEpilogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpilogoContext epilogo() throws RecognitionException {
		EpilogoContext _localctx = new EpilogoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_epilogo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(D_MAIORQ);
			setState(482);
			body2();
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_declareContext function_declare() {
			return getRuleContext(Function_declareContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public PrologoContext prologo() {
			return getRuleContext(PrologoContext.class,0);
		}
		public EpilogoContext epilogo() {
			return getRuleContext(EpilogoContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			function_declare();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SIGN) {
				{
				setState(485);
				prologo();
				}
			}

			setState(488);
			body();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==D_MAIORQ) {
				{
				setState(489);
				epilogo();
				}
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

	public static class Function_invocateContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public TerminalNode AT_SIGN() { return getToken(alg.AT_SIGN, 0); }
		public TerminalNode SIZEOF() { return getToken(alg.SIZEOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode WRITE() { return getToken(alg.WRITE, 0); }
		public TerminalNode WRITELN() { return getToken(alg.WRITELN, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(alg.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(alg.VIRGULA, i);
		}
		public Function_invocateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterFunction_invocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitFunction_invocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitFunction_invocate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocateContext function_invocate() throws RecognitionException {
		Function_invocateContext _localctx = new Function_invocateContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_invocate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				{
				setState(492);
				match(IDENT);
				setState(493);
				match(LP);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					setState(494);
					expr(0);
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(495);
						match(VIRGULA);
						setState(496);
						expr(0);
						}
						}
						setState(501);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(504);
				match(RP);
				}
				}
				break;
			case AT_SIGN:
				{
				{
				setState(505);
				match(AT_SIGN);
				setState(506);
				match(LP);
				setState(507);
				match(RP);
				}
				}
				break;
			case SIZEOF:
				{
				{
				setState(508);
				match(SIZEOF);
				setState(509);
				match(LP);
				setState(510);
				expr(0);
				setState(511);
				match(RP);
				}
				}
				break;
			case WRITE:
			case WRITELN:
				{
				{
				setState(513);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(514);
				match(LP);
				setState(515);
				expr(0);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(516);
					match(VIRGULA);
					setState(517);
					expr(0);
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(523);
				match(RP);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ctrl_instructContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(alg.PONTO_VIRGULA, 0); }
		public TerminalNode LEAVE() { return getToken(alg.LEAVE, 0); }
		public TerminalNode RESTART() { return getToken(alg.RESTART, 0); }
		public TerminalNode RETURN() { return getToken(alg.RETURN, 0); }
		public Expressions_list2Context expressions_list2() {
			return getRuleContext(Expressions_list2Context.class,0);
		}
		public Ctrl_instructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrl_instruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterCtrl_instruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitCtrl_instruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitCtrl_instruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctrl_instructContext ctrl_instruct() throws RecognitionException {
		Ctrl_instructContext _localctx = new Ctrl_instructContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ctrl_instruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(527);
				match(LEAVE);
				}
				break;
			case 2:
				{
				setState(528);
				match(RESTART);
				}
				break;
			case 3:
				{
				{
				setState(529);
				match(RETURN);
				setState(530);
				expressions_list2();
				}
				}
				break;
			case 4:
				{
				setState(531);
				match(RETURN);
				}
				break;
			}
			setState(534);
			match(PONTO_VIRGULA);
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

	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(alg.PONTO_VIRGULA, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public Expressions_list2Context expressions_list2() {
			return getRuleContext(Expressions_list2Context.class,0);
		}
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public Op_pointerContext op_pointer() {
			return getRuleContext(Op_pointerContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(536);
				match(IDENT);
				}
				break;
			case INDEX_POINT_L:
				{
				setState(537);
				op_pointer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(540);
			match(EQUAL);
			setState(541);
			expressions_list2();
			}
			setState(543);
			match(PONTO_VIRGULA);
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

	public static class InstructionsContext extends ParserRuleContext {
		public Expressions_listContext expressions_list() {
			return getRuleContext(Expressions_listContext.class,0);
		}
		public Ctrl_instructContext ctrl_instruct() {
			return getRuleContext(Ctrl_instructContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Sub_blockContext sub_block() {
			return getRuleContext(Sub_blockContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_instructions);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				expressions_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				ctrl_instruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				attributes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				if_cond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				sub_block();
				}
				break;
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

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(alg.IF, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public TerminalNode THEN() { return getToken(alg.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public LogicsContext logics() {
			return getRuleContext(LogicsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(alg.ELSE, 0); }
		public List<ComparationsContext> comparations() {
			return getRuleContexts(ComparationsContext.class);
		}
		public ComparationsContext comparations(int i) {
			return getRuleContext(ComparationsContext.class,i);
		}
		public List<TerminalNode> E_LOGICO() { return getTokens(alg.E_LOGICO); }
		public TerminalNode E_LOGICO(int i) {
			return getToken(alg.E_LOGICO, i);
		}
		public List<TerminalNode> OU_LOGICO() { return getTokens(alg.OU_LOGICO); }
		public TerminalNode OU_LOGICO(int i) {
			return getToken(alg.OU_LOGICO, i);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitIf_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitIf_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(IF);
			setState(554);
			match(LP);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				{
				setState(555);
				comparations();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==E_LOGICO || _la==OU_LOGICO) {
					{
					{
					setState(556);
					_la = _input.LA(1);
					if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(557);
					comparations();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(563);
				logics();
				}
				break;
			}
			setState(566);
			match(RP);
			setState(567);
			match(THEN);
			setState(568);
			instructions();
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(569);
				match(ELSE);
				setState(570);
				instructions();
				}
				break;
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(alg.WHILE, 0); }
		public TerminalNode LP() { return getToken(alg.LP, 0); }
		public TerminalNode RP() { return getToken(alg.RP, 0); }
		public TerminalNode DO() { return getToken(alg.DO, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Expressions_listContext expressions_list() {
			return getRuleContext(Expressions_listContext.class,0);
		}
		public LogicsContext logics() {
			return getRuleContext(LogicsContext.class,0);
		}
		public TerminalNode FINALLY() { return getToken(alg.FINALLY, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(WHILE);
			setState(574);
			match(LP);
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(575);
				expressions_list();
				}
				break;
			case 2:
				{
				setState(576);
				logics();
				}
				break;
			}
			setState(579);
			match(RP);
			setState(580);
			match(DO);
			setState(581);
			instructions();
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(582);
				match(FINALLY);
				setState(583);
				instructions();
				}
				break;
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

	public static class Sub_blockContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(alg.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(alg.R_BRACE, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Sub_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSub_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSub_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSub_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_blockContext sub_block() throws RecognitionException {
		Sub_blockContext _localctx = new Sub_blockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(L_BRACE);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << L_BRACE) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(587);
				instructions();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(593);
			match(R_BRACE);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode PONTO_VIRGULA() { return getToken(alg.PONTO_VIRGULA, 0); }
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public InteirosContext inteiros() {
			return getRuleContext(InteirosContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BooleanosContext booleanos() {
			return getRuleContext(BooleanosContext.class,0);
		}
		public ReaisContext reais() {
			return getRuleContext(ReaisContext.class,0);
		}
		public Cadeia_caracteresContext cadeia_caracteres() {
			return getRuleContext(Cadeia_caracteresContext.class,0);
		}
		public Cadeias_caracteresContext cadeias_caracteres() {
			return getRuleContext(Cadeias_caracteresContext.class,0);
		}
		public Ponteiro_inteiroContext ponteiro_inteiro() {
			return getRuleContext(Ponteiro_inteiroContext.class,0);
		}
		public Ponteiro_realContext ponteiro_real() {
			return getRuleContext(Ponteiro_realContext.class,0);
		}
		public Ponteiro_cadeiaContext ponteiro_cadeia() {
			return getRuleContext(Ponteiro_cadeiaContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(595);
				inteiro();
				}
				break;
			case 2:
				{
				setState(596);
				real();
				}
				break;
			case 3:
				{
				setState(597);
				inteiros();
				}
				break;
			case 4:
				{
				setState(598);
				booleano();
				}
				break;
			case 5:
				{
				setState(599);
				booleanos();
				}
				break;
			case 6:
				{
				setState(600);
				reais();
				}
				break;
			case 7:
				{
				setState(601);
				cadeia_caracteres();
				}
				break;
			case 8:
				{
				setState(602);
				cadeias_caracteres();
				}
				break;
			case 9:
				{
				setState(603);
				ponteiro_inteiro();
				}
				break;
			case 10:
				{
				setState(604);
				ponteiro_real();
				}
				break;
			case 11:
				{
				setState(605);
				ponteiro_cadeia();
				}
				break;
			}
			setState(608);
			match(PONTO_VIRGULA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0265\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\7\2f"+
		"\n\2\f\2\16\2i\13\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3y\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u008b\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ad\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u00ba\n\5\f\5\16\5\u00bd\13\5\3\6\3\6\3\6\7\6\u00c2"+
		"\n\6\f\6\16\6\u00c5\13\6\3\7\3\7\3\7\6\7\u00ca\n\7\r\7\16\7\u00cb\5\7"+
		"\u00ce\n\7\3\7\5\7\u00d1\n\7\3\b\5\b\u00d4\n\b\3\b\3\b\3\b\3\b\5\b\u00da"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00e2\n\t\f\t\16\t\u00e5\13\t\3\n\5\n"+
		"\u00e8\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ef\n\n\5\n\u00f1\n\n\3\13\3\13\3"+
		"\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\f\5\f\u00fd\n\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0103\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u010b\n\r\f\r\16"+
		"\r\u010e\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u0115\n\16\3\17\5\17\u0118"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u011e\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\7\20\u0126\n\20\f\20\16\20\u0129\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0132\n\21\f\21\16\21\u0135\13\21\3\21\3\21\3\21\7\21\u013a"+
		"\n\21\f\21\16\21\u013d\13\21\3\21\5\21\u0140\n\21\5\21\u0142\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u014b\n\22\f\22\16\22\u014e\13\22"+
		"\3\22\3\22\3\22\7\22\u0153\n\22\f\22\16\22\u0156\13\22\3\22\5\22\u0159"+
		"\n\22\5\22\u015b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u0167\n\23\f\23\16\23\u016a\13\23\3\23\5\23\u016d\n\23\3\24\3\24"+
		"\7\24\u0171\n\24\f\24\16\24\u0174\13\24\3\24\3\24\3\25\3\25\7\25\u017a"+
		"\n\25\f\25\16\25\u017d\13\25\3\25\3\25\3\26\3\26\5\26\u0183\n\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u018e\n\31\f\31\16\31\u0191"+
		"\13\31\3\31\3\31\7\31\u0195\n\31\f\31\16\31\u0198\13\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\5\32\u01a2\n\32\3\33\3\33\3\33\5\33\u01a7\n"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u01af\n\35\f\35\16\35\u01b2\13"+
		"\35\3\36\3\36\3\36\3\36\5\36\u01b8\n\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01c4\n\37\3 \3 \3 \3 \3 \3 \7 \u01cc\n \f "+
		"\16 \u01cf\13 \3 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u01da\n!\f!\16!\u01dd\13"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\5$\u01e9\n$\3$\3$\5$\u01ed\n$\3%\3"+
		"%\3%\3%\3%\7%\u01f4\n%\f%\16%\u01f7\13%\5%\u01f9\n%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0209\n%\f%\16%\u020c\13%\3%\3%\5%\u0210\n"+
		"%\3&\3&\3&\3&\3&\5&\u0217\n&\3&\3&\3\'\3\'\5\'\u021d\n\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\5(\u022a\n(\3)\3)\3)\3)\3)\7)\u0231\n)\f)\16"+
		")\u0234\13)\3)\5)\u0237\n)\3)\3)\3)\3)\3)\5)\u023e\n)\3*\3*\3*\3*\5*\u0244"+
		"\n*\3*\3*\3*\3*\3*\5*\u024b\n*\3+\3+\7+\u024f\n+\f+\16+\u0252\13+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0261\n,\3,\3,\3,\2\3\b-\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2"+
		"\b\4\2##\'\'\4\2,-89\3\2:;\3\2\r\16\4\2\5\5\7\b\3\2\30\31\2\u02a8\2[\3"+
		"\2\2\2\4\u008a\3\2\2\2\6\u008c\3\2\2\2\b\u00ac\3\2\2\2\n\u00be\3\2\2\2"+
		"\f\u00d0\3\2\2\2\16\u00d3\3\2\2\2\20\u00dd\3\2\2\2\22\u00e7\3\2\2\2\24"+
		"\u00f2\3\2\2\2\26\u00fc\3\2\2\2\30\u0106\3\2\2\2\32\u0114\3\2\2\2\34\u0117"+
		"\3\2\2\2\36\u0121\3\2\2\2 \u012a\3\2\2\2\"\u0143\3\2\2\2$\u015c\3\2\2"+
		"\2&\u016e\3\2\2\2(\u0177\3\2\2\2*\u0180\3\2\2\2,\u0184\3\2\2\2.\u0187"+
		"\3\2\2\2\60\u018b\3\2\2\2\62\u01a1\3\2\2\2\64\u01a6\3\2\2\2\66\u01a8\3"+
		"\2\2\28\u01ab\3\2\2\2:\u01b3\3\2\2\2<\u01c3\3\2\2\2>\u01c5\3\2\2\2@\u01d3"+
		"\3\2\2\2B\u01e0\3\2\2\2D\u01e3\3\2\2\2F\u01e6\3\2\2\2H\u020f\3\2\2\2J"+
		"\u0216\3\2\2\2L\u021c\3\2\2\2N\u0229\3\2\2\2P\u022b\3\2\2\2R\u023f\3\2"+
		"\2\2T\u024c\3\2\2\2V\u0260\3\2\2\2XZ\5\6\4\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2"+
		"\2\2[\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\5\4\3\2_^\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5V,\2ed\3\2\2\2fi\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hm\3\2\2\2ig\3\2\2\2jl\5F$\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\3\3\2\2\2rs\7\25\2\2st\5\62"+
		"\32\2tu\7\26\2\2ux\5N(\2vw\7\27\2\2wy\5N(\2xv\3\2\2\2xy\3\2\2\2yz\3\2"+
		"\2\2z{\b\3\1\2{\u008b\3\2\2\2|}\7\25\2\2}~\7\61\2\2~\177\5\62\32\2\177"+
		"\u0080\7\62\2\2\u0080\u0083\5N(\2\u0081\u0082\7\27\2\2\u0082\u0084\5N"+
		"(\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\3\1\2\u0086\u008b\3\2\2\2\u0087\u0088\5H%\2\u0088\u0089\b\3\1"+
		"\2\u0089\u008b\3\2\2\2\u008ar\3\2\2\2\u008a|\3\2\2\2\u008a\u0087\3\2\2"+
		"\2\u008b\5\3\2\2\2\u008c\u008d\7\5\2\2\u008d\u008e\7\f\2\2\u008e\u008f"+
		"\7\61\2\2\u008f\u0090\7\5\2\2\u0090\u0091\7\3\2\2\u0091\u0092\7 \2\2\u0092"+
		"\u0093\7,\2\2\u0093\u0094\7\b\2\2\u0094\u0095\7-\2\2\u0095\u0096\7\4\2"+
		"\2\u0096\u0097\7\62\2\2\u0097\u0098\5> \2\u0098\7\3\2\2\2\u0099\u009a"+
		"\b\5\1\2\u009a\u009b\7$\2\2\u009b\u009d\7\61\2\2\u009c\u009e\5\n\6\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00ad\7\62"+
		"\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a2\5\b\5\2\u00a2\u00a3\7\62\2\2\u00a3"+
		"\u00ad\3\2\2\2\u00a4\u00ad\5H%\2\u00a5\u00ad\5&\24\2\u00a6\u00ad\5(\25"+
		"\2\u00a7\u00ad\7#\2\2\u00a8\u00ad\7\'\2\2\u00a9\u00ad\7(\2\2\u00aa\u00ad"+
		"\5*\26\2\u00ab\u00ad\5,\27\2\u00ac\u0099\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac"+
		"\u00a4\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00bb\3\2\2\2\u00ae\u00af\f\r\2\2\u00af\u00b0\7\66"+
		"\2\2\u00b0\u00ba\5\b\5\16\u00b1\u00b2\f\f\2\2\u00b2\u00b3\7\67\2\2\u00b3"+
		"\u00ba\5\b\5\r\u00b4\u00b5\f\3\2\2\u00b5\u00b6\7\63\2\2\u00b6\u00b7\5"+
		"\b\5\2\u00b7\u00b8\7\64\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\t\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c3"+
		"\5\b\5\2\u00bf\u00c0\7 \2\2\u00c0\u00c2\5\b\5\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\13\3\2\2"+
		"\2\u00c5\u00c3\3\2\2\2\u00c6\u00cd\7+\2\2\u00c7\u00ce\5H%\2\u00c8\u00ca"+
		"\5\b\5\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c9\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\r\3\2\2\2\u00d2\u00d4\7\5\2\2\u00d3\u00d2\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\7#\2\2\u00d6\u00d7"+
		"\7\63\2\2\u00d7\u00d8\t\2\2\2\u00d8\u00da\7\64\2\2\u00d9\u00d6\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\f\7\2\u00dc\17"+
		"\3\2\2\2\u00dd\u00de\7\5\2\2\u00de\u00e3\7#\2\2\u00df\u00e0\7 \2\2\u00e0"+
		"\u00e2\7#\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\21\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8"+
		"\7\6\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00f0\7#\2\2\u00ea\u00ee\7+\2\2\u00eb\u00ef\7\r\2\2\u00ec\u00ef\7\16"+
		"\2\2\u00ed\u00ef\5H%\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\23\3\2\2\2\u00f2\u00f3\7\6\2\2\u00f3\u00f8\7#\2\2\u00f4\u00f5\7 \2\2"+
		"\u00f5\u00f7\7#\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fd\7\7\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0102\7#\2\2\u00ff\u0100\7\63\2\2\u0100\u0101\t\2\2\2\u0101"+
		"\u0103\7\64\2\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0105\5\f\7\2\u0105\27\3\2\2\2\u0106\u0107\7\7\2\2\u0107"+
		"\u010c\7#\2\2\u0108\u0109\7 \2\2\u0109\u010b\7#\2\2\u010a\u0108\3\2\2"+
		"\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\31"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7+\2\2\u0110\u0115\7*\2\2\u0111"+
		"\u0112\7+\2\2\u0112\u0115\5H%\2\u0113\u0115\3\2\2\2\u0114\u010f\3\2\2"+
		"\2\u0114\u0111\3\2\2\2\u0114\u0113\3\2\2\2\u0115\33\3\2\2\2\u0116\u0118"+
		"\7\b\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011d\7#\2\2\u011a\u011b\7\63\2\2\u011b\u011c\t\2\2\2\u011c\u011e\7\64"+
		"\2\2\u011d\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\5\32\16\2\u0120\35\3\2\2\2\u0121\u0122\7\b\2\2\u0122\u0127\7#\2"+
		"\2\u0123\u0124\7 \2\2\u0124\u0126\7#\2\2\u0125\u0123\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\37\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7,\2\2\u012b\u012c\7\5\2\2\u012c\u012d\7-\2"+
		"\2\u012d\u0141\7#\2\2\u012e\u013f\7+\2\2\u012f\u0140\5H%\2\u0130\u0132"+
		"\5\b\5\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0140\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0140\7\13"+
		"\2\2\u0137\u013b\7\63\2\2\u0138\u013a\5\b\5\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u0140\7\64\2\2\u013f\u012f\3\2\2\2\u013f"+
		"\u0133\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u0137\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u012e\3\2\2\2\u0141\u0142\3\2\2\2\u0142!\3\2\2\2\u0143\u0144"+
		"\7,\2\2\u0144\u0145\7\7\2\2\u0145\u0146\7-\2\2\u0146\u015a\7#\2\2\u0147"+
		"\u0158\7+\2\2\u0148\u0159\5H%\2\u0149\u014b\5\b\5\2\u014a\u0149\3\2\2"+
		"\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0159"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0159\7\13\2\2\u0150\u0154\7\63\2\2"+
		"\u0151\u0153\5\b\5\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\7\64\2\2\u0158\u0148\3\2\2\2\u0158\u014c\3\2\2\2\u0158\u014f\3"+
		"\2\2\2\u0158\u0150\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0147\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b#\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\7\b\2\2\u015e"+
		"\u015f\7-\2\2\u015f\u0160\7#\2\2\u0160\u016c\7+\2\2\u0161\u016d\7*\2\2"+
		"\u0162\u016d\5H%\2\u0163\u016d\7\13\2\2\u0164\u0168\7\63\2\2\u0165\u0167"+
		"\5\b\5\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7\64"+
		"\2\2\u016c\u0161\3\2\2\2\u016c\u0162\3\2\2\2\u016c\u0163\3\2\2\2\u016c"+
		"\u0164\3\2\2\2\u016d%\3\2\2\2\u016e\u0172\7\61\2\2\u016f\u0171\5\b\5\2"+
		"\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\62\2\2"+
		"\u0176\'\3\2\2\2\u0177\u017b\7\63\2\2\u0178\u017a\5\b\5\2\u0179\u0178"+
		"\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\64\2\2\u017f)\3\2\2\2"+
		"\u0180\u0182\7\67\2\2\u0181\u0183\5\b\5\2\u0182\u0181\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183+\3\2\2\2\u0184\u0185\7\65\2\2\u0185\u0186\7#\2\2\u0186"+
		"-\3\2\2\2\u0187\u0188\5\b\5\2\u0188\u0189\t\3\2\2\u0189\u018a\5\b\5\2"+
		"\u018a/\3\2\2\2\u018b\u018f\7\61\2\2\u018c\u018e\5\b\5\2\u018d\u018c\3"+
		"\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0196\t\4\2\2\u0193\u0195\5\b"+
		"\5\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7\62"+
		"\2\2\u019a\u019b\78\2\2\u019b\u019c\t\5\2\2\u019c\61\3\2\2\2\u019d\u01a2"+
		"\5.\30\2\u019e\u019f\5\b\5\2\u019f\u01a0\7\"\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019d\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a7\5.\30"+
		"\2\u01a4\u01a7\5\b\5\2\u01a5\u01a7\7*\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\65\3\2\2\2\u01a8\u01a9\5<\37\2\u01a9"+
		"\u01aa\7#\2\2\u01aa\67\3\2\2\2\u01ab\u01b0\5\66\34\2\u01ac\u01ad\7 \2"+
		"\2\u01ad\u01af\5\66\34\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b19\3\2\2\2\u01b2\u01b0\3\2\2\2"+
		"\u01b3\u01b4\5<\37\2\u01b4\u01b5\7#\2\2\u01b5\u01b7\7\61\2\2\u01b6\u01b8"+
		"\58\35\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\7\62\2\2\u01ba;\3\2\2\2\u01bb\u01c4\7\5\2\2\u01bc\u01c4\7\7\2\2"+
		"\u01bd\u01c4\7\6\2\2\u01be\u01c4\7\b\2\2\u01bf\u01c4\7\t\2\2\u01c0\u01c1"+
		"\7,\2\2\u01c1\u01c2\t\6\2\2\u01c2\u01c4\7-\2\2\u01c3\u01bb\3\2\2\2\u01c3"+
		"\u01bc\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3\u01bf\3\2"+
		"\2\2\u01c3\u01c0\3\2\2\2\u01c4=\3\2\2\2\u01c5\u01cd\7/\2\2\u01c6\u01cc"+
		"\5V,\2\u01c7\u01c8\5H%\2\u01c8\u01c9\7\"\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01cc\5N(\2\u01cb\u01c6\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01ca\3\2\2"+
		"\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\5N(\2\u01d1\u01d2\7\60\2\2\u01d2"+
		"?\3\2\2\2\u01d3\u01db\7/\2\2\u01d4\u01da\5V,\2\u01d5\u01d6\5H%\2\u01d6"+
		"\u01d7\7\"\2\2\u01d7\u01da\3\2\2\2\u01d8\u01da\5N(\2\u01d9\u01d4\3\2\2"+
		"\2\u01d9\u01d5\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01df\7\60\2\2\u01dfA\3\2\2\2\u01e0\u01e1\7.\2\2\u01e1\u01e2\5@!\2\u01e2"+
		"C\3\2\2\2\u01e3\u01e4\7<\2\2\u01e4\u01e5\5@!\2\u01e5E\3\2\2\2\u01e6\u01e8"+
		"\5:\36\2\u01e7\u01e9\5B\"\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\5> \2\u01eb\u01ed\5D#\2\u01ec\u01eb\3\2\2\2"+
		"\u01ec\u01ed\3\2\2\2\u01edG\3\2\2\2\u01ee\u01ef\7#\2\2\u01ef\u01f8\7\61"+
		"\2\2\u01f0\u01f5\5\b\5\2\u01f1\u01f2\7 \2\2\u01f2\u01f4\5\b\5\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0210\7\62\2\2\u01fb\u01fc\7"+
		".\2\2\u01fc\u01fd\7\61\2\2\u01fd\u0210\7\62\2\2\u01fe\u01ff\7\n\2\2\u01ff"+
		"\u0200\7\61\2\2\u0200\u0201\5\b\5\2\u0201\u0202\7\62\2\2\u0202\u0210\3"+
		"\2\2\2\u0203\u0204\t\7\2\2\u0204\u0205\7\61\2\2\u0205\u020a\5\b\5\2\u0206"+
		"\u0207\7 \2\2\u0207\u0209\5\b\5\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2"+
		"\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u020e\7\62\2\2\u020e\u0210\3\2\2\2\u020f\u01ee\3"+
		"\2\2\2\u020f\u01fb\3\2\2\2\u020f\u01fe\3\2\2\2\u020f\u0203\3\2\2\2\u0210"+
		"I\3\2\2\2\u0211\u0217\7\22\2\2\u0212\u0217\7\23\2\2\u0213\u0214\7\24\2"+
		"\2\u0214\u0217\5\64\33\2\u0215\u0217\7\24\2\2\u0216\u0211\3\2\2\2\u0216"+
		"\u0212\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u0219\7\"\2\2\u0219K\3\2\2\2\u021a\u021d\7#\2\2\u021b\u021d"+
		"\5(\25\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\7+\2\2\u021f\u0220\5\64\33\2\u0220\u0221\3\2\2\2\u0221\u0222\7"+
		"\"\2\2\u0222M\3\2\2\2\u0223\u022a\5\62\32\2\u0224\u022a\5J&\2\u0225\u022a"+
		"\5L\'\2\u0226\u022a\5P)\2\u0227\u022a\5R*\2\u0228\u022a\5T+\2\u0229\u0223"+
		"\3\2\2\2\u0229\u0224\3\2\2\2\u0229\u0225\3\2\2\2\u0229\u0226\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022aO\3\2\2\2\u022b\u022c\7\25\2\2"+
		"\u022c\u0236\7\61\2\2\u022d\u0232\5.\30\2\u022e\u022f\t\4\2\2\u022f\u0231"+
		"\5.\30\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\5\60"+
		"\31\2\u0236\u022d\3\2\2\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\7\62\2\2\u0239\u023a\7\26\2\2\u023a\u023d\5N(\2\u023b\u023c\7\27"+
		"\2\2\u023c\u023e\5N(\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023eQ"+
		"\3\2\2\2\u023f\u0240\7\17\2\2\u0240\u0243\7\61\2\2\u0241\u0244\5\62\32"+
		"\2\u0242\u0244\5\60\31\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\7\62\2\2\u0246\u0247\7\20\2\2\u0247\u024a\5"+
		"N(\2\u0248\u0249\7\21\2\2\u0249\u024b\5N(\2\u024a\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024bS\3\2\2\2\u024c\u0250\7/\2\2\u024d\u024f\5N(\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7\60\2\2\u0254"+
		"U\3\2\2\2\u0255\u0261\5\16\b\2\u0256\u0261\5\26\f\2\u0257\u0261\5\20\t"+
		"\2\u0258\u0261\5\22\n\2\u0259\u0261\5\24\13\2\u025a\u0261\5\30\r\2\u025b"+
		"\u0261\5\34\17\2\u025c\u0261\5\36\20\2\u025d\u0261\5 \21\2\u025e\u0261"+
		"\5\"\22\2\u025f\u0261\5$\23\2\u0260\u0255\3\2\2\2\u0260\u0256\3\2\2\2"+
		"\u0260\u0257\3\2\2\2\u0260\u0258\3\2\2\2\u0260\u0259\3\2\2\2\u0260\u025a"+
		"\3\2\2\2\u0260\u025b\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7\""+
		"\2\2\u0263W\3\2\2\2G[agmx\u0083\u008a\u009d\u00ac\u00b9\u00bb\u00c3\u00cb"+
		"\u00cd\u00d0\u00d3\u00d9\u00e3\u00e7\u00ee\u00f0\u00f8\u00fc\u0102\u010c"+
		"\u0114\u0117\u011d\u0127\u0133\u013b\u013f\u0141\u014c\u0154\u0158\u015a"+
		"\u0168\u016c\u0172\u017b\u0182\u018f\u0196\u01a1\u01a6\u01b0\u01b7\u01c3"+
		"\u01cb\u01cd\u01d9\u01db\u01e8\u01ec\u01f5\u01f8\u020a\u020f\u0216\u021c"+
		"\u0229\u0232\u0236\u023d\u0243\u024a\u0250\u0260";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}