package org.joo.libra.test;

import org.joo.libra.support.ObjectUtils;
import org.joo.libra.support.eval.VariableEvaluator;
import org.joo.libra.support.eval.impl.CompiledJavaEvaluator;
import org.joo.libra.test.support.MockDataUtils;
import org.joo.libra.test.support.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestCompile {

    @Test
    public void testCompile() throws Exception {
        Person p = MockDataUtils.mockPerson();
        VariableEvaluator evaluator = new CompiledJavaEvaluator<Person>(Person.class);
        Assert.assertEquals(27L, evaluator.evaluate(p, "age"));
        Assert.assertEquals("John", evaluator.evaluate(p, "name"));
        Assert.assertEquals("male", evaluator.evaluate(p, "demographic.gender"));
        Assert.assertEquals("Oracle", evaluator.evaluate(p, "jobs[0]"));
    }

    @Test
    public void testPerfCompiled() throws Exception {
        Person p = MockDataUtils.mockPerson();
        VariableEvaluator evaluator = new CompiledJavaEvaluator<Person>(Person.class);
        Assert.assertEquals("male", evaluator.evaluate(p, "demographic.gender"));

        int total = 1000000;
        long started = System.nanoTime();
        for (int i = 0; i < total; i++) {
            evaluator.evaluate(p, "demographic.gender");
        }
        long elapsed = System.nanoTime() - started;
        long throughput = (long) ((double) total / elapsed * 1e9);
        System.out.println("Elapsed: " + (long) (elapsed / 1e6) + "ms. Throughput: " + throughput);
    }

    @Test
    public void testPerfBean() throws Exception {
        Person p = MockDataUtils.mockPerson();

        int total = 1000000;
        long started = System.nanoTime();
        for (int i = 0; i < total; i++) {
            ObjectUtils.getValue(p, "demographic.gender");
        }
        long elapsed = System.nanoTime() - started;
        long throughput = (long) ((double) total / elapsed * 1e9);
        System.out.println("Elapsed: " + (long) (elapsed / 1e6) + "ms. Throughput: " + throughput);
    }
}
