package com.stanzaliving.housekeepingservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum HkStaffSortSpecs {
    EMPLOYEE_NAME("employeeName"),
    UUID("uuid"),
    MOBILE_NO("mobileNo"),
    UPDATEDAT("updatedAt");
    private String dbKey;
}
