// Generated from SqlParser.g4 by ANTLR 4.7.1

package org.joo.libra.sql.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, AND=2, OR=3, NOT=4, IS_EQUALS=5, IS_EQUALS_NOT=6, IS_EMPTY=7, IS_NOT_EMPTY=8, 
		CONTAINS=9, IN=10, MATCHES=11, TRUE=12, FALSE=13, UNDEFINED=14, NULL=15, 
		ANY=16, NONE=17, ALL=18, OF=19, SATISFIES=20, GREATER_THAN=21, GREATER_THAN_EQUALS=22, 
		LESS_THAN=23, LESS_THAN_EQUALS=24, EQUALS=25, NOT_EQUALS=26, DBL_EQUALS=27, 
		PLUS=28, MINUS=29, TIMES=30, DIVIDE=31, MOD=32, POW=33, QUESTION=34, COLON=35, 
		LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, COMMA=40, STRING=41, INTEGER=42, 
		DOUBLE=43, INDEX=44, VARIABLE=45;
	public static final int
		RULE_dummy = 0, RULE_predicate = 1, RULE_expression = 2, RULE_term = 3, 
		RULE_factor = 4, RULE_list = 5;
	public static final String[] ruleNames = {
		"dummy", "predicate", "expression", "term", "factor", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'>'", "'>='", "'<'", 
		"'<='", "'='", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'?'", "':'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", 
		"NULL", "ANY", "NONE", "ALL", "OF", "SATISFIES", "GREATER_THAN", "GREATER_THAN_EQUALS", 
		"LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "QUESTION", "COLON", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", 
		"DOUBLE", "INDEX", "VARIABLE"
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

	@Override
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DummyContext extends ParserRuleContext {
		public DummyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dummy; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitDummy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DummyContext dummy() throws RecognitionException {
		DummyContext _localctx = new DummyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dummy);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionExprContext extends PredicateContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionExprContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitExpressionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_predicate);
		try {
			_localctx = new ExpressionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext inner;
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermExprContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListMatchingExprContext extends ExpressionContext {
		public Token op;
		public Token indexName;
		public Token listName;
		public ExpressionContext condition;
		public TerminalNode OF() { return getToken(SqlParser.OF, 0); }
		public TerminalNode SATISFIES() { return getToken(SqlParser.SATISFIES, 0); }
		public TerminalNode ANY() { return getToken(SqlParser.ANY, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(SqlParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(SqlParser.VARIABLE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NONE() { return getToken(SqlParser.NONE, 0); }
		public TerminalNode ALL() { return getToken(SqlParser.ALL, 0); }
		public ListMatchingExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitListMatchingExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OR() { return getToken(SqlParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprContext extends ExpressionContext {
		public ExpressionContext main;
		public FactorContext left;
		public FactorContext right;
		public TerminalNode QUESTION() { return getToken(SqlParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(SqlParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public ConditionalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				match(NOT);
				setState(18);
				((NotExprContext)_localctx).inner = expression(8);
				}
				break;
			case TRUE:
			case FALSE:
			case UNDEFINED:
			case NULL:
			case LPAREN:
			case LBRACE:
			case STRING:
			case INTEGER:
			case DOUBLE:
			case VARIABLE:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				term();
				}
				break;
			case ANY:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				((ListMatchingExprContext)_localctx).op = match(ANY);
				setState(21);
				((ListMatchingExprContext)_localctx).indexName = match(VARIABLE);
				setState(22);
				match(OF);
				setState(23);
				((ListMatchingExprContext)_localctx).listName = match(VARIABLE);
				setState(24);
				match(SATISFIES);
				setState(25);
				((ListMatchingExprContext)_localctx).condition = expression(3);
				}
				break;
			case NONE:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				((ListMatchingExprContext)_localctx).op = match(NONE);
				setState(27);
				((ListMatchingExprContext)_localctx).indexName = match(VARIABLE);
				setState(28);
				match(OF);
				setState(29);
				((ListMatchingExprContext)_localctx).listName = match(VARIABLE);
				setState(30);
				match(SATISFIES);
				setState(31);
				((ListMatchingExprContext)_localctx).condition = expression(2);
				}
				break;
			case ALL:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				((ListMatchingExprContext)_localctx).op = match(ALL);
				setState(33);
				((ListMatchingExprContext)_localctx).indexName = match(VARIABLE);
				setState(34);
				match(OF);
				setState(35);
				((ListMatchingExprContext)_localctx).listName = match(VARIABLE);
				setState(36);
				match(SATISFIES);
				setState(37);
				((ListMatchingExprContext)_localctx).condition = expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(41);
						match(AND);
						setState(42);
						((AndExprContext)_localctx).right = expression(8);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						match(OR);
						setState(45);
						((OrExprContext)_localctx).right = expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExprContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).main = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
						match(QUESTION);
						setState(48);
						((ConditionalExprContext)_localctx).left = factor(0);
						setState(49);
						match(COLON);
						setState(50);
						((ConditionalExprContext)_localctx).right = factor(0);
						}
						break;
					}
					} 
				}
				setState(56);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode IS_EMPTY() { return getToken(SqlParser.IS_EMPTY, 0); }
		public TerminalNode IS_NOT_EMPTY() { return getToken(SqlParser.IS_NOT_EMPTY, 0); }
		public EmptyExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitEmptyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public InExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitInExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode NOT_EQUALS() { return getToken(SqlParser.NOT_EQUALS, 0); }
		public TerminalNode IS_EQUALS_NOT() { return getToken(SqlParser.IS_EQUALS_NOT, 0); }
		public NotEqualExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNotEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatchesExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MATCHES() { return getToken(SqlParser.MATCHES, 0); }
		public MatchesExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitMatchesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainsExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode CONTAINS() { return getToken(SqlParser.CONTAINS, 0); }
		public ContainsExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitContainsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorExprContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(SqlParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(SqlParser.GREATER_THAN_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(SqlParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(SqlParser.LESS_THAN_EQUALS, 0); }
		public CompareExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExprContext extends TermContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(SqlParser.EQUALS, 0); }
		public TerminalNode DBL_EQUALS() { return getToken(SqlParser.DBL_EQUALS, 0); }
		public TerminalNode IS_EQUALS() { return getToken(SqlParser.IS_EQUALS, 0); }
		public EqualExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((CompareExprContext)_localctx).left = factor(0);
				setState(58);
				((CompareExprContext)_localctx).op = match(GREATER_THAN);
				setState(59);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 2:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((CompareExprContext)_localctx).left = factor(0);
				setState(62);
				((CompareExprContext)_localctx).op = match(GREATER_THAN_EQUALS);
				setState(63);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 3:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				((CompareExprContext)_localctx).left = factor(0);
				setState(66);
				((CompareExprContext)_localctx).op = match(LESS_THAN);
				setState(67);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 4:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				((CompareExprContext)_localctx).left = factor(0);
				setState(70);
				((CompareExprContext)_localctx).op = match(LESS_THAN_EQUALS);
				setState(71);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 5:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				((EqualExprContext)_localctx).left = factor(0);
				setState(74);
				((EqualExprContext)_localctx).op = match(EQUALS);
				setState(75);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 6:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				((EqualExprContext)_localctx).left = factor(0);
				setState(78);
				((EqualExprContext)_localctx).op = match(DBL_EQUALS);
				setState(79);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 7:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(82);
				((NotEqualExprContext)_localctx).op = match(NOT_EQUALS);
				setState(83);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 8:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(86);
				((NotEqualExprContext)_localctx).op = match(IS_EQUALS_NOT);
				setState(87);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 9:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				((EqualExprContext)_localctx).left = factor(0);
				setState(90);
				((EqualExprContext)_localctx).op = match(IS_EQUALS);
				setState(91);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 10:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(94);
				((EmptyExprContext)_localctx).op = match(IS_EMPTY);
				}
				break;
			case 11:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(97);
				((EmptyExprContext)_localctx).op = match(IS_NOT_EMPTY);
				}
				break;
			case 12:
				_localctx = new ContainsExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(99);
				((ContainsExprContext)_localctx).left = factor(0);
				setState(100);
				((ContainsExprContext)_localctx).op = match(CONTAINS);
				setState(101);
				((ContainsExprContext)_localctx).right = factor(0);
				}
				break;
			case 13:
				_localctx = new MatchesExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(103);
				((MatchesExprContext)_localctx).left = factor(0);
				setState(104);
				((MatchesExprContext)_localctx).op = match(MATCHES);
				setState(105);
				((MatchesExprContext)_localctx).right = factor(0);
				}
				break;
			case 14:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(107);
				factor(0);
				}
				break;
			case 15:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(108);
				((InExprContext)_localctx).left = factor(0);
				setState(109);
				((InExprContext)_localctx).op = match(IN);
				setState(110);
				((InExprContext)_localctx).right = factor(0);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringExprContext extends FactorContext {
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public StringExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprContext extends FactorContext {
		public TerminalNode VARIABLE() { return getToken(SqlParser.VARIABLE, 0); }
		public VariableExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExprContext extends FactorContext {
		public TerminalNode UNDEFINED() { return getToken(SqlParser.UNDEFINED, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public NullExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExprContext extends FactorContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode POW() { return getToken(SqlParser.POW, 0); }
		public TerminalNode TIMES() { return getToken(SqlParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SqlParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public MathExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrapListExprContext extends FactorContext {
		public ListContext item;
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public WrapListExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitWrapListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends FactorContext {
		public TerminalNode DOUBLE() { return getToken(SqlParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(SqlParser.INTEGER, 0); }
		public NumberExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExprContext extends FactorContext {
		public TerminalNode TRUE() { return getToken(SqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlParser.FALSE, 0); }
		public BooleanExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends FactorContext {
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public ParenExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends FactorContext {
		public Token name;
		public ListContext inner;
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(SqlParser.VARIABLE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public FunctionExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		return factor(0);
	}

	private FactorContext factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FactorContext _localctx = new FactorContext(_ctx, _parentState);
		FactorContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(DOUBLE);
				}
				break;
			case 2:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(INTEGER);
				}
				break;
			case 3:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(FALSE);
				}
				break;
			case 6:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(UNDEFINED);
				}
				break;
			case 7:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(NULL);
				}
				break;
			case 8:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(VARIABLE);
				}
				break;
			case 9:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(LPAREN);
				setState(124);
				expression(0);
				setState(125);
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				((FunctionExprContext)_localctx).name = match(VARIABLE);
				setState(128);
				match(LPAREN);
				setState(129);
				((FunctionExprContext)_localctx).inner = list(0);
				setState(130);
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((FunctionExprContext)_localctx).name = match(VARIABLE);
				setState(133);
				match(LPAREN);
				setState(134);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(LBRACE);
				setState(136);
				((WrapListExprContext)_localctx).item = list(0);
				setState(137);
				match(RBRACE);
				}
				break;
			case 13:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(LBRACE);
				setState(140);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(143);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(144);
						((MathExprContext)_localctx).op = match(POW);
						setState(145);
						((MathExprContext)_localctx).right = factor(9);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(147);
						((MathExprContext)_localctx).op = match(TIMES);
						setState(148);
						((MathExprContext)_localctx).right = factor(8);
						}
						break;
					case 3:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						((MathExprContext)_localctx).op = match(DIVIDE);
						setState(151);
						((MathExprContext)_localctx).right = factor(7);
						}
						break;
					case 4:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						((MathExprContext)_localctx).op = match(PLUS);
						setState(154);
						((MathExprContext)_localctx).right = factor(6);
						}
						break;
					case 5:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						((MathExprContext)_localctx).op = match(MINUS);
						setState(157);
						((MathExprContext)_localctx).right = factor(5);
						}
						break;
					case 6:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						((MathExprContext)_localctx).op = match(MOD);
						setState(160);
						((MathExprContext)_localctx).right = factor(4);
						}
						break;
					}
					} 
				}
				setState(165);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListFactorExprContext extends ListContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ListFactorExprContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitListFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListCommaExprContext extends ListContext {
		public ListContext left;
		public ListContext right;
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListCommaExprContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitListCommaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		return list(0);
	}

	private ListContext list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListContext _localctx = new ListContext(_ctx, _parentState);
		ListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ListFactorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(167);
			factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListCommaExprContext(new ListContext(_parentctx, _parentState));
					((ListCommaExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(169);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(170);
					match(COMMA);
					setState(171);
					((ListCommaExprContext)_localctx).right = list(2);
					}
					} 
				}
				setState(176);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 5:
			return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\67\n\4"+
		"\f\4\16\4:\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0090\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u00a4\n\6\f\6\16\6\u00a7\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\7\2\5\6\n\f\b\2\4\6\b\n\f"+
		"\2\2\2\u00d5\2\16\3\2\2\2\4\20\3\2\2\2\6(\3\2\2\2\br\3\2\2\2\n\u008f\3"+
		"\2\2\2\f\u00a8\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\21\5\6\4\2\21\5\3"+
		"\2\2\2\22\23\b\4\1\2\23\24\7\6\2\2\24)\5\6\4\n\25)\5\b\5\2\26\27\7\22"+
		"\2\2\27\30\7/\2\2\30\31\7\25\2\2\31\32\7/\2\2\32\33\7\26\2\2\33)\5\6\4"+
		"\5\34\35\7\23\2\2\35\36\7/\2\2\36\37\7\25\2\2\37 \7/\2\2 !\7\26\2\2!)"+
		"\5\6\4\4\"#\7\24\2\2#$\7/\2\2$%\7\25\2\2%&\7/\2\2&\'\7\26\2\2\')\5\6\4"+
		"\3(\22\3\2\2\2(\25\3\2\2\2(\26\3\2\2\2(\34\3\2\2\2(\"\3\2\2\2)8\3\2\2"+
		"\2*+\f\t\2\2+,\7\4\2\2,\67\5\6\4\n-.\f\b\2\2./\7\5\2\2/\67\5\6\4\t\60"+
		"\61\f\6\2\2\61\62\7$\2\2\62\63\5\n\6\2\63\64\7%\2\2\64\65\5\n\6\2\65\67"+
		"\3\2\2\2\66*\3\2\2\2\66-\3\2\2\2\66\60\3\2\2\2\67:\3\2\2\28\66\3\2\2\2"+
		"89\3\2\2\29\7\3\2\2\2:8\3\2\2\2;<\5\n\6\2<=\7\27\2\2=>\5\n\6\2>s\3\2\2"+
		"\2?@\5\n\6\2@A\7\30\2\2AB\5\n\6\2Bs\3\2\2\2CD\5\n\6\2DE\7\31\2\2EF\5\n"+
		"\6\2Fs\3\2\2\2GH\5\n\6\2HI\7\32\2\2IJ\5\n\6\2Js\3\2\2\2KL\5\n\6\2LM\7"+
		"\33\2\2MN\5\n\6\2Ns\3\2\2\2OP\5\n\6\2PQ\7\35\2\2QR\5\n\6\2Rs\3\2\2\2S"+
		"T\5\n\6\2TU\7\34\2\2UV\5\n\6\2Vs\3\2\2\2WX\5\n\6\2XY\7\b\2\2YZ\5\n\6\2"+
		"Zs\3\2\2\2[\\\5\n\6\2\\]\7\7\2\2]^\5\n\6\2^s\3\2\2\2_`\5\n\6\2`a\7\t\2"+
		"\2as\3\2\2\2bc\5\n\6\2cd\7\n\2\2ds\3\2\2\2ef\5\n\6\2fg\7\13\2\2gh\5\n"+
		"\6\2hs\3\2\2\2ij\5\n\6\2jk\7\r\2\2kl\5\n\6\2ls\3\2\2\2ms\5\n\6\2no\5\n"+
		"\6\2op\7\f\2\2pq\5\n\6\2qs\3\2\2\2r;\3\2\2\2r?\3\2\2\2rC\3\2\2\2rG\3\2"+
		"\2\2rK\3\2\2\2rO\3\2\2\2rS\3\2\2\2rW\3\2\2\2r[\3\2\2\2r_\3\2\2\2rb\3\2"+
		"\2\2re\3\2\2\2ri\3\2\2\2rm\3\2\2\2rn\3\2\2\2s\t\3\2\2\2tu\b\6\1\2u\u0090"+
		"\7-\2\2v\u0090\7,\2\2w\u0090\7+\2\2x\u0090\7\16\2\2y\u0090\7\17\2\2z\u0090"+
		"\7\20\2\2{\u0090\7\21\2\2|\u0090\7/\2\2}~\7&\2\2~\177\5\6\4\2\177\u0080"+
		"\7\'\2\2\u0080\u0090\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7&\2\2\u0083"+
		"\u0084\5\f\7\2\u0084\u0085\7\'\2\2\u0085\u0090\3\2\2\2\u0086\u0087\7/"+
		"\2\2\u0087\u0088\7&\2\2\u0088\u0090\7\'\2\2\u0089\u008a\7(\2\2\u008a\u008b"+
		"\5\f\7\2\u008b\u008c\7)\2\2\u008c\u0090\3\2\2\2\u008d\u008e\7(\2\2\u008e"+
		"\u0090\7)\2\2\u008ft\3\2\2\2\u008fv\3\2\2\2\u008fw\3\2\2\2\u008fx\3\2"+
		"\2\2\u008fy\3\2\2\2\u008fz\3\2\2\2\u008f{\3\2\2\2\u008f|\3\2\2\2\u008f"+
		"}\3\2\2\2\u008f\u0081\3\2\2\2\u008f\u0086\3\2\2\2\u008f\u0089\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u0090\u00a5\3\2\2\2\u0091\u0092\f\n\2\2\u0092\u0093"+
		"\7#\2\2\u0093\u00a4\5\n\6\13\u0094\u0095\f\t\2\2\u0095\u0096\7 \2\2\u0096"+
		"\u00a4\5\n\6\n\u0097\u0098\f\b\2\2\u0098\u0099\7!\2\2\u0099\u00a4\5\n"+
		"\6\t\u009a\u009b\f\7\2\2\u009b\u009c\7\36\2\2\u009c\u00a4\5\n\6\b\u009d"+
		"\u009e\f\6\2\2\u009e\u009f\7\37\2\2\u009f\u00a4\5\n\6\7\u00a0\u00a1\f"+
		"\5\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a4\5\n\6\6\u00a3\u0091\3\2\2\2\u00a3"+
		"\u0094\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009d\3\2"+
		"\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\b\7\1"+
		"\2\u00a9\u00aa\5\n\6\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\f\3\2\2\u00ac\u00ad"+
		"\7*\2\2\u00ad\u00af\5\f\7\4\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\n(\668r\u008f\u00a3\u00a5\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}