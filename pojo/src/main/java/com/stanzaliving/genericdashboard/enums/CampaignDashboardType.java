package com.stanzaliving.genericdashboard.enums;

public enum CampaignDashboardType {
    NUDGE("NUDGE"),
    NOTIFICATION("NOTIFICATION"),
    SURVEY("SURVEY");

    public String campaignDashboardType;

    CampaignDashboardType(String campaignDashboardType) {
        this.campaignDashboardType = campaignDashboardType;
    }
}

