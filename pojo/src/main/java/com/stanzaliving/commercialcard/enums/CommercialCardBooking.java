package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommercialCardBooking {
    DISABLE("DISABLE"),
    ACTIVE("ACTIVE");

    private String name;
}
