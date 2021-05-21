package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CampaignStatus {
    DRAFT("Draft"),
    PENDING("Pending"),
    REJECTED("Rejected"),
    APPROVED("Approved"),
    LIVE("Live"),
    COMPLETED("Completed"),
    TERMINATED("Terminated");

    String status;

}
