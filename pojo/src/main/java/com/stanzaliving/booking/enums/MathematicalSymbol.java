package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MathematicalSymbol {
    GREATER_THAN_EQUAL_TO("greater than equal to"), EQUAL_TO("equal to");

    String name;
}
