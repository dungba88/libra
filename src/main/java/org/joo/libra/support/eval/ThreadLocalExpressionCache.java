package org.joo.libra.support.eval;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.janino.ExpressionEvaluator;

public class ThreadLocalExpressionCache implements ExpressionEvaluatorCache {

    private ThreadLocal<Map<String, ExpressionEvaluator>> cache = new ThreadLocal<Map<String, ExpressionEvaluator>>() {
        protected Map<String, ExpressionEvaluator> initialValue() {
            return new HashMap<>();
        }
    };

    @Override
    public ExpressionEvaluator get(String variableName) {
        return cache.get().get(variableName);
    }

    @Override
    public void put(String variableName, ExpressionEvaluator evaluator) {
        cache.get().put(variableName, evaluator);
    }
}
