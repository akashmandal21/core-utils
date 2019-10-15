package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.Test;

import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.base.utils.FinancialYear;

public class FinancialYearTest {

	@Test
	public void testGetFinancialYear() {

		LocalDate date = LocalDate.now();

		int month = date.getMonthValue();
		int year = date.getYear();

		if (month < 4) {
			year = year - 1;
		}

		String actual = Integer.toString(year) + "-" + Integer.toString(year + 1);

		String expected = FinancialYear.getFinancialYear();

		assertThat(actual).isNotNull().isEqualTo(expected);
	}

	@Test
	public void testGetShortFinancialYear() {

		LocalDate date = LocalDate.now();

		int month = date.getMonthValue();
		int year = date.getYear();

		if (month < 4) {
			year = year - 1;
		}

		String actual = Integer.toString(year % 100) + "-" + Integer.toString((year % 100) + 1);

		String expected = FinancialYear.getShortFinancialYear();

		assertThat(actual).isNotNull().isEqualTo(expected);
	}

	@Test
	public void testGetFinancialYearForDateDateConditaion1() {

		LocalDate date = LocalDate.of(2018, 06, 28);

		int year = date.getYear();

		String actual = Integer.toString(year) + "-" + Integer.toString(year + 1);

		String expected = FinancialYear.getFinancialYearForDate(DateUtil.convertToDate(date));

		assertThat(actual).isNotNull().isEqualTo(expected);
	}

	@Test
	public void testGetFinancialYearForDateDateConditaion2() {

		LocalDate date = LocalDate.of(2019, 01, 02);

		int year = date.getYear() - 1;

		String actual = Integer.toString(year) + "-" + Integer.toString(year + 1);

		String expected = FinancialYear.getFinancialYearForDate(DateUtil.convertToDate(date));

		assertThat(actual).isNotNull().isEqualTo(expected);
	}

	@Test
	public void testGetShortFinancialYearForDateDateConditation1() {

		LocalDate date = LocalDate.of(2018, 06, 28);

		int year = date.getYear();

		String actual = Integer.toString(year % 100) + "-" + Integer.toString((year % 100) + 1);

		String expected = FinancialYear.getShortFinancialYearForDate(DateUtil.convertToDate(date));

		assertThat(actual).isNotNull().isEqualTo(expected);

	}

	@Test
	public void testGetShortFinancialYearForDateDateConditation2() {

		LocalDate date = LocalDate.of(2019, 01, 02);

		int year = date.getYear() - 1;

		String actual = Integer.toString(year % 100) + "-" + Integer.toString((year % 100) + 1);

		String expected = FinancialYear.getShortFinancialYearForDate(DateUtil.convertToDate(date));

		assertThat(actual).isNotNull().isEqualTo(expected);

	}

	@Test
	public void testGetFinancialYearForDateLocalDateConditation1() {

		LocalDate date = LocalDate.of(2018, 06, 28);

		int year = date.getYear();

		String actual = Integer.toString(year) + "-" + Integer.toString(year + 1);

		String expected = FinancialYear.getFinancialYearForDate(date);

		assertThat(actual).isNotNull().isEqualTo(expected);

	}

	@Test
	public void testGetFinancialYearForDateLocalDateConditation2() {

		LocalDate date = LocalDate.of(2019, 01, 02);

		int year = date.getYear() - 1;

		String actual = Integer.toString(year) + "-" + Integer.toString(year + 1);

		String expected = FinancialYear.getFinancialYearForDate(date);

		assertThat(actual).isNotNull().isEqualTo(expected);

	}

	@Test
	public void testGetShortFinancialYearForDateLocalDateConditaion1() {

		LocalDate date = LocalDate.of(2018, 06, 28);

		int year = date.getYear();

		String actual = Integer.toString(year % 100) + "-" + Integer.toString((year % 100) + 1);

		String expected = FinancialYear.getShortFinancialYearForDate(date);

		assertThat(actual).isNotNull().isEqualTo(expected);
	}

	@Test
	public void testGetShortFinancialYearForDateLocalDateConditaion2() {

		LocalDate date = LocalDate.of(2019, 01, 02);

		int year = date.getYear() - 1;

		String actual = Integer.toString(year % 100) + "-" + Integer.toString((year % 100) + 1);

		String expected = FinancialYear.getShortFinancialYearForDate(date);

		assertThat(actual).isNotNull().isEqualTo(expected);
	}

}