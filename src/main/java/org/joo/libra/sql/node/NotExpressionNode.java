package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.logic.NotPredicate;

public class NotExpressionNode extends UnaryExpressionNode {

    @Override
    public Predicate buildPredicate() {
        return new NotPredicate(getInnerNode().buildPredicate());
    }
}