package org.joo.libra.support.functions.mappings;

import org.joo.libra.support.functions.RandFunction;
import org.joo.libra.support.functions.SqrtFunction;

public class MathFunctions extends Functions {

    private static final MathFunctions instance;

    static {
        instance = new MathFunctions();
        instance.addFunction("sqrt", new SqrtFunction());
        instance.addFunction("rand", new RandFunction());
    }

    public static final MathFunctions getInstance() {
        return instance;
    }

    private MathFunctions() {
        // Nothing to do here
    }
}
