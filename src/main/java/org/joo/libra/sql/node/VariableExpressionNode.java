package org.joo.libra.sql.node;

import java.util.Map;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;
import org.joo.libra.pointer.VariablePredicate;
import org.joo.libra.sql.ObjectUtils;
import org.joo.libra.support.PredicateValueException;

public class VariableExpressionNode implements ExpressionNode, HasValue<Object> {

    private String variableName;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(final String variableName) {
        this.variableName = variableName;
    }

    @Override
    public Object getValue(final PredicateContext context) {
        if (context == null)
            return null;
        Map<String, Object> cachedValues = context.getCachedValues();
        Object value = cachedValues.get(variableName);
        if (value == null) {
            value = getValueNoCache(context);
            cachedValues.put(variableName, value);
        }
        return value;
    }

    private Object getValueNoCache(final PredicateContext context) {
        try {
            return ObjectUtils.getValue(context.getContext(), variableName);
        } catch (ReflectiveOperationException e) {
            throw new PredicateValueException(e);
        }
    }

    @Override
    public Predicate buildPredicate() {
        return new VariablePredicate(this);
    }
    
    public String toString() {
    	return variableName;
    }
}