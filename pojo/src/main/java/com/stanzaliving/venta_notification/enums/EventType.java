package com.stanzaliving.venta_notification.enums;

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
    AUDIT_REJECTED("Audit Rejected"),
    AUDIT_APPROVED_EMAIL("Audit Approved Email"),
    MODIFY_CONTRACT_REQUEST("Modify Contract Email"),
    SETTLE_LEDGER_REJECTED_REFUNDS("Settle Ledger Rejected Refunds"),
    REFUND_SUCCESSFULLY_PROCESSED("Refund successfully processed"),
    CHECK_FOR_BALANCE_IN_RAZORPAY_REFUND("CHECK_FOR_BALANCE_IN_RAZORPAY_REFUND"),
    CHECK_FOR_BALANCE_IN_MSG_91("CHECK_FOR_BALANCE_IN_MSG_91"),
    COMMERCIAL_CODE_EMAIL_DIGEST("COMMERCIAL_CODE_EMAIL_DIGEST"),
    IMS_DIGEST_EMAIL("IMS Digest Email"),
    DISCOUNT_DIGEST_EMAIL("DISCOUNT_DIGEST_EMAIL");
    private String commandText;

    EventType(String commandText)
    {
        this.commandText = commandText;
    }

    public String showEventType(){return commandText;}
}
