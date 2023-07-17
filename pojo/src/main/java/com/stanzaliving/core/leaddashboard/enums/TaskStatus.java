package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TaskStatus {

    CANCELLED("Cancelled"), PENDING("Not Completed"), COMPLETED("Completed");

    private String statusDesc;

}