package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiscountValue {
    ABSOLUTE("Absolute"), PERCENT_OF_MONTHLY_RENT("% of monthly rent");

    String name;
}
