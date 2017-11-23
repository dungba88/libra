package org.joo.libra.sql;

import org.joo.libra.PredicateContext;

public interface Optimizer {

	public OptimizeStatus optimize(ExpressionNode node);

	public void setContext(PredicateContext context);
}
