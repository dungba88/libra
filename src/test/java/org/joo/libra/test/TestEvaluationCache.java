package org.joo.libra.test;

import org.codehaus.janino.ExpressionEvaluator;
import org.joo.libra.support.eval.EvaluationKey;
import org.joo.libra.support.eval.ExpressionEvaluatorCache;
import org.joo.libra.support.eval.impl.HashMapExpressionCache;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestEvaluationCache {

    @Test
    public void testWithHashMap() {
        ExpressionEvaluatorCache cache = new HashMapExpressionCache();
        EvaluationKey key1 = new EvaluationKey(String.class, "var1");
        EvaluationKey key2 = new EvaluationKey(String.class, "var1");
        EvaluationKey key3 = new EvaluationKey(String.class, "var2");
        EvaluationKey key4 = new EvaluationKey(Object.class, "var1");
        ExpressionEvaluator evaluator = Mockito.mock(ExpressionEvaluator.class);
        cache.put(key1, evaluator);
        Assert.assertEquals(evaluator, cache.get(key1));
        Assert.assertEquals(evaluator, cache.get(key2));
        Assert.assertNotEquals(evaluator, cache.get(key3));
        Assert.assertNull(cache.get(key3));
        Assert.assertNotEquals(evaluator, cache.get(key4));
        Assert.assertNull(cache.get(key4));
        cache.put(key4, Mockito.mock(ExpressionEvaluator.class));
        Assert.assertNotEquals(evaluator, cache.get(key4));
        Assert.assertNotNull(cache.get(key4));
    }
}
