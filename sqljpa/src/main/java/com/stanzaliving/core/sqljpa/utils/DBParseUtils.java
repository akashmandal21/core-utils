/**
 * 
 */
package com.stanzaliving.core.sqljpa.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.ObjectUtils;

import lombok.experimental.UtilityClass;

/**
 * @author naveen.kumar
 *
 * @date 21-Jan-2020
 *
 **/
@UtilityClass
public class DBParseUtils {

	public Integer getIntegerValue(Object object) {

		Integer value = (Integer) object;

		return ObjectUtils.defaultIfNull(value, 0);
	}

	public Double getDoubleValue(Object object) {

		Double value = (Double) object;

		return ObjectUtils.defaultIfNull(value, 0d);
	}

	public Float getFloatValue(Object object) {

		Float value = (Float) object;

		return ObjectUtils.defaultIfNull(value, 0f);
	}

	public Byte getByteValue(Object object) {

		Byte value = (Byte) object;

		return ObjectUtils.defaultIfNull(value, (byte) 0);
	}

	public Boolean getBooleanValue(Object object) {

		Boolean value = (Boolean) object;

		return ObjectUtils.defaultIfNull(value, false);
	}

	public BigInteger getBigIntegerValue(Object object) {

		BigInteger value = (BigInteger) object;

		return ObjectUtils.defaultIfNull(value, BigInteger.valueOf(0));
	}

	public BigDecimal getBigDecimalValue(Object object) {

		BigDecimal value = (BigDecimal) object;

		return ObjectUtils.defaultIfNull(value, BigDecimal.valueOf(0));
	}

}