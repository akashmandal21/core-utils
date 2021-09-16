package com.stanzaliving.housekeepingservice.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum AreaCommonSortSpecs {

    AREANAME("areaName"),
    SIZEINSQFT("sizeInSqFt"),
    CLEANINGTIMEINMINUTES("cleaningTimeInMinutes");
    private String dbKey;

}