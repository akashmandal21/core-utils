/**
 * 
 */
package com.stanzaliving.core.sqljpa.conveter;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.stanzaliving.core.base.utils.DateUtil;

/**
 * 
 * @author naveen.kumar
 *
 * @date 20-May-2020
 *
 */
@Converter(autoApply = true)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDateTime attribute) {
		return DateUtil.convertToDate(attribute);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Date dbData) {
		return DateUtil.convertToLocalDateTime(dbData);
	}

}