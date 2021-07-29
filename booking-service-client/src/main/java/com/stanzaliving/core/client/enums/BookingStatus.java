package com.stanzaliving.core.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum BookingStatus {

    DRAFT("DRAFT"),
    IN_PROGRESS("IN PROGRESS"),
    EXPIRED("EXPIRED"),

    SHARED_WITH_RESIDENT("SHARED WITH RESIDENT"),

    PAYMENT_PENDING("PAYMENT PENDING"),
    AGREEMENT_PENDING("AGREEMENT PENDING"),

    AGREEMENT_SENT("AGREEMENT SENT"),

    ONBOARDING_PENDING("ONBOARDING PENDING"),
    ONBOARDING_IN_PROGRESS("ONBOARDING IN PROGRESS"),
    ONBOARDING_COMPLETED("ONBOARDING COMPLETED");

    private String bookingStatus;

    public static List<BookingStatus> bookingEligibleForExpirationStatus() {
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        return bookingStatus;
    }

    public String getDescription() {
        return bookingStatus;
    }
}
