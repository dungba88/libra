package org.joo.libra.text;

import org.joo.libra.common.BinaryPredicate;
import org.joo.libra.common.HasValue;

public class MatchPredicate extends BinaryPredicate<String, String> {

    public MatchPredicate(final HasValue<String> one, final HasValue<String> other) {
        super(one, other);
    }

    @Override
    protected boolean doSatisifiedBy(final String one, final String other) {
        return one.matches(other);
    }
}
