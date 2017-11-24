package org.joo.libra.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joo.libra.Predicate;
import org.joo.libra.collection.InPredicate;
import org.joo.libra.common.SimpleHasValue;
import org.joo.libra.common.SimplePredicate;
import org.joo.libra.logic.AndPredicate;
import org.joo.libra.logic.OrPredicate;
import org.joo.libra.pointer.IsNullPredicate;
import org.joo.libra.support.PredicateExecutionException;
import org.joo.libra.text.EqualsIgnoreCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestJavaPredicate {

    private Predicate predicate;

    private Boolean expected;

    public TestJavaPredicate(Predicate predicate, Boolean expected) {
        this.predicate = predicate;
        this.expected = expected;
    }

    @Test
    public void test() throws PredicateExecutionException {
        Assert.assertEquals(expected, predicate.satisfiedBy(null));
    }

    @Parameters
    public static List<Object[]> data() {
        List<Object[]> list = new ArrayList<Object[]>();

        list.add(new Object[] { new InPredicate(new SimpleHasValue<>(5),
                new SimpleHasValue<>(Arrays.asList(new Integer[] { 1, 2, 5 }))), true });
        list.add(new Object[] { new InPredicate(new SimpleHasValue<>(5),
                new SimpleHasValue<>(Arrays.asList(new Integer[] { 1, 2, 3 }))), false });

        list.add(new Object[] { new IsNullPredicate(new SimpleHasValue<Object>("3")), false });
        list.add(new Object[] { new IsNullPredicate(new SimpleHasValue<Object>("")), false });
        list.add(new Object[] { new IsNullPredicate(new SimpleHasValue<Object>(null)), true });

        list.add(new Object[] {
                new EqualsIgnoreCase(new SimpleHasValue<String>("abc"), new SimpleHasValue<String>("abc")), true });
        list.add(new Object[] {
                new EqualsIgnoreCase(new SimpleHasValue<String>("abc"), new SimpleHasValue<String>("AbC")), true });
        list.add(new Object[] {
                new EqualsIgnoreCase(new SimpleHasValue<String>("abc"), new SimpleHasValue<String>("123")), false });
        list.add(new Object[] {
                new EqualsIgnoreCase(new SimpleHasValue<String>(null), new SimpleHasValue<String>(null)), true });
        list.add(new Object[] {
                new EqualsIgnoreCase(new SimpleHasValue<String>("abc"), new SimpleHasValue<String>(null)), false });

        list.add(new Object[] { new SimplePredicate(true).and(new SimplePredicate(false)), false });
        list.add(new Object[] { new SimplePredicate(true).and(new SimplePredicate(true)), true });
        list.add(new Object[] { new SimplePredicate(false).or(new SimplePredicate(false)), false });
        list.add(new Object[] { new SimplePredicate(true).or(new SimplePredicate(false)), true });
        list.add(new Object[] { new SimplePredicate(true).not(), false });
        list.add(new Object[] { new SimplePredicate(false).not(), true });

        list.add(new Object[] { new AndPredicate(), true });
        list.add(new Object[] { new OrPredicate(), true });

        return list;
    }
}
