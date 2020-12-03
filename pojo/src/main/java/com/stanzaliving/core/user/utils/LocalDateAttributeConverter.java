package com.stanzaliving.core.user.utils;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.stanzaliving.core.base.utils.DateUtil;

@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		return DateUtil.convertToDate(attribute);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		return DateUtil.convertToLocalDate(dbData);
	}

}