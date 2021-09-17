package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResolutionRuleColumnEnum {
    COMPLAINT_GROUP("ComplaintGroup"),
    CATEGORY("Category"),
    CREATED_BY("CreatedAt"),
    UPDATED_BY("LastUpdatedAt");
    private final String columnName;

}
