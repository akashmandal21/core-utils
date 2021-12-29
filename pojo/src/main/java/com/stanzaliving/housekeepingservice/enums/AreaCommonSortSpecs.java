package com.stanzaliving.housekeepingservice.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum AreaCommonSortSpecs {

    AREA_NAME("areaName"),
    SIZE_IN_SQFT("sizeInSqFt"),
    CLEANING_TIME_IN_MINUTES("cleaningTimeInMinutes"),
    AREA_TAG_NAME("areaTagName"),
    AREA_TAG_UUID("areaTagUuid");
    private String dbKey;

}