package com.stanzaliving.approval.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ApprovalEntityType {
    SERVICE_MIX("Service Mix"),
    SESSION_UNDERWRITTEN("Session UnderWritten"),
    MONTHLY_UNDERWRITTEN("Monthly UnderWritten"),
    FOOD_MENU_CATEGORY("Food Menu Category"),
    WEEKLY_MENU("Weekly Menu"),
    ;

    private final String value;

    public static final List<ApprovalEntityType> micormarketUuidBasedListing = Arrays.asList(FOOD_MENU_CATEGORY, WEEKLY_MENU);
}
