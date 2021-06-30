package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum MaintenanceFeeCollectionType {
	MONTHLY("MONTHLY"),
	ONE_TIME_UPFRONT("ONE TIME UPFRONT");

	private String name;

	/*MaintenanceFeeCollectionType(String name) {
		this.name = name;
	}*/

	public String getName() {
		return name;
	}
}
