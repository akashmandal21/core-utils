package com.stanzaliving.support.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum ResolutionRuleColumnEnum {
    COMPLAINT_GROUP("complaintGroup"),
    CATEGORY("category"),
    SUB_CATEGORY("subCategory"),
    SUB_TICKET_TASK("subTicketTask"),
    RESOLUTION_LEVEL("resolutionLevel"),
    ACTIVE("active"),
    CREATED_BY("createdBy"),
    UPDATED_BY("UpdatedBy");
    private final String name;
}
