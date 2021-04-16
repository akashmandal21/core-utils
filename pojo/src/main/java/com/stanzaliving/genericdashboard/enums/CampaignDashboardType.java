package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CampaignDashboardType {
    NUDGE("Nudge"),
    NOTIFICATION("Notification"),
    SURVEY("Survey");

    String campaignType;

}

