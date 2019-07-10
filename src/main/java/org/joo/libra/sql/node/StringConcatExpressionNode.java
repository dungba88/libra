package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.DerivedLiteralPredicate;
import org.joo.libra.common.HasValue;

public class StringConcatExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<String>>
        implements HasValue<String> {

    @Override
    public Predicate buildPredicate() {
        return new DerivedLiteralPredicate<String>(this, value -> value != null && !value.isEmpty());
    }

    @Override
    public String getValue(final PredicateContext context) {
        String left = String.valueOf(getLeft().getValue(context));
        String right = String.valueOf(getRight().getValue(context));
        return left + right;
    }

    public String toString() {
        return getLeft() + " + " + getRight();
    }
}