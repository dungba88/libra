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

public class TestSqlPerf {
	
	private SqlPredicate predicate;
	
	private Person person;
	
	private Map<String, Object> map;
	
	private PredicateContext personContext;
	
	private PredicateContext mapContext;

	public static void main(String[] args) {
		TestSqlPerf perf = new TestSqlPerf();
		perf.test(1000000);
	}
	
	public void test(long iterations) {
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
		person = MockDataUtils.mockPerson();
		map = MockDataUtils.mockMap();
		personContext = new PredicateContext(person);
		mapContext = new PredicateContext(map);
	}

	protected void warmup() {
		BeanUtilsBean.getInstance().getPropertyUtils();
		SqlLexer.VOCABULARY.getClass();
		SqlParser.VOCABULARY.getClass();
	}

	protected void doTest(long iterations, PredicateContext context) {
		for(int i=0; i<iterations; i++) {
			try {
				predicate.satisfiedBy(context);
			} catch (PredicateExecutionException e) {
				throw new RuntimeException(e);
			}
		}
	}

	protected void cleanup() {
		
	}
}
