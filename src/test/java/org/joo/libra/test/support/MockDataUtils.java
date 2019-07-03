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
        person.setJobList(new ArrayList<>(Arrays.asList(new String[] { "Oracle", "Google" })));
        person.setJobWithSalaries(
                new ArrayList<>(Arrays.asList(new JobWithSalary("Oracle", 1000), new JobWithSalary("Paypal", 500))));
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
        map.put("jobList", new ArrayList<>(Arrays.asList(new String[] { "Oracle", "Google" })));

        Map<String, Object> jobWithSalary = new HashMap<>();
        jobWithSalary.put("name", "Oracle");
        jobWithSalary.put("salary", 1000);
        Map<String, Object> jobWithSalary2 = new HashMap<>();
        jobWithSalary2.put("name", "Paypal");
        jobWithSalary2.put("salary", 500);
        map.put("jobWithSalaries", new Object[] { jobWithSalary, jobWithSalary2 });
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
        foo.setCollection1(Arrays.asList(7, 23, 45, 80));

        Bar bar = new Bar();
        bar.setFoo(foo);

        userVO.setBar(bar);
        return userVO;
    }
}
