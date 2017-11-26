package org.joo.libra.sql;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.MalformedSyntaxException;
import org.joo.libra.support.PredicateExecutionException;

import lombok.Getter;
import lombok.NonNull;

public class SqlPredicate implements CompositionPredicate {

    private boolean error;

    private @Getter MalformedSyntaxException cause;

    private @Getter SqlPredicateParser parser;

    private Predicate predicate;

    public SqlPredicate(final String predicate) {
        this(predicate, new AntlrSqlPredicateParser());
    }

    public SqlPredicate(final String predicate, final @NonNull SqlPredicateParser parser) {
        try {
            this.parser = parser;
            this.predicate = parser.parse(predicate);
        } catch (MalformedSyntaxException ex) {
            error = true;
            cause = ex;
        } catch (Exception ex) {
            error = true;
            cause = new MalformedSyntaxException(ex);
        }
    }

    @Override
    public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
        if (error || predicate == null)
            return false;
        try {
            return predicate != null ? predicate.satisfiedBy(context) : false;
        } catch (Exception ex) {
            throw new PredicateExecutionException("Exception while executing SQL predicate", ex);
        }
    }

    public void checkForErrorAndThrow() {
        if (error)
            throw cause;
    }

    public boolean hasError() {
        return error;
    }
}