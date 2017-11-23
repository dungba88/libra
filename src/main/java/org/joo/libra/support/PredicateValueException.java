package org.joo.libra.support;

public class PredicateValueException extends RuntimeException {

	private static final long serialVersionUID = -1137560262840154627L;

	public PredicateValueException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PredicateValueException(Throwable cause) {
		super(cause);
	}
}
