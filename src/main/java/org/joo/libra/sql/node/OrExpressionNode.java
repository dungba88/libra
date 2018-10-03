package org.joo.libra.sql.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joo.libra.Predicate;
import org.joo.libra.logic.OrPredicate;

public class OrExpressionNode extends InfixExpressionNode {

    @Override
    public Predicate buildPredicate() {
    	List<Predicate> predicates = compactExpressionPath();
        return new OrPredicate(predicates.toArray(new Predicate[0]));
    }
    
    private List<Predicate> compactExpressionPath() {
		List<Predicate> predicates = new ArrayList<>();
    	Predicate leftPredicate = getLeft().buildPredicate();
    	if (leftPredicate instanceof OrPredicate) {
    		predicates.addAll(Arrays.asList(((OrPredicate) leftPredicate).getPredicates()));
    	} else {
    		predicates.add(leftPredicate);
    	}
    	Predicate rightPredicate = getRight().buildPredicate();
    	if (rightPredicate instanceof OrPredicate) {
    		predicates.addAll(Arrays.asList(((OrPredicate) rightPredicate).getPredicates()));
    	} else {
    		predicates.add(rightPredicate);
    	}
		return predicates;
	}
}