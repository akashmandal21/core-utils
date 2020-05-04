package com.stanzaliving.designservice.enums;

import lombok.Getter;

@Getter
public enum BedCountType {

	INITIAL_BED_COUNT("Initial Bed Count"),
	FINAL_BED_COUNT("Final Bed Count");

	private String bedCountTypeName;

	BedCountType(String bedCountTypeName) {
		this.bedCountTypeName = bedCountTypeName;
	}

}
