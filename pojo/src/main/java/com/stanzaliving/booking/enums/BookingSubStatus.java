package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Getter
@AllArgsConstructor
public enum BookingSubStatus {


    IN_PROGRESS("IN PROGRESS"),
    NEEDS_ATTENTION("NEEDS ATTENTION"),
    COLLECT_PAYMENT_FROM_RESIDENT("COLLECT PAYMENT FROM RESIDENT"),
    PERSONAL_DETAILS_PENDING("PERSONAL DETAILS PENDING"),
    BOOKING_AMOUNT_PENDING("BOOKING AMOUNT PENDING"),
    PENDING_KYC_SUBMISSION("PENDING KYC SUBMISSION"),
    GUEST_PENDING_KYC_SUBMISSION("GUEST PENDING KYC SUBMISSION"),
    PENDING_KYC_VERIFICATION("PENDING KYC VERIFICATION"),
    EXIT_INITIATED("EXIT INITIATED"),
    KYC_REJECTED("KYC REJECTED"),
    ROOM_HANDOVER_PENDING("ROOM HANDOVER PENDING"),
    CONTRACT_MODIFICATION_PENDING("CONTRACT MODIFICATION PENDING"),
    KEY_HANDOVER_PENDING("KEY HANDOVER PENDING"),
    AUDIT_PENDING("AUDIT PENDING"),
    AUDIT_APPROVED("AUDIT APPROVED"),
    AUDIT_REJECTED("AUDIT REJECTED"),
    PENDING_CH_APPROVAL("PENDING CH APPROVAL"),
    AUDIT_APPROVAL_PENDING("AUDIT APPROVAL PENDING"),
    PENDING_ZH_APPROVAL("PENDING ZH APPROVAL"),
    USER_VALIDATION_FAILURE("USER VALIDATION FAILURE"),
    PENDING_SELFIE_SUBMISSION("PENDING SELFIE SUBMISSION"),
    PRIMARY_SIGNING_PENDING("PRIMARY SIGNING PENDING"),
    SECONDARY_SIGNING_PENDING("SECONDARY SIGNING PENDING"),
    COMMERCIAL_DETAILS_PENDING("COMMERCIAL DETAILS PENDING"),
    PAYMENT_PENDING("PAYMENT PENDING");

    private String bookingSubStatus;

    public static Set<String> bookingNeedsAttention() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingSubStatus.NEEDS_ATTENTION.getDescription());
        return bookingStatus;
    }

    public static Set<String> userActionPending() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(BookingSubStatus.PENDING_KYC_VERIFICATION.getDescription());
        return bookingStatus;
    }

    public String getDescription() {
        return bookingSubStatus;
    }

    public static Map<String , BookingSubStatus> getBookingSubStatusList(){
        Map<String, BookingSubStatus> bookingStatusMap = new HashMap<>();
        for(BookingSubStatus bookingSubStatus : BookingSubStatus.values()){
            bookingStatusMap.put(bookingSubStatus.bookingSubStatus , bookingSubStatus);
        }
        return bookingStatusMap;
    }

    public static BookingSubStatus getBookingSubStatus(String bookingSubStatus){
        Map<String, BookingSubStatus> bookingSubStatusMap = getBookingSubStatusList();
        if(bookingSubStatusMap.containsKey(bookingSubStatus)) return bookingSubStatusMap.get(bookingSubStatus);
        return null;
    }

    public static Set<BookingSubStatus> isPersonalDetailsFilled() {
        Set<BookingSubStatus> bookingSubStatus = new HashSet<>();
        bookingSubStatus.add(BookingSubStatus.BOOKING_AMOUNT_PENDING);
        return bookingSubStatus;
    }

    public static Set<String> exitInitiatedBookingSubStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(EXIT_INITIATED.getBookingSubStatus());
        bookingStatus.add(PENDING_CH_APPROVAL.getBookingSubStatus());
        bookingStatus.add(KEY_HANDOVER_PENDING.getBookingSubStatus());
        return bookingStatus;
    }

    public static Set<String> AuditBookingSubStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(AUDIT_PENDING.getBookingSubStatus());
        bookingStatus.add(AUDIT_APPROVAL_PENDING.getBookingSubStatus());
        bookingStatus.add(AUDIT_APPROVED.getBookingSubStatus());
        bookingStatus.add(AUDIT_REJECTED.getBookingSubStatus());
        return bookingStatus;
    }

    public static Set<String> exitProcessBookingSubStatuses() {
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(EXIT_INITIATED.getBookingSubStatus());
        bookingStatus.add(KEY_HANDOVER_PENDING.getBookingSubStatus());
        bookingStatus.add(PENDING_CH_APPROVAL.getBookingSubStatus());
        return bookingStatus;
    }

    public static Set<BookingSubStatus> cleverTapBookingSubStatus() {
        Set<BookingSubStatus> bookingSubStatus = new HashSet<>();
        bookingSubStatus.add(BookingSubStatus.EXIT_INITIATED);
        bookingSubStatus.add(BookingSubStatus.PERSONAL_DETAILS_PENDING);
        bookingSubStatus.add(BookingSubStatus.BOOKING_AMOUNT_PENDING);
        bookingSubStatus.add(BookingSubStatus.PAYMENT_PENDING);


        return bookingSubStatus;
    }

}