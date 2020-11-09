package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {
    VAS("Vas Item"),
    CHARGES("Charges"),
    COUPON("Coupon");

    private final String type;
}
