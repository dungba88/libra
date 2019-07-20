package org.joo.libra.support.eval;

import org.codehaus.janino.ExpressionEvaluator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompiledJavaEvaluator<T> implements VariableEvaluator {

    private Class<T> type;

    private ExpressionBuilder builder;

    private ExpressionEvaluatorCache cache;

    public CompiledJavaEvaluator(Class<T> type) {
        this(type, new ResolvedExpressionBuilder<>(type), new ThreadLocalExpressionCache());
    }

    @Override
    public Object evaluate(Object obj, String variableName) throws Exception {

        ExpressionEvaluator ee = cache.get(variableName);

        if (ee == null) {
            ee = new ExpressionEvaluator();

            ee.setParameters(new String[] { "obj" }, new Class[] { type });

            ee.setExpressionType(Object.class);

            String expression = builder.build(obj, "obj", variableName);
            ee.cook(expression);

            cache.put(variableName, ee);
        }

        // Eventually we evaluate the expression - and that goes super-fast.
        return ee.evaluate(new Object[] { obj });
    }
}
