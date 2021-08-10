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
    PENDING_KYC_VERIFICATION("PENDING KYC VERIFICATION"),
    KYC_REJECTED("KYC REJECTED"),
    ROOM_HANDOVER_PENDING("ROOM HANDOVER PENDING"),
    CONTRACT_MODIFICATION_PENDING("CONTRACT MODIFICATION PENDING");

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
        if(bookingSubStatusMap.containsKey(bookingSubStatus)) return bookingSubStatusMap.get(bookingSubStatusMap);
        return null;
    }

    public static Set<BookingSubStatus> isPersonalDetailsFilled() {
        Set<BookingSubStatus> bookingSubStatus = new HashSet<>();
        bookingSubStatus.add(BookingSubStatus.BOOKING_AMOUNT_PENDING);
        return bookingSubStatus;
    }
}
