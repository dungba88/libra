package org.joo.libra.common;

import org.joo.libra.Predicate;
import org.joo.libra.logic.AndPredicate;
import org.joo.libra.logic.NotPredicate;
import org.joo.libra.logic.OrPredicate;

/**
 * Interface for all composition predicates, according to Specification pattern.
 * It provides <code>and</code>, <code>or</code> and <code>not</code> for easily
 * assembling complicated predicates from basic ones.
 * 
 * @author griever
 *
 */
public interface CompositionPredicate extends Predicate {

    /**
     * Create a new predicate from the current predicate and another predicate. The
     * new predicate will be satisfied if and only if both the current predicate and
     * the other predicate are satisfied.
     * 
     * @param other
     *            the predicate
     * @return new predicate
     */
    public default Predicate and(final Predicate other) {
        return new AndPredicate(this, other);
    }

    /**
     * Create a new predicate from the current predicate and another predicate. The
     * new predicate will be satisfied if and only if either the current predicate
     * or the other predicate is satisfied.
     * 
     * @param other
     *            the predicate
     * @return new predicate
     */
    public default Predicate or(final Predicate other) {
        return new OrPredicate(this, other);
    }

    /**
     * Create a new predicate from the current predicate. The new predicate will be
     * satisfied if and only if the current predicate is not satisfied.
     * 
     * @return new predicate
     */
    public default Predicate not() {
        return new NotPredicate(this);
    }
}
