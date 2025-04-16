package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KiddoLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SET=1, TO=2, SAY=3, WHEN=4, OTHERWISE=5, COUNT=6, FROM=7, REPEAT=8, UNTIL=9, 
		AND=10, OR=11, NOT=12, YES=13, NO=14, PLUS=15, MINUS=16, MULT=17, DIV=18, 
		GT=19, LT=20, EQ=21, QMARK=22, COLON=23, LPAREN=24, RPAREN=25, LBRACE=26, 
		RBRACE=27, SEMI=28, ID=29, INT=30, FLOAT=31, STRING=32, WS=33, COMMENT=34;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_printStatement = 3, 
		RULE_ifStatement = 4, RULE_loopStatement = 5, RULE_forLoop = 6, RULE_whileLoop = 7, 
		RULE_ternaryExpr = 8, RULE_block = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "printStatement", "ifStatement", 
			"loopStatement", "forLoop", "whileLoop", "ternaryExpr", "block", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'set'", "'to'", "'say'", "'when'", "'otherwise'", "'count'", "'from'", 
			"'repeat'", "'until'", "'and'", "'or'", "'not'", "'yes'", "'no'", "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'?'", "':'", "'('", "')'", 
			"'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SET", "TO", "SAY", "WHEN", "OTHERWISE", "COUNT", "FROM", "REPEAT", 
			"UNTIL", "AND", "OR", "NOT", "YES", "NO", "PLUS", "MINUS", "MULT", "DIV", 
			"GT", "LT", "EQ", "QMARK", "COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"SEMI", "ID", "INT", "FLOAT", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "KiddoLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KiddoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8069869914L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public TernaryExprContext ternaryExpr() {
			return getRuleContext(TernaryExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KiddoLangParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				assignment();
				}
				break;
			case SAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				printStatement();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				ifStatement();
				}
				break;
			case COUNT:
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				loopStatement();
				}
				break;
			case NOT:
			case YES:
			case NO:
			case LPAREN:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				ternaryExpr();
				setState(32);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(KiddoLangParser.SET, 0); }
		public TerminalNode ID() { return getToken(KiddoLangParser.ID, 0); }
		public TerminalNode TO() { return getToken(KiddoLangParser.TO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KiddoLangParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(SET);
			setState(37);
			match(ID);
			setState(38);
			match(TO);
			setState(39);
			expr(0);
			setState(40);
			match(SEMI);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode SAY() { return getToken(KiddoLangParser.SAY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(KiddoLangParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(SAY);
			setState(43);
			expr(0);
			setState(44);
			match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KiddoLangParser.WHEN, 0); }
		public TerminalNode LPAREN() { return getToken(KiddoLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KiddoLangParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode OTHERWISE() { return getToken(KiddoLangParser.OTHERWISE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(WHEN);
			setState(47);
			match(LPAREN);
			setState(48);
			expr(0);
			setState(49);
			match(RPAREN);
			setState(50);
			block();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(51);
				match(OTHERWISE);
				setState(52);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopStatement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				forLoop();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				whileLoop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(KiddoLangParser.COUNT, 0); }
		public TerminalNode FROM() { return getToken(KiddoLangParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(KiddoLangParser.TO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(COUNT);
			setState(60);
			match(FROM);
			setState(61);
			expr(0);
			setState(62);
			match(TO);
			setState(63);
			expr(0);
			setState(64);
			block();
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(KiddoLangParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(KiddoLangParser.UNTIL, 0); }
		public TerminalNode LPAREN() { return getToken(KiddoLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KiddoLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(REPEAT);
			setState(67);
			match(UNTIL);
			setState(68);
			match(LPAREN);
			setState(69);
			expr(0);
			setState(70);
			match(RPAREN);
			setState(71);
			block();
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
	public static class TernaryExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QMARK() { return getToken(KiddoLangParser.QMARK, 0); }
		public TerminalNode COLON() { return getToken(KiddoLangParser.COLON, 0); }
		public TernaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpr; }
	}

	public final TernaryExprContext ternaryExpr() throws RecognitionException {
		TernaryExprContext _localctx = new TernaryExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ternaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			expr(0);
			setState(74);
			match(QMARK);
			setState(75);
			expr(0);
			setState(76);
			match(COLON);
			setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KiddoLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KiddoLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACE);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8069869914L) != 0) );
			setState(85);
			match(RBRACE);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(KiddoLangParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(KiddoLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KiddoLangParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(KiddoLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(KiddoLangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(KiddoLangParser.FLOAT, 0); }
		public TerminalNode YES() { return getToken(KiddoLangParser.YES, 0); }
		public TerminalNode NO() { return getToken(KiddoLangParser.NO, 0); }
		public TerminalNode STRING() { return getToken(KiddoLangParser.STRING, 0); }
		public TerminalNode MULT() { return getToken(KiddoLangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(KiddoLangParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(KiddoLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KiddoLangParser.MINUS, 0); }
		public TerminalNode GT() { return getToken(KiddoLangParser.GT, 0); }
		public TerminalNode LT() { return getToken(KiddoLangParser.LT, 0); }
		public TerminalNode EQ() { return getToken(KiddoLangParser.EQ, 0); }
		public TerminalNode AND() { return getToken(KiddoLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(KiddoLangParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(88);
				match(NOT);
				setState(89);
				expr(8);
				}
				break;
			case LPAREN:
				{
				setState(90);
				match(LPAREN);
				setState(91);
				expr(0);
				setState(92);
				match(RPAREN);
				}
				break;
			case ID:
				{
				setState(94);
				match(ID);
				}
				break;
			case INT:
				{
				setState(95);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(96);
				match(FLOAT);
				}
				break;
			case YES:
				{
				setState(97);
				match(YES);
				}
				break;
			case NO:
				{
				setState(98);
				match(NO);
				}
				break;
			case STRING:
				{
				setState(99);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(103);
						match(MULT);
						setState(104);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(106);
						match(DIV);
						setState(107);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(109);
						match(PLUS);
						setState(110);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(112);
						match(MINUS);
						setState(113);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(115);
						match(GT);
						setState(116);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(118);
						match(LT);
						setState(119);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(121);
						match(EQ);
						setState(122);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(124);
						match(AND);
						setState(125);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(127);
						match(OR);
						setState(128);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"6\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0004\tR\b\t\u000b\t\f\tS\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\ne\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0082\b\n\n\n\f\n\u0085\t\n\u0001\n\u0000\u0001"+
		"\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0000\u0093\u0000\u0017\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000"+
		"\u0000\u0004$\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b"+
		".\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001\u0000\u0000"+
		"\u0000\u000eB\u0001\u0000\u0000\u0000\u0010I\u0001\u0000\u0000\u0000\u0012"+
		"O\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016\u0018\u0003"+
		"\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b#\u0003\u0004"+
		"\u0002\u0000\u001c#\u0003\u0006\u0003\u0000\u001d#\u0003\b\u0004\u0000"+
		"\u001e#\u0003\n\u0005\u0000\u001f \u0003\u0010\b\u0000 !\u0005\u001c\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\"\u001b\u0001\u0000\u0000\u0000\"\u001c"+
		"\u0001\u0000\u0000\u0000\"\u001d\u0001\u0000\u0000\u0000\"\u001e\u0001"+
		"\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u001d\u0000\u0000&\'\u0005"+
		"\u0002\u0000\u0000\'(\u0003\u0014\n\u0000()\u0005\u001c\u0000\u0000)\u0005"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0003\u0000\u0000+,\u0003\u0014\n\u0000"+
		",-\u0005\u001c\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005\u0004"+
		"\u0000\u0000/0\u0005\u0018\u0000\u000001\u0003\u0014\n\u000012\u0005\u0019"+
		"\u0000\u000025\u0003\u0012\t\u000034\u0005\u0005\u0000\u000046\u0003\u0012"+
		"\t\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\t\u0001"+
		"\u0000\u0000\u00007:\u0003\f\u0006\u00008:\u0003\u000e\u0007\u000097\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0006\u0000\u0000<=\u0005\u0007\u0000\u0000=>\u0003\u0014"+
		"\n\u0000>?\u0005\u0002\u0000\u0000?@\u0003\u0014\n\u0000@A\u0003\u0012"+
		"\t\u0000A\r\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0005\t\u0000"+
		"\u0000DE\u0005\u0018\u0000\u0000EF\u0003\u0014\n\u0000FG\u0005\u0019\u0000"+
		"\u0000GH\u0003\u0012\t\u0000H\u000f\u0001\u0000\u0000\u0000IJ\u0003\u0014"+
		"\n\u0000JK\u0005\u0016\u0000\u0000KL\u0003\u0014\n\u0000LM\u0005\u0017"+
		"\u0000\u0000MN\u0003\u0014\n\u0000N\u0011\u0001\u0000\u0000\u0000OQ\u0005"+
		"\u001a\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u001b\u0000\u0000V\u0013\u0001"+
		"\u0000\u0000\u0000WX\u0006\n\uffff\uffff\u0000XY\u0005\f\u0000\u0000Y"+
		"e\u0003\u0014\n\bZ[\u0005\u0018\u0000\u0000[\\\u0003\u0014\n\u0000\\]"+
		"\u0005\u0019\u0000\u0000]e\u0001\u0000\u0000\u0000^e\u0005\u001d\u0000"+
		"\u0000_e\u0005\u001e\u0000\u0000`e\u0005\u001f\u0000\u0000ae\u0005\r\u0000"+
		"\u0000be\u0005\u000e\u0000\u0000ce\u0005 \u0000\u0000dW\u0001\u0000\u0000"+
		"\u0000dZ\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000d_\u0001\u0000"+
		"\u0000\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0083\u0001\u0000\u0000"+
		"\u0000fg\n\u0011\u0000\u0000gh\u0005\u0011\u0000\u0000h\u0082\u0003\u0014"+
		"\n\u0012ij\n\u0010\u0000\u0000jk\u0005\u0012\u0000\u0000k\u0082\u0003"+
		"\u0014\n\u0011lm\n\u000f\u0000\u0000mn\u0005\u000f\u0000\u0000n\u0082"+
		"\u0003\u0014\n\u0010op\n\u000e\u0000\u0000pq\u0005\u0010\u0000\u0000q"+
		"\u0082\u0003\u0014\n\u000frs\n\r\u0000\u0000st\u0005\u0013\u0000\u0000"+
		"t\u0082\u0003\u0014\n\u000euv\n\f\u0000\u0000vw\u0005\u0014\u0000\u0000"+
		"w\u0082\u0003\u0014\n\rxy\n\u000b\u0000\u0000yz\u0005\u0015\u0000\u0000"+
		"z\u0082\u0003\u0014\n\f{|\n\n\u0000\u0000|}\u0005\n\u0000\u0000}\u0082"+
		"\u0003\u0014\n\u000b~\u007f\n\t\u0000\u0000\u007f\u0080\u0005\u000b\u0000"+
		"\u0000\u0080\u0082\u0003\u0014\n\n\u0081f\u0001\u0000\u0000\u0000\u0081"+
		"i\u0001\u0000\u0000\u0000\u0081l\u0001\u0000\u0000\u0000\u0081o\u0001"+
		"\u0000\u0000\u0000\u0081r\u0001\u0000\u0000\u0000\u0081u\u0001\u0000\u0000"+
		"\u0000\u0081x\u0001\u0000\u0000\u0000\u0081{\u0001\u0000\u0000\u0000\u0081"+
		"~\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0015"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\b\u0019\""+
		"59Sd\u0081\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}