package com.stanzaliving.core.client.api;

public enum EventType {
    BOOKING_CREATED("Booking Created"),
    SHARED_WITH_RESIDENT("Shared With Resident"),
    BOOKING_AMOUNT_PENDING("Booking Amount Pending"),
    AGREEMENT_SENT("Agreement Sent"),
    BOOKING_AMOUNT_REMINDER("Booking Amount Reminder"),
    KYC_PENDING("Kyc Pending"),
    ONBOARDING_COMPLETED("Onboarding Completed"),
    PENDING_KYC_VERIFICATION("Pending Kyc Verification"),
    EXCEPTION_ONBOARDING_REQUEST("Exception Onboarding Request"),
    EVERY_SUCCESSFUL_TRANSACTION("Every Successful Transaction"),
    AGREEMENT_PENDING("Agreement Pending"),
    MODIFY_CONTRACT_REQUEST("Modify Contract Request"),
    TRESSPASSER_BOOKINGS("Tresspasser Bookings"),
    VISIT_SCHEDULED_TODAY("Visit Scheduled Today"),
    VISIT_SCHEDULED_TODAY_1("One Visit Scheduled Today"),
    VISIT_SCHEDULED("Visit Scheduled"),
    INVITE_GUEST_SMS("Invite Guest Sms"),
    INVITE_GUEST_EMAIL("Invite Guest Email"),
    CANCEL_INVITE_GUEST_SMS("Cancel Invite Guest Sms"),
    CANCEL_INVITE_GUEST_EMAIL("Cancel Invite Guest Email"),
    REFUND_SUCCESSFULLY_PROCESSED("Refund successfully processed"),
    PRICE_ESCALATION_ALERT("Price Escalation Alert"),
    CONTRACT_TERMINATION("Contract Termination"),
    CAPTURE_BANK_DETAILS("capture bank details"),
    INELIGIBLE_REFUNDS_DUE_GREATER_THAN_SD("ineligible refunds due greater than SD"),
    INELIGIBLE_REFUNDS_LEFT_WITHIN_LOCKIN("ineligible refunds within lockin"),
    PRE_BOOKING_COMPLETED("Pre Booking completed"),
    TOKEN_AMOUNT_PAID("Token Amount Paid"),
    CONTRACT_START_DATE_CROSSED("Contract Start Date Crossed"),
    BOOKING_AUTO_FORFEITURE("Booking Auto Forfeiture"),

    THREE_DAYS_BEFORE_CSD("Three Days Before CSD"),

    THREE_DAYS_BEFORE_BOOKING_FORFEITURE("Three Days Before CSD"),

    AUDIT_REJECTED("Audit Rejected"),
    AUDIT_APPROVED_EMAIL("Audit Approved Email"),
    SETTLE_LEDGER_REJECTED_REFUNDS("Settle Ledger Rejected Refunds"),
    VAS_OPT_IN_EMAIL("Vas Opt In Email"),
    VAS_OPT_OUT_EMAIL("Vas Opt Out Email"),
    CHECK_FOR_BALANCE_IN_RAZORPAY_REFUND("CHECK_FOR_BALANCE_IN_RAZORPAY_REFUND"),
    COMPLETE_ONBOARDING("Complete Onboarding"),
    DISCOUNT_DIGEST_EMAIL("DISCOUNT_DIGEST_EMAIL"),
    IMS_DIGEST_EMAIL("IMS Digest Email"),
    COMMERCIAL_CODE_EMAIL_DIGEST("COMMERCIAL_CODE_EMAIL_DIGEST"),
    CHECK_FOR_BALANCE_IN_MSG_91("CHECK_FOR_BALANCE_IN_MSG_91"),
    REFUND_CALCULATION_INTIMATION_TO_USER("REFUND_CALCULATION_INTIMATION_TO_USER"),
    REMOTE_BOOKING_ROOM_SHIFT("REMOTE_BOOKING_ROOM_SHIFT"),
    REMOTE_BOOKING_FORFEITURE("REMOTE_BOOKING_FORFEITURE"),
    REMOTE_BOOKING_REFUND("REMOTE_BOOKING_REFUND"),
    MEDULLA_PARTNER("MEDULLA_PARTNER");
    private String commandText;

    EventType(String commandText)
    {
        this.commandText = commandText;
    }

    public String showEventType(){return commandText;}
}
