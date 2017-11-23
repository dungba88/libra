package org.joo.libra.sql.node;

import org.joo.libra.Predicate;
import org.joo.libra.logic.AndPredicate;

public class AndExpressionNode extends InfixExpressionNode {

	@Override
	public Predicate buildPredicate() {
		return new AndPredicate(getLeft().buildPredicate(), getRight().buildPredicate());
	}
}