// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BOOLSQ=14, BOOLEAN=15, IDENT=16, 
		WHITESPACE=17, COMMENT=18, LONGCOMMENT=19;
	public static final int
		RULE_start = 0, RULE_hw = 1, RULE_hardware = 2, RULE_input = 3, RULE_outputs = 4, 
		RULE_latches = 5, RULE_update = 6, RULE_exp = 7, RULE_simulate = 8, RULE_signal = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hw", "hardware", "input", "outputs", "latches", "update", "exp", 
			"simulate", "signal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latches'", "'->'", 
			"'.update'", "'='", "'!'", "'&&'", "'||'", "'('", "')'", "'.simulate'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOLSQ", "BOOLEAN", "IDENT", "WHITESPACE", "COMMENT", "LONGCOMMENT"
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
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public HwContext hw() {
			return getRuleContext(HwContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			hw();
			setState(21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HwContext extends ParserRuleContext {
		public HardwareContext hardware() {
			return getRuleContext(HardwareContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public SimulateContext simulate() {
			return getRuleContext(SimulateContext.class,0);
		}
		public HwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterHw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitHw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitHw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HwContext hw() throws RecognitionException {
		HwContext _localctx = new HwContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			hardware();
			setState(24);
			input();
			setState(25);
			outputs();
			setState(26);
			latches();
			setState(27);
			update();
			setState(28);
			simulate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HardwareContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitHardware(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hardware);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				match(IDENT);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(IDENT);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LatchesContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_latches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(46);
				match(IDENT);
				setState(47);
				match(T__4);
				setState(48);
				match(IDENT);
				}
				}
				setState(53);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ccParser.IDENT, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__5);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(55);
				match(IDENT);
				setState(56);
				match(T__6);
				setState(57);
				exp(0);
				}
				}
				setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpContext {
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public VarContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NothingContext extends ExpContext {
		public NothingContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitNothing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(IDENT);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__7);
				setState(66);
				exp(5);
				}
				break;
			case 3:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__10);
				setState(68);
				exp(0);
				setState(69);
				match(T__11);
				}
				break;
			case 4:
				{
				_localctx = new NothingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(74);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(75);
						match(T__8);
						setState(76);
						exp(5);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(77);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(78);
						match(T__9);
						setState(79);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimulateContext extends ParserRuleContext {
		public List<SignalContext> signal() {
			return getRuleContexts(SignalContext.class);
		}
		public SignalContext signal(int i) {
			return getRuleContext(SignalContext.class,i);
		}
		public List<TerminalNode> BOOLSQ() { return getTokens(ccParser.BOOLSQ); }
		public TerminalNode BOOLSQ(int i) {
			return getToken(ccParser.BOOLSQ, i);
		}
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simulate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__12);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				signal();
				setState(87);
				match(T__6);
				setState(88);
				match(BOOLSQ);
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ccParser.IDENT, 0); }
		public SignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalContext signal() throws RecognitionException {
		SignalContext _localctx = new SignalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003"+
		"$\b\u0003\u000b\u0003\f\u0003%\u0001\u0004\u0001\u0004\u0004\u0004*\b"+
		"\u0004\u000b\u0004\f\u0004+\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u00052\b\u0005\n\u0005\f\u00055\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006;\b\u0006\n\u0006\f\u0006>\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007I\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007Q\b\u0007\n\u0007\f\u0007T\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0004\b[\b\b\u000b\b\f\b\\\u0001\t\u0001\t\u0001\t\u0000\u0001"+
		"\u000e\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000`"+
		"\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000"+
		"\u0004\u001e\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b"+
		"\'\u0001\u0000\u0000\u0000\n-\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000"+
		"\u0000\u000eH\u0001\u0000\u0000\u0000\u0010U\u0001\u0000\u0000\u0000\u0012"+
		"^\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016"+
		"\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0003\u0004\u0002\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a"+
		"\u0003\b\u0004\u0000\u001a\u001b\u0003\n\u0005\u0000\u001b\u001c\u0003"+
		"\f\u0006\u0000\u001c\u001d\u0003\u0010\b\u0000\u001d\u0003\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0005\u0010\u0000"+
		"\u0000 \u0005\u0001\u0000\u0000\u0000!#\u0005\u0002\u0000\u0000\"$\u0005"+
		"\u0010\u0000\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0007\u0001\u0000"+
		"\u0000\u0000\')\u0005\u0003\u0000\u0000(*\u0005\u0010\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,\t\u0001\u0000\u0000\u0000-3\u0005\u0004\u0000"+
		"\u0000./\u0005\u0010\u0000\u0000/0\u0005\u0005\u0000\u000002\u0005\u0010"+
		"\u0000\u00001.\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u000b\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u00006<\u0005\u0006\u0000\u000078\u0005\u0010"+
		"\u0000\u000089\u0005\u0007\u0000\u00009;\u0003\u000e\u0007\u0000:7\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?@\u0006\u0007\uffff\uffff\u0000@I\u0005\u0010\u0000\u0000AB\u0005"+
		"\b\u0000\u0000BI\u0003\u000e\u0007\u0005CD\u0005\u000b\u0000\u0000DE\u0003"+
		"\u000e\u0007\u0000EF\u0005\f\u0000\u0000FI\u0001\u0000\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000H?\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000"+
		"HC\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IR\u0001\u0000\u0000"+
		"\u0000JK\n\u0004\u0000\u0000KL\u0005\t\u0000\u0000LQ\u0003\u000e\u0007"+
		"\u0005MN\n\u0003\u0000\u0000NO\u0005\n\u0000\u0000OQ\u0003\u000e\u0007"+
		"\u0004PJ\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u000f"+
		"\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UZ\u0005\r\u0000\u0000"+
		"VW\u0003\u0012\t\u0000WX\u0005\u0007\u0000\u0000XY\u0005\u000e\u0000\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0011\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0010\u0000\u0000_\u0013\u0001\u0000\u0000"+
		"\u0000\b%+3<HPR\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}