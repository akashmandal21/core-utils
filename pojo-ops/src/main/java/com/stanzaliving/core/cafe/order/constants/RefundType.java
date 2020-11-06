package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RefundType {
    FULL_REFUND("Full Refund"),
    PARTIAL_REFUND("Partial Refund"),
    NO_REFUND("No Refund");

    private final String type;
}
