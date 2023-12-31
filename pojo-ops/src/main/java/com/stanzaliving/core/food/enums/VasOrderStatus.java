package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 15-Sep-2020
 */

@Getter
@AllArgsConstructor
public enum VasOrderStatus {
	UNDER_DRAFT("Under Draft"),
	PAYMENT_PENDING("Payment Pending"),
	FAILURE("Failed"),
	CANCELLED("Cancelled"),
	DISCARDED("Discarded"),
	CONFIRMED("Order Confirmed"),
	TO_BE_REFUNDED("To Be Refunded"),
	REFUNDED("Refunded");

	private String statusName;
}
