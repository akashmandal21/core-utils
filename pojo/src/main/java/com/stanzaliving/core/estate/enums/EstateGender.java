/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 22-Nov-2019
 *
 **/
@Getter
@AllArgsConstructor
public enum EstateGender {


	MALE("M", "Male"),
	FEMALE("F", "Female"),
	COED("C", "Coed");

	private String shortCode;
	private String genderName;
	
	private static List<EnumListing<EstateGender>> copyToServiceMixGendersList= new ArrayList<>();

	static {
		copyToServiceMixGendersList.add(EnumListing.of(EstateGender.MALE, EstateGender.MALE.getGenderName()));
		copyToServiceMixGendersList.add(EnumListing.of(EstateGender.FEMALE, EstateGender.FEMALE.getGenderName()));
		copyToServiceMixGendersList.add(EnumListing.of(EstateGender.COED, EstateGender.COED.getGenderName()));
	}
	
	public static List<EnumListing<EstateGender>> getCopyToServiceMixGendersList() {
		return copyToServiceMixGendersList;
	}

	public static Map<EstateGender, String> genderForCms = new HashMap<>();

	static {
		genderForCms.put(EstateGender.MALE, "MALE");
		genderForCms.put(EstateGender.FEMALE, "FEMALE");
		genderForCms.put(EstateGender.COED, "CO_ED");
	}
}