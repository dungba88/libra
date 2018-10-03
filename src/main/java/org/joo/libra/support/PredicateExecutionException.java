package org.joo.libra.support;

/**
 * This exception will be thrown if any exception occurred while evaluating
 * {@link org.joo.libra.Predicate}
 * 
 * @author griever
 *
 */
public class PredicateExecutionException extends Exception {

    private static final long serialVersionUID = 7343742359471386270L;

    public PredicateExecutionException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
