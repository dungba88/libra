package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.support.exceptions.PredicateExecutionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSqlLiteral {

	private String value;

	private Object expected;

	public TestSqlLiteral(String value, Object expected) {
		this.value = value;
		this.expected = expected;
	}

	@Test
	public void testLiteral() throws PredicateExecutionException {
		SqlPredicate predicate = new SqlPredicate(value);
		predicate.checkForErrorAndThrow();
		Assert.assertEquals(value + ":", expected, predicate.calculateLiteralValue(new PredicateContext(null)));
		Assert.assertEquals(value + ":", expected, predicate.calculateLiteralValue(null));
	}

	@Parameters
	public static List<Object[]> data() {
		List<Object[]> list = new ArrayList<Object[]>();

		list.add(new Object[] { "undefined", null });
		list.add(new Object[] { "null", null });
		list.add(new Object[] { "name", null });
		list.add(new Object[] { "''", "" });
		list.add(new Object[] { "'John'", "John" });
		list.add(new Object[] { "'John' is empty", false });
		list.add(new Object[] { "'John' is not null", true });
		list.add(new Object[] { "'John' is null", false });

		list.add(new Object[] { "false", false });
		list.add(new Object[] { "true", true });
		list.add(new Object[] { "1", 1L });
		list.add(new Object[] { "1 ^ 2", 1.0 });
		list.add(new Object[] { "2 ^ 2 % 3", 1.0 });
		list.add(new Object[] { "5 % 2 ^ 2", 1.0 });
		list.add(new Object[] { "(5 % 3) ^ 2", 4.0 });
		list.add(new Object[] { "4 % 3", 1.0 });
		list.add(new Object[] { "4 % 2", 0.0 });
		list.add(new Object[] { "2 * 2 % 2", 0.0 });
		list.add(new Object[] { "5 % 2 * 2", 1.0 });
		list.add(new Object[] { "5 ^ 2 * 2", 50.0 });
		list.add(new Object[] { "2 * 2 ^ 3", 16.0 });

		list.add(new Object[] { "sqrt (4)", 2.0 });
		list.add(new Object[] { "sqrt (2 * 5 + 6)", 4.0 });
		list.add(new Object[] { "sqrt (4) - 1", 1.0 });
		list.add(new Object[] { "sqrt (4) - 1 * 2", 0.0 });
		list.add(new Object[] { "sqrt (4) - 1 * 2", 0.0 });

		list.add(new Object[] { "avg (4, 5, 6)", 5.0 });
		list.add(new Object[] { "avg (4, 5)", 4.5 });
		list.add(new Object[] { "avg (4)", 4.0 });
		list.add(new Object[] { "avg (4, 5, 6) - 5", 0.0 });

		list.add(new Object[] { "sum (4, 5, 6)", 15.0 });
		list.add(new Object[] { "sum (4)", 4.0 });
		list.add(new Object[] { "sum (4, 5, 6) - 5", 10.0 });
		list.add(new Object[] { "sum (4, 5, 6)", 15.0 });

		list.add(new Object[] { "min (5, 4, 6)", 4.0 });
		list.add(new Object[] { "max (5, 4, 6)", 6.0 });

		list.add(new Object[] { "len ('name')", 4 });
		list.add(new Object[] { "len ({1, 2, 3})", 3 });
		list.add(new Object[] { "len ('name') + 1", 5.0 });
		list.add(new Object[] { "len ({1, 2, 3}) + 1", 4.0 });

		return list;
	}
}