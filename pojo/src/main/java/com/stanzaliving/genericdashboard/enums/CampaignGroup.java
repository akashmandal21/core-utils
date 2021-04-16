package com.stanzaliving.genericdashboard.enums;

public enum CampaignGroup {
    MANDATORY("MANDATORY"),
    SKIPPABLE("SKIPPABLE");

    public String campaignGroup;

    CampaignGroup(String campaignGroup) {
        this.campaignGroup = campaignGroup;
    }
}
