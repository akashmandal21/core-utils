package com.stanzaliving.core.base.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.enums.DateFormat;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DateUtil {

	public static String customDateFormatter(Date dateInput, DateFormat dateFormat) {

		if (dateInput != null) {
			SimpleDateFormat formatterOutput = new SimpleDateFormat(dateFormat.getValue());
			return formatterOutput.format(dateInput);
		}

		return null;
	}

	public static Date convertToDate(LocalDateTime localdateTime) {
		return Date.from(localdateTime.atZone(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant());
	}

	public static LocalDateTime convertToLocalDateTime(Date date) {
		if (date == null) {
			return null;
		}

		ZoneId zoneId = ZoneId.of(StanzaConstants.IST_TIMEZONE);
		Instant instant = date.toInstant();
		return instant.atZone(zoneId).toLocalDateTime();
	}

	/**
	 * Method to generate a list of all LocalDate between given date range. It includes the startDate and endDate both in list
	 *
	 * @param startDate
	 * @param endDate
	 * @return list of LocalDate including start and end date
	 */
	public static List<LocalDate> getAllLocalDatesForRange(LocalDate startDate, LocalDate endDate) {
		List<LocalDate> dates = new ArrayList<>();

		while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
			dates.add(startDate);
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	public static List<LocalDate> getAllLocalDatesBetweenRange(LocalDate startDate, LocalDate endDate) {
		List<LocalDate> dates = new ArrayList<>();

		while (!startDate.isEqual(endDate)) {
			dates.add(startDate);
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	/**
	 * Method to generate a list of all Date between given date range. It includes the startDate and endDate both in list
	 *
	 * @param startDate
	 * @param endDate
	 * @return list of Date including start and end date
	 */
	public static List<Date> getAllDatesForRange(LocalDate startDate, LocalDate endDate) {
		List<Date> dates = new ArrayList<>();

		while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
			dates.add(DateUtil.convertToDate(startDate));
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	public static List<Date> getAllDatesBetweenRange(LocalDate startDate, LocalDate endDate) {
		List<Date> dates = new ArrayList<>();

		while (startDate.isBefore(endDate)) {
			dates.add(DateUtil.convertToDate(startDate));
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	public static Date getYesterDate(Date date) {
		Date yesterday = null;
		if (date != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, -1);
			yesterday = cal.getTime();
		}
		return yesterday;
	}

	public static Date convertToDate(LocalDate localdate) {

		if (localdate == null) {
			return null;
		}

		return Date.from(localdate.atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant());
	}

	public static LocalDate convertToLocalDate(long timestamp) {
		return Instant.ofEpochMilli(timestamp).atZone(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toLocalDate();
	}

	public static LocalDate convertToLocalDate(Date date) {
		if (date == null) {
			return null;
		}

		if (date instanceof java.sql.Date) {
			return ((java.sql.Date) date).toLocalDate();
		}

		ZoneId zoneId = ZoneId.of(StanzaConstants.IST_TIMEZONE);
		Instant instant = date.toInstant();
		return instant.atZone(zoneId).toLocalDate();
	}

	public static long daysBetween(Date one, Date two) {
		long difference = ((one.getTime() - two.getTime()) / StanzaConstants.MILLI_SECONDS_IN_DAY);
		return Math.abs(difference);
	}

	public static int getMaxDaysInMonth(LocalDate date) {
		return date.lengthOfMonth();
	}

	public static Date getLaterDate(Date d1, Date d2) {

		if (d1 == null && d2 == null) {
			return null;
		}

		if (d1 == null) {
			return d2;
		}

		if (d2 == null) {
			return d1;
		}

		return d1.after(d2) ? d1 : d2;
	}

	public static LocalDate getLaterLocalDate(LocalDate d1, LocalDate d2) {

		if (d1 == null && d2 == null) {
			return null;
		}

		if (d1 == null) {
			return d2;
		}

		if (d2 == null) {
			return d1;
		}

		return d1.isAfter(d2) ? d1 : d2;
	}
}