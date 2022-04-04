package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuestBookingEventEnum {

    GUEST_PERSONAL_DETAILS_SCREEN("Personal Details Screen"),
    GUEST_AGREEMENT_CREATED("Guest Agreement Created"),
    CONTRACT_SIGNED("Contract Signed"),
    GUEST_COMPLETE_ONBOARDING("Complete Onboarding");

    String eventName;
}
