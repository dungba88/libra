package org.joo.libra.test;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
import org.joo.libra.sql.optimizers.OptimizedAntlrSqlPredicateParser;
import org.joo.libra.support.PredicateExecutionException;
import org.joo.libra.test.support.MockDataUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestSqlPerf {

    private SqlPredicate predicate;

    private SqlPredicate complexPredicate;

    private int iterations = 10000000;

    @Test
    public void test() throws PredicateExecutionException {
        try {
            System.out.println("Setting up...");
            setup();

            System.out.println("Warming up...");
            warmup();

            System.out.println("\nTesting with Java object...");
            doTest(iterations, predicate, false, 1);
            
            System.out.println("\nTesting with Map...");
            doTest(iterations, predicate, false, 2);

            System.out.println("\nTest Complex SQL");
            doTest(iterations, complexPredicate, false, 3);
        } finally {
            System.out.println("\nCleaning up...");
            cleanup();
            System.out.println("Finished");
        }
    }

    protected void setup() {
        predicate = new SqlPredicate("name is 'John' and age > 27");
        predicate.checkForErrorAndThrow();
        System.out.println("Parsed expression: " + predicate);

        String sql = "age % 2 + 4 * age - 1 * 5 + 6 != 0 " //
				+ "and (1 + 2 ^ 4) % 5 - 8 = 1 " //
				+ "or bar.foo.collection1 contains age " //
				+ "and data = 'ok' " //
				+ "and (not female or name = bar.foo.name) " //
				+ "and bar IS NOT NULL " //
				+ "and bar.foo.name matches '[Ms]ario.*' ";
        complexPredicate = new SqlPredicate(sql, new OptimizedAntlrSqlPredicateParser());
        complexPredicate.checkForErrorAndThrow();
        System.out.println("Parsed expression: " + complexPredicate);
    }

    protected void warmup() {
        BeanUtilsBean.getInstance().getPropertyUtils();
        SqlLexer.VOCABULARY.getClass();
        SqlParser.VOCABULARY.getClass();
    }

    protected void doTest(long iterations, SqlPredicate predicate, boolean expected, int objectType) throws PredicateExecutionException {
        long start = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
        	PredicateContext context = new PredicateContext(MockDataUtils.mock(objectType));
            boolean result = predicate.satisfiedBy(context);
            Assert.assertEquals(expected, result);
        }

        long elapsed = System.nanoTime() - start;
        long pace = iterations * (long) 1e9 / elapsed;
        long avg = elapsed / iterations;

        System.out.println("Elapsed: " + elapsed / (long) 1e6 + " ms");
        System.out.println("Pace: " + pace + " ops/sec");
        System.out.println("Avg: " + avg + " ns");
    }

    protected void cleanup() {
        // empty implementation
    }
}
