package org.joo.libra.test;

import java.util.Map;

import org.joo.libra.support.eval.ExpressionBuilder;
import org.joo.libra.support.eval.ResolvedExpressionBuilder;
import org.joo.libra.test.support.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestExpressionBuilder {

    @Test
    public void testResolveMap() throws Exception {
        ExpressionBuilder builder = new ResolvedExpressionBuilder<>(Map.class);
        Assert.assertEquals("obj.get(\"x\").get(\"y\")", builder.build("obj", "x.y"));
    }

    @Test
    public void testResolvePojo() throws Exception {
        ExpressionBuilder builder = new ResolvedExpressionBuilder<>(Person.class);
        Assert.assertEquals("obj.getName()", builder.build("obj", "name"));
        Assert.assertEquals("obj.getSalary()", builder.build("obj", "salary"));
        Assert.assertEquals("obj.getDemographic()", builder.build("obj", "demographic"));
        Assert.assertEquals("obj.getDemographic().getGender()", builder.build("obj", "demographic.gender"));
        Assert.assertEquals("obj.getJobs()[0]", builder.build("obj", "jobs[0]"));
        Assert.assertEquals("obj.getJobList().get(0)", builder.build("obj", "jobList[0]"));
        Assert.assertEquals("obj.isFemale()", builder.build("obj", "female"));
    }
}
