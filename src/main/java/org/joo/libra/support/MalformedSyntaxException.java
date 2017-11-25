package org.joo.libra.support;

public class MalformedSyntaxException extends RuntimeException {

    private static final long serialVersionUID = 7343742359471386270L;

    public MalformedSyntaxException(final String msg) {
        super(msg);
    }

    public MalformedSyntaxException(final Throwable cause) {
        super(cause);
    }
}
