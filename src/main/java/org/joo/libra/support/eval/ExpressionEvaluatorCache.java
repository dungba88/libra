package org.joo.libra.support.eval;

import org.codehaus.janino.ExpressionEvaluator;

public interface ExpressionEvaluatorCache {

    public ExpressionEvaluator get(EvaluationKey key);

    public void put(EvaluationKey key, ExpressionEvaluator evaluator);
}
