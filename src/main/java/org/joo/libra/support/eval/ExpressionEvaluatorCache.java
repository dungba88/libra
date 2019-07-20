package org.joo.libra.support.eval;

import org.codehaus.janino.ExpressionEvaluator;

public interface ExpressionEvaluatorCache {

    public ExpressionEvaluator get(String variableName);
    
    public void put(String variableName, ExpressionEvaluator evaluator);
}
