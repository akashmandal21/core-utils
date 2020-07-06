package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResidentTimelineType {
    PLAN_OF_ACTION(""), BOOKING_AMOUNT("Booking Amount"), PAYMENT("Payment"),
    RENTAL_FEE("Rental Fee"), SERVICE_FEE("Service Fee"), FOOD_FEE("Food Fee"),
    VAS_FEE("VAS Fee"), AMC_FEE("AMC_Fee"), PROCESSING_FEE("Processing Fee"),
    PENALTY("Penalty"), CREDIT_NOTE("Credit Note");

    private String responseString;
}
