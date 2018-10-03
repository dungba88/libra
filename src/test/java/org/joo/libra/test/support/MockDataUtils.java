package org.joo.libra.test.support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.joo.libra.test.support.UserVO.Bar;
import org.joo.libra.test.support.UserVO.Foo;

public class MockDataUtils {
	
	public static Object mock(int type) {
		if (type == 1)
			return mockPerson();
		if (type == 2)
			return mockMap();
		if (type == 3)
			return mockUserVO();
		return null;
	}

    public static Person mockPerson() {
        Person person = new Person();
        person.setName("John");
        person.setAge(27);
        person.setDemographic(new Demographic());
        person.getDemographic().setGender("male");
        person.setJobs(new String[] { "Oracle" });
        person.setJobList(new ArrayList<>(Arrays.asList(new String[] { "Oracle" })));
        return person;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Map mockMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 27);
        map.put("demographic", new HashMap<>());
        ((Map) map.get("demographic")).put("gender", "male");
        map.put("jobs", new String[] { "Oracle" });
        map.put("jobList", new ArrayList<>(Arrays.asList(new String[] { "Oracle" })));
        return map;
    }

    public static Object mockUserVO() {
    	UserVO userVO = new UserVO();
		userVO.setName("dungba");
		userVO.setAge(7);
		userVO.setFemale(false);
		userVO.setData("ok");
		userVO.setTime(20);

		Foo foo = new Foo();
		foo.setValue(27);
		foo.setName("sophie");
		foo.setCollection(Arrays.asList("dungba", "sophie", "heo", "meo", "cho"));
		foo.setCollection1(Arrays.asList(23, 45, 80));

		Bar bar = new Bar();
		bar.setFoo(foo);

		userVO.setBar(bar);
		return userVO;
	}
}
