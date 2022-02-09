package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingEventEnum {
	BOOKING_CREATED("Booking Created"),
    BOOKING_DETAILS_UPDATED("Booking Details Updated"),
    INITIATE_BOOKING("Initiate Booking"),
    TOKEN_AMOUNT_PAID("Token Amount Paid"),
    CONFIRM_BOOKING("Confirm Booking"),
    BOOKING_EXPIRED("Booking Expired"),
    PAYMENT_MODE_OFFLINE("Payment Mode Offline"),
    PAYMENT_MODE_CHEQUE_PENDING("Payment Mode Cheque Pending"),
    PAYMENT_MODE_ONLINE("Payment Mode Online"),
    PAYMENT_PENDING_SUCCESS("Payment Pending Success"),
    PAYMENT_PENDING_FAILURE("Payment Pending Failure"),
    PAYMENT_CREATED("Payment Created"),
    PAYMENT_PENDING_CANCELLATION("Payment Pending Cancellation"),
    PERSONAL_DETAILS_FILLED("Personal Details Filled"),
    BOOKING_AMOUNT_PAID("Booking Amount Paid"),
    DETAILS_FILLED_BOOKING_AMOUNT_PAID("Details Filled Booking Amount Paid"),
    AGREEMENT_CREATED("Agreement Created"),
    AGREEMENT_SIGNED("Agreement Signed"),
    INITIATE_ONBOARDING("Initiate Onboarding"),
    PENDING_KYC_SUBMISSION("Pending KYC Submission"),
    PENDING_KYC_VERIFICATION("Pending KYC Verification"),
    KYC_UPDATE_FAILED("KYC Update Failed"),
    KYC_UPDATE_SUCCESS("KYC Update Success"),
    ROOM_HANDOVER_COMPLETE("Room Handover Complete"),
    COMPLETE_ONBOARDING("Complete Onboarding"),
    COMPLETE_EXCEPTIONAL_ONBOARDING("Complete Exceptional Onboarding"),
    AUDIT_APPROVED("Audit Approved"),
    AUDIT_APPROVED_EMAIL("Audit Approved Email"),
    AUDIT_REJECTED("Audit Rejected"),
    ADDENDUM_SIGNED("Addendum Signed"),
    LEAD_BOOKED("Lead Booked"),
    BOOKING_AMOUNT_PENDING("Booking Amount Pending"),
    CONTRACT_MODIFICATION_PENDING("Contract Modification Pending"),
    TRESSPASSER("Tresspasser"),
    MARK_DEFAULTER_UNPAID("Mark Defaulter Unpaid"),
    MARK_DEFAULTER_PAID("Mark Defaulter Paid"),
    MARK_STAY_FORFEITURE("Mark Stay Forefeiture"),
    MARK_CONTRACT_COMPLETED("Mark Contract Completed"),
    RESIDENT_CREATED("Resident Created"),
    MARK_RENT_DEFAULTER("Mark Rent Defaulter"),
    FILIX_CUSTOMER_CREATION("Filix Customer Creation"),
    FILIX_CUSTOMER_PAYMENT("Filix Customer Payment"),
    CANCEL_BOOKING("Cancel Booking"),
    INITIATE_AUDIT("Initiate Audit"),
    AGREEMENT_PENDING("Agreement Pending"),
    SHARED_WITH_RESIDENT("Shared With Resident"),
    MARK_CONTRACT_TERMINATED("Mark Contract Terminated"),
    VAS_OPT_IN_EMAIL("Vas Opt In Email"),
    VAS_OPT_OUT_EMAIL("Vas Opt Out Email");
	
	String eventName;

}