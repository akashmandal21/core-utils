package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {

	MALE("Male"),
	FEMALE("Female"),
	CO_ED("Co_Ed"),
	UNISEX("Unisex");
	
	public String genderName;

}
