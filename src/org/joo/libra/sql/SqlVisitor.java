package org.joo.libra.sql;

import java.text.NumberFormat;
import java.text.ParseException;

import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.antlr.SqlParserBaseVisitor;

public class SqlVisitor extends SqlParserBaseVisitor<ExpressionNode> {

	@Override
	public ExpressionNode visitNotExpr(SqlParser.NotExprContext ctx) {
		NotExpressionNode node = new NotExpressionNode();
		node.setInnerNode(visitChildren(ctx));
		return node;
	}

	@Override
	public ExpressionNode visitOrExpr(SqlParser.OrExprContext ctx) {
		OrExpressionNode node = new OrExpressionNode();
		node.setLeft(visit(ctx.left));
		node.setRight(visit(ctx.right));
		return node;
	}

	@Override
	public ExpressionNode visitAndExpr(SqlParser.AndExprContext ctx) {
		AndExpressionNode node = new AndExpressionNode();
		node.setLeft(visit(ctx.left));
		node.setRight(visit(ctx.right));
		return node;
	}

	@Override
	public ExpressionNode visitCompareExpr(SqlParser.CompareExprContext ctx) {
		NumericCompareExpressionNode node = new NumericCompareExpressionNode();
		node.setLeft((HasValue<Number>) visit(ctx.left));
		node.setRight((HasValue<Number>) visit(ctx.right));
		node.setOp(ctx.op.getType());
		return node;
	}

	public ExpressionNode visitEqualExpr(SqlParser.EqualExprContext ctx) {
		GenericCompareExpressionNode node = new GenericCompareExpressionNode();
		node.setLeft((HasValue<?>) visit(ctx.left));
		node.setRight((HasValue<?>) visit(ctx.right));
		node.setOp(ctx.op.getType());
		return node;
	}

	@Override
	public ExpressionNode visitNotEqualExpr(SqlParser.NotEqualExprContext ctx) {
		GenericCompareExpressionNode node = new GenericCompareExpressionNode();
		node.setLeft((HasValue<?>) visit(ctx.left));
		node.setRight((HasValue<?>) visit(ctx.right));
		node.setOp(ctx.op.getType());
		return node;
	}

	@Override
	public ExpressionNode visitContainsExpr(SqlParser.ContainsExprContext ctx) {
		LexicalCompareExpressionNode node = new LexicalCompareExpressionNode();
		node.setLeft((HasValue<String>) visit(ctx.left));
		node.setRight((HasValue<String>) visit(ctx.right));
		node.setOp(ctx.op.getType());
		return node;
	}

	@Override
	public ExpressionNode visitMatchesExpr(SqlParser.MatchesExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public ExpressionNode visitStringExpr(SqlParser.StringExprContext ctx) {
		StringExpressionNode node = new StringExpressionNode();
		String value = ctx.getText();
		node.setValue(value.substring(1, value.length() - 1));
		return node;
	}

	@Override
	public ExpressionNode visitVariableExpr(SqlParser.VariableExprContext ctx) {
		VariableExpressionNode node = new VariableExpressionNode();
		node.setVariableName(ctx.getText());
		return node;
	}

	@Override
	public ExpressionNode visitNullExpr(SqlParser.NullExprContext ctx) {
		ObjectExpressionNode node = new ObjectExpressionNode();
		node.setValue(null);
		return node;
	}

	@Override
	public ExpressionNode visitEmptyExpr(SqlParser.EmptyExprContext ctx) {
		return new EmptyExpressionNode();
	}

	@Override
	public ExpressionNode visitNumberExpr(SqlParser.NumberExprContext ctx) {
		NumberExpressionNode node = new NumberExpressionNode();
		try {
			Number num = NumberFormat.getInstance().parse(ctx.getText());
			node.setValue(num);
		} catch (ParseException e) {}
		return node;
	}

	@Override
	public ExpressionNode visitBooleanExpr(SqlParser.BooleanExprContext ctx) {
		BooleanExpressionNode node = new BooleanExpressionNode();
		boolean value = Boolean.getBoolean(ctx.getText().toLowerCase());
		node.setValue(value);
		return node;
	}

	@Override
	public ExpressionNode visitMathExpr(SqlParser.MathExprContext ctx) {
		MathExpressionNode node = new MathExpressionNode();
		node.setLeft((HasValue<Number>) visit(ctx.left));
		node.setRight((HasValue<Number>) visit(ctx.right));
		node.setOp(ctx.op.getType());
		return node;
	}
}