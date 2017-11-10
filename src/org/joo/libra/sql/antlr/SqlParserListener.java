// Generated from /home/griever/Documents/javawork/libra/src/org/joo/libra/sql/antlr/SqlParser.g4 by ANTLR 4.7

package org.joo.libra.sql.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code expressionExpr}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpr(SqlParser.ExpressionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpr}
	 * labeled alternative in {@link SqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpr(SqlParser.ExpressionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SqlParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SqlParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(SqlParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(SqlParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SqlParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SqlParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SqlParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SqlParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(SqlParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(SqlParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(SqlParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(SqlParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(SqlParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(SqlParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containsExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterContainsExpr(SqlParser.ContainsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containsExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitContainsExpr(SqlParser.ContainsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchesExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMatchesExpr(SqlParser.MatchesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchesExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMatchesExpr(SqlParser.MatchesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(SqlParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorExpr}
	 * labeled alternative in {@link SqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(SqlParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(SqlParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(SqlParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(SqlParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(SqlParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(SqlParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(SqlParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterEmptyExpr(SqlParser.EmptyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitEmptyExpr(SqlParser.EmptyExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(SqlParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(SqlParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(SqlParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(SqlParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(SqlParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(SqlParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SqlParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SqlParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SqlParser.ParenExprContext ctx);
}