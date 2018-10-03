package org.joo.libra.support;

/**
 * This exception will be thrown if any exception occurred while parsing
 * {@link org.joo.libra.sql.SQLPredicate}
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
