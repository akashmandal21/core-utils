package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.CampaignAudienceType;

import javax.validation.constraints.NotNull;

public class CampaignAudienceDto {
    @NotNull(message = "Campaign Audience cannot be empty")
    CampaignAudienceType campaignAudienceType;

    AudienceLocationDto userLocationData;

    FileUploadDto fileUploadDto;

    Long distributionDays;

    Long numberOfUsers;

    Long id;
}
