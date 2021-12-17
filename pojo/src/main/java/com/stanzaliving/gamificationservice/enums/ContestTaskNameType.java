package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;


@Getter
@AllArgsConstructor
public enum ContestTaskNameType {
    PREBOOKING("Pre-Booking"), VISITS_COMPLETED("Visits Completed");

    private static final SortedMap<String, ContestTaskNameType> typeMap = new TreeMap<String, ContestTaskNameType>();

    static {
        for (ContestTaskNameType type : ContestTaskNameType.values()) {
            typeMap.put(type.getTypeName(), type);
        }
    }

    private final String typeName;

    public static Collection<ContestTaskNameType> getType() {
        return typeMap.values();
    }
}
