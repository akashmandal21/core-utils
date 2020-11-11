package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {
    VAS("Vas Item"),
    COUPON("Coupon");

    private final String type;
}
