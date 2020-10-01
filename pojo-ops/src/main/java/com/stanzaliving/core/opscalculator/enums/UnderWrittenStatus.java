package com.stanzaliving.core.opscalculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum UnderWrittenStatus {
    NEW("New", ""),
    UNDER_DRAFT("Under Draft", "Underwritten saved successfully"),
    SENT_FOR_APPROVAL("Sent For Approval", "Underwritten submitted for approval"),
    APPROVED("Approved", "Underwritten approved successfully"),
    REJECTED("Rejected", "Underwritten rejected successfully"),
    DISCARDED("Discarded", "Underwritten discarded successfully");

    String status;
    String responseMsg;
}
