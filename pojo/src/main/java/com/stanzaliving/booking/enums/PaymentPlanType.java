package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentPlanType {

	RENTAL("Rental"),
	SERVICE("Service"),
	FOOD_SERVICE("Food Service"),
	SECURITY_DEPOSIT("Security Deposit"),
	MAINTENANCE_FEE("Maintenance Fee"),
	ANNUAL_MAINTENANCE_FEE("Annual Maintenance Fee"),
	VAS("VAS"),
	BOOKING("Booking"),
	ADVANCE_RENTAL("Advance Rental"),
	INSTALLMENT("Instalment"),
	DISCOUNT("Discount Adjusted"),
	DAMAGE("Damage");

	private String name;
}
