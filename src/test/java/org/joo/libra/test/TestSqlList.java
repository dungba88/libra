package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;

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
public class TestSqlList {

	private String value;

	private Boolean expected;

	public TestSqlList(String value, Boolean expected) {
		this.value = value;
		this.expected = expected;
	}

	@Test
	public void testSimple() throws PredicateExecutionException {
		SqlPredicate predicate = new SqlPredicate(value);
		predicate.checkForErrorAndThrow();
		Assert.assertEquals(value + ":", expected,
				predicate.satisfiedBy(new PredicateContext(MockDataUtils.mockPerson())));
	}

	@Parameters
	public static List<Object[]> data() {
		List<Object[]> list = new ArrayList<Object[]>();

		list.add(new Object[] { "{1, 2, 3} contains 1", true });
		list.add(new Object[] { "{'abc', 2, 3} contains 1", false });
		list.add(new Object[] { "{'abc', 2, 3} contains 'abc'", true });
		list.add(new Object[] { "{name, 2, 3} contains 'John'", true });
		list.add(new Object[] { "{'John', 2, 3} contains name", true });
		list.add(new Object[] { "{name, 2, age} contains 27", true });
		list.add(new Object[] { "{name, 2, age} contains 1", false });

		list.add(new Object[] { "1 in {1, 2, 3}", true });
		list.add(new Object[] { "1 in {'abc', 2, 3}", false });
		list.add(new Object[] { "'abc' in {'abc', 2, 3}", true });
		list.add(new Object[] { "'John' in {name, 2, 3}", true });
		list.add(new Object[] { "name in {'John', 2, 3}", true });
		list.add(new Object[] { "27 in {name, 2, age}", true });
		list.add(new Object[] { "1 in {name, 2, age}", false });

		list.add(new Object[] { "1 in {1}", true });

		return list;
	}
}
