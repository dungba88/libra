package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.support.PredicateExecutionException;
import org.joo.libra.test.support.MockDataUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSqlVariable {

    private String value;

    private Boolean expected;

    private Object context;

    public TestSqlVariable(String value, Boolean expected, Object context) {
        this.value = value;
        this.expected = expected;
        this.context = context;
    }

    @Test
    public void testVariable() {
        SqlPredicate predicate = new SqlPredicate(value);
        if (predicate.hasError()) {
            Assert.assertEquals(expected, null);
        } else {
            try {
                Assert.assertEquals(expected, predicate.satisfiedBy(new PredicateContext(context)));
            } catch (PredicateExecutionException e) {
                Assert.assertEquals(expected, null);
            }
        }
    }

    @Parameters
    public static List<Object[]> data() {
        List<Object[]> list = new ArrayList<Object[]>();

        Object mapContext = MockDataUtils.mockMap();
        list.addAll(data(mapContext));

        Object objectContext = MockDataUtils.mockPerson();
        list.addAll(data(objectContext));

        return list;
    }

    private static List<Object[]> data(Object context) {
        BeanUtilsBean.getInstance().getPropertyUtils();

        List<Object[]> list = new ArrayList<Object[]>();

        list.add(new Object[] { "female", false, context });
        list.add(new Object[] { "name", true, context });
        list.add(new Object[] { "age", true, context });
        list.add(new Object[] { "salary", false, context });
        list.add(new Object[] { "jobs", true, context });
        list.add(new Object[] { "jobList", true, context });
        list.add(new Object[] { "noJobs", false, context });
        list.add(new Object[] { "noJobList", false, context });

        list.add(new Object[] { "name > ", null, context });
        list.add(new Object[] { "name is 'John'", true, context });
        list.add(new Object[] { "name matches 'John'", true, context });
        list.add(new Object[] { "name is not 'John'", false, context });
        list.add(new Object[] { "age > 27", false, context });
        list.add(new Object[] { "age < 27", false, context });
        list.add(new Object[] { "age <= 27", true, context });
        list.add(new Object[] { "age >= 27", true, context });
        list.add(new Object[] { "age = 27", true, context });
        list.add(new Object[] { "age + 2 = 27", false, context });
        list.add(new Object[] { "age + 2 > 27", true, context });
        list.add(new Object[] { "age + 2 > age", true, context });
        list.add(new Object[] { "demographic.gender is 'female'", false, context });
        list.add(new Object[] { "demographic.gender is 'male'", true, context });
        list.add(new Object[] { "jobs[0] is 'Oracle'", context instanceof Map ? null : true, context });
        list.add(new Object[] { "jobs contains 'Oracle'", true, context });
        list.add(new Object[] { "jobList contains 'Oracle'", true, context });
        list.add(new Object[] { "jobs contains 'Paypal'", false, context });
        list.add(new Object[] { "jobList contains 'Paypal'", false, context });
        list.add(new Object[] { "jobs is empty", false, context });
        list.add(new Object[] { "jobList is empty", false, context });
        list.add(new Object[] { "jobs is not empty", true, context });
        list.add(new Object[] { "jobList is not empty", true, context });
        list.add(new Object[] { "not jobs is empty", true, context });
        list.add(new Object[] { "jobssss is empty", context instanceof Map ? true : null, context });
        list.add(new Object[] { "age contains 3", false, context });

        return list;
    }
}