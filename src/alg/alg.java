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
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					fcall();
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
					variable();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << MENORQ))) != 0)) {
				{
				{
				setState(98);
				function();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(IF);
				setState(107);
				expressions_list();
				setState(108);
				match(THEN);
				setState(109);
				instructions();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(110);
					match(ELSE);
					setState(111);
					instructions();
					}
				}

				notifyErrorListeners("Missing parenteses");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(IF);
				setState(117);
				match(LP);
				setState(118);
				expressions_list();
				setState(119);
				match(RP);
				setState(120);
				instructions();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(121);
					match(ELSE);
					setState(122);
					instructions();
					}
				}

				notifyErrorListeners("Missing 'then'condition");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
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
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public TerminalNode VIRGULA() { return getToken(alg.VIRGULA, 0); }
		public TerminalNode MENORQ() { return getToken(alg.MENORQ, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode MAIORQ() { return getToken(alg.MAIORQ, 0); }
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
			setState(132);
			match(INT);
			setState(133);
			match(ALG);
			setState(134);
			match(LP);
			setState(135);
			match(INT);
			setState(136);
			match(IDENT);
			setState(137);
			match(VIRGULA);
			setState(138);
			match(MENORQ);
			setState(139);
			match(STRING);
			setState(140);
			match(MAIORQ);
			setState(141);
			match(IDENT);
			setState(142);
			match(RP);
			setState(143);
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				match(ID);
				setState(147);
				match(LP);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					setState(148);
					exprList();
					}
				}

				setState(151);
				match(RP);
				}
				break;
			case 2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(LP);
				setState(153);
				expr(0);
				setState(154);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new FuncInvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				function_invocate();
				}
				break;
			case 4:
				{
				_localctx = new ParentesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				op_paranteses();
				}
				break;
			case 5:
				{
				_localctx = new PointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				op_pointer();
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(IDENT);
				}
				break;
			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(LITERAL_INTEIRO);
				}
				break;
			case 8:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(LITERAL_DECIMAL);
				}
				break;
			case 9:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				ide();
				}
				break;
			case 10:
				{
				_localctx = new IdBoolPointContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				idy();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						{
						setState(167);
						match(MULT_DIV);
						}
						setState(168);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(170);
						match(SOMA_SUB);
						}
						setState(171);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new PointIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(173);
						match(INDEX_POINT_L);
						setState(174);
						expr(0);
						setState(175);
						match(INDEX_POINT_R);
						}
						break;
					}
					} 
				}
				setState(181);
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
		enterRule(_localctx, 8, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(183);
				match(VIRGULA);
				setState(184);
				expr(0);
				}
				}
				setState(189);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(190);
				match(EQUAL);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(191);
					function_invocate();
					}
					break;
				case 2:
					{
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(192);
						expr(0);
						}
						}
						setState(195); 
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
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(202);
				match(INT);
				}
			}

			setState(205);
			match(IDENT);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(206);
				match(INDEX_POINT_L);
				setState(207);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				match(INDEX_POINT_R);
				}
			}

			setState(211);
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
			setState(213);
			match(INT);
			setState(214);
			match(IDENT);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(215);
				match(VIRGULA);
				setState(216);
				match(IDENT);
				}
				}
				setState(221);
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
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(222);
				match(BOOL);
				}
			}

			setState(225);
			match(IDENT);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(226);
				match(EQUAL);
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
					{
					setState(227);
					match(TRUE);
					}
					break;
				case FALSE:
					{
					setState(228);
					match(FALSE);
					}
					break;
				case SIZEOF:
				case WRITE:
				case WRITELN:
				case IDENT:
				case AT_SIGN:
					{
					setState(229);
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
			setState(234);
			match(BOOL);
			setState(235);
			match(IDENT);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(236);
				match(VIRGULA);
				setState(237);
				match(IDENT);
				}
				}
				setState(242);
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
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FLOAT) {
				{
				setState(243);
				match(FLOAT);
				}
			}

			setState(246);
			match(IDENT);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(247);
				match(INDEX_POINT_L);
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				match(INDEX_POINT_R);
				}
			}

			setState(252);
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
			setState(254);
			match(FLOAT);
			setState(255);
			match(IDENT);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(256);
				match(VIRGULA);
				setState(257);
				match(IDENT);
				}
				}
				setState(262);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(EQUAL);
				setState(264);
				match(CADEIA_CARACTERES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(EQUAL);
				setState(266);
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
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(270);
				match(STRING);
				}
			}

			setState(273);
			match(IDENT);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEX_POINT_L) {
				{
				setState(274);
				match(INDEX_POINT_L);
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==LITERAL_INTEIRO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				match(INDEX_POINT_R);
				}
			}

			setState(279);
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
			setState(281);
			match(STRING);
			setState(282);
			match(IDENT);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(283);
				match(VIRGULA);
				setState(284);
				match(IDENT);
				}
				}
				setState(289);
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
			setState(290);
			match(MENORQ);
			setState(291);
			match(INT);
			setState(292);
			match(MAIORQ);
			setState(293);
			match(IDENT);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(294);
				match(EQUAL);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(295);
					function_invocate();
					}
					break;
				case 2:
					{
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(296);
						expr(0);
						}
						}
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(302);
					match(NULL);
					}
					break;
				case 4:
					{
					{
					setState(303);
					match(INDEX_POINT_L);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(304);
						expr(0);
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310);
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
			setState(315);
			match(MENORQ);
			setState(316);
			match(FLOAT);
			setState(317);
			match(MAIORQ);
			setState(318);
			match(IDENT);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(319);
				match(EQUAL);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(320);
					function_invocate();
					}
					break;
				case 2:
					{
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(321);
						expr(0);
						}
						}
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 3:
					{
					setState(327);
					match(NULL);
					}
					break;
				case 4:
					{
					{
					setState(328);
					match(INDEX_POINT_L);
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
						{
						{
						setState(329);
						expr(0);
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(335);
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
			setState(340);
			match(MENORQ);
			setState(341);
			match(STRING);
			setState(342);
			match(MAIORQ);
			setState(343);
			match(IDENT);
			{
			setState(344);
			match(EQUAL);
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA_CARACTERES:
				{
				setState(345);
				match(CADEIA_CARACTERES);
				}
				break;
			case SIZEOF:
			case WRITE:
			case WRITELN:
			case IDENT:
			case AT_SIGN:
				{
				setState(346);
				function_invocate();
				}
				break;
			case NULL:
				{
				setState(347);
				match(NULL);
				}
				break;
			case INDEX_POINT_L:
				{
				{
				setState(348);
				match(INDEX_POINT_L);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					{
					setState(349);
					expr(0);
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
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
			setState(358);
			match(LP);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(359);
				expr(0);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(365);
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
			setState(367);
			match(INDEX_POINT_L);
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
			setState(376);
			match(SOMA_SUB);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(377);
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
			setState(380);
			match(IDEY);
			setState(381);
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
			setState(383);
			expr(0);
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQ) | (1L << MAIORQ) | (1L << EQUAL_DIF) | (1L << COMPARATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(385);
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
			setState(387);
			match(LP);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(388);
				expr(0);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(394);
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
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(395);
				expr(0);
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(401);
			match(RP);
			setState(402);
			match(EQUAL_DIF);
			setState(403);
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
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				comparations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(406);
				expr(0);
				setState(407);
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
			setState(414);
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
				setState(412);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
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
			setState(416);
			type();
			setState(417);
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
			setState(419);
			arg();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(420);
				match(VIRGULA);
				setState(421);
				arg();
				}
				}
				setState(426);
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
			setState(427);
			type();
			setState(428);
			match(IDENT);
			setState(429);
			match(LP);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << MENORQ))) != 0)) {
				{
				setState(430);
				args();
				}
			}

			setState(433);
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
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(435);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(436);
				match(FLOAT);
				}
				break;
			case BOOL:
				{
				setState(437);
				match(BOOL);
				}
				break;
			case STRING:
				{
				setState(438);
				match(STRING);
				}
				break;
			case VOID:
				{
				setState(439);
				match(VOID);
				}
				break;
			case MENORQ:
				{
				{
				setState(440);
				match(MENORQ);
				setState(441);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(442);
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
			setState(445);
			match(L_BRACE);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(451);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(446);
						variable();
						}
						break;
					case 2:
						{
						setState(447);
						function_invocate();
						setState(448);
						match(PONTO_VIRGULA);
						}
						break;
					case 3:
						{
						setState(450);
						instructions();
						}
						break;
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(456);
			instructions();
			setState(457);
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
			setState(459);
			match(L_BRACE);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << SIZEOF) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << MENORQ) | (1L << AT_SIGN) | (1L << L_BRACE) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(460);
					variable();
					}
					break;
				case 2:
					{
					setState(461);
					function_invocate();
					setState(462);
					match(PONTO_VIRGULA);
					}
					break;
				case 3:
					{
					setState(464);
					instructions();
					}
					break;
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
			setState(472);
			match(AT_SIGN);
			setState(473);
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
			setState(475);
			match(D_MAIORQ);
			setState(476);
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
		public FunctionSpecialContext functionSpecial() {
			return getRuleContext(FunctionSpecialContext.class,0);
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(478);
				function_declare();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT_SIGN) {
					{
					setState(479);
					prologo();
					}
				}

				setState(482);
				body();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==D_MAIORQ) {
					{
					setState(483);
					epilogo();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				functionSpecial();
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
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				{
				setState(489);
				match(IDENT);
				setState(490);
				match(LP);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
					{
					setState(491);
					expr(0);
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(492);
						match(VIRGULA);
						setState(493);
						expr(0);
						}
						}
						setState(498);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(501);
				match(RP);
				}
				}
				break;
			case AT_SIGN:
				{
				{
				setState(502);
				match(AT_SIGN);
				setState(503);
				match(LP);
				setState(504);
				match(RP);
				}
				}
				break;
			case SIZEOF:
				{
				{
				setState(505);
				match(SIZEOF);
				setState(506);
				match(LP);
				setState(507);
				expr(0);
				setState(508);
				match(RP);
				}
				}
				break;
			case WRITE:
			case WRITELN:
				{
				{
				setState(510);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==WRITELN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(511);
				match(LP);
				setState(512);
				expr(0);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(513);
					match(VIRGULA);
					setState(514);
					expr(0);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(520);
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
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(524);
				match(LEAVE);
				}
				break;
			case 2:
				{
				setState(525);
				match(RESTART);
				}
				break;
			case 3:
				{
				{
				setState(526);
				match(RETURN);
				setState(527);
				expressions_list2();
				}
				}
				break;
			case 4:
				{
				setState(528);
				match(RETURN);
				}
				break;
			}
			setState(531);
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
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(533);
				match(IDENT);
				}
				break;
			case INDEX_POINT_L:
				{
				setState(534);
				op_pointer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(537);
			match(EQUAL);
			setState(538);
			expressions_list2();
			}
			setState(540);
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
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				expressions_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				ctrl_instruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				attributes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				if_cond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(547);
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
			setState(550);
			match(IF);
			setState(551);
			match(LP);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				{
				setState(552);
				comparations();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==E_LOGICO || _la==OU_LOGICO) {
					{
					{
					setState(553);
					_la = _input.LA(1);
					if ( !(_la==E_LOGICO || _la==OU_LOGICO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(554);
					comparations();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(560);
				logics();
				}
				break;
			}
			setState(563);
			match(RP);
			setState(564);
			match(THEN);
			setState(565);
			instructions();
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(566);
				match(ELSE);
				setState(567);
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
			setState(570);
			match(WHILE);
			setState(571);
			match(LP);
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(572);
				expressions_list();
				}
				break;
			case 2:
				{
				setState(573);
				logics();
				}
				break;
			}
			setState(576);
			match(RP);
			setState(577);
			match(DO);
			setState(578);
			instructions();
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(579);
				match(FINALLY);
				setState(580);
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
			setState(583);
			match(L_BRACE);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << IDENT) | (1L << ID) | (1L << LITERAL_INTEIRO) | (1L << LITERAL_DECIMAL) | (1L << AT_SIGN) | (1L << L_BRACE) | (1L << LP) | (1L << INDEX_POINT_L) | (1L << IDEY) | (1L << SOMA_SUB))) != 0)) {
				{
				{
				setState(584);
				instructions();
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
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
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(592);
				inteiro();
				}
				break;
			case 2:
				{
				setState(593);
				real();
				}
				break;
			case 3:
				{
				setState(594);
				inteiros();
				}
				break;
			case 4:
				{
				setState(595);
				booleano();
				}
				break;
			case 5:
				{
				setState(596);
				booleanos();
				}
				break;
			case 6:
				{
				setState(597);
				reais();
				}
				break;
			case 7:
				{
				setState(598);
				cadeia_caracteres();
				}
				break;
			case 8:
				{
				setState(599);
				cadeias_caracteres();
				}
				break;
			case 9:
				{
				setState(600);
				ponteiro_inteiro();
				}
				break;
			case 10:
				{
				setState(601);
				ponteiro_real();
				}
				break;
			case 11:
				{
				setState(602);
				ponteiro_cadeia();
				}
				break;
			}
			setState(605);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0262\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\7\2f"+
		"\n\2\f\2\16\2i\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u0085\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5\u0098\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a7"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b4\n\5\f\5\16"+
		"\5\u00b7\13\5\3\6\3\6\3\6\7\6\u00bc\n\6\f\6\16\6\u00bf\13\6\3\7\3\7\3"+
		"\7\6\7\u00c4\n\7\r\7\16\7\u00c5\5\7\u00c8\n\7\3\7\5\7\u00cb\n\7\3\b\5"+
		"\b\u00ce\n\b\3\b\3\b\3\b\3\b\5\b\u00d4\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00dc\n\t\f\t\16\t\u00df\13\t\3\n\5\n\u00e2\n\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00e9\n\n\5\n\u00eb\n\n\3\13\3\13\3\13\3\13\7\13\u00f1\n\13\f\13\16"+
		"\13\u00f4\13\13\3\f\5\f\u00f7\n\f\3\f\3\f\3\f\3\f\5\f\u00fd\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\7\r\u0105\n\r\f\r\16\r\u0108\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u010f\n\16\3\17\5\17\u0112\n\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0118\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u0120\n\20\f\20\16\20\u0123"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u012c\n\21\f\21\16\21\u012f"+
		"\13\21\3\21\3\21\3\21\7\21\u0134\n\21\f\21\16\21\u0137\13\21\3\21\5\21"+
		"\u013a\n\21\5\21\u013c\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0145"+
		"\n\22\f\22\16\22\u0148\13\22\3\22\3\22\3\22\7\22\u014d\n\22\f\22\16\22"+
		"\u0150\13\22\3\22\5\22\u0153\n\22\5\22\u0155\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0161\n\23\f\23\16\23\u0164\13\23"+
		"\3\23\5\23\u0167\n\23\3\24\3\24\7\24\u016b\n\24\f\24\16\24\u016e\13\24"+
		"\3\24\3\24\3\25\3\25\7\25\u0174\n\25\f\25\16\25\u0177\13\25\3\25\3\25"+
		"\3\26\3\26\5\26\u017d\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\7\31\u0188\n\31\f\31\16\31\u018b\13\31\3\31\3\31\7\31\u018f\n\31\f\31"+
		"\16\31\u0192\13\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u019c"+
		"\n\32\3\33\3\33\3\33\5\33\u01a1\n\33\3\34\3\34\3\34\3\35\3\35\3\35\7\35"+
		"\u01a9\n\35\f\35\16\35\u01ac\13\35\3\36\3\36\3\36\3\36\5\36\u01b2\n\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01be\n\37\3 "+
		"\3 \3 \3 \3 \3 \7 \u01c6\n \f \16 \u01c9\13 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\7!\u01d4\n!\f!\16!\u01d7\13!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\5$\u01e3"+
		"\n$\3$\3$\5$\u01e7\n$\3$\5$\u01ea\n$\3%\3%\3%\3%\3%\7%\u01f1\n%\f%\16"+
		"%\u01f4\13%\5%\u01f6\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0206"+
		"\n%\f%\16%\u0209\13%\3%\3%\5%\u020d\n%\3&\3&\3&\3&\3&\5&\u0214\n&\3&\3"+
		"&\3\'\3\'\5\'\u021a\n\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u0227"+
		"\n(\3)\3)\3)\3)\3)\7)\u022e\n)\f)\16)\u0231\13)\3)\5)\u0234\n)\3)\3)\3"+
		")\3)\3)\5)\u023b\n)\3*\3*\3*\3*\5*\u0241\n*\3*\3*\3*\3*\3*\5*\u0248\n"+
		"*\3+\3+\7+\u024c\n+\f+\16+\u024f\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\5,\u025e\n,\3,\3,\3,\2\3\b-\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\b\4\2!!%%\4\2*+\66\67\3\28"+
		"9\3\2\13\f\4\2\3\3\5\6\3\2\26\27\2\u02a5\2[\3\2\2\2\4\u0084\3\2\2\2\6"+
		"\u0086\3\2\2\2\b\u00a6\3\2\2\2\n\u00b8\3\2\2\2\f\u00ca\3\2\2\2\16\u00cd"+
		"\3\2\2\2\20\u00d7\3\2\2\2\22\u00e1\3\2\2\2\24\u00ec\3\2\2\2\26\u00f6\3"+
		"\2\2\2\30\u0100\3\2\2\2\32\u010e\3\2\2\2\34\u0111\3\2\2\2\36\u011b\3\2"+
		"\2\2 \u0124\3\2\2\2\"\u013d\3\2\2\2$\u0156\3\2\2\2&\u0168\3\2\2\2(\u0171"+
		"\3\2\2\2*\u017a\3\2\2\2,\u017e\3\2\2\2.\u0181\3\2\2\2\60\u0185\3\2\2\2"+
		"\62\u019b\3\2\2\2\64\u01a0\3\2\2\2\66\u01a2\3\2\2\28\u01a5\3\2\2\2:\u01ad"+
		"\3\2\2\2<\u01bd\3\2\2\2>\u01bf\3\2\2\2@\u01cd\3\2\2\2B\u01da\3\2\2\2D"+
		"\u01dd\3\2\2\2F\u01e9\3\2\2\2H\u020c\3\2\2\2J\u0213\3\2\2\2L\u0219\3\2"+
		"\2\2N\u0226\3\2\2\2P\u0228\3\2\2\2R\u023c\3\2\2\2T\u0249\3\2\2\2V\u025d"+
		"\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2"+
		"][\3\2\2\2^`\5V,\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2c"+
		"a\3\2\2\2df\5F$\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig"+
		"\3\2\2\2jk\7\2\2\3k\3\3\2\2\2lm\7\23\2\2mn\5\62\32\2no\7\24\2\2or\5N("+
		"\2pq\7\25\2\2qs\5N(\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\3\1\2u\u0085\3"+
		"\2\2\2vw\7\23\2\2wx\7/\2\2xy\5\62\32\2yz\7\60\2\2z}\5N(\2{|\7\25\2\2|"+
		"~\5N(\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\3\1\2\u0080\u0085"+
		"\3\2\2\2\u0081\u0082\5H%\2\u0082\u0083\b\3\1\2\u0083\u0085\3\2\2\2\u0084"+
		"l\3\2\2\2\u0084v\3\2\2\2\u0084\u0081\3\2\2\2\u0085\5\3\2\2\2\u0086\u0087"+
		"\7\3\2\2\u0087\u0088\7\n\2\2\u0088\u0089\7/\2\2\u0089\u008a\7\3\2\2\u008a"+
		"\u008b\7!\2\2\u008b\u008c\7\36\2\2\u008c\u008d\7*\2\2\u008d\u008e\7\6"+
		"\2\2\u008e\u008f\7+\2\2\u008f\u0090\7!\2\2\u0090\u0091\7\60\2\2\u0091"+
		"\u0092\5> \2\u0092\7\3\2\2\2\u0093\u0094\b\5\1\2\u0094\u0095\7\"\2\2\u0095"+
		"\u0097\7/\2\2\u0096\u0098\5\n\6\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u00a7\7\60\2\2\u009a\u009b\7/\2\2\u009b"+
		"\u009c\5\b\5\2\u009c\u009d\7\60\2\2\u009d\u00a7\3\2\2\2\u009e\u00a7\5"+
		"H%\2\u009f\u00a7\5&\24\2\u00a0\u00a7\5(\25\2\u00a1\u00a7\7!\2\2\u00a2"+
		"\u00a7\7%\2\2\u00a3\u00a7\7&\2\2\u00a4\u00a7\5*\26\2\u00a5\u00a7\5,\27"+
		"\2\u00a6\u0093\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u009f"+
		"\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00b5\3\2"+
		"\2\2\u00a8\u00a9\f\r\2\2\u00a9\u00aa\7\64\2\2\u00aa\u00b4\5\b\5\16\u00ab"+
		"\u00ac\f\f\2\2\u00ac\u00ad\7\65\2\2\u00ad\u00b4\5\b\5\r\u00ae\u00af\f"+
		"\3\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\7\62\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ae\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\t\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bd\5\b\5\2\u00b9\u00ba\7\36\2"+
		"\2\u00ba\u00bc\5\b\5\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\13\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c7\7)\2\2\u00c1\u00c8\5H%\2\u00c2\u00c4\5\b\5\2\u00c3\u00c2\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\r\3\2\2\2"+
		"\u00cc\u00ce\7\3\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d3\7!\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\t\2\2\2\u00d2"+
		"\u00d4\7\62\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00d6\5\f\7\2\u00d6\17\3\2\2\2\u00d7\u00d8\7\3\2\2\u00d8"+
		"\u00dd\7!\2\2\u00d9\u00da\7\36\2\2\u00da\u00dc\7!\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\21\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\7\4\2\2\u00e1\u00e0\3\2\2"+
		"\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00ea\7!\2\2\u00e4\u00e8"+
		"\7)\2\2\u00e5\u00e9\7\13\2\2\u00e6\u00e9\7\f\2\2\u00e7\u00e9\5H%\2\u00e8"+
		"\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\23\3\2\2\2\u00ec\u00ed"+
		"\7\4\2\2\u00ed\u00f2\7!\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f1\7!\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\25\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\7\5\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\7!\2\2\u00f9"+
		"\u00fa\7\61\2\2\u00fa\u00fb\t\2\2\2\u00fb\u00fd\7\62\2\2\u00fc\u00f9\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\5\f\7\2\u00ff"+
		"\27\3\2\2\2\u0100\u0101\7\5\2\2\u0101\u0106\7!\2\2\u0102\u0103\7\36\2"+
		"\2\u0103\u0105\7!\2\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\31\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7)\2\2\u010a\u010f\7(\2\2\u010b\u010c\7)\2\2\u010c\u010f\5H%\2"+
		"\u010d\u010f\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\33\3\2\2\2\u0110\u0112\7\6\2\2\u0111\u0110\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0117\7!\2\2\u0114\u0115\7\61"+
		"\2\2\u0115\u0116\t\2\2\2\u0116\u0118\7\62\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\5\32\16\2\u011a\35\3\2"+
		"\2\2\u011b\u011c\7\6\2\2\u011c\u0121\7!\2\2\u011d\u011e\7\36\2\2\u011e"+
		"\u0120\7!\2\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\37\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125"+
		"\7*\2\2\u0125\u0126\7\3\2\2\u0126\u0127\7+\2\2\u0127\u013b\7!\2\2\u0128"+
		"\u0139\7)\2\2\u0129\u013a\5H%\2\u012a\u012c\5\b\5\2\u012b\u012a\3\2\2"+
		"\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u013a"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u013a\7\t\2\2\u0131\u0135\7\61\2\2"+
		"\u0132\u0134\5\b\5\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013a\7\62\2\2\u0139\u0129\3\2\2\2\u0139\u012d\3\2\2\2\u0139\u0130\3"+
		"\2\2\2\u0139\u0131\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0128\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c!\3\2\2\2\u013d\u013e\7*\2\2\u013e\u013f\7\5\2\2\u013f"+
		"\u0140\7+\2\2\u0140\u0154\7!\2\2\u0141\u0152\7)\2\2\u0142\u0153\5H%\2"+
		"\u0143\u0145\5\b\5\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0153\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u0153\7\t\2\2\u014a\u014e\7\61\2\2\u014b\u014d\5\b\5\2\u014c\u014b\3"+
		"\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\7\62\2\2\u0152\u0142\3"+
		"\2\2\2\u0152\u0146\3\2\2\2\u0152\u0149\3\2\2\2\u0152\u014a\3\2\2\2\u0153"+
		"\u0155\3\2\2\2\u0154\u0141\3\2\2\2\u0154\u0155\3\2\2\2\u0155#\3\2\2\2"+
		"\u0156\u0157\7*\2\2\u0157\u0158\7\6\2\2\u0158\u0159\7+\2\2\u0159\u015a"+
		"\7!\2\2\u015a\u0166\7)\2\2\u015b\u0167\7(\2\2\u015c\u0167\5H%\2\u015d"+
		"\u0167\7\t\2\2\u015e\u0162\7\61\2\2\u015f\u0161\5\b\5\2\u0160\u015f\3"+
		"\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\7\62\2\2\u0166\u015b\3"+
		"\2\2\2\u0166\u015c\3\2\2\2\u0166\u015d\3\2\2\2\u0166\u015e\3\2\2\2\u0167"+
		"%\3\2\2\2\u0168\u016c\7/\2\2\u0169\u016b\5\b\5\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\60\2\2\u0170\'\3\2\2\2\u0171\u0175"+
		"\7\61\2\2\u0172\u0174\5\b\5\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u0179\7\62\2\2\u0179)\3\2\2\2\u017a\u017c\7\65\2\2\u017b"+
		"\u017d\5\b\5\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d+\3\2\2\2"+
		"\u017e\u017f\7\63\2\2\u017f\u0180\7!\2\2\u0180-\3\2\2\2\u0181\u0182\5"+
		"\b\5\2\u0182\u0183\t\3\2\2\u0183\u0184\5\b\5\2\u0184/\3\2\2\2\u0185\u0189"+
		"\7/\2\2\u0186\u0188\5\b\5\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018c\u0190\t\4\2\2\u018d\u018f\5\b\5\2\u018e\u018d\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7\60\2\2\u0194\u0195\7\66\2\2\u0195"+
		"\u0196\t\5\2\2\u0196\61\3\2\2\2\u0197\u019c\5.\30\2\u0198\u0199\5\b\5"+
		"\2\u0199\u019a\7 \2\2\u019a\u019c\3\2\2\2\u019b\u0197\3\2\2\2\u019b\u0198"+
		"\3\2\2\2\u019c\63\3\2\2\2\u019d\u01a1\5.\30\2\u019e\u01a1\5\b\5\2\u019f"+
		"\u01a1\7(\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\65\3\2\2\2\u01a2\u01a3\5<\37\2\u01a3\u01a4\7!\2\2\u01a4\67"+
		"\3\2\2\2\u01a5\u01aa\5\66\34\2\u01a6\u01a7\7\36\2\2\u01a7\u01a9\5\66\34"+
		"\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5<\37\2\u01ae"+
		"\u01af\7!\2\2\u01af\u01b1\7/\2\2\u01b0\u01b2\58\35\2\u01b1\u01b0\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\60\2\2\u01b4"+
		";\3\2\2\2\u01b5\u01be\7\3\2\2\u01b6\u01be\7\5\2\2\u01b7\u01be\7\4\2\2"+
		"\u01b8\u01be\7\6\2\2\u01b9\u01be\7\7\2\2\u01ba\u01bb\7*\2\2\u01bb\u01bc"+
		"\t\6\2\2\u01bc\u01be\7+\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd"+
		"\u01b7\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01ba\3\2"+
		"\2\2\u01be=\3\2\2\2\u01bf\u01c7\7-\2\2\u01c0\u01c6\5V,\2\u01c1\u01c2\5"+
		"H%\2\u01c2\u01c3\7 \2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c6\5N(\2\u01c5\u01c0"+
		"\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cb\5N(\2\u01cb\u01cc\7.\2\2\u01cc?\3\2\2\2\u01cd\u01d5\7"+
		"-\2\2\u01ce\u01d4\5V,\2\u01cf\u01d0\5H%\2\u01d0\u01d1\7 \2\2\u01d1\u01d4"+
		"\3\2\2\2\u01d2\u01d4\5N(\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7.\2\2\u01d9"+
		"A\3\2\2\2\u01da\u01db\7,\2\2\u01db\u01dc\5@!\2\u01dcC\3\2\2\2\u01dd\u01de"+
		"\7:\2\2\u01de\u01df\5@!\2\u01dfE\3\2\2\2\u01e0\u01e2\5:\36\2\u01e1\u01e3"+
		"\5B\"\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e6\5> \2\u01e5\u01e7\5D#\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2"+
		"\u01e7\u01ea\3\2\2\2\u01e8\u01ea\5\6\4\2\u01e9\u01e0\3\2\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01eaG\3\2\2\2\u01eb\u01ec\7!\2\2\u01ec\u01f5\7/\2\2\u01ed\u01f2"+
		"\5\b\5\2\u01ee\u01ef\7\36\2\2\u01ef\u01f1\5\b\5\2\u01f0\u01ee\3\2\2\2"+
		"\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u020d\7\60\2\2\u01f8\u01f9\7,\2\2\u01f9\u01fa\7/"+
		"\2\2\u01fa\u020d\7\60\2\2\u01fb\u01fc\7\b\2\2\u01fc\u01fd\7/\2\2\u01fd"+
		"\u01fe\5\b\5\2\u01fe\u01ff\7\60\2\2\u01ff\u020d\3\2\2\2\u0200\u0201\t"+
		"\7\2\2\u0201\u0202\7/\2\2\u0202\u0207\5\b\5\2\u0203\u0204\7\36\2\2\u0204"+
		"\u0206\5\b\5\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020b\7\60\2\2\u020b\u020d\3\2\2\2\u020c\u01eb\3\2\2\2\u020c\u01f8\3"+
		"\2\2\2\u020c\u01fb\3\2\2\2\u020c\u0200\3\2\2\2\u020dI\3\2\2\2\u020e\u0214"+
		"\7\20\2\2\u020f\u0214\7\21\2\2\u0210\u0211\7\22\2\2\u0211\u0214\5\64\33"+
		"\2\u0212\u0214\7\22\2\2\u0213\u020e\3\2\2\2\u0213\u020f\3\2\2\2\u0213"+
		"\u0210\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\7 "+
		"\2\2\u0216K\3\2\2\2\u0217\u021a\7!\2\2\u0218\u021a\5(\25\2\u0219\u0217"+
		"\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7)\2\2\u021c"+
		"\u021d\5\64\33\2\u021d\u021e\3\2\2\2\u021e\u021f\7 \2\2\u021fM\3\2\2\2"+
		"\u0220\u0227\5\62\32\2\u0221\u0227\5J&\2\u0222\u0227\5L\'\2\u0223\u0227"+
		"\5P)\2\u0224\u0227\5R*\2\u0225\u0227\5T+\2\u0226\u0220\3\2\2\2\u0226\u0221"+
		"\3\2\2\2\u0226\u0222\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0225\3\2\2\2\u0227O\3\2\2\2\u0228\u0229\7\23\2\2\u0229\u0233\7/\2\2"+
		"\u022a\u022f\5.\30\2\u022b\u022c\t\4\2\2\u022c\u022e\5.\30\2\u022d\u022b"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0234\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\5\60\31\2\u0233\u022a\3"+
		"\2\2\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\7\60\2\2\u0236"+
		"\u0237\7\24\2\2\u0237\u023a\5N(\2\u0238\u0239\7\25\2\2\u0239\u023b\5N"+
		"(\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023bQ\3\2\2\2\u023c\u023d"+
		"\7\r\2\2\u023d\u0240\7/\2\2\u023e\u0241\5\62\32\2\u023f\u0241\5\60\31"+
		"\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243"+
		"\7\60\2\2\u0243\u0244\7\16\2\2\u0244\u0247\5N(\2\u0245\u0246\7\17\2\2"+
		"\u0246\u0248\5N(\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248S\3\2"+
		"\2\2\u0249\u024d\7-\2\2\u024a\u024c\5N(\2\u024b\u024a\3\2\2\2\u024c\u024f"+
		"\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u0250\u0251\7.\2\2\u0251U\3\2\2\2\u0252\u025e\5\16\b\2"+
		"\u0253\u025e\5\26\f\2\u0254\u025e\5\20\t\2\u0255\u025e\5\22\n\2\u0256"+
		"\u025e\5\24\13\2\u0257\u025e\5\30\r\2\u0258\u025e\5\34\17\2\u0259\u025e"+
		"\5\36\20\2\u025a\u025e\5 \21\2\u025b\u025e\5\"\22\2\u025c\u025e\5$\23"+
		"\2\u025d\u0252\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0254\3\2\2\2\u025d\u0255"+
		"\3\2\2\2\u025d\u0256\3\2\2\2\u025d\u0257\3\2\2\2\u025d\u0258\3\2\2\2\u025d"+
		"\u0259\3\2\2\2\u025d\u025a\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7 \2\2\u0260W\3\2\2\2G[agr}\u0084"+
		"\u0097\u00a6\u00b3\u00b5\u00bd\u00c5\u00c7\u00ca\u00cd\u00d3\u00dd\u00e1"+
		"\u00e8\u00ea\u00f2\u00f6\u00fc\u0106\u010e\u0111\u0117\u0121\u012d\u0135"+
		"\u0139\u013b\u0146\u014e\u0152\u0154\u0162\u0166\u016c\u0175\u017c\u0189"+
		"\u0190\u019b\u01a0\u01aa\u01b1\u01bd\u01c5\u01c7\u01d3\u01d5\u01e2\u01e6"+
		"\u01e9\u01f2\u01f5\u0207\u020c\u0213\u0219\u0226\u022f\u0233\u023a\u0240"+
		"\u0247\u024d\u025d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}