/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.text.ParseException;

import org.junit.Test;

import com.google.gson.Gson;
import com.stanzaliving.core.base.common.dto.DateTimeRangeDto;

/**
 * @author naveen
 *
 * @date 17-Sep-2018
 */
public class DateTimeRangeTest {

	@Test
	public void testDateTimeRangeInit() throws ParseException {

		DateTimeRangeDto dateTimeRangeDto = new DateTimeRangeDto();

		dateTimeRangeDto.setStartDate("2016-04-26 06:38:00");
		dateTimeRangeDto.setEndDate("2016-04-26 06:38:30");

		System.out.println(new Gson().toJson(dateTimeRangeDto));

		System.out.println(dateTimeRangeDto);

	}

}