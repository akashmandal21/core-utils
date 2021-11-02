
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
	ADJUSTED,
	ACCEPTED,
	WRITE_OFF;

	public static boolean isFailed(PaymentStatus status) {
		return Objects.nonNull(status) && FAILED.equals(status);
	}

	public static boolean isRefundFailed(PaymentStatus status) {
		return Objects.nonNull(status) && REFUND_FAILED.equals(status);
	}
}