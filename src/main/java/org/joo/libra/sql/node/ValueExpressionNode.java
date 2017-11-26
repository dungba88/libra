package org.joo.libra.sql.node;

import org.joo.libra.PredicateContext;
import org.joo.libra.common.HasValue;

public abstract class ValueExpressionNode<T> implements ExpressionNode, HasValue<T> {

    protected T value;

    @Override
    public T getValue(final PredicateContext context) {
        return value;
    }

    public void setValue(final T value) {
        this.value = value;
    }
}