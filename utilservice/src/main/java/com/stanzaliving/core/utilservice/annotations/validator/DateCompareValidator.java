package com.stanzaliving.core.utilservice.annotations.validator;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.base.utils.DateUtil;
import com.stanzaliving.core.utilservice.annotations.DateCompare;
import com.stanzaliving.core.utilservice.utils.ReflectionUtils;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DateCompareValidator implements ConstraintValidator<DateCompare, Object> {

	private String firstField;
	private String secondField;
	private boolean isEqual;

	@Override
	public void initialize(DateCompare constraint) {
		firstField = constraint.first();
		secondField = constraint.second();
		isEqual = constraint.isEqual();
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		try {
			Class<?> clazz = obj.getClass();

			Field field1 = ReflectionUtils.findField(clazz, firstField);
			ReflectionUtils.makeAccessible(field1);

			Field field2 = ReflectionUtils.findField(clazz, secondField);
			ReflectionUtils.makeAccessible(field2);
			LocalDate fromDate = null;
			LocalDate toDate = null;
			if ((field1.get(obj) == null || field1.get(obj) instanceof Date) && (field2.get(obj) == null || field2.get(obj) instanceof Date)) {
				fromDate = DateUtil.convertToLocalDate((Date) field1.get(obj));
				toDate = DateUtil.convertToLocalDate((Date) field2.get(obj));
			} else {
				fromDate = (LocalDate) field1.get(obj);
				toDate = (LocalDate) field2.get(obj);
			}

			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate()).addPropertyNode(secondField).addConstraintViolation();

			if (fromDate != null && toDate != null) {

				if (!isEqual && !fromDate.isEqual(toDate)) {
					return fromDate.isBefore(toDate);
				} else if (isEqual && (fromDate.isBefore(toDate) || fromDate.isEqual(toDate))) {
					return true;
				}

				return false;
			}
		} catch (IllegalAccessException e) {
			log.error("@DateCompare is not placed at valid place");
		}
		return true;
	}
}