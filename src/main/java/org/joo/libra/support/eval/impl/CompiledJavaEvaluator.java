package org.joo.libra.support.eval.impl;

import org.codehaus.janino.ExpressionEvaluator;
import org.joo.libra.support.eval.EvaluationKey;
import org.joo.libra.support.eval.ExpressionBuilder;
import org.joo.libra.support.eval.ExpressionEvaluatorCache;
import org.joo.libra.support.eval.VariableEvaluator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompiledJavaEvaluator implements VariableEvaluator {

    private ExpressionBuilder builder;

    private ExpressionEvaluatorCache cache;

    public CompiledJavaEvaluator() {
        this(new ResolvedExpressionBuilder(), new HashMapExpressionCache());
    }

    @Override
    public Object evaluate(Object obj, String variableName) throws Exception {

        EvaluationKey key = new EvaluationKey(obj.getClass().getName(), variableName);
        ExpressionEvaluator ee = cache.get(key);

        if (ee == null) {
            ee = new ExpressionEvaluator();

            ee.setParameters(new String[] { "obj" }, new Class[] { obj.getClass() });

            ee.setExpressionType(Object.class);

            String expression = builder.build(obj, "obj", variableName);
            ee.cook(expression);

            cache.put(key, ee);
        }

        // Eventually we evaluate the expression - and that goes super-fast.
        return ee.evaluate(new Object[] { obj });
    }
}
