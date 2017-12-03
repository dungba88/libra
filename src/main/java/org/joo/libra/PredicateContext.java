package org.joo.libra;

import java.util.HashMap;
import java.util.Map;

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
public class PredicateContext {

    private Object context;

    private Map<String, Object> cachedValues;

    public PredicateContext(final Object context) {
        this.context = context;
        this.cachedValues = new HashMap<>();
    }

    public Object getContext() {
        return context;
    }

    public Map<String, Object> getCachedValues() {
        return cachedValues;
    }

    public boolean hasCachedValue(final String key) {
        return cachedValues.containsKey(key);
    }
}
