package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.common.HasValue;
import org.joo.libra.text.ContainPredicate;

public class ContainsCompareExpressionNode extends AbstractBinaryOpExpressionNode<HasValue<?>> {

    @Override
    public Predicate buildPredicate() {
        return new ContainPredicate(getLeft(), getRight());
    }
}