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
		INT=1, BOOL=2, FLOAT=3, STRING=4, VOID=5, SIZEOF=6, NULL=7, ALG=8, TRUE=9, 
		FALSE=10, WHILE=11, DO=12, FINALLY=13, LEAVE=14, RESTART=15, RETURN=16, 
		IF=17, THEN=18, ELSE=19, WRITE=20, WRITELN=21, CHANGE_LINE=22, CARRIAGE_RETURN=23, 
		SPACE=24, TABULACAO_HORIZONTAL=25, COMMENT_E=26, COMMENT_O=27, VIRGULA=28, 
		E=29, PONTO_VIRGULA=30, IDENT=31, ID=32, LETTER=33, LATIN1=34, LITERAL_INTEIRO=35, 
		LITERAL_DECIMAL=36, LITERAL_EXPONENCIAL=37, CADEIA_CARACTERES=38, EQUAL=39, 
		MENORQ=40, MAIORQ=41, AT_SIGN=42, L_BRACE=43, R_BRACE=44, LP=45, RP=46, 
		INDEX_POINT_L=47, INDEX_POINT_R=48, IDEY=49, MULT_DIV=50, SOMA_SUB=51, 
		EQUAL_DIF=52, COMPARATOR=53, E_LOGICO=54, OU_LOGICO=55, D_MAIORQ=56, WS=57, 
		COMMENTS=58;
	public static final int
		RULE_programa = 0, RULE_fcall = 1, RULE_expr = 2, RULE_exprList = 3, RULE_equals = 4, 
		RULE_inteiro = 5, RULE_inteiros = 6, RULE_booleano = 7, RULE_booleanos = 8, 
		RULE_real = 9, RULE_reais = 10, RULE_equals_string = 11, RULE_cadeia_caracteres = 12, 
		RULE_cadeias_caracteres = 13, RULE_ponteiro_inteiro = 14, RULE_ponteiro_real = 15, 
		RULE_ponteiro_cadeia = 16, RULE_op_paranteses = 17, RULE_op_pointer = 18, 
		RULE_ide = 19, RULE_comparations = 20, RULE_booV = 21, RULE_logics = 22, 
		RULE_expressions_list = 23, RULE_expressions_list2 = 24, RULE_arg = 25, 
		RULE_args = 26, RULE_function_declare = 27, RULE_type = 28, RULE_body = 29, 
		RULE_prologo = 30, RULE_epilogo = 31, RULE_function = 32, RULE_function_invocate = 33, 
		RULE_ctrl_instruct = 34, RULE_attributes = 35, RULE_instructions = 36, 
		RULE_if_cond = 37, RULE_loop = 38, RULE_sub_block = 39, RULE_variable = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "fcall", "expr", "exprList", "equals", "inteiro", "inteiros", 
			"booleano", "booleanos", "real", "reais", "equals_string", "cadeia_caracteres", 
			"cadeias_caracteres", "ponteiro_inteiro", "ponteiro_real", "ponteiro_cadeia", 
			"op_paranteses", "op_pointer", "ide", "comparations", "booV", "logics", 
			"expressions_list", "expressions_list2", "arg", "args", "function_declare", 
			"type", "body", "prologo", "epilogo", "function", "function_invocate", 
			"ctrl_instruct", "attributes", "instructions", "if_cond", "loop", "sub_block", 
			"variable"
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
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					fcall();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					variable();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << MENORQ))) != 0)) {
				{
				{
				setState(94);
				function();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(IF);
				setState(103);
				expressions_list();
				setState(104);
				match(THEN);
				setState(105);
				instructions();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(106);
					match(ELSE);
					setState(107);
					instructions();
					}
				}

				notifyErrorListeners("Missing parenteses");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(IF);
				setState(113);
				match(LP);
				setState(114);
				expressions_list();
				setState(115);
				match(RP);
				setState(116);
				instructions();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(117);
					match(ELSE);
					setState(118);
					instructions();
					}
				}

				notifyErrorListeners("Missing 'then'condition");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				match(ID);
				setState(130);
				match(LP);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					setState(131);
					exprList();
					}
				}

				setState(134);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(LP);
				setState(136);
				expr(0);
				setState(137);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new FuncInvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				function_invocate();
				}
				break;
			case 4:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				op_paranteses();
				}
				break;
			case 5:
				{
				_localctx = new PointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				op_pointer();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(IDENT);
				}
				break;
			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(LITERAL_INTEIRO);
				}
				break;
			case 8:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(LITERAL_DECIMAL);
				}
				break;
			case 9:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				ide();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(149);
						match(MULT_DIV);
						}
						setState(150);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(152);
						match(SOMA_SUB);
						}
						setState(153);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 6, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			expr(0);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(160);
				match(VIRGULA);
				setState(161);
				expr(0);
				}
				}
				setState(166);
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
		enterRule(_localctx, 8, RULE_equals);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(167);
				match(EQUAL);
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(168);
					expr(0);
					}
					}
					setState(171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0) );
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
		enterRule(_localctx, 10, RULE_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(176);
				match(INT);
				}
			}

			setState(179);
			match(IDENT);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(180);
				match(INDEX_POINT_L);
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(INDEX_POINT_R);
				}
			}

			setState(185);
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
		enterRule(_localctx, 12, RULE_inteiros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(INT);
			setState(188);
			match(IDENT);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(189);
				match(VIRGULA);
				setState(190);
				match(IDENT);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
		public TerminalNode EQUAL() { return getToken(alg.EQUAL, 0); }
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
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
		enterRule(_localctx, 14, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(196);
				match(BOOL);
				}
			}

			setState(199);
			match(IDENT);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(200);
				match(EQUAL);
				setState(201);
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
		enterRule(_localctx, 16, RULE_booleanos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(BOOL);
			setState(205);
			match(IDENT);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(206);
				match(VIRGULA);
				setState(207);
				match(IDENT);
				}
				}
				setState(212);
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
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FLOAT);
			setState(214);
			match(IDENT);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(215);
				match(INDEX_POINT_L);
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				match(INDEX_POINT_R);
				}
			}

			setState(220);
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
		enterRule(_localctx, 20, RULE_reais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(FLOAT);
			setState(223);
			match(IDENT);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(224);
				match(VIRGULA);
				setState(225);
				match(IDENT);
				}
				}
				setState(230);
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
		enterRule(_localctx, 22, RULE_equals_string);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(EQUAL);
				setState(232);
				match(CADEIA_CARACTERES);
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
		enterRule(_localctx, 24, RULE_cadeia_caracteres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(236);
				match(STRING);
				}
			}

			setState(239);
			match(IDENT);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(240);
				match(INDEX_POINT_L);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				match(INDEX_POINT_R);
				}
			}

			setState(245);
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
		enterRule(_localctx, 26, RULE_cadeias_caracteres);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(STRING);
			setState(248);
			match(IDENT);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(249);
				match(VIRGULA);
				setState(250);
				match(IDENT);
				}
				}
				setState(255);
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
		enterRule(_localctx, 28, RULE_ponteiro_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(MENORQ);
			setState(257);
			match(INT);
			setState(258);
			match(MAIORQ);
			setState(259);
			match(IDENT);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(260);
				match(EQUAL);
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(261);
						expr(0);
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(267);
					match(NULL);
					}
					break;
				case 3:
					{
					{
					setState(268);
					match(INDEX_POINT_L);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(269);
						expr(0);
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(275);
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
		enterRule(_localctx, 30, RULE_ponteiro_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(MENORQ);
			setState(281);
			match(FLOAT);
			setState(282);
			match(MAIORQ);
			setState(283);
			match(IDENT);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(284);
				match(EQUAL);
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(285);
						expr(0);
						}
						}
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(291);
					match(NULL);
					}
					break;
				case 3:
					{
					{
					setState(292);
					match(INDEX_POINT_L);
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(293);
						expr(0);
						}
						}
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(299);
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
		enterRule(_localctx, 32, RULE_ponteiro_cadeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(MENORQ);
			setState(305);
			match(STRING);
			setState(306);
			match(MAIORQ);
			setState(307);
			match(IDENT);
			{
			setState(308);
			match(EQUAL);
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA_CARACTERES:
				{
				setState(309);
				match(CADEIA_CARACTERES);
				}
				break;
			case NULL:
				{
				setState(310);
				match(NULL);
				}
				break;
			case INDEX_POINT_L:
				{
				{
				setState(311);
				match(INDEX_POINT_L);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					{
					setState(312);
					expr(0);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
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
		enterRule(_localctx, 34, RULE_op_paranteses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(LP);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(322);
				expr(0);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(328);
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
		enterRule(_localctx, 36, RULE_op_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(INDEX_POINT_L);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(331);
				expr(0);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(337);
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
		public TerminalNode IDEY() { return getToken(alg.IDEY, 0); }
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
		enterRule(_localctx, 38, RULE_ide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==IDEY || _la==SOMA_SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(340);
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

	public static class ComparationsContext extends ParserRuleContext {
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
		public TerminalNode EQUAL_DIF() { return getToken(alg.EQUAL_DIF, 0); }
		public TerminalNode COMPARATOR() { return getToken(alg.COMPARATOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Op_parantesesContext> op_paranteses() {
			return getRuleContexts(Op_parantesesContext.class);
		}
		public Op_parantesesContext op_paranteses(int i) {
			return getRuleContext(Op_parantesesContext.class,i);
		}
		public List<Op_pointerContext> op_pointer() {
			return getRuleContexts(Op_pointerContext.class);
		}
		public Op_pointerContext op_pointer(int i) {
			return getRuleContext(Op_pointerContext.class,i);
		}
		public List<IdeContext> ide() {
			return getRuleContexts(IdeContext.class);
		}
		public IdeContext ide(int i) {
			return getRuleContext(IdeContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public BooVContext booV() {
			return getRuleContext(BooVContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_comparations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(343);
				expr(0);
				}
				break;
			case 2:
				{
				setState(344);
				op_paranteses();
				}
				break;
			case 3:
				{
				setState(345);
				op_pointer();
				}
				break;
			case 4:
				{
				setState(346);
				ide();
				}
				break;
			}
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQ) | (1L << MAIORQ) | (1L << EQUAL_DIF) | (1L << COMPARATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(350);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(351);
				expr(0);
				}
				break;
			case 3:
				{
				setState(352);
				op_paranteses();
				}
				break;
			case 4:
				{
				setState(353);
				op_pointer();
				}
				break;
			case 5:
				{
				setState(354);
				ide();
				}
				break;
			case 6:
				{
				setState(355);
				booV();
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

	public static class BooVContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
		public BooVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBooV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBooV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBooV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooVContext booV() throws RecognitionException {
		BooVContext _localctx = new BooVContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 44, RULE_logics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LP);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(361);
				expr(0);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(367);
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
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(368);
				expr(0);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(374);
			match(RP);
			setState(375);
			match(EQUAL_DIF);
			setState(376);
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
		enterRule(_localctx, 46, RULE_expressions_list);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				comparations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(379);
				expr(0);
				setState(380);
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
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
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
		enterRule(_localctx, 48, RULE_expressions_list2);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				comparations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(CADEIA_CARACTERES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(BOOL);
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
		enterRule(_localctx, 50, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			type();
			setState(391);
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
		enterRule(_localctx, 52, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			arg();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(394);
				match(VIRGULA);
				setState(395);
				arg();
				}
				}
				setState(400);
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
		enterRule(_localctx, 54, RULE_function_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			type();
			setState(402);
			match(IDENT);
			setState(403);
			match(LP);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << MENORQ))) != 0)) {
				{
				setState(404);
				args();
				}
			}

			setState(407);
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
		enterRule(_localctx, 56, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(409);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(410);
				match(FLOAT);
				}
				break;
			case BOOL:
				{
				setState(411);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(412);
				match(STRING);
				}
				break;
			case VOID:
				{
				setState(413);
				match(VOID);
				}
				break;
			case MENORQ:
				{
				{
				setState(414);
				match(MENORQ);
				setState(415);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(416);
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
		enterRule(_localctx, 58, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(L_BRACE);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(425);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(420);
						variable();
						}
						break;
					case 2:
						{
						setState(421);
						function_invocate();
						setState(422);
						match(PONTO_VIRGULA);
						}
						break;
					case 3:
						{
						setState(424);
						instructions();
						}
						break;
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(430);
			instructions();
			setState(431);
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		enterRule(_localctx, 60, RULE_prologo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(AT_SIGN);
			setState(434);
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

	public static class EpilogoContext extends ParserRuleContext {
		public TerminalNode D_MAIORQ() { return getToken(alg.D_MAIORQ, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		enterRule(_localctx, 62, RULE_epilogo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(D_MAIORQ);
			setState(437);
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
		enterRule(_localctx, 64, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			function_declare();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SIGN) {
				{
				setState(440);
				prologo();
				}
			}

			setState(443);
			body();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==D_MAIORQ) {
				{
				setState(444);
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
		enterRule(_localctx, 66, RULE_function_invocate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				{
				setState(447);
				match(IDENT);
				setState(448);
				match(LP);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					setState(449);
					expr(0);
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(450);
						match(VIRGULA);
						setState(451);
						expr(0);
						}
						}
						setState(456);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(459);
				match(RP);
				}
				}
				break;
			case AT_SIGN:
				{
				{
				setState(460);
				match(AT_SIGN);
				setState(461);
				match(LP);
				setState(462);
				match(RP);
				}
				}
				break;
			case SIZEOF:
				{
				{
				setState(463);
				match(SIZEOF);
				setState(464);
				match(LP);
				setState(465);
				expr(0);
				setState(466);
				match(RP);
				}
				}
				break;
			case WRITE:
			case WRITELN:
				{
				{
				setState(468);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				match(LP);
				setState(470);
				expr(0);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(471);
					match(VIRGULA);
					setState(472);
					expr(0);
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
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
		enterRule(_localctx, 68, RULE_ctrl_instruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(482);
				match(LEAVE);
				}
				break;
			case 2:
				{
				setState(483);
				match(RESTART);
				}
				break;
			case 3:
				{
				{
				setState(484);
				match(RETURN);
				setState(485);
				expressions_list2();
				}
				}
				break;
			case 4:
				{
				setState(486);
				match(RETURN);
				}
				break;
			}
			setState(489);
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
		enterRule(_localctx, 70, RULE_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(491);
				match(IDENT);
				}
				break;
			case INDEX_POINT_L:
				{
				setState(492);
				op_pointer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(495);
			match(EQUAL);
			setState(496);
			expressions_list2();
			}
			setState(498);
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
		enterRule(_localctx, 72, RULE_instructions);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				expressions_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				ctrl_instruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				attributes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				if_cond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
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
		enterRule(_localctx, 74, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IF);
			setState(509);
			match(LP);
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				{
				setState(510);
				comparations();
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==E_LOGICO || _la==OU_LOGICO) {
					{
					{
					setState(511);
					_la = _input.LA(1);
					if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(512);
					comparations();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(518);
				logics();
				}
				break;
			}
			setState(521);
			match(RP);
			setState(522);
			match(THEN);
			setState(523);
			instructions();
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(524);
				match(ELSE);
				setState(525);
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
		enterRule(_localctx, 76, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(WHILE);
			setState(529);
			match(LP);
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(530);
				expressions_list();
				}
				break;
			case 2:
				{
				setState(531);
				logics();
				}
				break;
			}
			setState(534);
			match(RP);
			setState(535);
			match(DO);
			setState(536);
			instructions();
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(537);
				match(FINALLY);
				setState(538);
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
		enterRule(_localctx, 78, RULE_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(L_BRACE);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << L_BRACE) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(542);
				instructions();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
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
		public InteirosContext inteiros() {
			return getRuleContext(InteirosContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BooleanosContext booleanos() {
			return getRuleContext(BooleanosContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
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
		enterRule(_localctx, 80, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(550);
				inteiro();
				}
				break;
			case 2:
				{
				setState(551);
				inteiros();
				}
				break;
			case 3:
				{
				setState(552);
				booleano();
				}
				break;
			case 4:
				{
				setState(553);
				booleanos();
				}
				break;
			case 5:
				{
				setState(554);
				real();
				}
				break;
			case 6:
				{
				setState(555);
				reais();
				}
				break;
			case 7:
				{
				setState(556);
				cadeia_caracteres();
				}
				break;
			case 8:
				{
				setState(557);
				cadeias_caracteres();
				}
				break;
			case 9:
				{
				setState(558);
				ponteiro_inteiro();
				}
				break;
			case 10:
				{
				setState(559);
				ponteiro_real();
				}
				break;
			case 11:
				{
				setState(560);
				ponteiro_cadeia();
				}
				break;
			}
			setState(563);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0238\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\7\2b\n\2\f\2\16"+
		"\2e\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3z\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u0081\n\3\3\4\3\4\3"+
		"\4\3\4\5\4\u0087\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u0095\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u009d\n\4\f\4\16\4\u00a0\13\4"+
		"\3\5\3\5\3\5\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\6\3\6\6\6\u00ac\n\6\r"+
		"\6\16\6\u00ad\3\6\5\6\u00b1\n\6\3\7\5\7\u00b4\n\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00ba\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3"+
		"\t\5\t\u00c8\n\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\n\3\n\3\n\3\n\7\n\u00d3\n"+
		"\n\f\n\16\n\u00d6\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u00dd\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\f\u00e5\n\f\f\f\16\f\u00e8\13\f\3\r\3\r\3\r\5\r"+
		"\u00ed\n\r\3\16\5\16\u00f0\n\16\3\16\3\16\3\16\3\16\5\16\u00f6\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\7\17\u00fe\n\17\f\17\16\17\u0101\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u0109\n\20\f\20\16\20\u010c\13\20\3"+
		"\20\3\20\3\20\7\20\u0111\n\20\f\20\16\20\u0114\13\20\3\20\5\20\u0117\n"+
		"\20\5\20\u0119\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0121\n\21\f\21"+
		"\16\21\u0124\13\21\3\21\3\21\3\21\7\21\u0129\n\21\f\21\16\21\u012c\13"+
		"\21\3\21\5\21\u012f\n\21\5\21\u0131\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u013c\n\22\f\22\16\22\u013f\13\22\3\22\5\22\u0142"+
		"\n\22\3\23\3\23\7\23\u0146\n\23\f\23\16\23\u0149\13\23\3\23\3\23\3\24"+
		"\3\24\7\24\u014f\n\24\f\24\16\24\u0152\13\24\3\24\3\24\3\25\3\25\5\25"+
		"\u0158\n\25\3\26\3\26\3\26\3\26\5\26\u015e\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0167\n\26\3\27\3\27\3\30\3\30\7\30\u016d\n\30\f\30"+
		"\16\30\u0170\13\30\3\30\3\30\7\30\u0174\n\30\f\30\16\30\u0177\13\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0181\n\31\3\32\3\32\3\32"+
		"\3\32\5\32\u0187\n\32\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u018f\n\34\f"+
		"\34\16\34\u0192\13\34\3\35\3\35\3\35\3\35\5\35\u0198\n\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a4\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u01ac\n\37\f\37\16\37\u01af\13\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\5\"\u01bc\n\"\3\"\3\"\5\"\u01c0\n\"\3#\3#\3"+
		"#\3#\3#\7#\u01c7\n#\f#\16#\u01ca\13#\5#\u01cc\n#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\7#\u01dc\n#\f#\16#\u01df\13#\3#\3#\5#\u01e3\n#\3"+
		"$\3$\3$\3$\3$\5$\u01ea\n$\3$\3$\3%\3%\5%\u01f0\n%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\5&\u01fd\n&\3\'\3\'\3\'\3\'\3\'\7\'\u0204\n\'\f\'\16\'\u0207"+
		"\13\'\3\'\5\'\u020a\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0211\n\'\3(\3(\3(\3("+
		"\5(\u0217\n(\3(\3(\3(\3(\3(\5(\u021e\n(\3)\3)\7)\u0222\n)\f)\16)\u0225"+
		"\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0234\n*\3*\3*\3*\2\3\6"+
		"+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPR\2\t\4\2!!%%\3\2\13\f\4\2\63\63\65\65\4\2*+\66\67\3\289\4\2\3\3"+
		"\5\6\3\2\26\27\2\u0278\2W\3\2\2\2\4\u0080\3\2\2\2\6\u0094\3\2\2\2\b\u00a1"+
		"\3\2\2\2\n\u00b0\3\2\2\2\f\u00b3\3\2\2\2\16\u00bd\3\2\2\2\20\u00c7\3\2"+
		"\2\2\22\u00ce\3\2\2\2\24\u00d7\3\2\2\2\26\u00e0\3\2\2\2\30\u00ec\3\2\2"+
		"\2\32\u00ef\3\2\2\2\34\u00f9\3\2\2\2\36\u0102\3\2\2\2 \u011a\3\2\2\2\""+
		"\u0132\3\2\2\2$\u0143\3\2\2\2&\u014c\3\2\2\2(\u0155\3\2\2\2*\u015d\3\2"+
		"\2\2,\u0168\3\2\2\2.\u016a\3\2\2\2\60\u0180\3\2\2\2\62\u0186\3\2\2\2\64"+
		"\u0188\3\2\2\2\66\u018b\3\2\2\28\u0193\3\2\2\2:\u01a3\3\2\2\2<\u01a5\3"+
		"\2\2\2>\u01b3\3\2\2\2@\u01b6\3\2\2\2B\u01b9\3\2\2\2D\u01e2\3\2\2\2F\u01e9"+
		"\3\2\2\2H\u01ef\3\2\2\2J\u01fc\3\2\2\2L\u01fe\3\2\2\2N\u0212\3\2\2\2P"+
		"\u021f\3\2\2\2R\u0233\3\2\2\2TV\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2"+
		"WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5R*\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2"+
		"]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5B\"\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hi\7\23\2\2ij\5\60"+
		"\31\2jk\7\24\2\2kn\5J&\2lm\7\25\2\2mo\5J&\2nl\3\2\2\2no\3\2\2\2op\3\2"+
		"\2\2pq\b\3\1\2q\u0081\3\2\2\2rs\7\23\2\2st\7/\2\2tu\5\60\31\2uv\7\60\2"+
		"\2vy\5J&\2wx\7\25\2\2xz\5J&\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\3\1\2"+
		"|\u0081\3\2\2\2}~\5D#\2~\177\b\3\1\2\177\u0081\3\2\2\2\u0080h\3\2\2\2"+
		"\u0080r\3\2\2\2\u0080}\3\2\2\2\u0081\5\3\2\2\2\u0082\u0083\b\4\1\2\u0083"+
		"\u0084\7\"\2\2\u0084\u0086\7/\2\2\u0085\u0087\5\b\5\2\u0086\u0085\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0095\7\60\2\2\u0089"+
		"\u008a\7/\2\2\u008a\u008b\5\6\4\2\u008b\u008c\7\60\2\2\u008c\u0095\3\2"+
		"\2\2\u008d\u0095\5D#\2\u008e\u0095\5$\23\2\u008f\u0095\5&\24\2\u0090\u0095"+
		"\7!\2\2\u0091\u0095\7%\2\2\u0092\u0095\7&\2\2\u0093\u0095\5(\25\2\u0094"+
		"\u0082\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u009e\3\2\2\2\u0096\u0097\f\13"+
		"\2\2\u0097\u0098\7\64\2\2\u0098\u009d\5\6\4\f\u0099\u009a\f\n\2\2\u009a"+
		"\u009b\7\65\2\2\u009b\u009d\5\6\4\13\u009c\u0096\3\2\2\2\u009c\u0099\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\7\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a6\5\6\4\2\u00a2\u00a3\7\36\2"+
		"\2\u00a3\u00a5\5\6\4\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\t\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\7)\2\2\u00aa\u00ac\5\6\4\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\13\3\2\2"+
		"\2\u00b2\u00b4\7\3\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b9\7!\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\t\2\2\2\u00b8"+
		"\u00ba\7\62\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00bc\5\n\6\2\u00bc\r\3\2\2\2\u00bd\u00be\7\3\2\2\u00be\u00c3"+
		"\7!\2\2\u00bf\u00c0\7\36\2\2\u00c0\u00c2\7!\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\17\3\2\2"+
		"\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\4\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\7!\2\2\u00ca\u00cb\7)\2\2\u00cb"+
		"\u00cd\t\3\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\21\3\2\2"+
		"\2\u00ce\u00cf\7\4\2\2\u00cf\u00d4\7!\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00d3"+
		"\7!\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\23\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\5\2"+
		"\2\u00d8\u00dc\7!\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\t\2\2\2\u00db\u00dd"+
		"\7\62\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\u00df\5\n\6\2\u00df\25\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e6"+
		"\7!\2\2\u00e2\u00e3\7\36\2\2\u00e3\u00e5\7!\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\27\3\2\2"+
		"\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\u00ed\7(\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\31\3\2\2\2\u00ee"+
		"\u00f0\7\6\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f5\7!\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\t\2\2\2\u00f4"+
		"\u00f6\7\62\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\5\30\r\2\u00f8\33\3\2\2\2\u00f9\u00fa\7\6\2\2\u00fa"+
		"\u00ff\7!\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00fe\7!\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\35\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7*\2\2\u0103\u0104\7\3\2\2"+
		"\u0104\u0105\7+\2\2\u0105\u0118\7!\2\2\u0106\u0116\7)\2\2\u0107\u0109"+
		"\5\6\4\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0117\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0117\7\t"+
		"\2\2\u010e\u0112\7\61\2\2\u010f\u0111\5\6\4\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\62\2\2\u0116\u010a\3\2\2\2\u0116"+
		"\u010d\3\2\2\2\u0116\u010e\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0106\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\37\3\2\2\2\u011a\u011b\7*\2\2\u011b\u011c"+
		"\7\5\2\2\u011c\u011d\7+\2\2\u011d\u0130\7!\2\2\u011e\u012e\7)\2\2\u011f"+
		"\u0121\5\6\4\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u012f\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u012f\7\t\2\2\u0126\u012a\7\61\2\2\u0127\u0129\5\6\4\2\u0128\u0127\3"+
		"\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7\62\2\2\u012e\u0122\3"+
		"\2\2\2\u012e\u0125\3\2\2\2\u012e\u0126\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u011e\3\2\2\2\u0130\u0131\3\2\2\2\u0131!\3\2\2\2\u0132\u0133\7*\2\2\u0133"+
		"\u0134\7\6\2\2\u0134\u0135\7+\2\2\u0135\u0136\7!\2\2\u0136\u0141\7)\2"+
		"\2\u0137\u0142\7(\2\2\u0138\u0142\7\t\2\2\u0139\u013d\7\61\2\2\u013a\u013c"+
		"\5\6\4\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\7\62"+
		"\2\2\u0141\u0137\3\2\2\2\u0141\u0138\3\2\2\2\u0141\u0139\3\2\2\2\u0142"+
		"#\3\2\2\2\u0143\u0147\7/\2\2\u0144\u0146\5\6\4\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7\60\2\2\u014b%\3\2\2\2\u014c\u0150"+
		"\7\61\2\2\u014d\u014f\5\6\4\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0154\7\62\2\2\u0154\'\3\2\2\2\u0155\u0157\t\4\2\2\u0156"+
		"\u0158\5\6\4\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158)\3\2\2\2"+
		"\u0159\u015e\5\6\4\2\u015a\u015e\5$\23\2\u015b\u015e\5&\24\2\u015c\u015e"+
		"\5(\25\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0166\t\5\2\2\u0160\u0167\7!"+
		"\2\2\u0161\u0167\5\6\4\2\u0162\u0167\5$\23\2\u0163\u0167\5&\24\2\u0164"+
		"\u0167\5(\25\2\u0165\u0167\5,\27\2\u0166\u0160\3\2\2\2\u0166\u0161\3\2"+
		"\2\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167+\3\2\2\2\u0168\u0169\t\3\2\2\u0169-\3\2\2\2\u016a"+
		"\u016e\7/\2\2\u016b\u016d\5\6\4\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0175\t\6\2\2\u0172\u0174\5\6\4\2\u0173\u0172\3\2"+
		"\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u017a\7"+
		"\66\2\2\u017a\u017b\t\3\2\2\u017b/\3\2\2\2\u017c\u0181\5*\26\2\u017d\u017e"+
		"\5\6\4\2\u017e\u017f\7 \2\2\u017f\u0181\3\2\2\2\u0180\u017c\3\2\2\2\u0180"+
		"\u017d\3\2\2\2\u0181\61\3\2\2\2\u0182\u0187\5*\26\2\u0183\u0187\5\6\4"+
		"\2\u0184\u0187\7(\2\2\u0185\u0187\7\4\2\2\u0186\u0182\3\2\2\2\u0186\u0183"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\63\3\2\2\2\u0188"+
		"\u0189\5:\36\2\u0189\u018a\7!\2\2\u018a\65\3\2\2\2\u018b\u0190\5\64\33"+
		"\2\u018c\u018d\7\36\2\2\u018d\u018f\5\64\33\2\u018e\u018c\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\67\3\2\2"+
		"\2\u0192\u0190\3\2\2\2\u0193\u0194\5:\36\2\u0194\u0195\7!\2\2\u0195\u0197"+
		"\7/\2\2\u0196\u0198\5\66\34\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2"+
		"\u0198\u0199\3\2\2\2\u0199\u019a\7\60\2\2\u019a9\3\2\2\2\u019b\u01a4\7"+
		"\3\2\2\u019c\u01a4\7\5\2\2\u019d\u01a4\7\4\2\2\u019e\u01a4\7\6\2\2\u019f"+
		"\u01a4\7\7\2\2\u01a0\u01a1\7*\2\2\u01a1\u01a2\t\7\2\2\u01a2\u01a4\7+\2"+
		"\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019e"+
		"\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4;\3\2\2\2\u01a5"+
		"\u01ad\7-\2\2\u01a6\u01ac\5R*\2\u01a7\u01a8\5D#\2\u01a8\u01a9\7 \2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01ac\5J&\2\u01ab\u01a6\3\2\2\2\u01ab\u01a7\3\2\2"+
		"\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5J&\2\u01b1"+
		"\u01b2\7.\2\2\u01b2=\3\2\2\2\u01b3\u01b4\7,\2\2\u01b4\u01b5\5<\37\2\u01b5"+
		"?\3\2\2\2\u01b6\u01b7\7:\2\2\u01b7\u01b8\5<\37\2\u01b8A\3\2\2\2\u01b9"+
		"\u01bb\58\35\2\u01ba\u01bc\5> \2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2"+
		"\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\5<\37\2\u01be\u01c0\5@!\2\u01bf\u01be"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0C\3\2\2\2\u01c1\u01c2\7!\2\2\u01c2\u01cb"+
		"\7/\2\2\u01c3\u01c8\5\6\4\2\u01c4\u01c5\7\36\2\2\u01c5\u01c7\5\6\4\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01e3\7\60\2\2\u01ce\u01cf\7"+
		",\2\2\u01cf\u01d0\7/\2\2\u01d0\u01e3\7\60\2\2\u01d1\u01d2\7\b\2\2\u01d2"+
		"\u01d3\7/\2\2\u01d3\u01d4\5\6\4\2\u01d4\u01d5\7\60\2\2\u01d5\u01e3\3\2"+
		"\2\2\u01d6\u01d7\t\b\2\2\u01d7\u01d8\7/\2\2\u01d8\u01dd\5\6\4\2\u01d9"+
		"\u01da\7\36\2\2\u01da\u01dc\5\6\4\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3"+
		"\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01c1\3"+
		"\2\2\2\u01e2\u01ce\3\2\2\2\u01e2\u01d1\3\2\2\2\u01e2\u01d6\3\2\2\2\u01e3"+
		"E\3\2\2\2\u01e4\u01ea\7\20\2\2\u01e5\u01ea\7\21\2\2\u01e6\u01e7\7\22\2"+
		"\2\u01e7\u01ea\5\62\32\2\u01e8\u01ea\7\22\2\2\u01e9\u01e4\3\2\2\2\u01e9"+
		"\u01e5\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ec\7 \2\2\u01ecG\3\2\2\2\u01ed\u01f0\7!\2\2\u01ee\u01f0"+
		"\5&\24\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\7)\2\2\u01f2\u01f3\5\62\32\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7"+
		" \2\2\u01f5I\3\2\2\2\u01f6\u01fd\5\60\31\2\u01f7\u01fd\5F$\2\u01f8\u01fd"+
		"\5H%\2\u01f9\u01fd\5L\'\2\u01fa\u01fd\5N(\2\u01fb\u01fd\5P)\2\u01fc\u01f6"+
		"\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdK\3\2\2\2\u01fe\u01ff\7\23\2\2"+
		"\u01ff\u0209\7/\2\2\u0200\u0205\5*\26\2\u0201\u0202\t\6\2\2\u0202\u0204"+
		"\5*\26\2\u0203\u0201\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u020a\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5."+
		"\30\2\u0209\u0200\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\7\60\2\2\u020c\u020d\7\24\2\2\u020d\u0210\5J&\2\u020e\u020f\7\25"+
		"\2\2\u020f\u0211\5J&\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211M"+
		"\3\2\2\2\u0212\u0213\7\r\2\2\u0213\u0216\7/\2\2\u0214\u0217\5\60\31\2"+
		"\u0215\u0217\5.\30\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0219\7\60\2\2\u0219\u021a\7\16\2\2\u021a\u021d\5J&\2\u021b"+
		"\u021c\7\17\2\2\u021c\u021e\5J&\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021eO\3\2\2\2\u021f\u0223\7-\2\2\u0220\u0222\5J&\2\u0221\u0220\3"+
		"\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7.\2\2\u0227Q\3\2\2\2\u0228"+
		"\u0234\5\f\7\2\u0229\u0234\5\16\b\2\u022a\u0234\5\20\t\2\u022b\u0234\5"+
		"\22\n\2\u022c\u0234\5\24\13\2\u022d\u0234\5\26\f\2\u022e\u0234\5\32\16"+
		"\2\u022f\u0234\5\34\17\2\u0230\u0234\5\36\20\2\u0231\u0234\5 \21\2\u0232"+
		"\u0234\5\"\22\2\u0233\u0228\3\2\2\2\u0233\u0229\3\2\2\2\u0233\u022a\3"+
		"\2\2\2\u0233\u022b\3\2\2\2\u0233\u022c\3\2\2\2\u0233\u022d\3\2\2\2\u0233"+
		"\u022e\3\2\2\2\u0233\u022f\3\2\2\2\u0233\u0230\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7 \2\2\u0236"+
		"S\3\2\2\2CW]cny\u0080\u0086\u0094\u009c\u009e\u00a6\u00ad\u00b0\u00b3"+
		"\u00b9\u00c3\u00c7\u00cc\u00d4\u00dc\u00e6\u00ec\u00ef\u00f5\u00ff\u010a"+
		"\u0112\u0116\u0118\u0122\u012a\u012e\u0130\u013d\u0141\u0147\u0150\u0157"+
		"\u015d\u0166\u016e\u0175\u0180\u0186\u0190\u0197\u01a3\u01ab\u01ad\u01bb"+
		"\u01bf\u01c8\u01cb\u01dd\u01e2\u01e9\u01ef\u01fc\u0205\u0209\u0210\u0216"+
		"\u021d\u0223\u0233";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}