package com.stanzaliving.genericdashboard.enums;

public enum CampaignStatus {
    DRAFT("DRAFT"),
    PENDING("PENDING"),
    REJECTED("REJECTED"),
    APPROVED("APPROVED"),
    LIVE("LIVE"),
    COMPLETED("COMPLETED"),
    TERMINATED("TERMINATED");

    public String campaignStatus;

    CampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }
}
