package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum GenderAllowed {

	BOYS("Boys", "#8C54FF"),
	GIRLS("Girls", "#FD92AD"),
	COLIVING("Co-Living", "#b4b4b0"),
	NA("Not Applicable","#FD92AD");

	String gender, color;

	GenderAllowed(String gender, String color) {
		this.gender = gender;
		this.color = color;
	}

	public static Map<GenderAllowed,String > genderForCms = new HashMap<>();

	static {
		genderForCms.put(GenderAllowed.BOYS,"MALE");
		genderForCms.put(GenderAllowed.GIRLS,"FEMALE");
		genderForCms.put(GenderAllowed.COLIVING,"CO_ED");
	}

}
