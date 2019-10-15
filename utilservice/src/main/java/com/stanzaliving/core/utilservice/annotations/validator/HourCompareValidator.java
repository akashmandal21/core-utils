package com.stanzaliving.core.utilservice.annotations.validator;

import org.apache.log4j.Logger;

import com.stanzaliving.core.utilservice.annotations.HourCompare;
import com.stanzaliving.core.utilservice.utils.ReflectionUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.lang.reflect.Field;

public class HourCompareValidator implements ConstraintValidator<HourCompare, Object> {

	private static final Logger logger = Logger.getLogger(HourCompareValidator.class);

	private String firstField;
	private String secondField;

	@Override
	public void initialize(HourCompare constraint) {
		firstField = constraint.start();
		secondField = constraint.end();
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		try {
			Class<?> clazz = obj.getClass();

			Field field1 = ReflectionUtils.findField(clazz, firstField);
			ReflectionUtils.makeAccessible(field1);

			Field field2 = ReflectionUtils.findField(clazz, secondField);
			ReflectionUtils.makeAccessible(field2);

			int startHour = (int) field1.get(obj);
			int endHour = (int) field2.get(obj);

			if (startHour >= 12 && startHour < 24) {
				
				if (endHour >= 12 && endHour < 24) {
					if (startHour > endHour) {
						return false;
					}
				}
			} else if (startHour >= 0 && startHour < 12) {
				
				if (endHour >= 0 && endHour < 12) {
					if (startHour > endHour) {
						return false;
					}
				} else if (endHour >= 12 && endHour < 24) {
					return false;
				}
			}
		} catch (IllegalAccessException e) {
			logger.error("@DHourCompare cannot access fields");
		}
		
		return true;
	}
}