/**
 * 
 */
package com.stanzaliving.core.user.enums;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@AllArgsConstructor
public enum Gender {

	MALE("Male"),
	FEMALE("Female"),
	OTHERS("Others");

	private String genderName;
	
	private static List<EnumListing<Gender>> genders= new ArrayList<>();

	static {
			genders.add(EnumListing.of(Gender.MALE, Gender.MALE.getGenderName()));
			genders.add(EnumListing.of(Gender.FEMALE, Gender.FEMALE.getGenderName()));
	}
	
	public static List<EnumListing<Gender>> getGenders() {
		return genders;
	}

}