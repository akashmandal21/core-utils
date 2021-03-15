/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import java.util.HashMap;
import java.util.Map;

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

	public static Map<EstateGender, String> genderForCms = new HashMap<>();

	static {
		genderForCms.put(EstateGender.MALE, "MALE");
		genderForCms.put(EstateGender.FEMALE, "FEMALE");
		genderForCms.put(EstateGender.COED, "CO_ED");
	}
}