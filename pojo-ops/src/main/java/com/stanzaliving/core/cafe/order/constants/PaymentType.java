package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentType {
    PREPAID("Prepaid"),
    POSTPAID("Postpaid");
    private final String type;
}
