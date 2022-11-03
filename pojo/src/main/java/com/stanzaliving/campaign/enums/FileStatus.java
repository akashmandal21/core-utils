package com.stanzaliving.campaign.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FileStatus {
    GENERATION_IN_PROGRESS("File Generation is in Progress"),
    GENERATION_ABORTED("File Generation is aborted"),
    GENERATION_COMPLETE("File Generation Completed"),
    GENERATION_ERROR("Error in File Generation");

    private String fileStatus;
}
