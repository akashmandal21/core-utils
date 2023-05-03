package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum BookingEventEnum {
    BOOKING_CREATED("Booking Created"),
    GUEST_BOOKING_CREATED("Guest Booking Created"),
    BOOKING_DETAILS_UPDATED("Booking Details Updated"),
    INITIATE_BOOKING("Initiate Booking"),
    TOKEN_AMOUNT_PAID("Token Amount Paid"),
    TOKEN_AMOUNT_REFUNDED("Token Amount Refunded"),
    COLLECT_PAYMENT_FROM_RESIDENT("Collect Payment From Resident"),
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
    AUDIT_RESCHEDULED("Audit Rescheduled"),
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
    VAS_OPT_OUT_EMAIL("Vas Opt Out Email"),
    CONTRACT_END("Contract"),
    LOCK_IN_END("Lock-in period"),
    MOVE_IN_DATE_CHANGE("Move-in Date Change"),
    EXIT_INITIATED("Exit Initiated"),
    EXIT_UPDATED("Exit Updated"),
    INITIATE_ZH_APPROVAL("Initiate Zonal Head Approval"),
    KEY_HANDED_OVER("Key Handed Over"),
    MARK_RESIDENT_AS_MOVE_OUT("Mark resident as move out"),
    BOOKING_AUDIT_CREATED("Booking Audit Created"),
    AUDIT_APPROVAL_PENDING("Audit Approval Pending"),
    BOOKING_MOVE_OUT_DATE_UPDATED("Booking move out date updated"),
    BOOKING_ZONAL_HEAD_REJECTED("Booking zonal head rejected"),
    BOOKING_ZONAL_HEAD_APPROVED("Booking zonal head approved"),
    EXIT_CANCELLED("Exit Cancelled"),
    USER_DEACTIVATED_AFTER_TRESPASSER("User Deactivated After trespasser"),
    USER_AGREEMENT_SIGN_VALIDATION_FAILURE("User agreement sign Validation Failure"),
    ROOM_HANDOVER_PENDING("Room handover pending"),
    ACCESS_PROVIDED_FOR_RESIDENT("Biometric/Internet access provided for resident"),
    BROKER_CREATED("Broker created"),
    USER_DEACTIVATED_AFTER_CANCELLATION("User Deactivated After cancellation"),
    ALFRED_MOVE_IN_DATE_CHANGE("Move in date is changed by Resident from Alfred App"),
    ROOM_CHANGE_REQUESTED("Room change request created"),
    CONTRACT_EXTENSION_REQUESTED("contract extension request created"),
    CONTRACT_MODIFIED("Contract is modified successfully"),
    CONTRACT_START_DATE_CROSSED("Contract Start Date Crossed"),
    BOOKING_AUTO_FORFEITURE("Booking Auto Forfeiture"),
    REMOTE_BOOKING_FORFEITURE("Remote Booking Forfeiture"),
    REMOTE_BOOKING_ROOM_SHIFT("Remote Booking Room Shift"),

    REMOTE_BOOKING_REFUND("Remote Booking Refund"),
    RESIDENCE_CHANGE_REQUESTED("Residence change request created"),
    ROFR_BOOKING_CONFIRMED("Rofr Booking Confirmed");

    private final String eventName;

    public static List<BookingEventEnum> bookingEventsForJarvisSync(){
        List<BookingEventEnum> bookingEventList = new ArrayList<>();
        bookingEventList.add(BookingEventEnum.BOOKING_AUTO_FORFEITURE);
        bookingEventList.add(BookingEventEnum.MARK_STAY_FORFEITURE);
        bookingEventList.add(BookingEventEnum.MARK_CONTRACT_TERMINATED);
        bookingEventList.add(BookingEventEnum.MARK_CONTRACT_COMPLETED);
        bookingEventList.add(BookingEventEnum.CANCEL_BOOKING);
        bookingEventList.add(BookingEventEnum.CONTRACT_END);
        bookingEventList.add(BookingEventEnum.MARK_RESIDENT_AS_MOVE_OUT);

        bookingEventList.add(BookingEventEnum.TOKEN_AMOUNT_PAID);
        bookingEventList.add(BookingEventEnum.BOOKING_AMOUNT_PAID);
        bookingEventList.add(BookingEventEnum.PAYMENT_MODE_ONLINE);
        return bookingEventList;
    }
}