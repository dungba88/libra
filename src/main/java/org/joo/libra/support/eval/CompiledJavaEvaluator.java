package org.joo.libra.support.eval;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.janino.ExpressionEvaluator;

public class CompiledJavaEvaluator<T> implements VariableEvaluator {

    private Class<T> type;

    private ExpressionBuilder builder;

    public CompiledJavaEvaluator(Class<T> type) {
        this(type, new ResolvedExpressionBuilder<>(type));
    }

    public CompiledJavaEvaluator(Class<T> type, ExpressionBuilder builder) {
        this.type = type;
        this.builder = builder;
    }

    private ThreadLocal<Map<String, ExpressionEvaluator>> cachedEvaluator = new ThreadLocal<Map<String, ExpressionEvaluator>>() {
        protected Map<String, ExpressionEvaluator> initialValue() {
            return new HashMap<>();
        }
    };

    @Override
    public Object evaluate(Object obj, String variableName) throws Exception {

        ExpressionEvaluator ee = cachedEvaluator.get().get(variableName);

        if (ee == null) {
            ee = new ExpressionEvaluator();

            ee.setParameters(new String[] { "obj" }, new Class[] { type });

            ee.setExpressionType(Object.class);

            String expression = builder.build(obj, "obj", variableName);
            ee.cook(expression);

            cachedEvaluator.get().put(variableName, ee);
        }

        // Eventually we evaluate the expression - and that goes super-fast.
        return ee.evaluate(new Object[] { obj });
    }
}
