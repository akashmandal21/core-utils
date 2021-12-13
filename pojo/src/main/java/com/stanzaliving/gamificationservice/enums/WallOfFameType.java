package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;


@Getter
@AllArgsConstructor
public enum WallOfFameType {
    WINNER("Winner"), OTHER("Other");

    private static final SortedMap<String, WallOfFameType> typeMap = new TreeMap<String, WallOfFameType>();

    static {
        for (WallOfFameType type : WallOfFameType.values()) {
            typeMap.put(type.getTypeName(), type);
        }
    }

    private final String typeName;

    public static Collection<WallOfFameType> getType() {
        return typeMap.values();
    }
}
