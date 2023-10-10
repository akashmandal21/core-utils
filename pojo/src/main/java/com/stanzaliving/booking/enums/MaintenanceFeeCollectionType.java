package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum MaintenanceFeeCollectionType {

	MONTHLY("Monthly"),
	ONE_TIME_UPFRONT("One time upfront"),

	ADD_TO_SD_AND_DEDUCT_MONTHLY("Add to SD & deduct monthly"),
	DEDUCT_FROM_SD("Deduct from SD");
	private String name;

}
