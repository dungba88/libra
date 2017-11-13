package org.joo.libra.sql;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

public class ObjectUtils {

	public static Object getValue(Object obj, String variableName) throws ReflectiveOperationException {
		if (obj == null || variableName == null)
			return null;
		try {
			return PropertyUtils.getNestedProperty(obj, variableName);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			throw e;
		}
	}
}
