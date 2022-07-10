/**
 * 
 */
package com.stanzaliving.core.base.utils;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

import lombok.experimental.UtilityClass;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@UtilityClass
public class StringNormalizer {

	/**
	 * Method to remove all special characters from string leaving only [a-zA-Z0-9- ] characters with following assumptions -
	 * 1. Comma in string are replaced by a space
	 * 2. Spaces between string are kept as it is
	 * 3. Leading and Trailing Spaces are removed (trimmed)
	 * 4. All other special character are replaced by an empty character
	 * 
	 * @param string
	 *            - string with special characters
	 * @return normalized plain string containing only [a-zA-Z0-9- ]
	 */
	public static String normalizeString(String string) {

		if (StringUtils.isNotEmpty(string)) {
			string = string.replaceAll(",", " ").replaceAll("[^a-zA-Z0-9- ]", "").trim();
		} else {
			string = StringUtils.EMPTY;
		}

		return string;
	}

	public static String normalizeStringForRegex(String string, String regex, String replaceString) {

		replaceString = ObjectUtils.defaultIfNull(replaceString, StringUtils.EMPTY);

		if (StringUtils.isNotEmpty(string) && StringUtils.isNotBlank(regex)) {
			string = string.replaceAll(regex, replaceString).trim();
		}

		return string;
	}
	
	/**
	 * Method to convert a string to title case with following assumptions -
	 * 1. Char just after comma will be capitalized
	 * 2. Char just after space will be capitalized
	 * 3. Leading and Trailing Spaces are removed (trimmed)
	 */
	public static String getTitleCaseString(String string) {

		if (StringUtils.isNotEmpty(string)) {
			string = WordUtils.capitalizeFully(string, ',', ' ').trim();
		}
		return string;
	}
}