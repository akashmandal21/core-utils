package com.stanzaliving.approval.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApprovalEntityType {
    SERVICE_MIX ("Service Mix"),
    SESSION_UNDERWRITTEN ("Session UnderWritten"),
    MONTHLY_UNDERWRITTEN ("Monthly UnderWritten");

    private String value;
}
