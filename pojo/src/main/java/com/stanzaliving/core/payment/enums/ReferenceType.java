package com.stanzaliving.core.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ReferenceType {
	BOOKING_UUID, MERCHANT_TRANSACTION_ID, USER_ID;
}
