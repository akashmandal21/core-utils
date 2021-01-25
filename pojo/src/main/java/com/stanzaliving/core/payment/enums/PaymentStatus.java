
package com.stanzaliving.core.payment.enums;

import java.util.Objects;

public enum PaymentStatus {

	INITIATED,
	FAILED,
	PENDING,
	SUCCESS,
	REFUND_INITIATED,
	REFUNDED,
	REFUND_FAILED,
	ACCEPTED;

	public static boolean isFailed(PaymentStatus status) {
		return Objects.nonNull(status) && FAILED.equals(status);
	}
}