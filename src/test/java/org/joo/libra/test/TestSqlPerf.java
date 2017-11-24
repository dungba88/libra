package org.joo.libra.test;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.support.PredicateExecutionException;
import org.joo.libra.test.support.MockDataUtils;
import org.joo.libra.test.support.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestSqlPerf {

    private SqlPredicate predicate;

    private PredicateContext personContext;

    private PredicateContext mapContext;
    
    private int iterations = 10000000;
    
    @Test
    public void test() throws PredicateExecutionException {
        try {
            System.out.println("Setting up...");
            setup();

            System.out.println("Warming up...");
            warmup();

            System.out.println("\nTesting with Java object...");

            long start = System.currentTimeMillis();
            doTest(iterations, personContext);
            long elapsed = System.currentTimeMillis() - start;
            long pace = iterations * 1000 / elapsed;

            System.out.println("Elapsed: " + elapsed + "ms");
            System.out.println("Pace: " + pace + " ops/sec");

            System.out.println("\nTesting with Map...");

            start = System.currentTimeMillis();
            doTest(iterations, mapContext);
            elapsed = System.currentTimeMillis() - start;
            pace = iterations * 1000 / elapsed;

            System.out.println("Elapsed: " + elapsed + "ms");
            System.out.println("Pace: " + pace + " ops/sec");
        } finally {
            System.out.println("\nCleaning up...");
            cleanup();
            System.out.println("Finished");
        }
    }

    @SuppressWarnings("unchecked")
    protected void setup() {
        predicate = new SqlPredicate("name is 'John' and age > 27");
        Person person = MockDataUtils.mockPerson();
        Map<String, Object> map = MockDataUtils.mockMap();
        personContext = new PredicateContext(person);
        mapContext = new PredicateContext(map);
    }

    protected void warmup() {
        BeanUtilsBean.getInstance().getPropertyUtils();
        SqlLexer.VOCABULARY.getClass();
        SqlParser.VOCABULARY.getClass();
    }

    protected void doTest(long iterations, PredicateContext context) throws PredicateExecutionException {
        for (int i = 0; i < iterations; i++) {
            boolean result = predicate.satisfiedBy(context);
            Assert.assertEquals(false, result);
        }
    }

    protected void cleanup() {
        // empty implementation
    }
}
