package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BusinessHourColumnEnum {
    COMPLAINT_GROUP("ComplaintGroup"),
    CATEGORY("Category"),
    CREATED_AT("CreatedAt"),
    UPDATED_AT("LastUpdatedAt"),
    SUB_CATEGORY("SubCategory"),
    START_TIME("StartTime"),
    END_TIME("EndTime"),
    BUFFER_TIME("BufferTime");
    private final String columnName;
}
