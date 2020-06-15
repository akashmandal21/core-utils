package com.stanzaliving.core.operations.enums;

import lombok.Getter;

@Getter
public enum PaymentMode {

	UPI_QR("UPI QR");

	private String paymentMode;

	private PaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

}
