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

	/**
	 * Method to convert a string to trimmed string -
	 * 1. Blank strings will be returned as null
	 * 2. Leading and Trailing Spaces are removed (trimmed)
	 */
	public static String getNullOrTrimmedString(String string) {
		if (StringUtils.isBlank(string)) {
			return null;
		} else {
			return string.trim();
		}
	}

	/**
	 * Method to check equals on two strings by normalizing them-
	 * 1. blank strings will be converted to null
	 * 2. Leading and Trailing Spaces are removed (trimmed)
	 * 3. Then equals method will return true if their char seq matches
	 */
	public static boolean normalizeAndCheckEqualsOnStrings(String value1, String value2) {
		value1 = getNullOrTrimmedString(value1);
		value2 = getNullOrTrimmedString(value2);

		return StringUtils.equals(value1, value2);
	}

	public String fastReplaceAllUtil(String str, String target, String replacement) {

		int targetLength = target.length();

		if (targetLength == 0) {
			return str;
		}

		int idx2 = str.indexOf(target);
		if (idx2 < 0) {
			return str;
		}

		// discuss: size of string builder
		StringBuilder buffer = new StringBuilder(targetLength > replacement.length() ? str.length() : str.length() * 2);

		int idx1 = 0;
		do {
			buffer.append(str, idx1, idx2);
			buffer.append(replacement);
			idx1 = idx2 + targetLength;
			idx2 = str.indexOf(target, idx1);
		} while (idx2 > 0);

		buffer.append(str, idx1, str.length());

		return buffer.toString();
	}
}