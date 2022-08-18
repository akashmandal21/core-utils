package com.stanzaliving.wanda.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionStatus {

	INITIATED("INITIATED"),
	PENDING("PENDING"),
	SUCCESS("SUCCESS"),
	SUCCESS_ON_VERIFICATION("SUCCESS_ON_VERIFICATION"),
	FAIL("FAIL"),
	FAILED("FAILED"),
	ABORTED("ABORTED"),
	REFUNDED("REFUNDED"),
	CANCELLED("CANCELLED");

	private String status;

	private static final Map<String, TransactionStatus> transactionStatusMap = new HashMap<>();

	static {

		for (TransactionStatus transactionStatus : TransactionStatus.values()) {

			transactionStatusMap.put(transactionStatus.getStatus(), transactionStatus);

		}
	}

	public static TransactionStatus getTransactionByStatus(String status) {
		return transactionStatusMap.get(status);
	}

	public static boolean isTransactionStatusCancellable(TransactionStatus status) {
		return INITIATED == status || PENDING == status;
	}

	public static boolean isTransactionStatusCompletedAndNotSuccess(TransactionStatus status) {
		return FAIL == status || FAILED == status || ABORTED == status || REFUNDED == status || CANCELLED == status;
	}
}
