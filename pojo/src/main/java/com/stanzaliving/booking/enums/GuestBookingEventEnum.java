package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GuestBookingEventEnum {

    COMPLETE_ONBOARDING("Complete Onboarding"),
    PERSONAL_DETAILS_FILLED("Personal Details Filled"),
    CONTRACT_SIGNED("Contract Signed"),
    CONTRACT_SCREEN("Contract Screen"),
    PERSONAL_DETAILS_SCREEN("Personal Details Screen");

    String eventName;
}
