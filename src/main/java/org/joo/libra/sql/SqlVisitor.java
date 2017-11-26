package org.joo.libra.sql;

import java.text.NumberFormat;
import java.text.ParseException;

import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.antlr.SqlParserBaseVisitor;
import org.joo.libra.sql.node.AndExpressionNode;
import org.joo.libra.sql.node.BooleanExpressionNode;
import org.joo.libra.sql.node.ContainsCompareExpressionNode;
import org.joo.libra.sql.node.EmptyExpressionNode;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.sql.node.GenericCompareExpressionNode;
import org.joo.libra.sql.node.LexicalCompareExpressionNode;
import org.joo.libra.sql.node.MathExpressionNode;
import org.joo.libra.sql.node.NotExpressionNode;
import org.joo.libra.sql.node.NumberExpressionNode;
import org.joo.libra.sql.node.NumericCompareExpressionNode;
import org.joo.libra.sql.node.ObjectExpressionNode;
import org.joo.libra.sql.node.OrExpressionNode;
import org.joo.libra.sql.node.StringExpressionNode;
import org.joo.libra.sql.node.VariableExpressionNode;
import org.joo.libra.support.MalformedSyntaxException;

public class SqlVisitor extends SqlParserBaseVisitor<ExpressionNode> {

    @Override
    public ExpressionNode visitParenExpr(final SqlParser.ParenExprContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public ExpressionNode visitNotExpr(final SqlParser.NotExprContext ctx) {
        NotExpressionNode node = new NotExpressionNode();
        node.setInnerNode(visitChildren(ctx));
        return node;
    }

    @Override
    public ExpressionNode visitOrExpr(final SqlParser.OrExprContext ctx) {
        OrExpressionNode node = new OrExpressionNode();
        node.setLeft(visit(ctx.left));
        node.setRight(visit(ctx.right));
        return node;
    }

    @Override
    public ExpressionNode visitAndExpr(final SqlParser.AndExprContext ctx) {
        AndExpressionNode node = new AndExpressionNode();
        node.setLeft(visit(ctx.left));
        node.setRight(visit(ctx.right));
        return node;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ExpressionNode visitCompareExpr(final SqlParser.CompareExprContext ctx) {
        NumericCompareExpressionNode node = new NumericCompareExpressionNode();
        node.setLeft((HasValue<Number>) visit(ctx.left));
        node.setRight((HasValue<Number>) visit(ctx.right));
        node.setOp(ctx.op.getType());

        if (!isNumberNode(node.getLeft()) || !isNumberNode(node.getRight())) {
            throw new MalformedSyntaxException(
                    "Malformed syntax at compare node (" + ctx.op.getText() + "), number node expected");
        }

        return node;
    }

    @Override
    public ExpressionNode visitEqualExpr(final SqlParser.EqualExprContext ctx) {
        GenericCompareExpressionNode node = new GenericCompareExpressionNode();
        node.setLeft((HasValue<?>) visit(ctx.left));
        node.setRight((HasValue<?>) visit(ctx.right));
        node.setOp(ctx.op.getType());
        return node;
    }

    @Override
    public ExpressionNode visitNotEqualExpr(final SqlParser.NotEqualExprContext ctx) {
        GenericCompareExpressionNode node = new GenericCompareExpressionNode();
        node.setLeft((HasValue<?>) visit(ctx.left));
        node.setRight((HasValue<?>) visit(ctx.right));
        node.setOp(ctx.op.getType());
        return node;
    }

    @Override
    public ExpressionNode visitContainsExpr(final SqlParser.ContainsExprContext ctx) {
        ContainsCompareExpressionNode node = new ContainsCompareExpressionNode();
        node.setLeft((HasValue<?>) visit(ctx.left));
        node.setRight((HasValue<?>) visit(ctx.right));
        node.setOp(ctx.op.getType());
        return node;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ExpressionNode visitMatchesExpr(final SqlParser.MatchesExprContext ctx) {
        LexicalCompareExpressionNode node = new LexicalCompareExpressionNode();
        node.setLeft((HasValue<String>) visit(ctx.left));
        node.setRight((HasValue<String>) visit(ctx.right));
        node.setOp(ctx.op.getType());

        if (!isStringNode(node.getLeft()) || !isStringNode(node.getRight()))
            throw new MalformedSyntaxException("Malformed syntax at visit node, string node expected");

        return node;
    }

    @Override
    public ExpressionNode visitStringExpr(final SqlParser.StringExprContext ctx) {
        StringExpressionNode node = new StringExpressionNode();
        String value = ctx.getText();
        node.setValue(value.substring(1, value.length() - 1));
        return node;
    }

    @Override
    public ExpressionNode visitVariableExpr(final SqlParser.VariableExprContext ctx) {
        VariableExpressionNode node = new VariableExpressionNode();
        node.setVariableName(ctx.getText());
        return node;
    }

    @Override
    public ExpressionNode visitNullExpr(final SqlParser.NullExprContext ctx) {
        ObjectExpressionNode node = new ObjectExpressionNode();
        node.setValue(null);
        return node;
    }

    @Override
    public ExpressionNode visitEmptyExpr(final SqlParser.EmptyExprContext ctx) {
        EmptyExpressionNode node = new EmptyExpressionNode();
        node.setInnerNode(visit(ctx.left));
        node.setOp(ctx.op.getType());
        return node;
    }

    @Override
    public ExpressionNode visitNumberExpr(final SqlParser.NumberExprContext ctx) {
        NumberExpressionNode node = new NumberExpressionNode();
        try {
            Number num = NumberFormat.getInstance().parse(ctx.getText());
            node.setValue(num);
        } catch (ParseException e) {
        }
        return node;
    }

    @Override
    public ExpressionNode visitBooleanExpr(final SqlParser.BooleanExprContext ctx) {
        BooleanExpressionNode node = new BooleanExpressionNode();
        boolean value = Boolean.valueOf(ctx.getText().toLowerCase());
        node.setValue(value);
        return node;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ExpressionNode visitMathExpr(final SqlParser.MathExprContext ctx) {
        MathExpressionNode node = new MathExpressionNode();
        node.setLeft((HasValue<Number>) visit(ctx.left));
        node.setRight((HasValue<Number>) visit(ctx.right));
        node.setOp(ctx.op.getType());

        if (!isNumberNode(node.getLeft()) || !isNumberNode(node.getRight())) {
            throw new MalformedSyntaxException(
                    "Malformed syntax at math node (" + ctx.op.getText() + "), number node expected");
        }

        return node;
    }

    private boolean isStringNode(final Object node) {
        return node instanceof StringExpressionNode || node instanceof VariableExpressionNode;
    }

    private boolean isNumberNode(final Object node) {
        return node instanceof NumberExpressionNode || node instanceof MathExpressionNode
                || node instanceof VariableExpressionNode;
    }
}
