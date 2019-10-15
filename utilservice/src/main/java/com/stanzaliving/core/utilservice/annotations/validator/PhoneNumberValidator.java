package com.stanzaliving.core.utilservice.annotations.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.base.utils.PhoneNumberUtils;
import com.stanzaliving.core.utilservice.annotations.ValidPhoneNumber;
import com.stanzaliving.core.utilservice.annotations.validator.PhoneNumberValidator.PhoneNumber;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, PhoneNumber> {

	@SuppressWarnings("unused")
	private boolean required;

	@Override
	public void initialize(ValidPhoneNumber constraintAnnotation) {
		this.required = constraintAnnotation.required();
	}

	@Override
	public boolean isValid(PhoneNumber phone, ConstraintValidatorContext context) {

		context.disableDefaultConstraintViolation();
		context
				.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
				.addPropertyNode("mobile")
				.addConstraintViolation();

		boolean response = true;
		if (StringUtils.isNotBlank(phone.getMobile())
				&& !PhoneNumberUtils.isValidMobileForCountry(phone.getMobile(), phone.getCountryCode())) {

			response = false;
		}

		return response;
	}

	public static interface PhoneNumber {

		String getMobile();

		String getCountryCode();
	}

}