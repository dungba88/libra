package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.logic.OrPredicate;

public class OrExpressionNode extends InfixExpressionNode {

	@Override
	public Predicate buildPredicate() {
		return new OrPredicate(getLeft().buildPredicate(), getRight().buildPredicate());
	}
}