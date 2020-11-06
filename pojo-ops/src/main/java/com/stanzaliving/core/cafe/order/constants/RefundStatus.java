package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RefundStatus {
    INITIATED("Initiated"),
    PENDING("Pending"),
    COMPLETED("Completed");

    private final String status;
}
