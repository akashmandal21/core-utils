/**
 * 
 */
package com.stanzaliving.core.base.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@UtilityClass
public class StanzaParseUtils {

	public static int getIntValue(String stringValue) {
		return isParsable(stringValue) ? Integer.parseInt(stringValue) : 0;
	}

	public static long getLongValue(String stringValue) {
		return isParsable(stringValue) ? Long.parseLong(stringValue) : 0;
	}

	public static float getFloatValue(String stringValue) {
		return isParsable(stringValue) ? Float.parseFloat(stringValue) : 0;

	}

	public static double getDoubleValue(String stringValue) {
		return isParsable(stringValue) ? Double.parseDouble(stringValue) : 0;

	}

	private static boolean isParsable(String stringValue) {
		return NumberUtils.isParsable(stringValue);
	}

	/**
	 * Method to remove all special characters from string. It leaves only [a-zA-Z0-9] in string. All special characters are replaced by a space
	 * 
	 * @param string
	 * @return normalized string
	 */
	public static String getNormalizedString(String string) {

		if (StringUtils.isNotBlank(string)) {
			string = string.replaceAll("[^a-zA-Z0-9]", " ");
		}

		return StringUtils.defaultString(string);
	}
}