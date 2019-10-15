/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import lombok.experimental.UtilityClass;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@UtilityClass
public class FinancialYear {

	public static String getFinancialYear() {

		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;

		if (month < 4) {
			year = year - 1;
		}

		return year + "-" + (year + 1);
	}

	public static String getShortFinancialYear() {

		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;

		if (month < 4) {
			year = year - 1;
		}

		return getShortYear(year) + "-" + getShortYear((year + 1));
	}

	public static String getFinancialYearForDate(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;

		if (month < 4) {
			year = year - 1;
		}

		return year + "-" + (year + 1);
	}

	public static String getShortFinancialYearForDate(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;

		if (month < 4) {
			year = year - 1;
		}

		return getShortYear(year) + "-" + getShortYear((year + 1));
	}

	public static String getFinancialYearForDate(LocalDate localdate) {
		return getFinancialYearForDate(DateUtil.convertToDate(localdate));
	}

	public static String getShortFinancialYearForDate(LocalDate date) {
		return getShortFinancialYearForDate(DateUtil.convertToDate(date));
	}

	private static int getShortYear(int year) {
		return year % 100;
	}
}