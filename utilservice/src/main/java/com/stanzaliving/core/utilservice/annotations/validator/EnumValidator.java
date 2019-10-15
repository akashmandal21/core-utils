package com.stanzaliving.core.utilservice.annotations.validator;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.ValidEnum;

public class EnumValidator implements ConstraintValidator<ValidEnum, String> {

	private Set<String> stringSet;

	@Override
	@SuppressWarnings("rawtypes")
	public void initialize(ValidEnum constraint) {
		Class<? extends Enum<?>> enumSelected = constraint.enumClass();
		stringSet = new HashSet<>();

		for (Enum anEnum : enumSelected.getEnumConstants()) {
			stringSet.add(anEnum.name().toUpperCase());
		}
	}

	@Override
	public boolean isValid(String obj, ConstraintValidatorContext context) {
		if (obj != null) {
			return stringSet.contains(obj.toUpperCase());
		}
		return true;
	}
}