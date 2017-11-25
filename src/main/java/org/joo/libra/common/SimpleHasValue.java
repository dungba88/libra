package org.joo.libra.common;

import org.joo.libra.PredicateContext;

public class SimpleHasValue<T> implements HasValue<T> {

    private T value;

    public SimpleHasValue(final T value) {
        this.value = value;
    }

    @Override
    public T getValue(final PredicateContext context) {
        return value;
    }
}
