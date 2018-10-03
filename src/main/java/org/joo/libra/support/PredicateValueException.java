package org.joo.libra.support;

/**
 * This exception will be thrown if any exception occurred while getting the
 * value.
 * 
 * @author griever
 *
 */
public class PredicateValueException extends RuntimeException {

    private static final long serialVersionUID = -1137560262840154627L;

    public PredicateValueException(final Throwable cause) {
        super(cause);
    }
}
