package com.stanzaliving.campaign_dashboard.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class CampaignRequestDto {

    Long id;

    @NotBlank(message = "Department Name cannot be empty")
    String departmentName;

    @Valid CampaignDetailsDto campaignDetails;

    @Valid TemplateDetailsDto templateDetails;

    @Valid SchedulingDto notificationScheduling;

    @Valid CampaignAudienceDto campaignAudience;

    SurveyDto surveyDto;
}

