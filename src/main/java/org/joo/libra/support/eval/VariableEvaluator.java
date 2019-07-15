package org.joo.libra.support.eval;

public interface VariableEvaluator {

    public Object evaluate(Object obj, String variableName) throws Exception;
}
