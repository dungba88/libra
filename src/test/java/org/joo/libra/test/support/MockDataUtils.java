package org.joo.libra.test.support;

import java.util.HashMap;
import java.util.Map;

public class MockDataUtils {

	public static Person mockPerson() {
		Person person = new Person();
		person.setName("John");
		person.setAge(27);
		person.setDemographic(new Demographic());
		person.getDemographic().setGender("male");
		person.setJobs(new String[] {"Oracle"});
		return person;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map mockMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "John");
		map.put("age", 27);
		map.put("demographic", new HashMap<>());
		((Map)map.get("demographic")).put("gender", "male");
		map.put("jobs", new String[] {"Oracle"});
		return map;
	}
}
