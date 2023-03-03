package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaskSubCategory {
    RECIEVE_MEALS("Receive meals"),
    DAMAGE_CHECK("Damage Check"),
    METER_READING("Enter Meter Reading"),
    POLICE_VERIFICATION("Police Verification"),
    RESOLVE_COMPLAINT("Resolve complaint"),
    COMPLETE_EXIT("Complete Exit"),
    COMPLETE_AUDIT("Complete Audit"),
    PRE_ONBOARDING_CHECKLIST("Pre OnBoarding Checklist");

    private String name;
}