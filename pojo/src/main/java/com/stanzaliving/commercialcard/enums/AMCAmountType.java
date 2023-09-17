package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AMCAmountType {
    MONTHLY("Monthly"),
    FIXED("Fixed"),

    PERCENTAGE_OF_RENT("Percentage of rent");

    private String name;
}
