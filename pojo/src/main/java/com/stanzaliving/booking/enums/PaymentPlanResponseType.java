package com.stanzaliving.booking.enums;

public enum PaymentPlanResponseType {

    BOOKING("Booking"),
    INSTALLMENT("Installment");

    private String name;

    PaymentPlanResponseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
