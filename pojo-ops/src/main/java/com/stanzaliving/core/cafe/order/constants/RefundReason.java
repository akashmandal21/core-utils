package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RefundReason {
    EXTRA_PAYMENTS("Extra Payment"),
    HOSTEL_CHANGE("Hostel Change"),
    CANCELLED_ORDER("Cancelled Order");
    private final String reason;
}
