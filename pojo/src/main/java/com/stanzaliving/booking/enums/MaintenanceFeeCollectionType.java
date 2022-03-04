package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum MaintenanceFeeCollectionType {

	MONTHLY("Monthly"),
	ONE_TIME_UPFRONT("One Time Upfront");

	private String name;

}
