package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ApartmentType {

    ONE_BHK("1BHK"),
    TWO_BHK("2BHK"),
    THREE_BHK("3BHK"),
    FOUR_BHK("4BHK"),
    FIVE_BHK("5BHK");


    private static final Map<String, ApartmentType> map = new HashMap<>();

    static {
        for (ApartmentType apartmentType : ApartmentType.values()) {
            map.put(apartmentType.value, apartmentType);
        }
    }

    private final String value;

    public static ApartmentType enumOf(String apartmentType) {
        return map.get(apartmentType);
    }
}
