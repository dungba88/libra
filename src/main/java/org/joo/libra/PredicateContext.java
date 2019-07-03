package org.joo.libra;

import java.util.HashMap;
import java.util.Map;

import org.joo.libra.sql.ObjectUtils;
import org.joo.libra.support.exceptions.PredicateValueException;
import org.joo.libra.support.functions.MultiArgsFunction;

import lombok.Getter;

/**
 * Represents a predicate context. This is used to evaluate the predicate.
 * Generally the context itself is used by
 * {@link org.joo.libra.sql.node.VariableExpressionNode} to resolve the
 * variable. But it can also be used by any custom predicate to hold the value
 * they need while evaluating.
 * 
 * @author griever
 *
 */
public class PredicateContext implements Cloneable {

    @Getter
    private Object context;

    private Map<String, Object> cachedValues;

    private Map<String, MultiArgsFunction> functionMappings;

    private Map<String, Object> tempVariables = new HashMap<>();

    public PredicateContext(final Object context) {
        this.context = context;
        this.cachedValues = new HashMap<>();
    }

    public PredicateContext(final Object context, Map<String, MultiArgsFunction> functionMappings) {
        this.context = context;
        this.cachedValues = new HashMap<>();
        this.functionMappings = functionMappings;
    }

    public Object getVariableValue(final String name, final PredicateContext context) {
        Object value = cachedValues.get(name);
        if (value == null) {
            value = getValueNoCache(name, context);
            cachedValues.put(name, value);
        }
        return value;
    }

    private Object getValueNoCache(final String name, final PredicateContext context) {
        if (tempVariables.containsKey(name))
            return tempVariables.get(name);
        try {
            if (!tempVariables.isEmpty()) {
                Object value = ObjectUtils.getValue(tempVariables, name);
                if (value != null)
                    return value;
            }
        } catch (Exception e) {
            // Nothing to do
        }
        try {
            return ObjectUtils.getValue(context.getContext(), name);
        } catch (ReflectiveOperationException e) {
            throw new PredicateValueException(e);
        }
    }

    public boolean hasCachedValue(final String key) {
        return cachedValues.containsKey(key);
    }

    public MultiArgsFunction getRegisteredFunction(final String name) {
        return functionMappings != null ? functionMappings.get(name) : null;
    }

    public Object getTempVariable(String name) {
        return tempVariables.get(name);
    }

    public void setTempVariable(String name, Object value) {
        tempVariables.put(name, value);
    }

    @Override
    public PredicateContext clone() {
        return new PredicateContext(context, functionMappings);
    }
}
