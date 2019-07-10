package org.joo.libra.support.functions.mappings;

import org.joo.libra.support.functions.ConcatFunction;
import org.joo.libra.support.functions.LenFunction;

public class ListFunctions extends Functions {

    private static final ListFunctions instance;

    static {
        instance = new ListFunctions();
        instance.addFunction("len", new LenFunction());
        instance.addFunction("concat", new ConcatFunction());
    }

    public static final ListFunctions getInstance() {
        return instance;
    }
}
