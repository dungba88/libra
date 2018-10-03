package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.collection.InPredicate;
import org.joo.libra.common.HasValue;

public class InCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<?>> {

    @Override
    public Predicate buildPredicate() {
        return new InPredicate(getLeft(), getRight());
    }
}