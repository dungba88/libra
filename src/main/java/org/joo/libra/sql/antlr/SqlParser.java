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
		AND=1, OR=2, NOT=3, IS_EQUALS=4, IS_EQUALS_NOT=5, IS_EMPTY=6, IS_NOT_EMPTY=7, 
		CONTAINS=8, IN=9, MATCHES=10, TRUE=11, FALSE=12, UNDEFINED=13, NULL=14, 
		GREATER_THAN=15, GREATER_THAN_EQUALS=16, LESS_THAN=17, LESS_THAN_EQUALS=18, 
		EQUALS=19, NOT_EQUALS=20, DBL_EQUALS=21, PLUS=22, MINUS=23, TIMES=24, 
		DIVIDE=25, MOD=26, POW=27, SQRT=28, QUESTION=29, COLON=30, LPAREN=31, 
		RPAREN=32, LBRACK=33, RBRACK=34, COMMA=35, STRING=36, INTEGER=37, DOUBLE=38, 
		INDEX=39, VARIABLE=40, WS=41;
	public static final int
		RULE_predicate = 0, RULE_expression = 1, RULE_term = 2, RULE_factor = 3, 
		RULE_list = 4;
	public static final String[] ruleNames = {
		"predicate", "expression", "term", "factor", "list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'>'", "'>='", "'<'", "'<='", "'='", "'!='", "'=='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", null, "'?'", "':'", "'('", "')'", 
		"'['", "']'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "NOT", "IS_EQUALS", "IS_EQUALS_NOT", "IS_EMPTY", "IS_NOT_EMPTY", 
		"CONTAINS", "IN", "MATCHES", "TRUE", "FALSE", "UNDEFINED", "NULL", "GREATER_THAN", 
		"GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", "EQUALS", "NOT_EQUALS", 
		"DBL_EQUALS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "SQRT", 
		"QUESTION", "COLON", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", 
		"STRING", "INTEGER", "DOUBLE", "INDEX", "VARIABLE", "WS"
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
			setState(10);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(13);
				match(NOT);
				setState(14);
				((NotExprContext)_localctx).inner = expression(5);
				}
				break;
			case TRUE:
			case FALSE:
			case UNDEFINED:
			case NULL:
			case SQRT:
			case LPAREN:
			case LBRACK:
			case STRING:
			case INTEGER:
			case DOUBLE:
			case VARIABLE:
				{
				_localctx = new TermExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(18);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(19);
						match(AND);
						setState(20);
						((AndExprContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(21);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(22);
						match(OR);
						setState(23);
						((OrExprContext)_localctx).right = expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExprContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).main = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(24);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(25);
						match(QUESTION);
						setState(26);
						((ConditionalExprContext)_localctx).left = factor(0);
						setState(27);
						match(COLON);
						setState(28);
						((ConditionalExprContext)_localctx).right = factor(0);
						}
						break;
					}
					} 
				}
				setState(34);
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
		enterRule(_localctx, 4, RULE_term);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((CompareExprContext)_localctx).left = factor(0);
				setState(36);
				((CompareExprContext)_localctx).op = match(GREATER_THAN);
				setState(37);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 2:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((CompareExprContext)_localctx).left = factor(0);
				setState(40);
				((CompareExprContext)_localctx).op = match(GREATER_THAN_EQUALS);
				setState(41);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 3:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((CompareExprContext)_localctx).left = factor(0);
				setState(44);
				((CompareExprContext)_localctx).op = match(LESS_THAN);
				setState(45);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 4:
				_localctx = new CompareExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				((CompareExprContext)_localctx).left = factor(0);
				setState(48);
				((CompareExprContext)_localctx).op = match(LESS_THAN_EQUALS);
				setState(49);
				((CompareExprContext)_localctx).right = factor(0);
				}
				break;
			case 5:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				((EqualExprContext)_localctx).left = factor(0);
				setState(52);
				((EqualExprContext)_localctx).op = match(EQUALS);
				setState(53);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 6:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				((EqualExprContext)_localctx).left = factor(0);
				setState(56);
				((EqualExprContext)_localctx).op = match(DBL_EQUALS);
				setState(57);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 7:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(60);
				((NotEqualExprContext)_localctx).op = match(NOT_EQUALS);
				setState(61);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 8:
				_localctx = new NotEqualExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				((NotEqualExprContext)_localctx).left = factor(0);
				setState(64);
				((NotEqualExprContext)_localctx).op = match(IS_EQUALS_NOT);
				setState(65);
				((NotEqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 9:
				_localctx = new EqualExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				((EqualExprContext)_localctx).left = factor(0);
				setState(68);
				((EqualExprContext)_localctx).op = match(IS_EQUALS);
				setState(69);
				((EqualExprContext)_localctx).right = factor(0);
				}
				break;
			case 10:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(72);
				((EmptyExprContext)_localctx).op = match(IS_EMPTY);
				}
				break;
			case 11:
				_localctx = new EmptyExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(74);
				((EmptyExprContext)_localctx).left = factor(0);
				setState(75);
				((EmptyExprContext)_localctx).op = match(IS_NOT_EMPTY);
				}
				break;
			case 12:
				_localctx = new ContainsExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				((ContainsExprContext)_localctx).left = factor(0);
				setState(78);
				((ContainsExprContext)_localctx).op = match(CONTAINS);
				setState(79);
				((ContainsExprContext)_localctx).right = factor(0);
				}
				break;
			case 13:
				_localctx = new MatchesExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(81);
				((MatchesExprContext)_localctx).left = factor(0);
				setState(82);
				((MatchesExprContext)_localctx).op = match(MATCHES);
				setState(83);
				((MatchesExprContext)_localctx).right = factor(0);
				}
				break;
			case 14:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(85);
				factor(0);
				}
				break;
			case 15:
				_localctx = new InExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(86);
				((InExprContext)_localctx).left = factor(0);
				setState(87);
				((InExprContext)_localctx).op = match(IN);
				setState(88);
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
	public static class MathUnaryExprContext extends FactorContext {
		public Token op;
		public FactorContext inner;
		public TerminalNode SQRT() { return getToken(SqlParser.SQRT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MathUnaryExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlParserVisitor ) return ((SqlParserVisitor<? extends T>)visitor).visitMathUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrapListExprContext extends FactorContext {
		public ListContext item;
		public TerminalNode LBRACK() { return getToken(SqlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SqlParser.RBRACK, 0); }
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93);
				match(DOUBLE);
				}
				break;
			case INTEGER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(STRING);
				}
				break;
			case TRUE:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(FALSE);
				}
				break;
			case UNDEFINED:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(UNDEFINED);
				}
				break;
			case NULL:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(NULL);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(VARIABLE);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(LPAREN);
				setState(102);
				expression(0);
				setState(103);
				match(RPAREN);
				}
				break;
			case SQRT:
				{
				_localctx = new MathUnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((MathUnaryExprContext)_localctx).op = match(SQRT);
				setState(106);
				((MathUnaryExprContext)_localctx).inner = factor(8);
				}
				break;
			case LBRACK:
				{
				_localctx = new WrapListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(LBRACK);
				setState(108);
				((WrapListExprContext)_localctx).item = list(0);
				setState(109);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(113);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(114);
						((MathExprContext)_localctx).op = match(POW);
						setState(115);
						((MathExprContext)_localctx).right = factor(8);
						}
						break;
					case 2:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						((MathExprContext)_localctx).op = match(TIMES);
						setState(118);
						((MathExprContext)_localctx).right = factor(7);
						}
						break;
					case 3:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
						((MathExprContext)_localctx).op = match(DIVIDE);
						setState(121);
						((MathExprContext)_localctx).right = factor(6);
						}
						break;
					case 4:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						((MathExprContext)_localctx).op = match(PLUS);
						setState(124);
						((MathExprContext)_localctx).right = factor(5);
						}
						break;
					case 5:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						((MathExprContext)_localctx).op = match(MINUS);
						setState(127);
						((MathExprContext)_localctx).right = factor(4);
						}
						break;
					case 6:
						{
						_localctx = new MathExprContext(new FactorContext(_parentctx, _parentState));
						((MathExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_factor);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						((MathExprContext)_localctx).op = match(MOD);
						setState(130);
						((MathExprContext)_localctx).right = factor(3);
						}
						break;
					}
					} 
				}
				setState(135);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ListFactorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(137);
			factor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
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
					setState(139);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(140);
					match(COMMA);
					setState(141);
					((ListCommaExprContext)_localctx).right = list(2);
					}
					} 
				}
				setState(146);
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return factor_sempred((FactorContext)_localctx, predIndex);
		case 4:
			return list_sempred((ListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean factor_sempred(FactorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0096\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\5\3\23\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\2\5\4\b"+
		"\n\7\2\4\6\b\n\2\2\2\u00b3\2\f\3\2\2\2\4\22\3\2\2\2\6\\\3\2\2\2\bq\3\2"+
		"\2\2\n\u008a\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\b\3\1\2\17\20\7\5\2"+
		"\2\20\23\5\4\3\7\21\23\5\6\4\2\22\16\3\2\2\2\22\21\3\2\2\2\23\"\3\2\2"+
		"\2\24\25\f\6\2\2\25\26\7\3\2\2\26!\5\4\3\7\27\30\f\5\2\2\30\31\7\4\2\2"+
		"\31!\5\4\3\6\32\33\f\3\2\2\33\34\7\37\2\2\34\35\5\b\5\2\35\36\7 \2\2\36"+
		"\37\5\b\5\2\37!\3\2\2\2 \24\3\2\2\2 \27\3\2\2\2 \32\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%&\5\b\5\2&\'\7\21\2\2\'("+
		"\5\b\5\2(]\3\2\2\2)*\5\b\5\2*+\7\22\2\2+,\5\b\5\2,]\3\2\2\2-.\5\b\5\2"+
		"./\7\23\2\2/\60\5\b\5\2\60]\3\2\2\2\61\62\5\b\5\2\62\63\7\24\2\2\63\64"+
		"\5\b\5\2\64]\3\2\2\2\65\66\5\b\5\2\66\67\7\25\2\2\678\5\b\5\28]\3\2\2"+
		"\29:\5\b\5\2:;\7\27\2\2;<\5\b\5\2<]\3\2\2\2=>\5\b\5\2>?\7\26\2\2?@\5\b"+
		"\5\2@]\3\2\2\2AB\5\b\5\2BC\7\7\2\2CD\5\b\5\2D]\3\2\2\2EF\5\b\5\2FG\7\6"+
		"\2\2GH\5\b\5\2H]\3\2\2\2IJ\5\b\5\2JK\7\b\2\2K]\3\2\2\2LM\5\b\5\2MN\7\t"+
		"\2\2N]\3\2\2\2OP\5\b\5\2PQ\7\n\2\2QR\5\b\5\2R]\3\2\2\2ST\5\b\5\2TU\7\f"+
		"\2\2UV\5\b\5\2V]\3\2\2\2W]\5\b\5\2XY\5\b\5\2YZ\7\13\2\2Z[\5\b\5\2[]\3"+
		"\2\2\2\\%\3\2\2\2\\)\3\2\2\2\\-\3\2\2\2\\\61\3\2\2\2\\\65\3\2\2\2\\9\3"+
		"\2\2\2\\=\3\2\2\2\\A\3\2\2\2\\E\3\2\2\2\\I\3\2\2\2\\L\3\2\2\2\\O\3\2\2"+
		"\2\\S\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2]\7\3\2\2\2^_\b\5\1\2_r\7(\2\2`r\7"+
		"\'\2\2ar\7&\2\2br\7\r\2\2cr\7\16\2\2dr\7\17\2\2er\7\20\2\2fr\7*\2\2gh"+
		"\7!\2\2hi\5\4\3\2ij\7\"\2\2jr\3\2\2\2kl\7\36\2\2lr\5\b\5\nmn\7#\2\2no"+
		"\5\n\6\2op\7$\2\2pr\3\2\2\2q^\3\2\2\2q`\3\2\2\2qa\3\2\2\2qb\3\2\2\2qc"+
		"\3\2\2\2qd\3\2\2\2qe\3\2\2\2qf\3\2\2\2qg\3\2\2\2qk\3\2\2\2qm\3\2\2\2r"+
		"\u0087\3\2\2\2st\f\t\2\2tu\7\35\2\2u\u0086\5\b\5\nvw\f\b\2\2wx\7\32\2"+
		"\2x\u0086\5\b\5\tyz\f\7\2\2z{\7\33\2\2{\u0086\5\b\5\b|}\f\6\2\2}~\7\30"+
		"\2\2~\u0086\5\b\5\7\177\u0080\f\5\2\2\u0080\u0081\7\31\2\2\u0081\u0086"+
		"\5\b\5\6\u0082\u0083\f\4\2\2\u0083\u0084\7\34\2\2\u0084\u0086\5\b\5\5"+
		"\u0085s\3\2\2\2\u0085v\3\2\2\2\u0085y\3\2\2\2\u0085|\3\2\2\2\u0085\177"+
		"\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\t\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\b\6\1\2"+
		"\u008b\u008c\5\b\5\2\u008c\u0092\3\2\2\2\u008d\u008e\f\3\2\2\u008e\u008f"+
		"\7%\2\2\u008f\u0091\5\n\6\4\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\13\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\n\22 \"\\q\u0085\u0087\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}