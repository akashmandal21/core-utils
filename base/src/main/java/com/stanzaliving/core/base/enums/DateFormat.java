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
	ELASTIC_SEARCH("yyyy-MM-dd HH:mm:ss");

	private String value;

	DateFormat(String value) {
		this.value = value;
	}

}