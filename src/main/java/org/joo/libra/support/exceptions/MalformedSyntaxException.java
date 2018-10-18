package org.joo.libra.support.exceptions;

/**
 * This exception will be thrown if any exception occurred while parsing
 * 
 * @author griever
 *
 */
public class MalformedSyntaxException extends RuntimeException {

	private static final long serialVersionUID = 7343742359471386270L;

	public MalformedSyntaxException(final String msg) {
		super(msg);
	}

	public MalformedSyntaxException(final Throwable cause) {
		super(cause);
	}
}
