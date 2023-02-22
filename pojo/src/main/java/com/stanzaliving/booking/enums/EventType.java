package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventType {
    FOOD_RECEIVING,
    SUPPORT,
    POLICE_VERIFICATION,
    COMPLETE_EXIT,
    COMPLETE_AUDIT,
    PRE_ONBOARDING_CHECKLIST;
}