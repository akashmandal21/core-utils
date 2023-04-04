package com.stanzaliving.booking.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

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
    TRESSPASSER("TRESPASSER"),
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

    public String getDescription() {
        return bookingStatus;
    }

    public static List<BookingStatus> bookingEligibleForExpirationStatus() {
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        bookingStatus.add(BookingStatus.IN_PROGRESS);
        return bookingStatus;
    }

    public static Set<BookingStatus> paymentRemapStatusTransitionNotAllowedStatus() {
        Set<BookingStatus> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.IN_PROGRESS);
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        bookingStatus.add(BookingStatus.EXPIRED);
        bookingStatus.add(BookingStatus.DRAFT);
        return bookingStatus;
    }

    public static Set<BookingStatus> activeStatusBooking() {
        Set<BookingStatus> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING);
        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED);
        return bookingStatus;
    }

    public static Set<String> activeStatusBookingStr() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(AGREEMENT_PENDING.bookingStatus);
        bookingStatus.add(AGREEMENT_SENT.bookingStatus);
        bookingStatus.add(ONBOARDING_PENDING.bookingStatus);
        bookingStatus.add(ONBOARDING_IN_PROGRESS.bookingStatus);
        bookingStatus.add(ONBOARDING_COMPLETED.bookingStatus);
        return bookingStatus;
    }

    public static Set<BookingStatus> notAllowedForBookingCreationStatus() {
        Set<BookingStatus> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING);
        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED);
        return bookingStatus;
    }


    public static Set<String> retentionBookingAllowedStatus() {
        Set<String> bookingStatus = new HashSet<>();

        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getBookingStatus());
        bookingStatus.add(BookingStatus.CANCELLED.getBookingStatus());
        bookingStatus.add(BookingStatus.TRESSPASSER.getBookingStatus());
        bookingStatus.add(BookingStatus.BOOKING_FORFEITURE.getBookingStatus());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getBookingStatus());
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(BookingStatus.STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(BookingStatus.WRONG_BOOKING.getBookingStatus());

        return bookingStatus;
    }

    public static Set<String> ignoreBookingForSummary() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.DRAFT.getDescription());
        bookingStatus.add(BookingStatus.EXPIRED.getDescription());
        bookingStatus.add(BookingStatus.CANCELLED.getDescription());
        bookingStatus.add(BookingStatus.TRESSPASSER.getDescription());
        bookingStatus.add(BookingStatus.BOOKING_FORFEITURE.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.STAY_FORFEITURE.getDescription());
        bookingStatus.add(BookingStatus.WRONG_BOOKING.getDescription());
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
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        return bookingStatus;
    }


    public static Set<String>  bookingNeedsAttention() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT.getDescription());
        bookingStatus.add(BookingStatus.PAYMENT_PENDING.getDescription());
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

    public static Set<String> invoicingStatusAllowedForResident(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getDescription());
        bookingStatus.add(BookingStatus.CANCELLED.getDescription());
        return bookingStatus;
    }

    public static List<String> agreementSignedStatus() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_COMPLETED.getDescription());
        return bookingStatus;
    }

    public static List<String> agreementSentStatus() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.GUEST_AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_COMPLETED.getDescription());
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
        bookingStatus.add(BookingStatus.CANCELLED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getDescription());
        return bookingStatus;
    }

    public static List<String> RESIDENT_AGREEMENT() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CANCELLED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getDescription());
        bookingStatus.add(BookingStatus.TRESSPASSER.getDescription());
        bookingStatus.add(BookingStatus.BOOKING_FORFEITURE.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID.getDescription());
        bookingStatus.add(BookingStatus.STAY_FORFEITURE.getDescription());
        return bookingStatus;
    }

    public static List<String> ONBOARDING_DETAILS() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CANCELLED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getDescription());
        bookingStatus.add(BookingStatus.TRESSPASSER.getDescription());
        bookingStatus.add(BookingStatus.BOOKING_FORFEITURE.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID.getDescription());
        bookingStatus.add(BookingStatus.STAY_FORFEITURE.getDescription());
        bookingStatus.add(BookingStatus.WRONG_BOOKING.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        return bookingStatus;
    }

    public static List<String> RESIDENT_LEDGER() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING.getDescription());
        bookingStatus.add(BookingStatus.AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.CANCELLED.getDescription());
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED.getDescription());
        bookingStatus.add(BookingStatus.TRESSPASSER.getDescription());
        bookingStatus.add(BookingStatus.BOOKING_FORFEITURE.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID.getDescription());
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID.getDescription());
        bookingStatus.add(BookingStatus.STAY_FORFEITURE.getDescription());
        return bookingStatus;
    }

    public static List<BookingStatus> userBookingEligibleForExpiration() {
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        bookingStatus.add(BookingStatus.IN_PROGRESS);
        bookingStatus.add(BookingStatus.DRAFT);
        return bookingStatus;
    }

    public static Map<String , BookingStatus> getBookingStatusList(){
        Map<String, BookingStatus> bookingStatusMap = new HashMap<>();
        for(BookingStatus bookingStatus : BookingStatus.values()){
            bookingStatusMap.put(bookingStatus.getBookingStatus() , bookingStatus);
        }
        bookingStatusMap.put("AUTO CANCELLED", BookingStatus.CONTRACT_COMPLETED);
        bookingStatusMap.put("AWAITING CONFIRMATION", BookingStatus.AGREEMENT_PENDING);
        bookingStatusMap.put("PAYMENT RESENT", BookingStatus.PAYMENT_PENDING);
        bookingStatusMap.put("REFUND INITIATED", BookingStatus.CONTRACT_COMPLETED);
        return bookingStatusMap;
    }

    public static List<String> onboardingPendingStatus() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING.getDescription());
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_PENDING.getDescription());
        return bookingStatus;
    }

    public static BookingStatus getBookingStatus(String bookingStatus){
        Map<String, BookingStatus> bookingStatusMap = getBookingStatusList();
        if(bookingStatusMap.containsKey(bookingStatus)) return bookingStatusMap.get(bookingStatus);
        else return null;
    }

    public static Set<BookingStatus> isPersonalDetailsFilled() {
        Set<BookingStatus> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.CANCELLED);
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED);
        return bookingStatus;
    }

    public static Set<String> notInitiatedExitBookingStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(ONBOARDING_COMPLETED.getBookingStatus()); //todo: check this
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(CONTRACT_TERMINATED.getBookingStatus());
        return bookingStatus;
    }

    public static Set<String> exitInitiatedBookingStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(TRESSPASSER.getBookingStatus());
        bookingStatus.add(ONBOARDING_COMPLETED.getBookingStatus());
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(CONTRACT_TERMINATED.getBookingStatus());
        return bookingStatus;
    }

    public static Set<String> exitProcessBookingStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(TRESSPASSER.getBookingStatus()); //remove tresspasser
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(CONTRACT_TERMINATED.getBookingStatus());
        return bookingStatus;
    }

    public static Set<String> ledgerBookingStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(TRESSPASSER.getBookingStatus()); //remove tresspasser
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(CONTRACT_TERMINATED.getBookingStatus());
        bookingStatus.add(CANCELLED.getBookingStatus());
        return bookingStatus;
    }

    public static Set<String> jarvisOptOutSyncBookingStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(CONTRACT_TERMINATED.getBookingStatus());
        bookingStatus.add(CANCELLED.getBookingStatus());
        return bookingStatus;
    }

    public static List<String> afterOnBoardingCompleteStatus(){
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(EXPIRED.getBookingStatus());
        bookingStatus.add(DRAFT.getBookingStatus());
        bookingStatus.add(IN_PROGRESS.getBookingStatus());
        bookingStatus.add(CANCELLED.getBookingStatus());
        bookingStatus.add(BOOKING_FORFEITURE.getBookingStatus());
        bookingStatus.add(WRONG_BOOKING.getBookingStatus());
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        bookingStatus.add(TRESSPASSER.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(CONTRACT_TERMINATED.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER.getBookingStatus());

        return bookingStatus;
    }

    public static Set<BookingStatus> cleverTapBookingStatus(){
        Set<BookingStatus> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.IN_PROGRESS);
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING);
        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED);
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID);
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED);
        bookingStatus.add(BookingStatus.CANCELLED);
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID);
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED);
        return bookingStatus;
    }


    public static List<String> RESIDENT_CONTRACT() {
        List<String> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_COMPLETED.getDescription());
        bookingStatus.add(BookingStatus.GUEST_AGREEMENT_SENT.getDescription());
        bookingStatus.add(BookingStatus.GUEST_ONBOARDING_PENDING.getDescription());
        return bookingStatus;
    }


    public static List<BookingStatus> bookingEligibleForContractTerminationStatus() {
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.ONBOARDING_COMPLETED);
        return bookingStatus;
    }

    public static List<BookingStatus> EXIT_NOT_ALLOWED_STATUS() {
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT);
        bookingStatus.add(BookingStatus.AGREEMENT_PENDING);
        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        return bookingStatus;
    }

    public static List<BookingStatus> refundDetailsBookingStatuses(){
        List<BookingStatus> bookingStatus = new ArrayList<>();
        bookingStatus.add(BookingStatus.CONTRACT_COMPLETED);
        bookingStatus.add(BookingStatus.STAY_FORFEITURE);
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_PAID);
        bookingStatus.add(BookingStatus.RENT_DEFAULTER_UNPAID);
        bookingStatus.add(BookingStatus.CONTRACT_TERMINATED);
        bookingStatus.add(BookingStatus.TRESSPASSER);
        bookingStatus.add(BookingStatus.CANCELLED);
        return bookingStatus;
    }

    public static List<BookingStatus> bookingStatusForBookingAmountRealisation() {
        List<BookingStatus> bookingStatus = new ArrayList<>();

        bookingStatus.add(BookingStatus.AGREEMENT_PENDING);
        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        return bookingStatus;
    }

    public static List<BookingStatus> remoteBookingStatusForBookingAmountRealisation() {
        List<BookingStatus> bookingStatus = new ArrayList<>();

        bookingStatus.add(BookingStatus.AGREEMENT_SENT);
        bookingStatus.add(BookingStatus.ONBOARDING_PENDING);
        bookingStatus.add(BookingStatus.ONBOARDING_IN_PROGRESS);
        return bookingStatus;
    }

    public static Set<String> activeStatusesBooking() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingStatus.SHARED_WITH_RESIDENT.getBookingStatus());
        bookingStatus.add(AGREEMENT_PENDING.getBookingStatus());
        bookingStatus.add(AGREEMENT_SENT.getBookingStatus());
        bookingStatus.add(ONBOARDING_PENDING.getBookingStatus());
        bookingStatus.add(ONBOARDING_IN_PROGRESS.getBookingStatus());
        bookingStatus.add(ONBOARDING_COMPLETED.getBookingStatus());
        return bookingStatus;
    }

    public static Set<String> inactiveBookingStatuses() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(CONTRACT_COMPLETED.getBookingStatus());
        bookingStatus.add(CANCELLED.getBookingStatus());
        bookingStatus.add(BOOKING_FORFEITURE.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_PAID.getBookingStatus());
        bookingStatus.add(RENT_DEFAULTER_UNPAID.getBookingStatus());
        bookingStatus.add(STAY_FORFEITURE.getBookingStatus());
        return bookingStatus;
    }

}
