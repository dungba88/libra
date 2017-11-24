package org.joo.libra.sql.node;

import org.joo.libra.Predicate;

public interface ExpressionNode {

    public Predicate buildPredicate();
}