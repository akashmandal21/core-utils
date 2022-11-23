package com.stanzaliving.core.base.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 05-June-2020
 *
 */

@UtilityClass
public class GovLicenceValidator {
	public boolean isGstinValid(CharSequence gstin) {
		String regex = "\\d{2}[a-zA-Z]{5}\\d{4}[a-zA-Z]{1}\\d{1}[zZ]{1}[\\da-zA-Z]{1}";

		if (StringUtils.isNotBlank(gstin) && gstin.length() == 15) {
			return Pattern.matches(regex, gstin);
		}

		return false;
	}


	public boolean isFassaiValid(String fassai) {
		String regex = "[1-2]{1}\\d{13}";

		if (StringUtils.isNotBlank(fassai) && fassai.length() == 14) {
			return Pattern.matches(regex, fassai);
		}
		return false;
	}
}
