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
	YYYY_MM_DD("yyyyMMdd"),
	ELASTIC_SEARCH("yyyy-MM-dd HH:mm:ss"),
	COMMENT_FORMAT("dd/MM/YYYY (HH:mm)"),
	MONTH_FULL_NAME("MMMM"),
	DD_MMM("dd MMM"),
	MMM("MMM"),
	DD_MMM_YY("dd MMM''YY"),
	DD_MMM_YY_HH_MM("dd MMM''YY HH:mm"),
	D_DD_MMM_YY("EEE, dd MMM''YY"),
	WEEK_OF_YEAR("w"),
	YEAR_IN_WEEK_OF_YEAR("YYYY"),
	DAY_OF_MONTH("d"),
	DD_MMM_YYYY("dd-MMM-yyyy"),
	DATE_TIME_TIME_ZONE("yyyy-MM-dd'T'HH:mm:ss'Z'"),
	DD_SPACE_MMM_SPACE_YYYY("dd MMM yyyy"),
	DDMMMYYYY("ddMMMyyyy"),
	ELASTIC_SEARCH_WITH_MILI_SECONDS("yyyy-MM-dd HH:mm:ss.S"),
	MMMM_YYYY("MMMM, yyyy"),//June, 2020
	MMM_YYYY("MMM, yyyy"),
	MMM_YY("MMM, yy"),
	DD_MMM_YYYY_H_MM_A("dd MMM yyyy h:mm a"),
	H_MM_A("h:mm a"),
	FRESHDESK_DATE_FORMAT("yyyy-MM-dd'T'HH:mm:ssXXX"),
	YYYY_MM_DD_T_HH_MM_SSXXX("yyyy-MM-dd'T'HH:mm:ssXXX");

	private String value;

}