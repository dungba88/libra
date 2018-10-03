package org.joo.libra.sql;

import org.joo.libra.Predicate;
import org.joo.libra.PredicateContext;
import org.joo.libra.common.CompositionPredicate;
import org.joo.libra.support.MalformedSyntaxException;
import org.joo.libra.support.PredicateExecutionException;

import lombok.Getter;
import lombok.NonNull;

/**
 * Represents a SQL-syntax predicate. It will parse the given string using a
 * specified grammar.
 * 
 * @author griever
 *
 */
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
        if (this.predicate == null) {
        	error = true;
        	cause = new MalformedSyntaxException("Predicate cannot be parsed");
        }
    }
    
    @Override
    public boolean satisfiedBy(final PredicateContext context) throws PredicateExecutionException {
        if (error || predicate == null)
            return false;
        try {
            return predicate.satisfiedBy(context);
        } catch (Exception ex) {
            throw new PredicateExecutionException("Exception while executing SQL predicate", ex);
        }
    }

    /**
     * Check if there is any error while parsing the SQL and throw it.
     */
    public void checkForErrorAndThrow() {
        if (error)
            throw cause;
    }

    /**
     * Check if there is any error while parsing the SQL.
     * 
     * @return true if and only if any error occurred while parsing the SQL.
     */
    public boolean hasError() {
        return error;
    }
    
    public String toString() {
    	if (error)
    		return "#ERROR#";
    	return predicate.toString();
    }
}