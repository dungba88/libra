package org.joo.libra.common;

import org.joo.libra.PredicateContext;

public interface HasValue<T> {

    public T getValue(final PredicateContext context);
}
