/**
 * 
 */
package com.stanzaliving.core.sqljpa.conveter;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.stanzaliving.core.base.utils.DateUtil;

/**
 * 
 * @author naveen.kumar
 *
 * @date 31-Dec-2019
 *
 */
@Converter(autoApply = true)
public class LocalTimeAttributeConverter implements AttributeConverter<LocalTime, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalTime attribute) {
		return DateUtil.convertToDate(attribute);
	}

	@Override
	public LocalTime convertToEntityAttribute(Date dbData) {
		return DateUtil.convertToLocalTime(dbData);
	}

}