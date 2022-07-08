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
    CANCEL_INVITE_GUEST_EMAIL("Cancel Invite Guest Email");
    TRESSPASSER_BOOKINGS("Tresspasser Bookings"),
    PRICE_ESCALATION_ALERT("Price Escalation Alert");
    private String commandText;

    EventType(String commandText)
    {
        this.commandText = commandText;
    }

    public String showEventType(){return commandText;}
}
