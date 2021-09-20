package com.stanzaliving.housekeepingservice.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum AreaCommonSortSpecs {

    AREA_NAME("areaName"),
    SIZE_IN_SQFT("sizeInSqFt"),
    CLEANING_TIME_IN_MINUTES("cleaningTimeInMinutes");
    private String dbKey;

}