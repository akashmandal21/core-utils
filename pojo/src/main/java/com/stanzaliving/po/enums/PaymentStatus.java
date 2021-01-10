package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentStatus {

	NOT_PAID("Not Paid"),
	PARTIAL_PAID("Partial Paid"),
	FULLY_PAID("Fully Paid");

	private String status;

}