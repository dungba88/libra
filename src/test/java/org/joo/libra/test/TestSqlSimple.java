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
public class TestSqlSimple {
	
	private String value;
	
	private Boolean expected;
	
	public TestSqlSimple(String value, Boolean expected) {
		this.value = value;
		this.expected = expected;
	}

	@Test()
	public void testSimple() throws PredicateExecutionException {
		SqlPredicate predicate = new SqlPredicate(value);
		if (predicate.hasError()) {
			Assert.assertEquals(value + ":", expected, null);
		} else {
			Assert.assertEquals(value + ":", expected, predicate.satisfiedBy(null));
		}
	}

	@Parameters
	public static List<Object[]> data() {
		List<Object[]> list = new ArrayList<Object[]>();

		list.add(new Object[] { "'John' is 'John'", true });
		list.add(new Object[] { "'John' == 'John'", true });
		list.add(new Object[] { "'John' = 'John'", true });
		list.add(new Object[] { "'John' is 'oh'", false });
		list.add(new Object[] { "'John' is not 'oh'", true });
		list.add(new Object[] { "'John' != 'oh'", true });
		list.add(new Object[] { "'John' > 'oh'", null });
		list.add(new Object[] { "'John' contains 'oh'", true });
		list.add(new Object[] { "'John' is not empty", true });
		list.add(new Object[] { "'John' is empty", false });
		list.add(new Object[] { "'John' is not null", true });
		list.add(new Object[] { "'John' is null", false });
		
		list.add(new Object[] { "4 > 1", true });
		list.add(new Object[] { "1 > 4", false });
		list.add(new Object[] { "3 >= 2", true });
		list.add(new Object[] { "3 >= 3", true });
		list.add(new Object[] { "2 >= 3", false });
		list.add(new Object[] { "3 < 2", false });
		list.add(new Object[] { "2 < 3", true });
		list.add(new Object[] { "3 <= 2", false });
		list.add(new Object[] { "1 <= 2", true });
		list.add(new Object[] { "1 <= 1", true });
		list.add(new Object[] { "1 = 1", true });
		list.add(new Object[] { "1 = 2", false });
		list.add(new Object[] { "1 == 1", true });
		list.add(new Object[] { "1 == 2", false });
		
		list.add(new Object[] { "1 + 1 == 2", true});
		list.add(new Object[] { "1 + 2 * 3 == 7", true});
		list.add(new Object[] { "1 + 2 * 3 < 8", true });
		list.add(new Object[] { "1 + 2 * 3 < 7", false });

		return list;
	}
}
