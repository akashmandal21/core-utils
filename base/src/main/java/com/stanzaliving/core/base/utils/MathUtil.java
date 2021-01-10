package com.stanzaliving.core.base.utils;

import org.apache.commons.lang3.ObjectUtils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MathUtil {

	public Double getAverage(Double... list) {
		Double sum = 0.0;
		Integer count = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				sum += list[i];
				count += 1;
			}
		}

		if (count <= 0) {
			return 0d;
		}

		return sum / count;

	}

	public Integer add(Integer a, Integer b) {

		return ObjectUtils.defaultIfNull(a, 0) + ObjectUtils.defaultIfNull(b, 0);

	}

}