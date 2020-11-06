package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiscountType {
    FLAT_AMOUNT("Flat"),
    PERCENTAGE("Percentage");
    private final String type;
}
