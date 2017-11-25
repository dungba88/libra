package org.joo.libra;

import java.util.HashMap;
import java.util.Map;

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
