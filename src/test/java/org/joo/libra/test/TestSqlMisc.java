package org.joo.libra.test;

import org.joo.libra.sql.AntlrSqlPredicateParser;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.antlr.SqlParserBaseVisitor;
import org.joo.libra.sql.node.ExpressionNode;
import org.joo.libra.support.PredicateExecutionException;
import org.junit.Assert;
import org.junit.Test;

public class TestSqlMisc {

    @Test
    public void test() {
        AntlrSqlPredicateParser parser = new AntlrSqlPredicateParser() {

            protected ExpressionNode doParse(SqlParser parser) {
                SqlParserBaseVisitor<ExpressionNode> visitor = new SqlParserBaseVisitor<>();
                return visitor.visit(parser.predicate());
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
    }
}
