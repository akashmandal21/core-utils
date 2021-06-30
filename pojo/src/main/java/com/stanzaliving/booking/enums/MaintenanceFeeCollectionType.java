package com.stanzaliving.booking.enums;


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
