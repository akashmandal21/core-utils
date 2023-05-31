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
    SCHOLAR,
    SUITES,
    MANAGED_APARTMENT,
    MANAGED_APARTMENTS,
    ALL,
    PROFESSIONAL;

    private static Map<String, CommercialCardUserType> commercialCardUserTypeByName = new HashMap<>();
    static {
        for (CommercialCardUserType commercialCardUserType : CommercialCardUserType.values()) {
            commercialCardUserTypeByName.put(commercialCardUserType.name(), commercialCardUserType);
        }
    }
    public static CommercialCardUserType getCommercialTypeUserName(String commercialCardUserType) {
            return commercialCardUserTypeByName.get(commercialCardUserType);
    }
}
