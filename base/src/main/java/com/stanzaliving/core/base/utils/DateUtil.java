package com.stanzaliving.core.base.utils;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.stanzaliving.core.base.StanzaConstants;
import com.stanzaliving.core.base.enums.DateFormat;
import com.stanzaliving.core.base.enums.DatePart;
import static com.google.common.base.Preconditions.*;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

@Log4j2
@UtilityClass
public class DateUtil {
	
	public String formatIst(Date date, String format) {
		return Instant.ofEpochMilli(date.getTime()).atZone(StanzaConstants.IST_TIMEZONEID).format(DateTimeFormatter.ofPattern(format));
	}
	
	public String customDateFormatter(Date dateInput, DateFormat dateFormat) {

		if (dateInput != null) {
			SimpleDateFormat formatterOutput = new SimpleDateFormat(dateFormat.getValue());
			return formatterOutput.format(dateInput);
		}

		return null;
	}

	public String customDateFormatter(LocalDate dateInput, DateFormat dateFormat) {

		if (dateInput != null) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat.getValue());
			return formatter.format(dateInput);
		}

		return null;
	}

	public String convertLocalDateTimeToDateFormatString(LocalDateTime localDateTime, DateFormat dateFormat) {

		if (localDateTime != null) {
			Date date = convertToDate(localDateTime);
			return customDateFormatter(date, dateFormat);
		}

		return null;

	}

	public Date customDateParser(String dateInput, DateFormat dateFormat) {

		if (dateInput != null) {
			SimpleDateFormat formatterOutput = new SimpleDateFormat(dateFormat.getValue());
			try {
				return formatterOutput.parse(dateInput);
			} catch (ParseException e) {
				// Ignore
			}
		}

		return null;
	}

	public String changeDateFormat(String dateInput, DateFormat inputDateFormat, DateFormat outputDateFormat) {

		if (dateInput != null) {
			SimpleDateFormat formatterOutput = new SimpleDateFormat(inputDateFormat.getValue());
			try {
				return customDateFormatter(formatterOutput.parse(dateInput), outputDateFormat);
			} catch (ParseException e) {
				// Ignore
			}
		}

		return null;
	}

	public Date convertToDate(LocalDateTime localdateTime) {
		return Date.from(localdateTime.atZone(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant());
	}

	public LocalDateTime convertToLocalDateTime(Date date) {
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
	public List<LocalDate> getAllLocalDatesForRange(LocalDate startDate, LocalDate endDate) {
		List<LocalDate> dates = new ArrayList<>();

		while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
			dates.add(startDate);
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	public List<LocalDate> getAllLocalDatesBetweenRange(LocalDate startDate, LocalDate endDate) {
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
	public List<Date> getAllDatesForRange(LocalDate startDate, LocalDate endDate) {
		List<Date> dates = new ArrayList<>();

		while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
			dates.add(DateUtil.convertToDate(startDate));
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	public List<Date> getAllDatesBetweenRange(LocalDate startDate, LocalDate endDate) {
		List<Date> dates = new ArrayList<>();

		while (startDate.isBefore(endDate)) {
			dates.add(DateUtil.convertToDate(startDate));
			startDate = startDate.plusDays(1);
		}

		return dates;
	}

	public Date getYesterDate(Date date) {
		Date yesterday = null;
		if (date != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, -1);
			yesterday = cal.getTime();
		}
		return yesterday;
	}

	public Date convertToDate(LocalDate localdate) {

		if (localdate == null) {
			return null;
		}

		return Date.from(localdate.atStartOfDay(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant());
	}

	public LocalDate convertToLocalDate(long timestamp) {
		return Instant.ofEpochMilli(timestamp).atZone(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toLocalDate();
	}

	public Date convertToDate(LocalTime localTime) {

		if (localTime == null) {
			return null;
		}

		return Date.from(localTime.atDate(LocalDate.now()).atZone(ZoneId.of(StanzaConstants.IST_TIMEZONE)).toInstant());
	}

	public Integer yearsBetween(LocalDate one, LocalDate two) {

		if (Objects.isNull(one) || Objects.isNull(two)) {
			return null;
		}

		return Period.between(one, two).getYears();
	}

	public LocalDate convertToLocalDate(Date date) {
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
	
	public boolean isLocalDateExpired(LocalDate localDate) {
		ZoneId zoneId = ZoneId.of(StanzaConstants.IST_TIMEZONE);
		return localDate.isBefore(LocalDate.now(zoneId));
	}

	public LocalTime convertToLocalTime(Date date) {
		if (date == null) {
			return null;
		}

		if (date instanceof java.sql.Date) {
			return new Time(((java.sql.Date) date).getTime()).toLocalTime();
		}

		ZoneId zoneId = ZoneId.of(StanzaConstants.IST_TIMEZONE);
		Instant instant = date.toInstant();
		return instant.atZone(zoneId).toLocalTime();
	}

	public long daysBetween(Date one, Date two) {
		long difference = ((one.getTime() - two.getTime()) / StanzaConstants.MILLI_SECONDS_IN_DAY);
		return Math.abs(difference);
	}

	public int getMaxDaysInMonth(LocalDate date) {
		return date.lengthOfMonth();
	}

	public int getDaysInCurrentMonth() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public int getMTDDaysCount() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	public Date getLaterDate(Date d1, Date d2) {

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

	public LocalDate getLaterLocalDate(LocalDate d1, LocalDate d2) {

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

	public LocalDate getEarlierLocalDate(LocalDate d1, LocalDate d2) {

		if (d1 == null && d2 == null) {
			return null;
		}

		if (d1 == null) {
			return d2;
		}

		if (d2 == null) {
			return d1;
		}

		return d1.isAfter(d2) ? d2 : d1;
	}

	public List<String> getListOfMonths(LocalDate startDate, LocalDate endDate) {
		LinkedHashSet<String> monthsList = new LinkedHashSet<>();
		for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
			monthsList.add(customDateFormatter(date, DateFormat.MONTH_FULL_NAME));
		}
		return new ArrayList<>(monthsList);
	}

	public List<String> getYearWeekSqlListOfWeeks(LocalDate startDate, LocalDate endDate) {
		LinkedHashSet<String> weeksList = new LinkedHashSet<>();
		for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
			Integer weekNumber = Integer.parseInt(customDateFormatter(date, DateFormat.WEEK_OF_YEAR));
			String week;
			if (weekNumber < 10) {
				week = "0" + weekNumber.toString();
			} else {
				week = weekNumber.toString();
			}
			weeksList.add(customDateFormatter(date, DateFormat.YEAR_IN_WEEK_OF_YEAR) + week);
		}

		return new ArrayList<>(weeksList);
	}

	public List<String> getFormattedListOfWeeksFromWeekOne(LocalDate startDate, LocalDate endDate) {
		List<String> weeksList = getYearWeekSqlListOfWeeks(startDate, endDate);

		List<String> weekListInFromOne = new ArrayList<>();
		for (Integer i = 1; i <= weeksList.size(); i++) {
			weekListInFromOne.add("Week " + i.toString());
		}

		return weekListInFromOne;
	}

	public List<String> getListOfDates(LocalDate startDate, LocalDate endDate) {
		LinkedHashSet<String> dateList = new LinkedHashSet<>();
		for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
			dateList.add(customDateFormatter(date, DateFormat.YYYY_HIFEN_MM_HIFEN_DD));
		}
		return new ArrayList<>(dateList);
	}

	public Integer getCountOfDates(LocalDate startDate, LocalDate endDate) {
		return getListOfDates(startDate, endDate).size();
	}

	public LocalDate getCurrentMonthStartDate() {
		return getMonthStartDate(LocalDate.now());
	}

	public LocalDate getMonthStartDate(LocalDate localDate) {
		return localDate.withDayOfMonth(1);
	}

	public LocalDate getCurrentMonthEndDate() {
		return YearMonth.now().atEndOfMonth();
	}

	public LocalDate getMonthEndDate(LocalDate localDate) {
		return YearMonth.from(localDate).atEndOfMonth();
	}

	public Date getNMinutesBackTime(Integer minutes) {
		return getNMinutesBackTime(new Date(), minutes);
	}

	public Date getNMinutesBackTime(Date date, Integer minutes) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -(minutes));
		return cal.getTime();
	}

	public static Date addToDate(Date dateToBeAdjusted, Integer days, Integer months, Integer  years, Boolean normalizeDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateToBeAdjusted);
		if (normalizeDate) {
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MILLISECOND, 0);
		}
		if (days != null) {
			calendar.add(Calendar.DAY_OF_MONTH, days);
		}
		if (months != null) {
			calendar.add(Calendar.MONTH, months);
		}
		if (years != null) {
			calendar.add(Calendar.YEAR, years);
		}
		return calendar.getTime();
	}
	public Date getFormatedCleanDate(Date date, String format) {

		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String dateString = dateFormat.format(date);
		Date formatedDate = date;
		try {
			formatedDate = dateFormat.parse(dateString);
		} catch (ParseException e) {
			log.error("Exception while parsing date", e);
		}
		return formatedDate;
	}

	public Date customiseDateTime(Date date, int hour, int min, int seconds) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, min);
		cal.set(Calendar.SECOND, seconds);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public Date putTimeIntoDate(Date date, Date timeDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, getPartsFromDate(timeDate, DatePart.HOUR));
		calendar.set(Calendar.MINUTE, getPartsFromDate(timeDate, DatePart.MINUTE));
		calendar.set(Calendar.SECOND, getPartsFromDate(timeDate, DatePart.SECOND));
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public int getPartsFromDate(Date date, DatePart datePart) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int requiredValue;
		switch (datePart) {
			case YEAR:
				requiredValue = cal.get(Calendar.YEAR);
				break;
			case MONTH:
				requiredValue = cal.get(Calendar.MONTH);
				break;
			case DATE:
				requiredValue = cal.get(Calendar.DATE);
				break;
			case HOUR:
				requiredValue = cal.get(Calendar.HOUR_OF_DAY);
				break;
			case MINUTE:
				requiredValue = cal.get(Calendar.MINUTE);
				break;
			case SECOND:
				requiredValue = cal.get(Calendar.SECOND);
			default:
				requiredValue = 0;
		}
		return requiredValue;
	}

	public LocalDate getMonthStartBeginningDate(Integer month, Integer year) {

		return LocalDate.of(year, month, 1);
	}

	public LocalDate getMonthEndBeginningDate(Integer month, Integer year) {
		LocalDate date = LocalDate.of(year, month, 1);
		return date.withDayOfMonth(date.lengthOfMonth());
	}

	public Date getTodayEndDate() {

		LocalDateTime today = LocalDateTime.now().withHour(23).withMinute(59).withSecond(59);

		return convertToDate(today);
	}

	public Date addDaysToDate(Date d1, long days) {
		long ltime = d1.getTime() + days * 24 * 60 * 60 * 1000;
		Date newdate = new Date(ltime);
		return newdate;
	}

	public Date addDayAndSetHour(Integer days, Integer hour) {

		LocalDateTime tomorrow = LocalDateTime.now().plusDays(days);
		tomorrow.withHour(hour);
		tomorrow.withMinute(0);
		tomorrow.withSecond(0);

		return convertToDate(tomorrow);
	}

	public int getLeaderboardWeekNumberForDate(LocalDate localDate) {

		int weekNumber = 1;

		if (localDate.getDayOfMonth() >= 22) {
			weekNumber = 4;
		} else if (localDate.getDayOfMonth() >= 15) {
			weekNumber = 3;
		} else if (localDate.getDayOfMonth() >= 8) {
			weekNumber = 2;
		}

		return weekNumber;
	}
	
	public static Map<String, LocalDate> getStartAndEndDateForFoodOrder(Integer week, LocalDate date) {

		Map<String, LocalDate> dateMap = new HashMap<>();
		if (week == 1) {
			dateMap.put("startDate", date.withDayOfMonth(1));
			dateMap.put("endDate", date);
			return dateMap;
		} else if (week == 2) {
			dateMap.put("startDate", date.withDayOfMonth(8));
			dateMap.put("endDate", date);
			return dateMap;
		} else if (week == 3) {
			dateMap.put("startDate", date.withDayOfMonth(15));
			dateMap.put("endDate", date);
			return dateMap;
		} else {
			dateMap.put("startDate", date.withDayOfMonth(22));
			dateMap.put("endDate", date);
			return dateMap;
		}
	}
	
	public static List<LocalDate> getWeekFirstAndLastDaysForLeaderboard(LocalDate date) {

		List<LocalDate> weekFirstAndLastDays = new ArrayList<>();
		Integer dayOfMonth = date.getDayOfMonth();

		if (dayOfMonth >= 1 && dayOfMonth <= 7) {
			weekFirstAndLastDays.add(date.withDayOfMonth(1));
			weekFirstAndLastDays.add(date.withDayOfMonth(7));
			return weekFirstAndLastDays;
		} else if (dayOfMonth >= 8 && dayOfMonth <= 14) {
			weekFirstAndLastDays.add(date.withDayOfMonth(8));
			weekFirstAndLastDays.add(date.withDayOfMonth(14));
			return weekFirstAndLastDays;
		} else if (dayOfMonth >= 15 && dayOfMonth <= 21) {
			weekFirstAndLastDays.add(date.withDayOfMonth(15));
			weekFirstAndLastDays.add(date.withDayOfMonth(21));
			return weekFirstAndLastDays;
		} else {
			weekFirstAndLastDays.add(date.withDayOfMonth(22));
			weekFirstAndLastDays.add(date.withDayOfMonth(date.lengthOfMonth()));
			return weekFirstAndLastDays;
		}
	}
	
	public static List<LocalDate> getFirstAndTillDayOfCurrentWeekForLeaderboard(LocalDate date) {

		List<LocalDate> firstAndTillDayOfCurrentWeek = new ArrayList<>();
		Integer dayOfMonth = date.getDayOfMonth();

		if (dayOfMonth >= 1 && dayOfMonth <= 7) {
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(1));
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(7));
			return firstAndTillDayOfCurrentWeek;
		} else if (dayOfMonth >= 8 && dayOfMonth <= 14) {
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(8));
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(14));
			return firstAndTillDayOfCurrentWeek;
		} else if (dayOfMonth >= 15 && dayOfMonth <= 21) {
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(15));
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(21));
			return firstAndTillDayOfCurrentWeek;
		} else {
			firstAndTillDayOfCurrentWeek.add(date.withDayOfMonth(22));
			firstAndTillDayOfCurrentWeek.add(date);
			return firstAndTillDayOfCurrentWeek;
		}

	}

	public String getDatePhrase(LocalDate localDate) {

		if (localDate.getDayOfMonth() == 1 || localDate.getDayOfMonth() == 21 || localDate.getDayOfMonth() == 31) {

			return "st";
		}

		if (localDate.getDayOfMonth() == 2 || localDate.getDayOfMonth() == 22) {

			return "nd";
		}

		if (localDate.getDayOfMonth() == 3 || localDate.getDayOfMonth() == 23) {

			return "rd";
		}

		return "th";

	}

	public String getDayOfMonthSuffix(final int n) {
		checkArgument(n >= 1 && n <= 31, "illegal day of month: " + n);
		if (n >= 11 && n <= 13) {
			return "th";
		}
		switch (n % 10) {
			case 1:  return "st";
			case 2:  return "nd";
			case 3:  return "rd";
			default: return "th";
		}
	}

	/**
	 * Method to generate a standard date String for display purpose
	 * @return Date string eg. 1st May, 2020
	 */
	public String getStandardDateString(Date dateInput) {
		Integer datePart = getPartsFromDate(dateInput, DatePart.DATE);
		return datePart
				+ getDayOfMonthSuffix(datePart) + " "
				+ customDateFormatter(dateInput, DateFormat.MMMM_YYYY);
	}

}