package org.joo.libra.sql;

import org.joo.libra.Predicate;
import org.joo.libra.support.MalformedSyntaxException;

public interface SqlPredicateParser {

    public Predicate parse(String predicate) throws MalformedSyntaxException;
}
