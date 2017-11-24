package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.sql.node.BooleanExpressionNode;
import org.joo.libra.sql.node.EmptyExpressionNode;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.sql.node.GenericCompareExpressionNode;
import org.joo.libra.sql.node.NumberExpressionNode;
import org.joo.libra.sql.optimizers.OptimizedAntlrSqlPredicateParser;
import org.joo.libra.support.PredicateExecutionException;
import org.joo.libra.test.support.MockDataUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSqlOptimized {

    private String value;

    private Boolean expected;

    private PredicateContext context;

    private Function<ExpressionNode, Boolean> condition;

    public TestSqlOptimized(String value, Boolean expected, Object context,
            Function<ExpressionNode, Boolean> condition) {
        this.value = value;
        this.expected = expected;
        this.context = new PredicateContext(context);
        this.condition = condition;
    }

    @Test
    public void testOptimized() throws PredicateExecutionException {
        SqlPredicate predicate = new SqlPredicate(value, new OptimizedAntlrSqlPredicateParser());
        if (predicate.hasError()) {
            Assert.assertEquals(value + ":", expected, null);
        } else {
            Assert.assertEquals(value + ":", expected, predicate.satisfiedBy(context));
            OptimizedAntlrSqlPredicateParser parser = (OptimizedAntlrSqlPredicateParser) predicate.getParser();
            Assert.assertTrue(condition.apply(parser.getOptimizedNode()));
        }
    }

    @Parameters
    public static List<Object[]> data() {
        List<Object[]> list = new ArrayList<Object[]>();

        Object mapContext = MockDataUtils.mockMap();

        list.add(new Object[] { "name is not empty and 1 > 2 and 1 matches 2", null, mapContext, null });
        list.add(new Object[] { "name is not empty or 1 > 2", true, mapContext, toCondition(node -> {
            return node instanceof EmptyExpressionNode;
        }) });
        list.add(new Object[] { "1 > 2 or 2 < 1", false, mapContext, toCondition(node -> {
            return node instanceof BooleanExpressionNode;
        }) });
        list.add(new Object[] { "1 > 2 or name is not empty", true, mapContext, toCondition(node -> {
            return node instanceof EmptyExpressionNode;
        }) });
        list.add(new Object[] { "name is not empty and 1 > 2", false, mapContext, toCondition(node -> {
            return node instanceof BooleanExpressionNode;
        }) });
        list.add(new Object[] { "name is not empty and 1 < 2", true, mapContext, toCondition(node -> {
            return node instanceof EmptyExpressionNode;
        }) });
        list.add(new Object[] { "1 < 2 and name is not empty", true, mapContext, toCondition(node -> {
            return node instanceof EmptyExpressionNode;
        }) });
        list.add(new Object[] { "name is not empty and 1 + 1 > 2", false, mapContext, toCondition(node -> {
            return node instanceof BooleanExpressionNode;
        }) });
        list.add(new Object[] { "1 + 1 > 2 and name is not empty", false, mapContext, toCondition(node -> {
            return node instanceof BooleanExpressionNode;
        }) });
        list.add(new Object[] { "not (1 == 1)", false, mapContext, toCondition(node -> {
            return node instanceof BooleanExpressionNode;
        }) });
        list.add(new Object[] { "name is not empty or 1 + 1 == 2", true, mapContext, toCondition(node -> {
            return node instanceof BooleanExpressionNode;
        }) });
        list.add(
                new Object[] { "(name is not empty and age > 27) or 1 + 1 == 2", true, mapContext, toCondition(node -> {
                    return node instanceof BooleanExpressionNode;
                }) });
        list.add(new Object[] { "age == 1 + 2", false, mapContext, toCondition(node -> {
            return node instanceof GenericCompareExpressionNode
                    && ((GenericCompareExpressionNode) node).getRight() instanceof NumberExpressionNode;
        }) });
        list.add(new Object[] { "2 + 23 + 2 == age", true, mapContext, toCondition(node -> {
            return node instanceof GenericCompareExpressionNode
                    && ((GenericCompareExpressionNode) node).getLeft() instanceof NumberExpressionNode;
        }) });

        return list;
    }

    private static Function<ExpressionNode, Boolean> toCondition(Function<ExpressionNode, Boolean> condition) {
        return condition;
    }
}
