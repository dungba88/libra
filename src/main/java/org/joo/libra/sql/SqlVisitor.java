package org.joo.libra.sql;

import java.text.NumberFormat;
import java.text.ParseException;

import org.joo.libra.common.HasList;
import org.joo.libra.common.HasValue;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.antlr.SqlParserBaseVisitor;
import org.joo.libra.sql.node.AndExpressionNode;
import org.joo.libra.sql.node.BooleanExpressionNode;
import org.joo.libra.sql.node.ConditionalExpressionNode;
import org.joo.libra.sql.node.ContainsCompareExpressionNode;
import org.joo.libra.sql.node.EmptyExpressionNode;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.sql.node.FilterMatchingExpressionNode;
import org.joo.libra.sql.node.FunctionExpressionNode;
import org.joo.libra.sql.node.GenericCompareExpressionNode;
import org.joo.libra.sql.node.InCompareExpressionNode;
import org.joo.libra.sql.node.LexicalCompareExpressionNode;
import org.joo.libra.sql.node.ListExpressionNode;
import org.joo.libra.sql.node.ListItemExpressionNode;
import org.joo.libra.sql.node.MatchingExpressionNode;
import org.joo.libra.sql.node.MathExpressionNode;
import org.joo.libra.sql.node.NotExpressionNode;
import org.joo.libra.sql.node.NumberExpressionNode;
import org.joo.libra.sql.node.NumericCompareExpressionNode;
import org.joo.libra.sql.node.ObjectExpressionNode;
import org.joo.libra.sql.node.OrExpressionNode;
import org.joo.libra.sql.node.StringConcatExpressionNode;
import org.joo.libra.sql.node.StringExpressionNode;
import org.joo.libra.sql.node.TempVariableExpressionNode;
import org.joo.libra.sql.node.VariableExpressionNode;
import org.joo.libra.support.exceptions.MalformedSyntaxException;

public class SqlVisitor extends SqlParserBaseVisitor<ExpressionNode> {

    @SuppressWarnings("unchecked")
    @Override
    public ExpressionNode visitListMatchingExpr(final SqlParser.ListMatchingExprContext ctx) {
        MatchingExpressionNode node = new MatchingExpressionNode();
        node.setOp(ctx.op.getType());
        node.setCondition(visit(ctx.condition));
        node.setIndexName(ctx.indexName.getText());
        node.setList((HasValue<Object>) visit(ctx.listName));
        return node;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ExpressionNode visitFilterMatchingExpr(final SqlParser.FilterMatchingExprContext ctx) {
        FilterMatchingExpressionNode node = new FilterMatchingExpressionNode();
        node.setCondition(visit(ctx.condition));
        node.setIndexName(ctx.indexName.getText());
        node.setList((HasValue<Object>) visit(ctx.listName));
        if (ctx.transform != null)
            node.setTransform((HasValue<?>) visit(ctx.transform));
        return node;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ExpressionNode visitConditionalExpr(final SqlParser.ConditionalExprContext ctx) {
        ConditionalExpressionNode node = new ConditionalExpressionNode();
        node.setMain(visit(ctx.main));
        node.setLeft((HasValue<Object>) visit(ctx.left));
        node.setRight((HasValue<Object>) visit(ctx.right));
        return node;
    }

    @Override
    public ExpressionNode visitFunctionExpr(final SqlParser.FunctionExprContext ctx) {
        FunctionExpressionNode node = new FunctionExpressionNode();
        if (ctx.inner != null)
            node.setInner((HasList) visit(ctx.inner));
        node.setName(ctx.name.getText());
        return node;
    }

    @Override
    public ExpressionNode visitWrapListExpr(final SqlParser.WrapListExprContext ctx) {
        ListExpressionNode node = new ListExpressionNode();
        if (ctx.item != null)
            node.setListItem((ListItemExpressionNode) visit(ctx.item));
        return node;
    }

    @Override
    public ExpressionNode visitListFactorExpr(final SqlParser.ListFactorExprContext ctx) {
        ListItemExpressionNode node = new ListItemExpressionNode();
        ExpressionNode innerNode = visitChildren(ctx);
        if (!(innerNode instanceof HasValue))
            throw new MalformedSyntaxException("Inner node must be value type: " + ctx.getChild(0).getText());
        node.getInnerNode().add(innerNode);
        return node;
    }

    @Override
    public ExpressionNode visitListCommaExpr(final SqlParser.ListCommaExprContext ctx) {
        ListItemExpressionNode node = new ListItemExpressionNode();
        ListItemExpressionNode left = (ListItemExpressionNode) visit(ctx.left);
        ListItemExpressionNode right = (ListItemExpressionNode) visit(ctx.right);
        node.getInnerNode().addAll(left.getInnerNode());
        node.getInnerNode().addAll(right.getInnerNode());
        return node;
    }

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
            throw new MalformedSyntaxException("Malformed syntax at compare node (" + ctx.op.getText()
                    + "), number node expected. (" + node.getLeft().getClass().getName() + ","
                    + node.getRight().getClass().getName() + ") given");
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
    public ExpressionNode visitInExpr(SqlParser.InExprContext ctx) {
        InCompareExpressionNode node = new InCompareExpressionNode();
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
    public ExpressionNode visitTempVarExpr(final SqlParser.TempVarExprContext ctx) {
        TempVariableExpressionNode node = new TempVariableExpressionNode();
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
            if (ctx.op.getType() == SqlLexer.PLUS && (isStringNode(node.getLeft()) || isStringNode(node.getRight()))) {
                StringConcatExpressionNode concatNode = new StringConcatExpressionNode();
                concatNode.setLeft((HasValue<String>) visit(ctx.left));
                concatNode.setRight((HasValue<String>) visit(ctx.right));
                return concatNode;
            }

            throw new MalformedSyntaxException(
                    "Malformed syntax at math node (" + ctx.op.getText() + "), number node expected");
        }

        return node;
    }

    private boolean isStringNode(final Object node) {
        return node instanceof StringExpressionNode || node instanceof VariableExpressionNode
                || node instanceof TempVariableExpressionNode;
    }

    private boolean isNumberNode(final Object node) {
        return node instanceof NumberExpressionNode || node instanceof MathExpressionNode
                || node instanceof FunctionExpressionNode || node instanceof VariableExpressionNode
                || node instanceof TempVariableExpressionNode;
    }
}
