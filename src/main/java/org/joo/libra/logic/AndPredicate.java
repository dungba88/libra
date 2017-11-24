package org.joo.libra.logic;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.PredicateExecutionException;

public class AndPredicate extends CompositionPredicate {

    private Predicate[] predicates;

    @SafeVarargs
    public AndPredicate(Predicate... predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean satisfiedBy(PredicateContext context) throws PredicateExecutionException {
        for (Predicate predicate : predicates) {
            if (!predicate.satisfiedBy(context))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
    	try {
			new AndPredicate().satisfiedBy(null);
		} catch (PredicateExecutionException e) {
			e.printStackTrace();
		}
    }
}
