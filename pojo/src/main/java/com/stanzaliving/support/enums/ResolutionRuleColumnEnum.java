package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResolutionRuleColumnEnum {
    COMPLAINT_GROUP("ComplaintGroup"),
    CATEGORY("Category"),
    CREATED_AT("CreatedAt"),
    UPDATED_AT("LastUpdatedAt");
    private final String columnName;

}
