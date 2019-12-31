/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 22-Nov-2019
 *
 **/
@Getter
public enum EstateGender {

	MALE("M"),
	FEMALE("F"),
	COED("C");

	private String shortCode;

	private EstateGender(String shortCode) {
		this.shortCode = shortCode;
	}
}