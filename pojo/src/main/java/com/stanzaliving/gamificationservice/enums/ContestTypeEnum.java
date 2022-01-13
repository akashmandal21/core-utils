package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;


@Getter
@AllArgsConstructor
public enum ContestTypeEnum {

    INDIVIDUAL("INDIVIDUAL"), TEAM("TEAM"), CLUSTER("CLUSTER");

    private static final SortedMap<String, ContestTypeEnum> contestTypeMap = new TreeMap<String, ContestTypeEnum>();

    static {
        for (ContestTypeEnum contestType : ContestTypeEnum.values()) {
            contestTypeMap.put(contestType.getContestTypeName(), contestType);
        }
    }

    private final String contestTypeName;

    public static Collection<ContestTypeEnum> getContestType() {
        return contestTypeMap.values();
    }
}
