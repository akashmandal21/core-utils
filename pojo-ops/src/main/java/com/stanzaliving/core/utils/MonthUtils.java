package com.stanzaliving.core.utils;

import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.utils.DateUtil;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.util.Date;

@UtilityClass
public class MonthUtils {

	public Date getFirstDateOfMonth(Integer year, Integer month) {

		LocalDate now = LocalDate.now();
		if (year == null) {
			year = now.getYear();
		}
		if (month == null) {
			month = now.getMonthValue();
		}
		validateMonth(year, month);

		return DateUtil.convertToDate(DateUtil.getMonthStartBeginningDate(month, year));
	}

	private void validateMonth(int year, int month) {
		if (year <= 0) {
			throw new ApiValidationException("Year value is invalid");
		}

		if (month < 1 || month > 12) {
			throw new ApiValidationException("Month value should be between 1 to 12. Invalid Month Value " + month + ".");
		}
	}
}