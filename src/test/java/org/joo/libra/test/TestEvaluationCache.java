package org.joo.libra.test;

import org.codehaus.janino.ExpressionEvaluator;
import org.joo.libra.support.eval.EvaluationKey;
import org.joo.libra.support.eval.ExpressionEvaluatorCache;
import org.joo.libra.support.eval.impl.HashMapExpressionCache;
import org.junit.Assert;

public class TestEvaluationCache {

    public void testWithHashMap() {
        ExpressionEvaluatorCache cache = new HashMapExpressionCache();
        EvaluationKey key1 = new EvaluationKey("class1", "var1");
        EvaluationKey key2 = new EvaluationKey("class1", "var1");
        EvaluationKey key3 = new EvaluationKey("class1", "var2");
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        cache.put(key1, evaluator);
        Assert.assertEquals(evaluator, cache.get(key1));
        Assert.assertEquals(evaluator, cache.get(key2));
        Assert.assertNotEquals(evaluator, cache.get(key3));
        Assert.assertNull(cache.get(key3));
    }
}
