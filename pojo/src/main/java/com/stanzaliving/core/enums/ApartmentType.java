package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ApartmentType {


    ONE_BHK("1BHK", 1),
    TWO_BHK("2BHK", 2),
    THREE_BHK("3BHK", 3),
    FOUR_BHK("4BHK", 4),
    FIVE_BHK("5BHK", 5),
    SIX_BHK("6BHK", 6),
    SEVEN_BHK("7BHK", 7),
    EIGHT_BHK("8BHK", 8),
    NINE_BHK("9BHK", 9),
    TEN_BHK("10BHK", 10);

    private static final Map<String, ApartmentType> map = new HashMap<>();
    private static final Map<Integer, ApartmentType> bhkMap = new HashMap<>();

    static {
        for (ApartmentType apartmentType : ApartmentType.values()) {
            map.put(apartmentType.getValue(), apartmentType);
            bhkMap.put(apartmentType.getBhk(), apartmentType);
        }
    }

    private final String value;
    private final int bhk;

    public static ApartmentType enumOf(String apartmentType) {
        return map.get(apartmentType);
    }

}