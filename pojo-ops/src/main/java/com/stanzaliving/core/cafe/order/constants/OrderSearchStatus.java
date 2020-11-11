package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderSearchStatus {
    OPEN("Open"),
    COMPLETED("Completed");

    private final String status;
}
