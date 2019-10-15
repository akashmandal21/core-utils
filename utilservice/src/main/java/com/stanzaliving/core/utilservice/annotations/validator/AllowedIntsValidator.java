package com.stanzaliving.core.utilservice.annotations.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.AllowedInts;

public class AllowedIntsValidator implements ConstraintValidator<AllowedInts, Integer> {

	private int[] values;

	@Override
	public void initialize(AllowedInts constraint) {
		values = constraint.value();
	}

	@Override
	public boolean isValid(Integer obj, ConstraintValidatorContext context) {

		for (int value : values) {
			if (obj == value)
				return true;
		}
		return false;
	}
}