package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
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

    public TestSqlOptimized(String value, Boolean expected, Object context) {
        this.value = value;
        this.expected = expected;
        this.context = new PredicateContext(context);
    }

    @Test
    public void testOptimized() throws PredicateExecutionException {
        SqlPredicate predicate = new SqlPredicate(value, new OptimizedAntlrSqlPredicateParser());
        if (predicate.hasError()) {
            Assert.assertEquals(value + ":", expected, null);
        } else {
            Assert.assertEquals(value + ":", expected, predicate.satisfiedBy(context));
        }
    }

    @Parameters
    public static List<Object[]> data() {
        List<Object[]> list = new ArrayList<Object[]>();

        Object mapContext = MockDataUtils.mockMap();

        list.add(new Object[] { "name is not empty and 1 > 2 and 1 matches 2", null, mapContext });
        list.add(new Object[] { "name is not empty and 1 > 2", false, mapContext });
        list.add(new Object[] { "name is not empty and 1 + 1 > 2", false, mapContext });
        list.add(new Object[] { "name is not empty or 1 + 1 == 2", true, mapContext });
        list.add(new Object[] { "(name is not empty and age > 27) or 1 + 1 == 2", true, mapContext });
        list.add(new Object[] { "age == 1 + 2", false, mapContext });

        return list;
    }
}
