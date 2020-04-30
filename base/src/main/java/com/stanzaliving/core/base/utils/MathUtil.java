package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MathUtil {

	public Double getAverage(Double... list) {
		Double average = 0.0;
		Integer count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				average += list[i];
				count += 1;
			}
		}
		return average / count;

	}
}
