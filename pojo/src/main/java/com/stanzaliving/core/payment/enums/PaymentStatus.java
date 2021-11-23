
package com.stanzaliving.core.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public enum PaymentStatus {

	INITIATED("Initiated"),
	FAILED("Failed"),
	PENDING("Pending"),
	SUCCESS("Success"),
	REFUND_INITIATED("Refund Initiated"),
	REFUNDED("Refunded"),
	REFUND_FAILED("Refund Failed"),
	ADJUSTED("Adjusted"),
	ACCEPTED("Accepted"),
	WRITE_OFF("Write Off"),
	REMAPPED("Remapped");

	private String paymentStatus;

	public static boolean isFailed(PaymentStatus status) {
		return Objects.nonNull(status) && FAILED.equals(status);
	}

	public static boolean isRefundFailed(PaymentStatus status) {
		return Objects.nonNull(status) && REFUND_FAILED.equals(status);
	}
}