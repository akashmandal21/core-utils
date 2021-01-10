package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidentType {
	
	STUDENT("Student"), WORKING_PROFESSIONALS("Working Professional"), OTHERS("Others");
	
	private String name;
	
	private static List<EnumListing<ResidentType>> residentTypes= new ArrayList<>();

	static {
		for (ResidentType residentType : ResidentType.values()) {
			residentTypes.add(EnumListing.of(residentType, residentType.getName()));
		}
	}
	
	public static List<EnumListing<ResidentType>> getResidentTypes() {
		return residentTypes;
	}
 
}