package com.stanzaliving.core.base.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetAllLocalDatesForRange() {

		LocalDate startDate = LocalDate.of(2018, 06, 21);

		LocalDate endDate = LocalDate.of(2018, 06, 23);

		LocalDate dateBetween = LocalDate.of(2018, 06, 22);

		List<LocalDate> actual = Arrays.asList(startDate, dateBetween, endDate);

		List<LocalDate> expected = DateUtil.getAllLocalDatesForRange(startDate, endDate);

		assertThat(expected).isNotNull().isNotEmpty().hasSize(3);

		assertThat(expected).isEqualTo(actual);
	}

	@Test
	public void testGetAllLocalDatesBetweenRange() {

		LocalDate startDate = LocalDate.of(2018, 06, 21);

		LocalDate endDate = LocalDate.of(2018, 06, 23);

		LocalDate dateBetween = LocalDate.of(2018, 06, 22);

		List<LocalDate> actual = Arrays.asList(startDate, dateBetween);

		List<LocalDate> expected = DateUtil.getAllLocalDatesBetweenRange(startDate, endDate);

		assertThat(expected).isNotNull().isNotEmpty().hasSize(2);

		assertThat(expected).isEqualTo(actual);
	}

	@Test
	public void testGetAllDatesForRange() {

		LocalDate startDate = LocalDate.of(2018, 06, 21);

		LocalDate endDate = LocalDate.of(2018, 06, 23);

		LocalDate dateBetween = LocalDate.of(2018, 06, 22);

		List<Date> actual = Arrays.asList(DateUtil.convertToDate(startDate), DateUtil.convertToDate(dateBetween), DateUtil.convertToDate(endDate));

		List<Date> expected = DateUtil.getAllDatesForRange(startDate, endDate);

		assertThat(expected).isNotNull().isNotEmpty().hasSize(3);

		assertThat(expected).isEqualTo(actual);
	}

	@Test
	public void testGetYesterDateConditation1() {

		Date startDate = DateUtil.convertToDate(LocalDate.of(2018, 06, 21));

		Date yestereday = DateUtil.convertToDate(LocalDate.of(2018, 06, 20));

		assertThat(yestereday).isNotNull().isEqualTo(DateUtil.getYesterDate(startDate));
	}

	@Test
	public void testGetYesterDateConditation2() {

		Date expected = DateUtil.getYesterDate(null);

		assertThat(expected).isNull();
	}

	@Test
	public void testConvertToLocalDateConditation1() {

		LocalDate actual = LocalDate.of(2018, 06, 28);

		LocalDate expected = DateUtil.convertToLocalDate(DateUtil.convertToDate(actual));

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testConvertToLocalDateConditation2() {

		LocalDate expected = DateUtil.convertToLocalDate(null);

		assertThat(expected).isNull();
	}

	@Test
	public void testDaysBetween() {

		long actual = 1L;

		Date date1 = DateUtil.convertToDate(LocalDate.of(2018, 06, 21));

		Date date2 = DateUtil.convertToDate(LocalDate.of(2018, 06, 20));

		long expected = DateUtil.daysBetween(date1, date2);

		assertThat(expected).isNotNull().isEqualTo(actual);
	}

	@Test
	public void testGetMaxDaysInMonth() {
		LocalDate date = LocalDate.of(2018, 05, 15);
		int days = DateUtil.getMaxDaysInMonth(date);
		assertThat(days).isEqualTo(31);
	}

	@Test
	public void testNullCheckGetMaxDaysInMonth() {
		assertThatThrownBy(() -> DateUtil.getMaxDaysInMonth(null)).isInstanceOf(NullPointerException.class);

	}

}