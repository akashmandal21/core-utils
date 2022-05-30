package com.stanzaliving.core.base.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NumberUtils {

	public static boolean parsableToInteger;
    private NumberFormat india = null;
	static {
		Locale indiaLocale = new Locale("en", "IN");

		india = NumberFormat.getCurrencyInstance(indiaLocale);

	}

	public String getOrdinalNumber(Integer n) {
		String suffix;
		switch (n % 10) {
		case 1:
			suffix = "st";
			break;
		case 2:
			suffix = "nd";
			break;
		case 3:
			suffix = "rd";
			break;
		default:
			suffix = "th";
		}
		if (n >= 11 && n <= 13) {
			suffix = "th";
		}
		return n.toString() + suffix;
	}

	public boolean parsableToLong(String number) {
		if (StringUtils.isEmpty(number)) {
			return false;
		}
		try {
			Long.parseLong(number);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public boolean parsableToInteger(String number) {
		if (StringUtils.isEmpty(number)) {
			return false;
		}
		try {
			Integer.parseInt(number);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public boolean parseableToDouble(String number) {
		if (StringUtils.isEmpty(number)) {
			return false;
		}
		try {
			Double.parseDouble(number);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

	public static List<Object> convertBigIntegerAndBigDecimal(Object[] record) {
		List<Object> updatedRecord = new ArrayList<>(record.length);
		Object updatedObject;

		for (Object object : record) {
			updatedObject = (null == object) ? object
					: object instanceof BigDecimal ? ((BigDecimal) object).doubleValue()
							: object instanceof BigInteger ? ((BigInteger) object).intValue() : object;
			updatedRecord.add(updatedObject);
		}
		return updatedRecord;
	}

	public static String getIndianFormat(Double amount) {
		
		if(Objects.isNull(amount)) {
			return null;
		}
		
		int intamount = amount.intValue();
		
		return india.format(intamount);
	}

	//This function is same as round function but
	//when we have the values like 0.5, 1.5, 2.5, 3.5 ,...
	//then it always returns ceil value of the number.
	//ex - 1.4 -> 1
	//ex - 1.5 -> 2
	//ex - 1.8 -> 2
	public static int getRoundOff(double value){
		double number = Math.floor(value);
		if(value - number < 0.5){
			return (int)number;
		}
		return (int) number +1;
	}


	public static boolean isEqualDouble(Double firstDouble, Double secondDouble) {
		if (null == firstDouble && null == secondDouble) {
			return true;
		}
		if (null == firstDouble || null == secondDouble) {
			return false;
		}
		return Math.abs(firstDouble - secondDouble) < 0.001;
	}

	public static Double sumDouble(Double firstDouble, Double secondDouble) {
		if (null == firstDouble && null == secondDouble) {
			return null;
		}
		if (null == firstDouble) {
			return secondDouble;
		}
		if (null == secondDouble) {
			return firstDouble;
		}
		return firstDouble + secondDouble;
	}

	public int getNonNullIntegerValue(Integer number) {
		return number!=null?number:0;
	}
}
