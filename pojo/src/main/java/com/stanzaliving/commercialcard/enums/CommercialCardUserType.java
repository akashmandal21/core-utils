package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;


@Getter
@AllArgsConstructor
@ToString
public enum CommercialCardUserType {
    SCHOLAR("SCHOLAR"), SUITES("SUITES"), MANAGED_APARTMENT("MANAGED_APARTMENT"), MANAGED_APARTMENTS("MANAGED_APARTMENTS"),
    ALL("ALL"), PROFESSIONAL("PROFESSIONAL"),SHORT_STAY("SHORT_STAY");

    private final String commercialCardUserType;

    public String getDescription() {
        return commercialCardUserType;
    }

    private static Map<String, CommercialCardUserType> commercialCardUserTypeNameMap = new HashMap<>();

    static {
        for (CommercialCardUserType cardUserType : CommercialCardUserType.values()) {
            commercialCardUserTypeNameMap.put(cardUserType.getDescription(), cardUserType);
        }
    }

    public static CommercialCardUserType getCommercialCardUserTypeByName(String name) {
        return commercialCardUserTypeNameMap.getOrDefault(name, SCHOLAR);
    }
}
