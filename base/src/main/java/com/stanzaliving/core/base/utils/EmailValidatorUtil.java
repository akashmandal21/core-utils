package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

@UtilityClass
public class EmailValidatorUtil {

	public boolean isValidEmail(String email) {
		if (StringUtils.isBlank(email)) {
			return false;
		}
		return EmailValidator.getInstance().isValid(email);
	}
}
