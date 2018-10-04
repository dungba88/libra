package org.joo.libra.support.exceptions;

/**
 * This exception will be thrown if any exception occurred while evaluating
 * {@link org.joo.libra.Predicate}
 * 
 * @author griever
 *
 */
public class PredicateExecutionException extends RuntimeException {

	private static final long serialVersionUID = 7343742359471386270L;

	public PredicateExecutionException(final String msg, final Throwable cause) {
		super(msg, cause);
	}
}
