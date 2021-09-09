package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ApartmentType {

<<<<<<< HEAD
    ONE_BHK("1 BHK"),
    TWO_BHK("2 BHK"),
    THREE_BHK("3 BHK"),
    FOUR_BHK("4 BHK"),
    FIVE_BHK("5 BHK");
=======
    ONE_BHK("1BHK",1),
    TWO_BHK("2BHK",2),
    THREE_BHK("3BHK",3),
    FOUR_BHK("4BHK",4),
    FIVE_BHK("5BHK",5);
>>>>>>> master


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
