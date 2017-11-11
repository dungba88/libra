// Generated from /home/griever/Documents/javawork/libra/src/main/java/org/joo/libra/sql/antlr/SqlParser.g4 by ANTLR 4.7

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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, IS_EQUALS=4, IS_EQUALS_NOT=5, CONTAINS=6, MATCHES=7, 
		TRUE=8, FALSE=9, UNDEFINED=10, NULL=11, EMPTY=12, GREATER_THAN=13, GREATER_THAN_EQUALS=14, 
		LESS_THAN=15, LESS_THAN_EQUALS=16, EQUALS=17, NOT_EQUALS=18, DBL_EQUALS=19, 
		PLUS=20, MINUS=21, TIMES=22, DIVIDE=23, LPAREN=24, RPAREN=25, INTEGER=26, 
		DOUBLE=27, STRING=28, WS=29, VARIABLE=30;
	public static final int
		RULE_predicate = 0, RULE_expression = 1, RULE_term = 2, RULE_factor = 3;
	public static final String[] ruleNames = {
		"predicate", "expression", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "CONTAINS", "MATCHES", 
		"TRUE", "FALSE", "UNDEFINED", "NULL", "EMPTY", "GREATER_THAN", "GREATER_THAN_EQUALS", 
		"LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", "DBL_EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE", "LPAREN", "RPAREN", "INTEGER", "DOUBLE", 
		"STRING", "WS", "VARIABLE"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterExpressionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitExpressionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitExpressionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_predicate);
		try {
			_localctx = new ExpressionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNotExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitTermExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitTermExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitOrExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitAndExpr(this);
		}
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(11);
				match(NOT);
				setState(12);
				((NotExprContext)_localctx).inner = expression(2);
				}
				break;
			case TRUE:
			case FALSE:
			case UNDEFINED:
			case NULL:
			case EMPTY:
			case LPAREN:
			case INTEGER:
			case DOUBLE:
			case STRING:
			case VARIABLE:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(24);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(22);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(16);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(17);
						match(AND);
						setState(18);
						((AndExprContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(19);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(20);
						match(OR);
						setState(21);
						((OrExprContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(26);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNotEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNotEqualExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterMatchesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitMatchesExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterContainsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitContainsExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitFactorExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitCompareExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitEqualExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				((CompareExprContext)_localctx).left = factor(0);
				setState(28);
				((CompareExprContext)_localctx).op = match(GREATER_THAN);
				setState(29);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 2:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((CompareExprContext)_localctx).left = factor(0);
				setState(32);
				((CompareExprContext)_localctx).op = match(GREATER_THAN_EQUALS);
				setState(33);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 3:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				((CompareExprContext)_localctx).left = factor(0);
				setState(36);
				((CompareExprContext)_localctx).op = match(LESS_THAN);
				setState(37);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 4:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				((CompareExprContext)_localctx).left = factor(0);
				setState(40);
				((CompareExprContext)_localctx).op = match(LESS_THAN_EQUALS);
				setState(41);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 5:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				((EqualExprContext)_localctx).left = factor(0);
				setState(44);
				((EqualExprContext)_localctx).op = match(EQUALS);
				setState(45);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 6:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				((EqualExprContext)_localctx).left = factor(0);
				setState(48);
				((EqualExprContext)_localctx).op = match(DBL_EQUALS);
				setState(49);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 7:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(52);
				((NotEqualExprContext)_localctx).op = match(NOT_EQUALS);
				setState(53);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 8:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(56);
				((NotEqualExprContext)_localctx).op = match(IS_EQUALS_NOT);
				setState(57);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 9:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				((EqualExprContext)_localctx).left = factor(0);
				setState(60);
				((EqualExprContext)_localctx).op = match(IS_EQUALS);
				setState(61);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 10:
				_localctx = new ContainsExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				((ContainsExprContext)_localctx).left = factor(0);
				setState(64);
				((ContainsExprContext)_localctx).op = match(CONTAINS);
				setState(65);
				((ContainsExprContext)_localctx).right = factor(0);
				}
				break;
			case 11:
				_localctx = new MatchesExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(67);
				((MatchesExprContext)_localctx).left = factor(0);
				setState(68);
				((MatchesExprContext)_localctx).op = match(MATCHES);
				setState(69);
				((MatchesExprContext)_localctx).right = factor(0);
				}
				break;
			case 12:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(71);
				factor(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitStringExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitVariableExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyExprContext extends FactorContext {
		public TerminalNode EMPTY() { return getToken(SqlParser.EMPTY, 0); }
		public EmptyExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterEmptyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitEmptyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitEmptyExpr(this);
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
		public TerminalNode TIMES() { return getToken(SqlParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SqlParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public MathExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends FactorContext {
		public TerminalNode DOUBLE() { return getToken(SqlParser.DOUBLE, 0); }
		public TerminalNode INTEGER() { return getToken(SqlParser.INTEGER, 0); }
		public NumberExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitNumberExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitBooleanExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlParserListener ) ((SqlParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitParenExpr(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(DOUBLE);
				}
				break;
			case INTEGER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(STRING);
				}
				break;
			case TRUE:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(FALSE);
				}
				break;
			case UNDEFINED:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(UNDEFINED);
				}
				break;
			case NULL:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(NULL);
				}
				break;
			case EMPTY:
				{
				_localctx = new EmptyExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(EMPTY);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(VARIABLE);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(LPAREN);
				setState(85);
				expression(0);
				setState(86);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(90);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91);
						((MathExprContext)_localctx).op = match(TIMES);
						setState(92);
						((MathExprContext)_localctx).right = factor(5);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						((MathExprContext)_localctx).op = match(DIVIDE);
						setState(95);
						((MathExprContext)_localctx).right = factor(4);
						}
						break;
					case 3:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97);
						((MathExprContext)_localctx).op = match(PLUS);
						setState(98);
						((MathExprContext)_localctx).right = factor(3);
						}
						break;
					case 4:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(99);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(100);
						((MathExprContext)_localctx).op = match(MINUS);
						setState(101);
						((MathExprContext)_localctx).right = factor(2);
						}
						break;
					}
					} 
				}
				setState(106);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return factor_sempred((FactorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 n\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\5\3\21\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5i\n\5\f\5"+
		"\16\5l\13\5\3\5\2\4\4\b\6\2\4\6\b\2\2\2\u0084\2\n\3\2\2\2\4\20\3\2\2\2"+
		"\6J\3\2\2\2\bZ\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\b\3\1\2\r\16\7\5"+
		"\2\2\16\21\5\4\3\4\17\21\5\6\4\2\20\f\3\2\2\2\20\17\3\2\2\2\21\32\3\2"+
		"\2\2\22\23\f\6\2\2\23\24\7\3\2\2\24\31\5\4\3\7\25\26\f\5\2\2\26\27\7\4"+
		"\2\2\27\31\5\4\3\6\30\22\3\2\2\2\30\25\3\2\2\2\31\34\3\2\2\2\32\30\3\2"+
		"\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\36\5\b\5\2\36\37\7\17"+
		"\2\2\37 \5\b\5\2 K\3\2\2\2!\"\5\b\5\2\"#\7\20\2\2#$\5\b\5\2$K\3\2\2\2"+
		"%&\5\b\5\2&\'\7\21\2\2\'(\5\b\5\2(K\3\2\2\2)*\5\b\5\2*+\7\22\2\2+,\5\b"+
		"\5\2,K\3\2\2\2-.\5\b\5\2./\7\23\2\2/\60\5\b\5\2\60K\3\2\2\2\61\62\5\b"+
		"\5\2\62\63\7\25\2\2\63\64\5\b\5\2\64K\3\2\2\2\65\66\5\b\5\2\66\67\7\24"+
		"\2\2\678\5\b\5\28K\3\2\2\29:\5\b\5\2:;\7\7\2\2;<\5\b\5\2<K\3\2\2\2=>\5"+
		"\b\5\2>?\7\6\2\2?@\5\b\5\2@K\3\2\2\2AB\5\b\5\2BC\7\b\2\2CD\5\b\5\2DK\3"+
		"\2\2\2EF\5\b\5\2FG\7\t\2\2GH\5\b\5\2HK\3\2\2\2IK\5\b\5\2J\35\3\2\2\2J"+
		"!\3\2\2\2J%\3\2\2\2J)\3\2\2\2J-\3\2\2\2J\61\3\2\2\2J\65\3\2\2\2J9\3\2"+
		"\2\2J=\3\2\2\2JA\3\2\2\2JE\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\b\5\1\2M[\7"+
		"\35\2\2N[\7\34\2\2O[\7\36\2\2P[\7\n\2\2Q[\7\13\2\2R[\7\f\2\2S[\7\r\2\2"+
		"T[\7\16\2\2U[\7 \2\2VW\7\32\2\2WX\5\4\3\2XY\7\33\2\2Y[\3\2\2\2ZL\3\2\2"+
		"\2ZN\3\2\2\2ZO\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2"+
		"\2ZU\3\2\2\2ZV\3\2\2\2[j\3\2\2\2\\]\f\6\2\2]^\7\30\2\2^i\5\b\5\7_`\f\5"+
		"\2\2`a\7\31\2\2ai\5\b\5\6bc\f\4\2\2cd\7\26\2\2di\5\b\5\5ef\f\3\2\2fg\7"+
		"\27\2\2gi\5\b\5\4h\\\3\2\2\2h_\3\2\2\2hb\3\2\2\2he\3\2\2\2il\3\2\2\2j"+
		"h\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2\t\20\30\32JZhj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}