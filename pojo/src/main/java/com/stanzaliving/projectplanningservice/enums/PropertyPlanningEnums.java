package com.stanzaliving.projectplanningservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * @author Anudeep Alevoor
 * @description ENUM for Property plan column sort
 */
@Getter
@AllArgsConstructor
public enum PropertyPlanningEnums {
    PROJECT_NAME("projectName"),
    PROPERTY_NAME("propertyName"),
    MICRO_MARKET("microMarket"),
    CITY("city"),
    PLAN_STATUS("planStatus"),
    BED_COUNT("bedCount"),
    PROGRESS("progress"),
    DEFAULT_COLUMN("updatedAt"),
    DURATION("duration"),
    CREATED_AT("createdAt");
    String name;

}
