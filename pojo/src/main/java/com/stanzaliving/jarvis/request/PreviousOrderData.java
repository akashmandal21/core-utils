package com.stanzaliving.jarvis.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PreviousOrderData {

    FOOD_MIR("Food MIR"),
    ATTENDANCE("Attendance"),
    ORDERS("Orders"),
    SCANS("Scans"),
    GRAMMAGE("Grammage"),
    UNSCANNED_MEAL_COST("Unscanned Meal Cost"),
    SHORTAGE_COMPLAINTS("Shortage Complaints");

    private final String previousOrderDataName;
}