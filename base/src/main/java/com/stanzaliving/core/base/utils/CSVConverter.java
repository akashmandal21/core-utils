/**
 * 
 */
package com.stanzaliving.core.base.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import lombok.experimental.UtilityClass;

/**
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@UtilityClass
public class CSVConverter {

	/**
	 * Converts Long or Integer List of ids to csv format
	 * 
	 * @param list
	 *            List of Ids
	 * @return csv String
	 */
	@SuppressWarnings("rawtypes")
	public static final String getCSVString(List list) {
		String csvString = "";

		if (CollectionUtils.isNotEmpty(list)) {

			StringBuilder csvSB = new StringBuilder();

			for (int i = 0; i < list.size(); i++) {
				csvSB.append(list.get(i));
				csvSB.append(",");
			}

			csvString = csvSB.toString();
			csvString = csvString.substring(0, csvString.length() - 1);
		}

		return csvString;
	}

	@SuppressWarnings("rawtypes")
	public static final String getCSVStringBeautified(List list) {
		String csvString = "";

		if (CollectionUtils.isNotEmpty(list)) {

			StringBuilder csvSB = new StringBuilder();

			for (int i = 0; i < list.size(); i++) {

				if (!csvSB.toString().isEmpty()) {
					csvSB.append(", ");
				}

				csvSB.append(list.get(i));
			}

			csvString = csvSB.toString();
		}

		return csvString;
	}

	/**
	 * Converts Array of long to csv format
	 * 
	 * @param list
	 *            Long List of Ids
	 * @return csv String
	 */
	public static final String getCSVString(long[] ids) {
		String csvString = "";

		if (ids != null && ids.length > 0) {

			StringBuilder csvSB = new StringBuilder();

			for (int i = 0; i < ids.length; i++) {
				csvSB.append(ids[i]);
				csvSB.append(',');
			}

			csvString = csvSB.toString();
			csvString = csvString.substring(0, csvString.length() - 1);
		}

		return csvString;
	}

	/**
	 * Converts Array of int to csv format
	 * 
	 * @param int
	 *            array of ids
	 * @return csv String
	 */
	public static final String getCSVString(int[] ids) {
		String csvString = "";

		if (ids != null && ids.length > 0) {

			StringBuilder csvSB = new StringBuilder();

			for (int i = 0; i < ids.length; i++) {
				csvSB.append(ids[i]);
				csvSB.append(',');
			}

			csvString = csvSB.toString();
			csvString = csvString.substring(0, csvString.length() - 1);
		}

		return csvString;
	}

	/**
	 * Converts Array of String ids to csv format
	 * 
	 * @param list
	 *            Long List of Ids
	 * @return csv String
	 */
	public static final String getCSVString(String[] ids) {
		int length = (ids == null) ? 0 : ids.length;
		return getCSVString(ids, 0, length);
	}

	public static final String getCSVString(String[] ids, int startIndex, int endIndex) {
		String csvString = "";

		if (ids != null && ids.length > 0) {

			StringBuilder csvSB = new StringBuilder();

			for (int i = startIndex; i < endIndex; i++) {
				csvSB.append('\'');
				csvSB.append(ids[i]);
				csvSB.append('\'');
				csvSB.append(',');
			}
			csvString = csvSB.toString();
			csvString = csvString.substring(0, csvString.length() - 1);
		}

		return csvString;
	}

	public static List<String> getStringListFromCSV(String csvString) {

		List<String> list = new ArrayList<>();

		if (StringUtils.isNotBlank(csvString)) {

			String[] stringArray = csvString.split(",");

			for (String string : stringArray) {

				if (StringUtils.isNotBlank(string)) {
					list.add(string.trim());
				}
			}

		}

		return list;
	}

}