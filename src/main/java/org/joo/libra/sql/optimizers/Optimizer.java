package org.joo.libra.sql.optimizers;

import org.joo.libra.PredicateContext;
import org.joo.libra.sql.node.ExpressionNode;

public interface Optimizer {

    public OptimizeStatus optimize(ExpressionNode node);

    public void setContext(PredicateContext context);
}
