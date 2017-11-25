package org.joo.libra.numeric;

import java.math.BigDecimal;

public class NumericComparator {

    public static int compare(final Number one, final Number other) {
        return BigDecimal.valueOf(one.doubleValue()).compareTo(BigDecimal.valueOf(other.doubleValue()));
    }
}
