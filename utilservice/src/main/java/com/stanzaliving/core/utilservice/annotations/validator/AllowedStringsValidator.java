package com.stanzaliving.core.utilservice.annotations.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.AllowedStrings;

public class AllowedStringsValidator implements ConstraintValidator<AllowedStrings, String> {

	private String[] values;

	@Override
	public void initialize(AllowedStrings constraint) {
		values = constraint.values();
	}

	@Override
	public boolean isValid(String obj, ConstraintValidatorContext context) {

		for (String value : values) {
			if (obj.equals(value))
				return true;
		}

		return false;
	}
}