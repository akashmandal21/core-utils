package com.stanzaliving.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ResidenceAttributes {

    EMI_ENABLED("EMI Enabled", "Boolean"),
    BOOKING_FLOW("Booking Flow", "String"),
    SD_MULTIPLIER("SD Multiplier", "Double"),
    AMC_MULTIPLIER("AMC Multiplier", "Double"),
    BOOKING_START_DATE("Booking Start Date", "Date"),
    UNDERWRITE_FINANCE("Underwrite Price", "Double"),
    MONTHLY_MULTIPLIER("Monthly Multiplier", "Double"),
    BOOKING_EXPIRY_TIME("Booking Expiry Time", "String"),
    EXIT_PROCESSING_FEE("Exit Processing Fee", "Double"),
    BOOKING_EXIT_NOTICE_PERIOD("Notice Period", "String"),
    PRE_BOOKING_START_DATE("Pre-Booking Start Date", "Date"),
    PENALTY_AMOUNT_PER_DAY("Penalty Amount Per Day", "String"),
    ROOM_CONVERSION_CHARGES("Room Conversion Charges", "String"),
    CONVENIENCE_FEE_ENABLED("Convenience Fee Enabled", "Boolean"),
    PRICE_ESCALATION_ENABLE("Price Escalation Enabled", "Boolean"),
    NO_LOCK_IN_SUITS_BOOKING("No Lock In Suits Booking", "Boolean"),
    FOREIGN_RESIDENTS_ALLOWED("Foreign Residents Allowed", "Boolean"),
    RETENTION_MIN_TOKEN_AMOUNT("Retention Min Token Amount", "String"),
    NEEDS_ATTENTION_EXPIRY_TIME("Needs Attention Expiry Time", "String"),
    MODIFY_CONTRACT_CUT_OFF_DAYS("Modify Contract Cut off Days", "String"),
    NEW_CLOSURE_MIN_TOKEN_AMOUNT("New Closure Min Token Amount", "String"),
    MAXIMUM_WAIVE_OFF_PERCENTAGE("Maximum Waive off Percentage", "Double"),
    CITY_HEAD_BUFFER_CONTRIBUTION("City Head Buffer Contribution", "String"),
    FUTURE_BOOKING_ALLOWED_DAYS("Future Booking Allowed Duration", "Integer"),
    BOOKING_EXIT_DELTA_DAYS("Buffer days for contract completion", "String"),
    AUTO_BOOKING_CANCELLATION_TIME("Auto Booking Cancellation Time", "String"),
    RETENTION_CREATION_BUFFER_DAYS("Retention Creation Buffer Days", "Integer"),
    BOOKING_AMOUNT_REALISATION_ENABLED("Booking Amount Realisation Enabled", "Boolean"),
    BOOKING_AUTO_FORFEITURE_DURATION_IN_DAYS("Booking Auto Forfeiture Duration in Days", "Integer"),
    MAX_ALLOWED_DAYS_AFTER_BOOKING_FORFEITURE("Max Allowed Days After Booking Forfeiture", "Integer"),
    BOOKING_RENEWAL_COUNTDOWN_HOURS("Booking Renewal Countdown Hours", "Integer"),
    MOVE_IN_DATE_CHANGE("Move in Date Change", "Integer"),
    CONTRACT_END_DATE_CHANGE("Contract End Date Change", "Integer"),
    LOCK_IN_DATE_CHANGE("Lock In Date Change", "Integer"),
    ROOM_CHANGE("Room Change", "Integer"),
    PLAN_CHANGE("Plan Change", "Integer"),
    ONE_MONTH_BOOKING_ENABLED("One Month Booking Enabled", "Boolean"),
    MIN_ALLOWED_DAYS_BEFORE_MOVE_IN("Min Allowed Days Before Move In", "Integer"),
    MAX_ALLOWED_DAYS_AFTER_MOVE_IN("Max Allowed Days After Move In", "Integer"),
    REFUND_SCHEDULED_DAYS("Refund Scheduled Days", "Integer"),
    EXIT_FEE_AFTER_RENEWAL("Exit Fee After Renewal", "Boolean"),
    AUTO_AUDIT_DURATION("auto audit duration", "Integer");


    private static final Map<ResidenceAttributes, String> getType = new HashMap<>();
    private static final Map<ResidenceAttributes, String> getLabel = new HashMap<>();

    static {
        for (ResidenceAttributes priority : ResidenceAttributes.values()) {
            getType.put(priority, priority.type);
        }
    }

    static {
        for (ResidenceAttributes priority : ResidenceAttributes.values()) {
            getLabel.put(priority, priority.label);
        }
    }

    private final String label;
    private final String type;

    public static String getLabel(ResidenceAttributes priority) {
        return getLabel.get(priority);
    }

    public static String getType(ResidenceAttributes priority) {
        return getType.get(priority);
    }

    public static List<ResidenceAttributes> residenceAttributesList() {
        List<ResidenceAttributes> residenceAttributes = new ArrayList<>();
        residenceAttributes.add(BOOKING_EXPIRY_TIME);
        residenceAttributes.add(NEW_CLOSURE_MIN_TOKEN_AMOUNT);
        residenceAttributes.add(NEEDS_ATTENTION_EXPIRY_TIME);
        residenceAttributes.add(BOOKING_START_DATE);
        residenceAttributes.add(PRE_BOOKING_START_DATE);
        residenceAttributes.add(RETENTION_MIN_TOKEN_AMOUNT);
        residenceAttributes.add(EXIT_PROCESSING_FEE);
        residenceAttributes.add(BOOKING_RENEWAL_COUNTDOWN_HOURS);
        residenceAttributes.add(BOOKING_AMOUNT_REALISATION_ENABLED);
        residenceAttributes.add(FUTURE_BOOKING_ALLOWED_DAYS);
        return residenceAttributes;
    }

}