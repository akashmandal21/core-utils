package com.stanzaliving.core.utilservice.annotations.validator;

import java.lang.reflect.Field;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.log4j.Logger;

import com.stanzaliving.core.utilservice.annotations.ValueCompare;
import com.stanzaliving.core.utilservice.utils.ReflectionUtils;

public class ValueCompareValidator implements ConstraintValidator<ValueCompare, Object> {

	private static final Logger logger = Logger.getLogger(ValueCompareValidator.class);

	private String firstField;
	private String secondField;
	private boolean isEqual;

	@Override
	public void initialize(ValueCompare constraint) {
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
			Integer first = (Integer) field1.get(obj);
			Integer second = (Integer) field2.get(obj);

			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate()).addPropertyNode(secondField).addConstraintViolation();
			if (first != null && second != null) {
				if (!isEqual && first < second) {
					return true;
				} else if (isEqual) {
					if (first <= second) {
						return true;
					} else {
						context.buildConstraintViolationWithTemplate(secondField + " should not be less than " + firstField).addPropertyNode(secondField).addConstraintViolation();
					}
				}
			}
		} catch (IllegalAccessException e) {
			logger.error("@ValueCompare is not placed at valid place");
		}
		return false;
	}
}