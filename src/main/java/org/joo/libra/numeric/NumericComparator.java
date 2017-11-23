package org.joo.libra.numeric;

import java.math.BigDecimal;

public class NumericComparator {

    public static int compare(Number one, Number other) {
        return BigDecimal.valueOf(one.doubleValue()).compareTo(BigDecimal.valueOf(other.doubleValue()));
    }
}
