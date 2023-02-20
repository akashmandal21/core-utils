package com.stanzaliving.core.ventaaggregationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExitVisibility {

    INITIATED("Exit Initiated","#FFD119"),
    RETAINED("Retained","#9B82A5"),
    ACTION_PENDING("User Action Pending","#5FD1D9"),
    TRESSPASSER("Tresspasser","#F55F71");

    private String label;
    private String colorCode;
}
