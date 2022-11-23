package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiscountValueType {
    FIXED("Fixed"), VARIABLE("Variable");

    String name;
}
