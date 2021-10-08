package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;


@Getter
@AllArgsConstructor
public enum BadgeType {
    QUALITATIVE("QUALITATIVE"), QUANTITATIVE("QUANTITATIVE");

    private static final SortedMap<String, BadgeType> badgeTypeMap = new TreeMap<String, BadgeType>();

    static {
        for (BadgeType badgeType : BadgeType.values()) {
            badgeTypeMap.put(badgeType.getBadgeTypeName(), badgeType);
        }
    }

    private final String badgeTypeName;

    public static Collection<BadgeType> getBadgeType() {
        return badgeTypeMap.values();
    }
}
