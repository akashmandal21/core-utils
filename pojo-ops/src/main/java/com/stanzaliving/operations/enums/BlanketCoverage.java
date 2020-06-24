package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum BlanketCoverage implements EnumValue {
	ALL_STUDENT("All Student"),
	NO_STUDENT("No Student"),
	SECOND_YEAR_ONWARD("2nd Year Onwards");
	
	private String value;
	
	private BlanketCoverage(String value) {
		this.value = value;
	}
}
