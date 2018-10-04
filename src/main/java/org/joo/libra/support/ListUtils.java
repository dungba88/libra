package org.joo.libra.support;

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

	public static boolean contains(final Object[] list, final Object item) {
		if (list == null)
			return false;
		for (Object o : list) {
			if (o != null && o.equals(item))
				return true;
		}
		return false;
	}
}
