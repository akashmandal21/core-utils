package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public String getDescription() {
        return bookingStatus;
    }

    public static Set<String> ignoreBookingForSummary() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.DRAFT.getDescription());
        bookingStatus.add(BookingStatus.EXPIRED.getDescription());
        return bookingStatus;
    }

    public static Set<String> bookingUnderDraft() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.IN_PROGRESS.getDescription());
        return bookingStatus;
    }

    //User action pending - agreement pending + agreement sent + Pending KYC Submission
    public static Set<String> userActionPending() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        return bookingStatus;
    }


    public static Set<String>  bookingNeedsAttention() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT.getDescription());
        return bookingStatus;
    }

    public static Set<String> invoicingStatus() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> agreementSignedStatus() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> agreementSentStatus() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> pricingPlanStatus() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT.getDescription());
        bookingStatus.add(BookingStatus.PAYMENT_PENDING.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> RESIDENT_AGREEMENT() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> ONBOARDING_DETAILS() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> RESIDENT_LEDGER() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

}
