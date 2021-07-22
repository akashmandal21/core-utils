package com.stanzaliving.booking.enums;

public enum BookingEventEnum {
    BOOKING_CREATED,
    BOOKING_DETAILS_UPDATED,
    INITIATE_BOOKING,
    TOKEN_AMOUNT_PAID,
    CONFIRM_BOOKING,
    BOOKING_EXPIRED,
    PAYMENT_MODE_OFFLINE,
    PAYMENT_MODE_ONLINE,
    PAYMENT_PENDING_SUCCESS,
    PAYMENT_PENDING_FAILURE,
    PAYMENT_PENDING_CANCELLATION,
    DETAILS_FILLED_BOOKING_AMOUNT_PAID,
    AGREEMENT_SIGNED,
    INITIATE_ONBOARDING,
    KYC_UPDATE_FAILED,
    KYC_UPDATE_SUCCESS,
    ROOM_HANDOVER_COMPLETE,
    COMPLETE_ONBOARDING
}