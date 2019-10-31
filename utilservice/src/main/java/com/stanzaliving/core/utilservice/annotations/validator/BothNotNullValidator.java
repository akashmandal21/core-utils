package com.stanzaliving.core.utilservice.annotations.validator;

import java.lang.reflect.Field;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.BothNotNull;
import com.stanzaliving.core.utilservice.utils.ReflectionUtils;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BothNotNullValidator implements ConstraintValidator<BothNotNull, Object> {

	private String firstField;
	private String secondField;

	@Override
	public void initialize(BothNotNull constraint) {
		firstField = constraint.first();
		secondField = constraint.second();
	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		try {
			Class<?> clazz = obj.getClass();

			Field field1 = ReflectionUtils.findField(clazz, firstField);
			ReflectionUtils.makeAccessible(field1);

			Field field2 = ReflectionUtils.findField(clazz, secondField);
			ReflectionUtils.makeAccessible(field2);

			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate()).addPropertyNode(secondField).addConstraintViolation();

			if (field1.get(obj) == null && field2.get(obj) == null)
				return false;

		} catch (IllegalAccessException e) {
			log.error("@BothNotNull is not placed at valid place");
		}
		return true;
	}
}