package com.stanzaliving.core.base.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;


public class EmailValidatorUtil {

	public static boolean isValidEmail(String email) {
		if (StringUtils.isBlank(email)) {
			return false;
		}
		return EmailValidator.getInstance().isValid(email);
	}
}
