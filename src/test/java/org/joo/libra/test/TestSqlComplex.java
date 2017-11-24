package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;

import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.support.PredicateExecutionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSqlComplex {

    private String value;

    private Boolean expected;

    public TestSqlComplex(String value, Boolean expected) {
        this.value = value;
        this.expected = expected;
    }

    @Test
    public void testComplex() throws PredicateExecutionException {
        SqlPredicate predicate = new SqlPredicate(value);
        if (predicate.hasError())
            Assert.assertEquals(expected, null);
        else
            Assert.assertEquals(expected, predicate.satisfiedBy(null));
    }

    @Parameters
    public static List<Object[]> data() {
        List<Object[]> list = new ArrayList<Object[]>();

        list.add(new Object[] { "'John' is 'John' and 1 == 1 and", null });
        list.add(new Object[] { "'John' is 'John' and 1 == 1 and 0", false });
        list.add(new Object[] { "'John' is 'John' and 1 == 1 and 1", true });
        list.add(new Object[] { "'John' is 'John' or 1 == 1", true });
        list.add(new Object[] { "'John' is 'John' or 1 == 2", true });
        list.add(new Object[] { "'John' is not 'John' or 1 == 2", false });
        list.add(new Object[] { "'John' is 'John' and 1 == 1", true });
        list.add(new Object[] { "'John' is 'John' and 1 == 2", false });
        list.add(new Object[] { "'John' is not 'John' and 1 == 1", false });

        list.add(new Object[] { "('John' is not 'John' or 1 == 1) and 1 > 2", false });
        list.add(new Object[] { "('John' is not 'John' or 1 == 1) or 1 > 2", true });
        list.add(new Object[] { "('John' is not 'John' or 1 == 1) or (1 < 2 and 1 + 1 == 2)", true });

        return list;
    }
}
