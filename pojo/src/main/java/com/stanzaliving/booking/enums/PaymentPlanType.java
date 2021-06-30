package com.stanzaliving.booking.enums;

public enum PaymentPlanType {

	RENTAL("RENTAL"),
	SERVICE("SERVICE"),
	FOOD_SERVICE("FOOD SERVICE"),
	SECURITY_DEPOSIT("SECURITY DEPOSIT"),
	MAINTENANCE_FEE("MAINTENANCE FEE"),
	ANNUAL_MAINTENANCE_FEE("ANNUAL MAINTENANCE FEE"),
	VAS("VAS"),
	BOOKING("BOOKING"),
	ADVANCE_RENTAL("ADVANCE RENTAL"),
	INSTALLMENT("INSTALLMENT"),
	DISCOUNT("DISCOUNT");

	private String name;

	PaymentPlanType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
