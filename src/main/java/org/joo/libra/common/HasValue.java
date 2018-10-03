package org.joo.libra.common;

import org.joo.libra.PredicateContext;

/**
 * Represents anything which can have a value
 * 
 * @author griever
 *
 * @param <T>
 *            the class type of the value
 */
public interface HasValue<T> {

    /**
     * Get the value this object is holding using a given context
     * 
     * @param context
     *            the context
     * @return the value this object is currently holding
     */
    public T getValue(final PredicateContext context);
}
