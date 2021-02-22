/**
 * 
 */
package com.stanzaliving.core.estate.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

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
	private static List<EnumListing<EstateGender>> copyToServiceMixGendersList= new ArrayList<>();

	private EstateGender(String shortCode) {
		this.shortCode = shortCode;
	}

	static {
		copyToServiceMixGendersList.add(EnumListing.of(EstateGender.MALE, EstateGender.MALE.getShortCode()));
		copyToServiceMixGendersList.add(EnumListing.of(EstateGender.FEMALE, EstateGender.FEMALE.getShortCode()));
		copyToServiceMixGendersList.add(EnumListing.of(EstateGender.COED, EstateGender.COED.getShortCode()));
	}
	
	public static List<EnumListing<EstateGender>> getCopyToServiceMixGendersList() {
		return copyToServiceMixGendersList;
	}
}