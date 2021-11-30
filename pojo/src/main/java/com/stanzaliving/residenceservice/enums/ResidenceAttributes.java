package com.stanzaliving.residenceservice.enums;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResidenceAttributes {

    BOOKING_FLOW("Booking Flow", "String"),

    CITY_HEAD_BUFFER_CONTRIBUTION("City Head Buffer Contribution", "String"),
    AUTO_BOOKING_CANCELLATION_TIME("Auto Booking Cancellation Time", "String"),
    MODIFY_CONTRACT_CUT_OFF_DAYS("Modify Contract Cut off Days", "String"),
    BOOKING_EXPIRY_TIME("Booking Expiry Time", "String"),

    FOREIGN_RESIDENTS_ALLOWED("Foreign Residents Allowed", "Boolean"),

    NEW_CLOSURE_MIN_TOKEN_AMOUNT("New Closure Min Token Amount", "String"),

    PENALTY_AMOUNT_PER_DAY("Penalty Amount Per Day", "String"),

    RETENTION_MIN_TOKEN_AMOUNT("Retention Min Token Amount", "String"),
    ROOM_CONVERSION_CHARGES("Room Conversion Charges", "String"),
    RETENTION_CREATION_BUFFER_DAYS("Retention Creation Buffer Days", "Integer"),
    NO_LOCK_IN_SUITS_BOOKING("No Lock In Suits Booking", "Boolean"),
	
    MONTHLY_MULTIPLIER("Monthly Multiplier","Double"),
	SD_MULTIPLIER("SD Multiplier","Double"),
	AMC_MULTIPLIER("AMC Multiplier","Double"),
	
	FUTURE_BOOKING_ALLOWED_DAYS("Future Booking Allowed Duration","Integer"),
    NEEDS_ATTENTION_EXPIRY_TIME("Needs Attention Expiry Time","String"),

    CONVENIENCE_FEE_ENABLED("Convenience Fee Enabled","Boolean"),

    BOOKING_EXIT_DELTA_DAYS("Booking Exit Delta Days", "Integer"),
    BOOKING_EXIT_NOTICE_PERIOD("Notice Period Days", "Integer"),
    EMI_ENABLED("EMI Enabled","Boolean");
	
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

    public static List<ResidenceAttributes> residenceAttributesList() {
        List<ResidenceAttributes> residenceAttributes = new ArrayList<>();
        residenceAttributes.add(BOOKING_EXPIRY_TIME);
        residenceAttributes.add(NEW_CLOSURE_MIN_TOKEN_AMOUNT);
        residenceAttributes.add(NEEDS_ATTENTION_EXPIRY_TIME);
        return residenceAttributes;
    }
 }
