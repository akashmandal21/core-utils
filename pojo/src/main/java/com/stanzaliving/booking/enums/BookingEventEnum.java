package com.stanzaliving.booking.enums;

public enum BookingEventEnum {
    BOOKING_CREATED,
    BOOKING_DETAILS_UPDATED,
    INITIATE_BOOKING,
    TOKEN_AMOUNT_PAID,
    CONFIRM_BOOKING,
    BOOKING_EXPIRED,
    PAYMENT_MODE_OFFLINE,
    PAYMENT_MODE_CHEQUE_PENDING,
    PAYMENT_MODE_ONLINE,
    PAYMENT_PENDING_SUCCESS,
    PAYMENT_PENDING_FAILURE,
    PAYMENT_PENDING_CANCELLATION,
    PERSONAL_DETAILS_FILLED,
    BOOKING_AMOUNT_PAID,
    DETAILS_FILLED_BOOKING_AMOUNT_PAID,
    AGREEMENT_CREATED,
    AGREEMENT_SIGNED,
    INITIATE_ONBOARDING,
    PENDING_KYC_SUBMISSION,
    PENDING_KYC_VERIFICATION,
    KYC_UPDATE_FAILED,
    KYC_UPDATE_SUCCESS,
    ROOM_HANDOVER_COMPLETE,
    COMPLETE_ONBOARDING,
    COMPLETE_EXCEPTIONAL_ONBOARDING,
    AUDIT_APPROVED,
    AUDIT_APPROVED_EMAIL,
    AUDIT_REJECTED,
    ADDENDUM_SIGNED,
    LEAD_BOOKED,
    BOOKING_AMOUNT_PENDING,
    CONTRACT_MODIFICATION_PENDING,
    TRESSPASSER,
    MARK_DEFAULTER_UNPAID,
    MARK_DEFAULTER_PAID,
    MARK_STAY_FORFEITURE,
    MARK_CONTRACT_COMPLETED;
}