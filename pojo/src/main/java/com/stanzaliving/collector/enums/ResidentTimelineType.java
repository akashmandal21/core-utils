package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResidentTimelineType {
    PLAN_OF_ACTION(""), BOOKING_AMOUNT("Annual Maintenance Charges"), SECURITY_DEPOSIT("Security Deposit"),
    PAYMENT("Payment"), RENTAL_FEE("Rental Fee"), SERVICE_FEE("Service Fee"), FOOD_FEE("Food Fee"),
    VAS_FEE("VAS Fee"), AMC_FEE("AMC Fee"), PROCESSING_FEE("Staggered plan processing fee"),
    PENALTY("Penalty"), CREDIT_NOTE("Credit Note");

    private String responseString;
}
