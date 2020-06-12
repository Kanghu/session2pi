// Generated from D:/Users/Kanghu/Github/session-pi/src/main/resources/grammar\pi.g4 by ANTLR 4.8
package gen.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class piParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WHITESPACE=12, NEWLINE=13, EMPTY=14, RECV=15, SEND=16, 
		REPL=17, NEW=18, IN=19, IF=20, THEN=21, ELSE=22, AND=23, CONTINUE=24, 
		WITH=25, FST=26, SND=27, CONS=28, NIL=29, LET=30, BRANCH=31, SELECT=32, 
		INT=33, LIT=34, TRUE=35, FALSE=36;
	public static final int
		RULE_expression = 0, RULE_proc = 1, RULE_output = 2, RULE_input = 3, RULE_branch = 4, 
		RULE_select = 5, RULE_conditional = 6, RULE_subproc = 7, RULE_tuple = 8, 
		RULE_value = 9, RULE_arithExpr = 10, RULE_logicExpr = 11, RULE_pairExpr = 12, 
		RULE_pair = 13, RULE_name = 14, RULE_bool = 15, RULE_num = 16, RULE_list = 17, 
		RULE_subval = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "proc", "output", "input", "branch", "select", "conditional", 
			"subproc", "tuple", "value", "arithExpr", "logicExpr", "pairExpr", "pair", 
			"name", "bool", "num", "list", "subval"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "':'", "'}'", "'('", "')'", "'['", "']'", "'+'", 
			"'-'", "'/'", null, null, "'O'", "'?'", "'!'", "'*'", "'new'", "'in'", 
			"'if'", "'then'", "'else'", null, "'.'", "','", "'fst'", "'snd'", "'cons'", 
			"'nil'", "'let'", "'>'", "'<'", null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WHITESPACE", "NEWLINE", "EMPTY", "RECV", "SEND", "REPL", "NEW", "IN", 
			"IF", "THEN", "ELSE", "AND", "CONTINUE", "WITH", "FST", "SND", "CONS", 
			"NIL", "LET", "BRANCH", "SELECT", "INT", "LIT", "TRUE", "FALSE"
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
	public String getGrammarFileName() { return "pi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public piParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				proc(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				value();
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode EMPTY() { return getToken(piParser.EMPTY, 0); }
		public TerminalNode REPL() { return getToken(piParser.REPL, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode NEW() { return getToken(piParser.NEW, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode WITH() { return getToken(piParser.WITH, 0); }
		public TerminalNode IN() { return getToken(piParser.IN, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public SubprocContext subproc() {
			return getRuleContext(SubprocContext.class,0);
		}
		public TerminalNode LET() { return getToken(piParser.LET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode AND() { return getToken(piParser.AND, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		return proc(0);
	}

	private ProcContext proc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProcContext _localctx = new ProcContext(_ctx, _parentState);
		ProcContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_proc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43);
				match(EMPTY);
				}
				break;
			case 2:
				{
				setState(44);
				match(REPL);
				setState(45);
				proc(10);
				}
				break;
			case 3:
				{
				setState(46);
				match(NEW);
				setState(47);
				name();
				setState(48);
				match(WITH);
				setState(49);
				name();
				setState(50);
				match(IN);
				setState(51);
				proc(9);
				}
				break;
			case 4:
				{
				setState(53);
				output();
				}
				break;
			case 5:
				{
				setState(54);
				input();
				}
				break;
			case 6:
				{
				setState(55);
				branch();
				}
				break;
			case 7:
				{
				setState(56);
				select();
				}
				break;
			case 8:
				{
				setState(57);
				conditional();
				}
				break;
			case 9:
				{
				setState(58);
				subproc();
				}
				break;
			case 10:
				{
				setState(59);
				match(LET);
				setState(60);
				name();
				setState(61);
				match(T__0);
				setState(62);
				value();
				setState(63);
				match(IN);
				setState(64);
				proc(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProcContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_proc);
					setState(68);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(69);
					match(AND);
					setState(70);
					proc(9);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class OutputContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEND() { return getToken(piParser.SEND, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(piParser.CONTINUE, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			name();
			setState(77);
			match(SEND);
			setState(78);
			value();
			setState(79);
			match(CONTINUE);
			setState(80);
			proc(0);
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

	public static class InputContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode RECV() { return getToken(piParser.RECV, 0); }
		public TerminalNode CONTINUE() { return getToken(piParser.CONTINUE, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			name();
			setState(83);
			match(RECV);
			setState(84);
			name();
			setState(85);
			match(CONTINUE);
			setState(86);
			proc(0);
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

	public static class BranchContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRANCH() { return getToken(piParser.BRANCH, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(piParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(piParser.WITH, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(piParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(piParser.WHITESPACE, i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_branch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			name();
			setState(89);
			match(BRANCH);
			setState(90);
			match(T__1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					num();
					setState(92);
					match(T__2);
					setState(93);
					proc(0);
					setState(94);
					match(WITH);
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(95);
						match(WHITESPACE);
						}
					}

					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			{
			setState(103);
			num();
			setState(104);
			match(T__2);
			setState(105);
			proc(0);
			}
			setState(107);
			match(T__3);
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

	public static class SelectContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(piParser.SELECT, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(piParser.CONTINUE, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			name();
			setState(110);
			match(SELECT);
			setState(111);
			num();
			setState(112);
			match(CONTINUE);
			setState(113);
			proc(0);
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(piParser.IF, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode THEN() { return getToken(piParser.THEN, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(piParser.ELSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			bool();
			setState(117);
			match(THEN);
			setState(118);
			proc(0);
			setState(119);
			match(ELSE);
			setState(120);
			proc(0);
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

	public static class SubprocContext extends ParserRuleContext {
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public SubprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterSubproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitSubproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitSubproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprocContext subproc() throws RecognitionException {
		SubprocContext _localctx = new SubprocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__4);
			setState(123);
			proc(0);
			setState(124);
			match(T__5);
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

	public static class TupleContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(piParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(piParser.WITH, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(piParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(piParser.WHITESPACE, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__6);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					value();
					setState(128);
					match(WITH);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(129);
						match(WHITESPACE);
						}
					}

					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(137);
			value();
			setState(138);
			match(T__7);
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

	public static class ValueContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public PairExprContext pairExpr() {
			return getRuleContext(PairExprContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SubvalContext subval() {
			return getRuleContext(SubvalContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(140);
				bool();
				}
				break;
			case 2:
				{
				setState(141);
				name();
				}
				break;
			case 3:
				{
				setState(142);
				num();
				}
				break;
			case 4:
				{
				setState(143);
				arithExpr();
				}
				break;
			case 5:
				{
				setState(144);
				logicExpr();
				}
				break;
			case 6:
				{
				setState(145);
				pair();
				}
				break;
			case 7:
				{
				setState(146);
				pairExpr();
				}
				break;
			case 8:
				{
				setState(147);
				list();
				}
				break;
			case 9:
				{
				setState(148);
				subval();
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

	public static class ArithExprContext extends ParserRuleContext {
		public TerminalNode REPL() { return getToken(piParser.REPL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitArithExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			name();
			}
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << REPL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(153);
				name();
				}
				break;
			case 2:
				{
				setState(154);
				value();
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

	public static class LogicExprContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			name();
			setState(158);
			match(T__0);
			setState(159);
			value();
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

	public static class PairExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode FST() { return getToken(piParser.FST, 0); }
		public TerminalNode SND() { return getToken(piParser.SND, 0); }
		public PairExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterPairExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitPairExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitPairExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairExprContext pairExpr() throws RecognitionException {
		PairExprContext _localctx = new PairExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pairExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !(_la==FST || _la==SND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			match(T__4);
			setState(163);
			value();
			setState(164);
			match(T__5);
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

	public static class PairContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode WITH() { return getToken(piParser.WITH, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__4);
			setState(167);
			value();
			setState(168);
			match(WITH);
			setState(169);
			value();
			setState(170);
			match(T__5);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> LIT() { return getTokens(piParser.LIT); }
		public TerminalNode LIT(int i) {
			return getToken(piParser.LIT, i);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LIT);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(175);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LIT:
						{
						setState(173);
						match(LIT);
						}
						break;
					case T__9:
					case INT:
						{
						setState(174);
						num();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(179);
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
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(piParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(piParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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

	public static class NumContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(piParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(piParser.INT, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_num);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(182);
				match(T__9);
				}
			}

			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode CONS() { return getToken(piParser.CONS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode WITH() { return getToken(piParser.WITH, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NIL() { return getToken(piParser.NIL, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(CONS);
				setState(191);
				match(T__4);
				setState(192);
				value();
				setState(193);
				match(WITH);
				setState(194);
				list();
				setState(195);
				match(T__5);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(NIL);
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

	public static class SubvalContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SubvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).enterSubval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof piListener ) ((piListener)listener).exitSubval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof piVisitor ) return ((piVisitor<? extends T>)visitor).visitSubval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubvalContext subval() throws RecognitionException {
		SubvalContext _localctx = new SubvalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__4);
			setState(201);
			value();
			setState(202);
			match(T__5);
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
		case 1:
			return proc_sempred((ProcContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean proc_sempred(ProcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3E"+
		"\n\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n\6\7\6e\n\6\f"+
		"\6\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0085\n\n\7\n"+
		"\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\5\f\u009e\n\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u00b2\n\20\f\20\16\20\u00b5\13\20\3\21\3\21\3\22\5\22"+
		"\u00ba\n\22\3\22\6\22\u00bd\n\22\r\22\16\22\u00be\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\24\3\24\3\24\2\3\4\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\4\2\13\r\23\23\3\2\34"+
		"\35\3\2%&\2\u00d8\2*\3\2\2\2\4D\3\2\2\2\6N\3\2\2\2\bT\3\2\2\2\nZ\3\2\2"+
		"\2\fo\3\2\2\2\16u\3\2\2\2\20|\3\2\2\2\22\u0080\3\2\2\2\24\u0097\3\2\2"+
		"\2\26\u0099\3\2\2\2\30\u009f\3\2\2\2\32\u00a3\3\2\2\2\34\u00a8\3\2\2\2"+
		"\36\u00ae\3\2\2\2 \u00b6\3\2\2\2\"\u00b9\3\2\2\2$\u00c8\3\2\2\2&\u00ca"+
		"\3\2\2\2(+\5\4\3\2)+\5\24\13\2*(\3\2\2\2*)\3\2\2\2+\3\3\2\2\2,-\b\3\1"+
		"\2-E\7\20\2\2./\7\23\2\2/E\5\4\3\f\60\61\7\24\2\2\61\62\5\36\20\2\62\63"+
		"\7\33\2\2\63\64\5\36\20\2\64\65\7\25\2\2\65\66\5\4\3\13\66E\3\2\2\2\67"+
		"E\5\6\4\28E\5\b\5\29E\5\n\6\2:E\5\f\7\2;E\5\16\b\2<E\5\20\t\2=>\7 \2\2"+
		">?\5\36\20\2?@\7\3\2\2@A\5\24\13\2AB\7\25\2\2BC\5\4\3\3CE\3\2\2\2D,\3"+
		"\2\2\2D.\3\2\2\2D\60\3\2\2\2D\67\3\2\2\2D8\3\2\2\2D9\3\2\2\2D:\3\2\2\2"+
		"D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2EK\3\2\2\2FG\f\n\2\2GH\7\31\2\2HJ\5\4\3"+
		"\13IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3\2\2\2NO\5\36"+
		"\20\2OP\7\22\2\2PQ\5\24\13\2QR\7\32\2\2RS\5\4\3\2S\7\3\2\2\2TU\5\36\20"+
		"\2UV\7\21\2\2VW\5\36\20\2WX\7\32\2\2XY\5\4\3\2Y\t\3\2\2\2Z[\5\36\20\2"+
		"[\\\7!\2\2\\f\7\4\2\2]^\5\"\22\2^_\7\5\2\2_`\5\4\3\2`b\7\33\2\2ac\7\16"+
		"\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2d]\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gi\3\2\2\2hf\3\2\2\2ij\5\"\22\2jk\7\5\2\2kl\5\4\3\2lm\3\2\2\2mn\7"+
		"\6\2\2n\13\3\2\2\2op\5\36\20\2pq\7\"\2\2qr\5\"\22\2rs\7\32\2\2st\5\4\3"+
		"\2t\r\3\2\2\2uv\7\26\2\2vw\5 \21\2wx\7\27\2\2xy\5\4\3\2yz\7\30\2\2z{\5"+
		"\4\3\2{\17\3\2\2\2|}\7\7\2\2}~\5\4\3\2~\177\7\b\2\2\177\21\3\2\2\2\u0080"+
		"\u0088\7\t\2\2\u0081\u0082\5\24\13\2\u0082\u0084\7\33\2\2\u0083\u0085"+
		"\7\16\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2"+
		"\u0086\u0081\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\24\13\2"+
		"\u008c\u008d\7\n\2\2\u008d\23\3\2\2\2\u008e\u0098\5 \21\2\u008f\u0098"+
		"\5\36\20\2\u0090\u0098\5\"\22\2\u0091\u0098\5\26\f\2\u0092\u0098\5\30"+
		"\r\2\u0093\u0098\5\34\17\2\u0094\u0098\5\32\16\2\u0095\u0098\5$\23\2\u0096"+
		"\u0098\5&\24\2\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3\2"+
		"\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2"+
		"\2\u0099\u009a\5\36\20\2\u009a\u009d\t\2\2\2\u009b\u009e\5\36\20\2\u009c"+
		"\u009e\5\24\13\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\27\3\2"+
		"\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\24\13\2\u00a2"+
		"\31\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\5\24\13"+
		"\2\u00a6\u00a7\7\b\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa"+
		"\5\24\13\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\7\b"+
		"\2\2\u00ad\35\3\2\2\2\u00ae\u00b3\7$\2\2\u00af\u00b2\7$\2\2\u00b0\u00b2"+
		"\5\"\22\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\t\4\2\2\u00b7!\3\2\2\2\u00b8\u00ba\7\f\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\7#"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\7\7\2\2"+
		"\u00c2\u00c3\5\24\13\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\5$\23\2\u00c5"+
		"\u00c6\7\b\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\7\37\2\2\u00c8\u00c0\3"+
		"\2\2\2\u00c8\u00c7\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc"+
		"\5\24\13\2\u00cc\u00cd\7\b\2\2\u00cd\'\3\2\2\2\20*DKbf\u0084\u0088\u0097"+
		"\u009d\u00b1\u00b3\u00b9\u00be\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}