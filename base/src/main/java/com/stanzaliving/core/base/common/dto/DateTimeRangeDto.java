/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.stanzaliving.core.base.StanzaConstants;

import lombok.Getter;
import lombok.ToString;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@Getter
@ToString
public class DateTimeRangeDto {

	protected Date startDate;

	protected Date endDate;

	public DateTimeRangeDto() {
		super();
	}

	public DateTimeRangeDto(Date startDate, Date endDate) {
		this();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setStartDate(String startDate) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone(StanzaConstants.IST_TIMEZONE));
		this.startDate = dateFormat.parse(startDate);
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setEndDate(String endDate) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone(StanzaConstants.IST_TIMEZONE));
		this.endDate = dateFormat.parse(endDate);
	}

}