package com.stanzaliving.core.base.utils;

import java.util.Objects;

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

		if (Objects.isNull(a) && Objects.isNull(b)) {
			return null;
		}

		if (Objects.isNull(a) && Objects.nonNull(b)) {
			return b;
		}

		if (Objects.isNull(b) && Objects.nonNull(a)) {
			return a;
		}

		return a + b;
	}
}