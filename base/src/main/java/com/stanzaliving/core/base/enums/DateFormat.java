/**
 * 
 */
package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@Getter
@AllArgsConstructor
public enum DateFormat {

	YYYY_HIFEN_MM_HIFEN_DD("yyyy-MM-dd"),
	ELASTIC_SEARCH("yyyy-MM-dd HH:mm:ss"),
	COMMENT_FORMAT("dd/MM/YYYY (HH:mm)"),
	MONTH_FULL_NAME("MMMM"),
	WEEK_OF_YEAR("w"),
	YEAR_IN_WEEK_OF_YEAR("YYYY"),
	DAY_OF_MONTH("d"),
	DD_MMM_YYYY("dd-MMM-yyyy"),
	DD_SPACE_MMM_SPACE_YYYY("dd MMM yyyy"),
	DD_MMM("dd MMM"),
	DATE_TIME_TIME_ZONE("yyyy-MM-dd'T'HH:mm:ss'Z'"),
	ELASTIC_SEARCH_WITH_MILI_SECONDS("yyyy-MM-dd HH:mm:ss.S");

	private String value;

}