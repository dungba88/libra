package org.joo.libra.support.eval.impl;

import org.codehaus.janino.ExpressionEvaluator;
import org.joo.libra.support.eval.EvaluationKey;
import org.joo.libra.support.eval.ExpressionEvaluatorCache;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalExpressionCache implements ExpressionEvaluatorCache {

    private ThreadLocal<Map<EvaluationKey, ExpressionEvaluator>> cache = ThreadLocal.withInitial(() -> new HashMap<>());

    @Override
    public ExpressionEvaluator get(EvaluationKey variableName) {
        return cache.get().get(variableName);
    }

    @Override
    public void put(EvaluationKey variableName, ExpressionEvaluator evaluator) {
        cache.get().put(variableName, evaluator);
    }
}
