package com.stanzaliving.core.projectservice.enums;

import lombok.Getter;


@Getter
public enum TaskStatus {

    PENDING("Pending"),
    STARTED("Started"),
    COMPLETED("Completed");

    private String taskStatusFormat;

    TaskStatus(String taskStatusFormat) {
        this.taskStatusFormat = taskStatusFormat;
    }
}
