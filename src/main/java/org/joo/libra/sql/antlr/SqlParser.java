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
		ANY=16, NONE=17, ALL=18, FILTER=19, OF=20, SATISFIES=21, GREATER_THAN=22, 
		GREATER_THAN_EQUALS=23, LESS_THAN=24, LESS_THAN_EQUALS=25, EQUALS=26, 
		NOT_EQUALS=27, DBL_EQUALS=28, PLUS=29, MINUS=30, TIMES=31, DIVIDE=32, 
		MOD=33, POW=34, QUESTION=35, COLON=36, LPAREN=37, RPAREN=38, LBRACE=39, 
		RBRACE=40, COMMA=41, STRING=42, INTEGER=43, DOUBLE=44, INDEX=45, VARIABLE=46, 
		TEMP_VAR=47;
	public static final int
		RULE_dummy = 0, RULE_predicate = 1, RULE_expression = 2, RULE_term = 3, 
		RULE_factor = 4, RULE_list = 5, RULE_filter = 6;
	public static final String[] ruleNames = {
		"dummy", "predicate", "expression", "term", "factor", "list", "filter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'>'", "'>='", 
		"'<'", "'<='", "'='", "'!='", "'=='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'?'", "':'", "'('", "')'", "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", 
		"IS_NOT_EMPTY", "CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", 
		"NULL", "ANY", "NONE", "ALL", "FILTER", "OF", "SATISFIES", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "QUESTION", 
		"COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "COMMA", "STRING", "INTEGER", 
		"DOUBLE", "INDEX", "VARIABLE", "TEMP_VAR"
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
			setState(16);
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
		public FactorContext listName;
		public ExpressionContext condition;
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TerminalNode SATISFIES() { return getToken(SqlParser.SATISFIES, 0); }
		public TerminalNode ANY() { return getToken(SqlParser.ANY, 0); }
		public TerminalNode TEMP_VAR() { return getToken(SqlParser.TEMP_VAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
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
	public static class FilterMatchingContext extends ExpressionContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterMatchingContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFilterMatching(this);
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(NOT);
				setState(20);
				((NotExprContext)_localctx).inner = expression(9);
				}
				break;
			case 2:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				term();
				}
				break;
			case 3:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				((ListMatchingExprContext)_localctx).op = match(ANY);
				setState(23);
				((ListMatchingExprContext)_localctx).indexName = match(TEMP_VAR);
				setState(24);
				match(IN);
				setState(25);
				((ListMatchingExprContext)_localctx).listName = factor(0);
				setState(26);
				match(SATISFIES);
				setState(27);
				((ListMatchingExprContext)_localctx).condition = expression(4);
				}
				break;
			case 4:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				((ListMatchingExprContext)_localctx).op = match(NONE);
				setState(30);
				((ListMatchingExprContext)_localctx).indexName = match(TEMP_VAR);
				setState(31);
				match(IN);
				setState(32);
				((ListMatchingExprContext)_localctx).listName = factor(0);
				setState(33);
				match(SATISFIES);
				setState(34);
				((ListMatchingExprContext)_localctx).condition = expression(3);
				}
				break;
			case 5:
				{
				_localctx = new ListMatchingExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				((ListMatchingExprContext)_localctx).op = match(ALL);
				setState(37);
				((ListMatchingExprContext)_localctx).indexName = match(TEMP_VAR);
				setState(38);
				match(IN);
				setState(39);
				((ListMatchingExprContext)_localctx).listName = factor(0);
				setState(40);
				match(SATISFIES);
				setState(41);
				((ListMatchingExprContext)_localctx).condition = expression(2);
				}
				break;
			case 6:
				{
				_localctx = new FilterMatchingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				filter();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(47);
						match(AND);
						setState(48);
						((AndExprContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(50);
						match(OR);
						setState(51);
						((OrExprContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExprContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).main = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(53);
						match(QUESTION);
						setState(54);
						((ConditionalExprContext)_localctx).left = factor(0);
						setState(55);
						match(COLON);
						setState(56);
						((ConditionalExprContext)_localctx).right = factor(0);
						}
						break;
					}
					} 
				}
				setState(62);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((CompareExprContext)_localctx).left = factor(0);
				setState(64);
				((CompareExprContext)_localctx).op = match(GREATER_THAN);
				setState(65);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 2:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((CompareExprContext)_localctx).left = factor(0);
				setState(68);
				((CompareExprContext)_localctx).op = match(GREATER_THAN_EQUALS);
				setState(69);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 3:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				((CompareExprContext)_localctx).left = factor(0);
				setState(72);
				((CompareExprContext)_localctx).op = match(LESS_THAN);
				setState(73);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 4:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				((CompareExprContext)_localctx).left = factor(0);
				setState(76);
				((CompareExprContext)_localctx).op = match(LESS_THAN_EQUALS);
				setState(77);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 5:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				((EqualExprContext)_localctx).left = factor(0);
				setState(80);
				((EqualExprContext)_localctx).op = match(EQUALS);
				setState(81);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 6:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				((EqualExprContext)_localctx).left = factor(0);
				setState(84);
				((EqualExprContext)_localctx).op = match(DBL_EQUALS);
				setState(85);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 7:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(88);
				((NotEqualExprContext)_localctx).op = match(NOT_EQUALS);
				setState(89);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 8:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(92);
				((NotEqualExprContext)_localctx).op = match(IS_EQUALS_NOT);
				setState(93);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 9:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				((EqualExprContext)_localctx).left = factor(0);
				setState(96);
				((EqualExprContext)_localctx).op = match(IS_EQUALS);
				setState(97);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 10:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(100);
				((EmptyExprContext)_localctx).op = match(IS_EMPTY);
				}
				break;
			case 11:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(103);
				((EmptyExprContext)_localctx).op = match(IS_NOT_EMPTY);
				}
				break;
			case 12:
				_localctx = new ContainsExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				((ContainsExprContext)_localctx).left = factor(0);
				setState(106);
				((ContainsExprContext)_localctx).op = match(CONTAINS);
				setState(107);
				((ContainsExprContext)_localctx).right = factor(0);
				}
				break;
			case 13:
				_localctx = new MatchesExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
				((MatchesExprContext)_localctx).left = factor(0);
				setState(110);
				((MatchesExprContext)_localctx).op = match(MATCHES);
				setState(111);
				((MatchesExprContext)_localctx).right = factor(0);
				}
				break;
			case 14:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(113);
				factor(0);
				}
				break;
			case 15:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(114);
				((InExprContext)_localctx).left = factor(0);
				setState(115);
				((InExprContext)_localctx).op = match(IN);
				setState(116);
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
	public static class TempVarExprContext extends FactorContext {
		public TerminalNode TEMP_VAR() { return getToken(SqlParser.TEMP_VAR, 0); }
		public TempVarExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTempVarExpr(this);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				match(DOUBLE);
				}
				break;
			case 2:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(INTEGER);
				}
				break;
			case 3:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(TRUE);
				}
				break;
			case 5:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(FALSE);
				}
				break;
			case 6:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(UNDEFINED);
				}
				break;
			case 7:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(NULL);
				}
				break;
			case 8:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(VARIABLE);
				}
				break;
			case 9:
				{
				_localctx = new TempVarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(TEMP_VAR);
				}
				break;
			case 10:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(LPAREN);
				setState(131);
				expression(0);
				setState(132);
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				((FunctionExprContext)_localctx).name = match(VARIABLE);
				setState(135);
				match(LPAREN);
				setState(136);
				((FunctionExprContext)_localctx).inner = list(0);
				setState(137);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				((FunctionExprContext)_localctx).name = match(VARIABLE);
				setState(140);
				match(LPAREN);
				setState(141);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(LBRACE);
				setState(143);
				((WrapListExprContext)_localctx).item = list(0);
				setState(144);
				match(RBRACE);
				}
				break;
			case 14:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(LBRACE);
				setState(147);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						((MathExprContext)_localctx).op = match(POW);
						setState(152);
						((MathExprContext)_localctx).right = factor(9);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						((MathExprContext)_localctx).op = match(TIMES);
						setState(155);
						((MathExprContext)_localctx).right = factor(8);
						}
						break;
					case 3:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						((MathExprContext)_localctx).op = match(DIVIDE);
						setState(158);
						((MathExprContext)_localctx).right = factor(7);
						}
						break;
					case 4:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						((MathExprContext)_localctx).op = match(PLUS);
						setState(161);
						((MathExprContext)_localctx).right = factor(6);
						}
						break;
					case 5:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						((MathExprContext)_localctx).op = match(MINUS);
						setState(164);
						((MathExprContext)_localctx).right = factor(5);
						}
						break;
					case 6:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						((MathExprContext)_localctx).op = match(MOD);
						setState(167);
						((MathExprContext)_localctx).right = factor(4);
						}
						break;
					}
					} 
				}
				setState(172);
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
	public static class FilterExprContext extends ListContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilterExprContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFilterExpr(this);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ListFactorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				factor(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				filter();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListCommaExprContext(new ListContext(_parentctx, _parentState));
					((ListCommaExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(178);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(179);
					match(COMMA);
					setState(180);
					((ListCommaExprContext)_localctx).right = list(3);
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterMatchingExprContext extends FilterContext {
		public Token indexName;
		public FactorContext listName;
		public ExpressionContext condition;
		public FactorContext transform;
		public TerminalNode FILTER() { return getToken(SqlParser.FILTER, 0); }
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public TerminalNode SATISFIES() { return getToken(SqlParser.SATISFIES, 0); }
		public TerminalNode TEMP_VAR() { return getToken(SqlParser.TEMP_VAR, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterMatchingExprContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitFilterMatchingExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_filter);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
				_localctx = new FilterMatchingExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(FILTER);
				setState(187);
				((FilterMatchingExprContext)_localctx).indexName = match(TEMP_VAR);
				setState(188);
				match(IN);
				setState(189);
				((FilterMatchingExprContext)_localctx).listName = factor(0);
				setState(190);
				match(SATISFIES);
				setState(191);
				((FilterMatchingExprContext)_localctx).condition = expression(0);
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
			case TEMP_VAR:
				_localctx = new FilterMatchingExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				((FilterMatchingExprContext)_localctx).transform = factor(0);
				setState(194);
				match(FILTER);
				setState(195);
				((FilterMatchingExprContext)_localctx).indexName = match(TEMP_VAR);
				setState(196);
				match(IN);
				setState(197);
				((FilterMatchingExprContext)_localctx).listName = factor(0);
				setState(198);
				match(SATISFIES);
				setState(199);
				((FilterMatchingExprContext)_localctx).condition = expression(0);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 5);
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
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ab\n\6\f\6\16"+
		"\6\u00ae\13\6\3\7\3\7\3\7\5\7\u00b3\n\7\3\7\3\7\3\7\7\7\u00b8\n\7\f\7"+
		"\16\7\u00bb\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00cc\n\b\3\b\2\5\6\n\f\t\2\4\6\b\n\f\16\2\2\2\u00f2\2\20\3"+
		"\2\2\2\4\22\3\2\2\2\6.\3\2\2\2\bx\3\2\2\2\n\u0096\3\2\2\2\f\u00b2\3\2"+
		"\2\2\16\u00cb\3\2\2\2\20\21\3\2\2\2\21\3\3\2\2\2\22\23\5\6\4\2\23\5\3"+
		"\2\2\2\24\25\b\4\1\2\25\26\7\6\2\2\26/\5\6\4\13\27/\5\b\5\2\30\31\7\22"+
		"\2\2\31\32\7\61\2\2\32\33\7\f\2\2\33\34\5\n\6\2\34\35\7\27\2\2\35\36\5"+
		"\6\4\6\36/\3\2\2\2\37 \7\23\2\2 !\7\61\2\2!\"\7\f\2\2\"#\5\n\6\2#$\7\27"+
		"\2\2$%\5\6\4\5%/\3\2\2\2&\'\7\24\2\2\'(\7\61\2\2()\7\f\2\2)*\5\n\6\2*"+
		"+\7\27\2\2+,\5\6\4\4,/\3\2\2\2-/\5\16\b\2.\24\3\2\2\2.\27\3\2\2\2.\30"+
		"\3\2\2\2.\37\3\2\2\2.&\3\2\2\2.-\3\2\2\2/>\3\2\2\2\60\61\f\n\2\2\61\62"+
		"\7\4\2\2\62=\5\6\4\13\63\64\f\t\2\2\64\65\7\5\2\2\65=\5\6\4\n\66\67\f"+
		"\7\2\2\678\7%\2\289\5\n\6\29:\7&\2\2:;\5\n\6\2;=\3\2\2\2<\60\3\2\2\2<"+
		"\63\3\2\2\2<\66\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@>\3\2"+
		"\2\2AB\5\n\6\2BC\7\30\2\2CD\5\n\6\2Dy\3\2\2\2EF\5\n\6\2FG\7\31\2\2GH\5"+
		"\n\6\2Hy\3\2\2\2IJ\5\n\6\2JK\7\32\2\2KL\5\n\6\2Ly\3\2\2\2MN\5\n\6\2NO"+
		"\7\33\2\2OP\5\n\6\2Py\3\2\2\2QR\5\n\6\2RS\7\34\2\2ST\5\n\6\2Ty\3\2\2\2"+
		"UV\5\n\6\2VW\7\36\2\2WX\5\n\6\2Xy\3\2\2\2YZ\5\n\6\2Z[\7\35\2\2[\\\5\n"+
		"\6\2\\y\3\2\2\2]^\5\n\6\2^_\7\b\2\2_`\5\n\6\2`y\3\2\2\2ab\5\n\6\2bc\7"+
		"\7\2\2cd\5\n\6\2dy\3\2\2\2ef\5\n\6\2fg\7\t\2\2gy\3\2\2\2hi\5\n\6\2ij\7"+
		"\n\2\2jy\3\2\2\2kl\5\n\6\2lm\7\13\2\2mn\5\n\6\2ny\3\2\2\2op\5\n\6\2pq"+
		"\7\r\2\2qr\5\n\6\2ry\3\2\2\2sy\5\n\6\2tu\5\n\6\2uv\7\f\2\2vw\5\n\6\2w"+
		"y\3\2\2\2xA\3\2\2\2xE\3\2\2\2xI\3\2\2\2xM\3\2\2\2xQ\3\2\2\2xU\3\2\2\2"+
		"xY\3\2\2\2x]\3\2\2\2xa\3\2\2\2xe\3\2\2\2xh\3\2\2\2xk\3\2\2\2xo\3\2\2\2"+
		"xs\3\2\2\2xt\3\2\2\2y\t\3\2\2\2z{\b\6\1\2{\u0097\7.\2\2|\u0097\7-\2\2"+
		"}\u0097\7,\2\2~\u0097\7\16\2\2\177\u0097\7\17\2\2\u0080\u0097\7\20\2\2"+
		"\u0081\u0097\7\21\2\2\u0082\u0097\7\60\2\2\u0083\u0097\7\61\2\2\u0084"+
		"\u0085\7\'\2\2\u0085\u0086\5\6\4\2\u0086\u0087\7(\2\2\u0087\u0097\3\2"+
		"\2\2\u0088\u0089\7\60\2\2\u0089\u008a\7\'\2\2\u008a\u008b\5\f\7\2\u008b"+
		"\u008c\7(\2\2\u008c\u0097\3\2\2\2\u008d\u008e\7\60\2\2\u008e\u008f\7\'"+
		"\2\2\u008f\u0097\7(\2\2\u0090\u0091\7)\2\2\u0091\u0092\5\f\7\2\u0092\u0093"+
		"\7*\2\2\u0093\u0097\3\2\2\2\u0094\u0095\7)\2\2\u0095\u0097\7*\2\2\u0096"+
		"z\3\2\2\2\u0096|\3\2\2\2\u0096}\3\2\2\2\u0096~\3\2\2\2\u0096\177\3\2\2"+
		"\2\u0096\u0080\3\2\2\2\u0096\u0081\3\2\2\2\u0096\u0082\3\2\2\2\u0096\u0083"+
		"\3\2\2\2\u0096\u0084\3\2\2\2\u0096\u0088\3\2\2\2\u0096\u008d\3\2\2\2\u0096"+
		"\u0090\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u00ac\3\2\2\2\u0098\u0099\f\n"+
		"\2\2\u0099\u009a\7$\2\2\u009a\u00ab\5\n\6\13\u009b\u009c\f\t\2\2\u009c"+
		"\u009d\7!\2\2\u009d\u00ab\5\n\6\n\u009e\u009f\f\b\2\2\u009f\u00a0\7\""+
		"\2\2\u00a0\u00ab\5\n\6\t\u00a1\u00a2\f\7\2\2\u00a2\u00a3\7\37\2\2\u00a3"+
		"\u00ab\5\n\6\b\u00a4\u00a5\f\6\2\2\u00a5\u00a6\7 \2\2\u00a6\u00ab\5\n"+
		"\6\7\u00a7\u00a8\f\5\2\2\u00a8\u00a9\7#\2\2\u00a9\u00ab\5\n\6\6\u00aa"+
		"\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a1\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\b\7\1\2\u00b0\u00b3\5\n\6\2\u00b1\u00b3\5\16\b\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\f\4"+
		"\2\2\u00b5\u00b6\7+\2\2\u00b6\u00b8\5\f\7\5\u00b7\u00b4\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\r\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf"+
		"\7\f\2\2\u00bf\u00c0\5\n\6\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\5\6\4\2"+
		"\u00c2\u00cc\3\2\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6"+
		"\7\61\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5\n\6\2\u00c8\u00c9\7\27\2\2"+
		"\u00c9\u00ca\5\6\4\2\u00ca\u00cc\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00c3"+
		"\3\2\2\2\u00cc\17\3\2\2\2\f.<>x\u0096\u00aa\u00ac\u00b2\u00b9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}