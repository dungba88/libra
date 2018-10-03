package org.joo.libra.test;

import org.joo.libra.common.SimpleHasValue;
import org.joo.libra.sql.AntlrSqlPredicateParser;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.antlr.SqlParserBaseVisitor;
import org.joo.libra.sql.node.AbstractBinaryOpExpressionNode;
import org.joo.libra.sql.node.BooleanExpressionNode;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.sql.node.GenericCompareExpressionNode;
import org.joo.libra.sql.node.LexicalCompareExpressionNode;
import org.joo.libra.sql.node.MathExpressionNode;
import org.joo.libra.sql.node.NumericCompareExpressionNode;
import org.joo.libra.sql.node.ObjectExpressionNode;
import org.joo.libra.support.PredicateExecutionException;
import org.junit.Assert;
import org.junit.Test;

public class TestSqlMisc {

    @Test
    public void test() {
        AntlrSqlPredicateParser parser = new AntlrSqlPredicateParser() {

            protected ExpressionNode doParse(SqlParser parser) {
                SqlParserBaseVisitor<ExpressionNode> visitor = new SqlParserBaseVisitor<>();
                visitor.visit(parser.predicate());
                return new BooleanExpressionNode(false);
            }
        };

        String predicateStr = "(1 > 2 + 3) and (not name is empty) or age contains null and employed is false or employed is not false and (name matches 'name')";
        SqlPredicate predicate = new SqlPredicate(predicateStr, parser);
        predicate.checkForErrorAndThrow();
        try {
            Assert.assertFalse(predicate.satisfiedBy(null));
        } catch (PredicateExecutionException e) {
            Assert.fail(e.getMessage());
        }
        
        AbstractBinaryOpExpressionNode<?> node = new GenericCompareExpressionNode();
        node.setOp(-1);
        Assert.assertNull(node.buildPredicate());
        
        node = new NumericCompareExpressionNode();
        node.setOp(-1);
        Assert.assertNull(node.buildPredicate());
        
        node = new LexicalCompareExpressionNode();
        node.setOp(-1);
        Assert.assertNull(node.buildPredicate());
        
        MathExpressionNode mathNode = new MathExpressionNode();
        mathNode.setLeft(new SimpleHasValue<Number>(1));
        mathNode.setRight(new SimpleHasValue<Number>(2));
        mathNode.setOp(-1);
        Assert.assertNull(mathNode.getValue(null));
        
        ObjectExpressionNode objNode = new ObjectExpressionNode();
        objNode.setValue(new Object());
        try {
            Assert.assertTrue(objNode.buildPredicate().satisfiedBy(null));
        } catch (PredicateExecutionException e) {
            Assert.fail(e.getMessage());
        }
    }
}
