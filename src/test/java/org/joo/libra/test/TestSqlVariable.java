package org.joo.libra.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.joo.libra.PredicateContext;
import org.joo.libra.sql.SqlPredicate;
import org.joo.libra.support.PredicateExecutionException;
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
	
	@Test()
	public void testSimple() {
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
		
		Object mapContext = createMapContext();
		list.addAll(data(mapContext));

		Object objectContext = createObjectContext();
		list.addAll(data(objectContext));

		return list;
	}
	
	private static List<Object[]> data(Object context) {
		BeanUtilsBean.getInstance().getPropertyUtils();
		
		List<Object[]> list = new ArrayList<Object[]>();
		
		list.add(new Object[] { "name is 'John'", true, context });
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
		list.add(new Object[] { "jobs contains 'Paypal'", false, context });

		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Object createMapContext() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "John");
		map.put("age", 27);
		map.put("demographic", new HashMap<>());
		((Map)map.get("demographic")).put("gender", "male");
		map.put("jobs", new String[] {"Oracle"});
		return map;
	}
	
	private static Object createObjectContext() {
		Person person = new Person();
		person.setName("John");
		person.setAge(27);
		person.setDemographic(new Demographic());
		person.getDemographic().setGender("male");
		person.setJobs(new String[] {"Oracle"});
		return person;
	}
}