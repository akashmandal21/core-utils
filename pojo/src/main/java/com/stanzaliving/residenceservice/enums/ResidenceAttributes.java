package com.stanzaliving.residenceservice.enums;


import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ResidenceAttributes {

    BOOKING_FLOW("Booking Flow", "String"),

    ROOM_COUNT("Room Count", "String"),

    CITY_HEAD_BUFFER_CONTRIBUTION("City Head Buffer Contribution", "String"),
    AUTO_BOOKING_CANCELLATION_TIME("Auto Booking Cancellation Time", "String"),
    MODIFY_CONTRACT_CUT_OFF_DAYS("Modify Contract Cut off Days", "String"),
    BOOKING_EXPIRY_TIME("Booking Expiry Time", "String"),

    FOREIGN_RESIDENTS_ALLOWED("Foreign Residents Allowed", "Boolean"),

    NEW_CLOSURE_MIN_TOKEN_AMOUNT("New Closure Min Token Amount", "String"),

    PENALTY_AMOUNT_PER_DAY("Penalty Amount Per Day", "String"),

    RETENTION_MIN_TOKEN_AMOUNT("Retention Min Token Amount", "String"),
    ROOM_CONVERSION_CHARGES("Room Conversion Charges", "String"),
   RETENTION_CREATION_BUFFER_DAYS("Retention Creation Buffer Days", "Integer");


    private String label;
    private String type;


    private static final Map<ResidenceAttributes, String> getType = new HashMap<>();
    static {
        for (ResidenceAttributes priority : ResidenceAttributes.values()) {
            getType.put(priority,priority.type);
        }
    }
    private static final Map<ResidenceAttributes, String> getLabel = new HashMap<>();
    static {
        for (ResidenceAttributes priority : ResidenceAttributes.values()) {
            getLabel.put(priority,priority.label);
        }
    }
    public static String getLabel(ResidenceAttributes priority) {
        return getType.get(priority);
    }
    public static String getType(ResidenceAttributes priority) {
        return getLabel.get(priority);
    }
 }
