package org.joo.libra.support.eval.impl;

import org.codehaus.janino.ExpressionEvaluator;
import org.joo.libra.support.eval.EvaluationKey;
import org.joo.libra.support.eval.ExpressionEvaluatorCache;

import java.util.HashMap;
import java.util.Map;

public class HashMapExpressionCache implements ExpressionEvaluatorCache {

    private Map<EvaluationKey, ExpressionEvaluator> cache = new HashMap<>();

    @Override
    public void put(EvaluationKey key, ExpressionEvaluator value) {
        cache.put(key, value);
    }

    @Override
    public ExpressionEvaluator get(EvaluationKey variableName) {
        return cache.get(variableName);
    }
}
