/**
 * 
 */
package com.stanzaliving.core.base.enums;

import lombok.Getter;

/**
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@Getter
public enum DateFormat {

	YYYY_HIFEN_MM_HIFEN_DD("yyyy-MM-dd"),
	ELASTIC_SEARCH("yyyy-MM-dd HH:mm:ss"),
	MONTH_FULL_NAME("MMMM"),
	WEEK_IN_YEAR("w-yyyy"),
	DAY_OF_MONTH("d");

	private String value;

	DateFormat(String value) {
		this.value = value;
	}

}