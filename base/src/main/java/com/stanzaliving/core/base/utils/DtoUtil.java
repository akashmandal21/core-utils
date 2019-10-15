package com.stanzaliving.core.base.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import lombok.experimental.UtilityClass;

import java.beans.FeatureDescriptor;
import java.util.stream.Stream;

@UtilityClass
public class DtoUtil {

	private static final Logger logger = Logger.getLogger(DtoUtil.class);

	public static <T> T nonNullValue(T value, T defaultValue) {
		if (value != null) {
			return value;
		}

		return defaultValue;
	}

	/**
	 * Convert the given object into the specified class type object.
	 *
	 * @param source
	 *            object to be converted
	 * @param clazz
	 *            Target class name
	 * @return object of target class
	 */
	public static <T, S> S convertByCopy(T source, Class<S> clazz) {
		try {
			S objNew = clazz.newInstance();
			BeanUtils.copyProperties(source, objNew, getNullPropertyNames(source));
			return objNew;
		} catch (IllegalAccessException
				| InstantiationException e) {
			logger.error("Error converting " + source.getClass().getName() + " to " + clazz.getName(), e);
			return null;
		}
	}

	/**
	 * Paste all the non null objects from source to destination object.
	 *
	 * @param source
	 *            object to be converted
	 * @return object of target class
	 */
	public static <T, S> S createObjectByCopying(T source, S dest) {
		BeanUtils.copyProperties(source, dest, getNullPropertyNames(source));
		return dest;
	}

	public static String[] getNullPropertyNames(Object source) {
		final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
		return Stream.of(wrappedSource.getPropertyDescriptors())
				.map(FeatureDescriptor::getName)
				.filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
				.toArray(String[]::new);
	}
}