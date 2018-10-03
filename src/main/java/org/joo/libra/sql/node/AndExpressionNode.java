package org.joo.libra.sql.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joo.libra.Predicate;
import org.joo.libra.logic.AndPredicate;

public class AndExpressionNode extends InfixExpressionNode {

    @Override
    public Predicate buildPredicate() {
    	List<Predicate> predicates = compactExpressionPath();
        return new AndPredicate(predicates.toArray(new Predicate[0]));
    }

	private List<Predicate> compactExpressionPath() {
		List<Predicate> predicates = new ArrayList<>();
    	Predicate leftPredicate = getLeft().buildPredicate();
    	if (leftPredicate instanceof AndPredicate) {
    		predicates.addAll(Arrays.asList(((AndPredicate) leftPredicate).getPredicates()));
    	} else {
    		predicates.add(leftPredicate);
    	}
    	Predicate rightPredicate = getRight().buildPredicate();
    	if (rightPredicate instanceof AndPredicate) {
    		predicates.addAll(Arrays.asList(((AndPredicate) rightPredicate).getPredicates()));
    	} else {
    		predicates.add(rightPredicate);
    	}
		return predicates;
	}
}