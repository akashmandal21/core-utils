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

	public static double getWeightedAverage(double[] value, int[] weight) {
		int sum = 0;
		double numWeight = 0;

		for (int i = 0; i < value.length; i++) {
			numWeight = numWeight + value[i] * weight[i];
			sum = sum + weight[i];
		}

		return (float) (numWeight) / sum;
	}

	public static double roundDoubleValue(double number, Long decimalPrecision) {
		return number == 0 ? 0 : (double) Math.round(number * decimalPrecision) / decimalPrecision;
	}

	public static double roundDoubleValue(double number) {
		return number == 0 ? 0 : (double) Math.round(number);
	}


}