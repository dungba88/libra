package org.joo.libra.support.eval;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.janino.ExpressionEvaluator;

public class HashMapExpressionCache implements ExpressionEvaluatorCache {

    private Map<String, ExpressionEvaluator> cache = new HashMap<>();

    public void put(String key, ExpressionEvaluator value) {
        cache.put(key, value);
    }

    @Override
    public ExpressionEvaluator get(String variableName) {
        return cache.get(variableName);
    }
}
