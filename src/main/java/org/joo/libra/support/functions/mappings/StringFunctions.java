package org.joo.libra.support.functions.mappings;

import org.joo.libra.support.functions.ConcatFunction;
import org.joo.libra.support.functions.LenFunction;

public class StringFunctions extends Functions {

    private static final StringFunctions instance;

    static {
        instance = new StringFunctions();
        instance.addFunction("len", new LenFunction());
        instance.addFunction("concat", new ConcatFunction());
    }

    public static final StringFunctions getInstance() {
        return instance;
    }
}
