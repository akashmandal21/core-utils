package com.stanzaliving.core.utilservice.annotations.validator;

import org.apache.commons.lang3.math.NumberUtils;

import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnsureNumberValidator implements ConstraintValidator<EnsureNumber, String> {

	@Override
	public void initialize(EnsureNumber constraint) {
	}

	@Override
	public boolean isValid(String obj, ConstraintValidatorContext context) {
		return NumberUtils.isDigits(obj);
	}

}