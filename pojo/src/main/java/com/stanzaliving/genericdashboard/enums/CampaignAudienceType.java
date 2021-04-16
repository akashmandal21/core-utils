package com.stanzaliving.genericdashboard.enums;

public enum CampaignAudienceType {
    ALL("ALL"),
    SPECIFIC("SPECIFIC"),
    LIST("LIST");

    String campaignAudienceType;

    CampaignAudienceType(String campaignAudienceType) {
        this.campaignAudienceType = campaignAudienceType;
    }
}
