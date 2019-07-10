package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.support.exceptions.PredicateExecutionException;
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
            if (expected != null)
                predicate.checkForErrorAndThrow();
        } else {
            try {
                Assert.assertEquals(expected, predicate.satisfiedBy(new PredicateContext(context)));
            } catch (PredicateExecutionException e) {
                if (expected != null) {
                    e.printStackTrace();
                    Assert.fail(e.getMessage());
                }
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
        list.add(new Object[] { "age + 2", true, context });
        list.add(new Object[] { "age - 27", false, context });
        list.add(new Object[] { "noJobs", false, context });
        list.add(new Object[] { "sqrt(age + 2)", true, context });
        list.add(new Object[] { "sqrt(age) + 2", true, context });
        list.add(new Object[] { "sqrt(age) - sqrt(27)", false, context });
        list.add(new Object[] { "age + 2 = 27", false, context });
        list.add(new Object[] { "age + 2 > 27", true, context });
        list.add(new Object[] { "age + 2 > age", true, context });
        list.add(new Object[] { "demographic.gender is 'female'", false, context });
        list.add(new Object[] { "demographic.gender is 'male'", true, context });
        list.add(new Object[] { "jobs[0] is 'Oracle'", context instanceof Map ? null : true, context });

        list.add(new Object[] { "age IN {27.0, 28, 29}", true, context });

        list.add(new Object[] { "(with $item in {1, 2, 3} satisfies $item > 1) contains 2", true, context });

        list.add(new Object[] { "with $job in jobWithSalaries satisfies $job.salary > 500", true, context });
        list.add(new Object[] { "with $job in jobWithSalaries satisfies $job.salary < 0", false, context });

        list.add(new Object[] {
                "any $job in (with $theJob in jobWithSalaries satisfies $theJob.salary > 500) satisfies $job.salary >= 1000",
                true, context });

        list.add(new Object[] {
                "any $salary in ($job.salary with $job in jobWithSalaries satisfies $job.salary > 500) satisfies $salary >= 1000",
                true, context });

        list.add(new Object[] { "sum($job.salary with $job in jobWithSalaries satisfies $job.salary > 500) == 1000",
                true, context });

        list.add(new Object[] { "any $item in {1, 2, 3} satisfies $item >= 1000", false, context });
        list.add(new Object[] { "any $item in {1, 2, 3} satisfies $item == 2", true, context });

        list.add(new Object[] { "any $job in jobWithSalaries satisfies $job.salary >= 1000", true, context });
        list.add(new Object[] { "any $job in jobWithSalaries satisfies $job.salary < 1000", true, context });
        list.add(new Object[] { "any $job in jobWithSalaries satisfies $job.salary < 500", false, context });

        list.add(new Object[] { "any $job in jobs satisfies $job is 'Oracle' and $job is 'Paypal'", false, context });
        list.add(new Object[] { "any $job in jobs satisfies $job is 'Oracle' or $job is 'Paypal'", true, context });
        list.add(new Object[] { "any $job in jobs satisfies $job is 'Oracle'", true, context });
        list.add(new Object[] { "any $job in jobs satisfies $job is 'Paypal'", false, context });
        list.add(new Object[] { "none $job in jobs satisfies $job is 'Oracle'", false, context });
        list.add(new Object[] { "none $job in jobs satisfies $job is 'Paypal'", true, context });
        list.add(new Object[] { "all $job in jobs satisfies $job is 'Oracle'", true, context });
        list.add(new Object[] { "all $job in jobList satisfies $job is 'Oracle'", false, context });
        list.add(new Object[] { "any $job in noJobs satisfies (job is 'Oracle')", false, context });
        list.add(new Object[] { "none $job in noJobs satisfies $job is 'Oracle'", true, context });
        list.add(new Object[] { "all $job in noJobs satisfies $job is 'Oracle'", true, context });
        list.add(new Object[] { "any $job in jobs satisfies $job in {'Oracle', 'Paypal'}", true, context });
        list.add(new Object[] { "all $job in jobs satisfies $job in {'Oracle', 'Paypal'}", true, context });

        list.add(new Object[] { "jobs contains 'Oracle'", true, context });
        list.add(new Object[] { "jobList contains 'Oracle'", true, context });
        list.add(new Object[] { "jobs contains 'Paypal'", false, context });
        list.add(new Object[] { "jobList contains 'Paypal'", false, context });
        list.add(new Object[] { "'Paypal' in jobList", false, context });
        list.add(new Object[] { "'Oracle' in jobList", true, context });
        list.add(new Object[] { "'Paypal' in jobs", false, context });
        list.add(new Object[] { "'Oracle' in jobs", true, context });
        list.add(new Object[] { "jobs is empty", false, context });
        list.add(new Object[] { "jobList is empty", false, context });
        list.add(new Object[] { "jobs is not empty", true, context });
        list.add(new Object[] { "jobList is not empty", true, context });
        list.add(new Object[] { "not jobs is empty", true, context });
        list.add(new Object[] { "jobssss is empty", context instanceof Map ? true : null, context });
        list.add(new Object[] { "age contains 3", false, context });

        list.add(new Object[] { "sqrt(age) > 5", true, context });
        list.add(new Object[] { "sqrt(age) < 6", true, context });
        list.add(new Object[] { "sqrt(age + 9) == 6", true, context });
        list.add(new Object[] { "avg(age, 25) == 26", true, context });
        list.add(new Object[] { "sum(age, -2) == 25", true, context });

        list.add(new Object[] { "(name ? age + 1 : age - 1) == 28", true, context });
        list.add(new Object[] { "(age > 20 ? age + 1 : age - 1) == 28", true, context });
        list.add(new Object[] { "(age < 20 ? age + 1 : age - 1) == 26", true, context });

        return list;
    }
}