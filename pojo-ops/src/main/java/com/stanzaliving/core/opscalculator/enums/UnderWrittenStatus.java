package com.stanzaliving.core.opscalculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum UnderWrittenStatus {
    NEW("New"),
    UNDER_DRAFT("Under Draft"),
    SENT_FOR_APPROVAL("Sent For Approval"),
    APPROVED("Approved"),
    REJECTED("Rejected");

    String status;
}
