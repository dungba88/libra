package org.joo.libra.test;

import java.util.ArrayList;
import java.util.List;

import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.support.MalformedSyntaxException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSqlError {

	private String value;

	public TestSqlError(String value) {
		this.value = value;
	}

	@Test
	public void testError() {
		SqlPredicate predicate = new SqlPredicate(value);
		Assert.assertTrue(predicate.hasError() && predicate.getCause() instanceof MalformedSyntaxException);
	}

	@Parameters
	public static List<Object[]> data() {
        List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] { "name'" });
		list.add(new Object[] { "'John' > 'oh'" });
		list.add(new Object[] { "1 > 'oh'" });
		list.add(new Object[] { "1 matches '.*ho.*'" });
		list.add(new Object[] { "'John' matches 1" });
		list.add(new Object[] { "1 - 'a'" });
		list.add(new Object[] { "'a' - 1" });
		return list;
	}

}
