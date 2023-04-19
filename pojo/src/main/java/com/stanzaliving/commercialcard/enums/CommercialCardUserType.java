package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@ToString
public enum CommercialCardUserType {
    SCHOLAR("SCHOLAR"), SUITES("SUITES"), MANAGED_APARTMENT("MANAGED_APARTMENT"), MANAGED_APARTMENTS("MANAGED_APARTMENTS"),
    ALL("ALL"), PROFESSIONAL("PROFESSIONAL");

    private final String commercialCardUserType;

    public String getDescription() {
        return commercialCardUserType;
    }
}
