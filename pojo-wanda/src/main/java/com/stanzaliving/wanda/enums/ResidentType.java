package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidentType {
	
	STUDENT("Student"), WORKING_PROFESSIONALS("Working Professional"), OTHERS("Others");
	
	private String name;
}