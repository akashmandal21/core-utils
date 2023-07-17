package com.stanzaliving.core.client.enums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
    ONBOARDING_COMPLETED("ONBOARDING COMPLETED"),
    CANCELLED("CANCELLED"),
    TRESSPASSER("TRESSPASSER"),
    BOOKING_FORFEITURE("BOOKING FORFEITURE"),
    RENT_DEFAULTER_PAID("DEFAULTER PAID"),
    RENT_DEFAULTER_UNPAID("DEFAULTER UNPAID"),
    CONTRACT_TERMINATED("CONTRACT TERMINATED"),
    CONTRACT_COMPLETED("CONTRACT COMPLETED"),
    STAY_FORFEITURE("STAY FORFEITURE"),
    WRONG_BOOKING("WRONG BOOKING"),
    RENT_DEFAULTER("RENT DEFAULTER"),
    GUEST_BOOKING_IN_PROGRESS("GUEST BOOKING IN PROGRESS"),
    GUEST_AGREEMENT_PENDING("GUEST AGREEMENT PENDING"),
    GUEST_AGREEMENT_SENT("GUEST AGREEMENT SENT"),
    GUEST_ONBOARDING_PENDING("GUEST ONBOARDING PENDING"),
    GUEST_ONBOARDING_COMPLETED("GUEST ONBOARDING COMPLETED");
    private String bookingStatus;

    public static List<BookingStatus> bookingEligibleForExpirationStatus() {
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        return bookingStatus;
    }

    public String getDescription() {
        return bookingStatus;
    }

    public static Set<BookingStatus> exitInitiatedBookingStatuses(){
        Set<BookingStatus> bookingStatus = new HashSet<>();
        bookingStatus.add(TRESSPASSER);
        bookingStatus.add(CONTRACT_COMPLETED);
        bookingStatus.add(STAY_FORFEITURE);
        bookingStatus.add(RENT_DEFAULTER_PAID);
        bookingStatus.add(RENT_DEFAULTER_UNPAID);
        bookingStatus.add(CONTRACT_TERMINATED);
        return bookingStatus;
    }
}
