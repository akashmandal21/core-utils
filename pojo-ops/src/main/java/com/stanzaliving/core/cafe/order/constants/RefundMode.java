package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RefundMode {
    INSTANT("Instant"),
    ORIGINAL("Original");

    private final String mode;
}
