package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignRequestDto {

    private String id;

    @NotBlank(message = "Department Name cannot be empty")
    private String departmentName;

    @Valid private CampaignDetailsDto campaignDetails;

    @Valid private TemplateDetailsDto templateDetails;

    @Valid private SchedulingDto notificationScheduling;

    @Valid private CampaignAudienceDto campaignAudience;

    private SurveyDto surveyDto;
}

