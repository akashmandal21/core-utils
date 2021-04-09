package com.stanzaliving.campaign_dashboard.dto;

import com.stanzaliving.campaign_dashboard.enums.CampaignDashboardType;
import com.stanzaliving.campaign_dashboard.enums.CampaignGroup;
import com.stanzaliving.campaign_dashboard.validation.DraftValidation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

public class CampaignDetailsDto {
    @NotBlank(message = "Campaign name cannot be empty")
    @Size(
            max = 36,
            message = "Campaign Name can't be more than 36 characters",
            groups = {DraftValidation.class, Default.class})
    String campaignName;

    @NotNull(message = "Campaign type cannot be empty")
    CampaignDashboardType campaignType;

    @NotNull(message = "Campaign group cannot be empty")
    CampaignGroup campaignGroup;

    Integer priorityOrder;

    @Size(
            max = 180,
            message = "Campaign Objective can't be more than 180 characters",
            groups = {DraftValidation.class, Default.class})
    String campaignObjective;
}
