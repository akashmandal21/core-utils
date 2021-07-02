package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum MaintenanceFeeCollectionType {
	ONE_TIME_UPFRONT("One Time Upfront"),
	MONTHLY_PAYMENTS("Monthly Payment");

	private String name;

	public String getName() {
		return name;
	}
}
