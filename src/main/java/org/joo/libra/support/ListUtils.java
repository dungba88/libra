package org.joo.libra.support;

import java.util.Collection;

/**
 * Utility class for comparing numbers. Both numbers will be converted into
 * BigDecimal before comparing.
 * 
 * @author griever
 *
 */
public class ListUtils {

    private ListUtils() {

    }

    public static boolean contains(Collection<?> list, Object item) {
        if (list == null)
            return false;
        for (Object o : list) {
            if (GenericComparator.compare(o, item))
                return true;
        }
        return false;
    }
}
