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


	IN_PROGRESS("IN PROGRESS");

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

    public static Set<String> exitProcessBookingSubStatuses(){
        Set<String> bookingStatus = new HashSet<>();
        bookingStatus.add(EXIT_INITIATED.getBookingSubStatus());
        bookingStatus.add(KEY_HANDOVER_PENDING.getBookingSubStatus());
        return bookingStatus;
    }




}
