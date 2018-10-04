package org.joo.libra.support.functions;

import java.util.function.BiFunction;

import org.joo.libra.PredicateContext;

public interface MultiArgsFunction extends BiFunction<PredicateContext, Object[], Object> {

}
