package org.joo.libra.test;

import org.joo.libra.support.eval.ExpressionBuilder;
import org.joo.libra.support.eval.impl.ResolvedExpressionBuilder;
import org.joo.libra.test.support.MockDataUtils;
import org.joo.libra.test.support.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestExpressionBuilder {

    @Test
    public void testResolvePojo() throws Exception {
        Person person = MockDataUtils.mockPerson();
        ExpressionBuilder builder = new ResolvedExpressionBuilder<>(Person.class);
        Assert.assertEquals("obj.getName()", builder.build(person, "obj", "name"));
        Assert.assertEquals("obj.getSalary()", builder.build(person, "obj", "salary"));
        Assert.assertEquals("obj.getDemographic()", builder.build(person, "obj", "demographic"));
        Assert.assertEquals("obj.getDemographic().getGender()", builder.build(person, "obj", "demographic.gender"));
        Assert.assertEquals("obj.getDemographic().isFemale()", builder.build(person, "obj", "demographic.female"));
        Assert.assertEquals("obj.getJobs()[0]", builder.build(person, "obj", "jobs[0]"));
        Assert.assertEquals("obj.getJobList().get(0)", builder.build(person, "obj", "jobList[0]"));
        Assert.assertEquals("obj.getJobWithSalariesArr()[0].getSalary()", builder.build(person, "obj", "jobWithSalariesArr[0].salary"));
        Assert.assertEquals("obj.getJobWithSalaries().get(0).getSalary()", builder.build(person, "obj", "jobWithSalaries[0].salary"));
        Assert.assertEquals("obj.isFemale()", builder.build(person, "obj", "female"));
    }
}
