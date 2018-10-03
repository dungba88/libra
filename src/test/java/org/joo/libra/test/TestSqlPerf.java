package org.joo.libra.test;

import java.util.function.Supplier;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.sql.antlr.SqlLexer;
import org.joo.libra.sql.antlr.SqlParser;
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

            long start = System.currentTimeMillis();
            doTest(iterations, () -> new PredicateContext(MockDataUtils.mockPerson()));
            long elapsed = System.currentTimeMillis() - start;
            long pace = iterations * 1000L / elapsed;

            System.out.println("Elapsed: " + elapsed + "ms");
            System.out.println("Pace: " + pace + " ops/sec");

            System.out.println("\nTesting with Map...");

            start = System.currentTimeMillis();
            doTest(iterations, () -> new PredicateContext(MockDataUtils.mockMap()));
            elapsed = System.currentTimeMillis() - start;
            pace = iterations * 1000L / elapsed;

            System.out.println("Elapsed: " + elapsed + "ms");
            System.out.println("Pace: " + pace + " ops/sec");
            
            System.out.println("Test Complex SQL");
            start = System.currentTimeMillis();
            doTest(iterations, () -> new PredicateContext(MockDataUtils.mockUserVO()));
            elapsed = System.currentTimeMillis() - start;
			pace = iterations * 1000L / elapsed;

			System.out.println("Elapsed: " + elapsed + "ms");
			System.out.println("Pace: " + pace + " ops/sec");
        } finally {
            System.out.println("\nCleaning up...");
            cleanup();
            System.out.println("Finished");
        }
    }

    protected void setup() {
        predicate = new SqlPredicate("name is 'John' and age > 27");
        predicate.checkForErrorAndThrow();

        String sql = "age * 2 + 4 * age - 1 * 5 + 6 != 0 " //
				+ "and (1 + 2 * 4) / 5 - 8 = 1 " //
				+ "or age in bar.foo.collection1 " //
				+ "and data = 'ok' " //
				+ "and (not female or name = bar.foo.name) " //
				+ "and bar IS NOT NULL " //
				+ "and (name in ('noname', -1, bar.foo.name) " //
				+ "or bar.foo.name matches '[Ms]ario.*') ";
        complexPredicate = new SqlPredicate(sql);
        complexPredicate.checkForErrorAndThrow();
    }

    protected void warmup() {
        BeanUtilsBean.getInstance().getPropertyUtils();
        SqlLexer.VOCABULARY.getClass();
        SqlParser.VOCABULARY.getClass();
    }

    protected void doTest(long iterations, Supplier<PredicateContext> contextSupplier) throws PredicateExecutionException {
        for (int i = 0; i < iterations; i++) {
        	PredicateContext context = contextSupplier.get();
            boolean result = predicate.satisfiedBy(context);
            Assert.assertEquals(false, result);
        }
    }

    protected void cleanup() {
        // empty implementation
    }
}
