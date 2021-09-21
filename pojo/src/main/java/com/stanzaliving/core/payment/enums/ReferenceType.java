package com.stanzaliving.core.payment.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum ReferenceType {
    BOOKING, MERCHANT_TRANSACTION, USER;
}
