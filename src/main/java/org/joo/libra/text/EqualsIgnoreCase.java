package org.joo.libra.text;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

/**
 * Represents a textual <code>equals ignore case</code> predicate.
 * 
 * @author griever
 *
 */
public class EqualsIgnoreCase extends BinaryPredicate<String, String> {

    public EqualsIgnoreCase(final HasValue<String> one, final HasValue<String> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final String one, final String other) {
        return one.equalsIgnoreCase(other);
    }
}
