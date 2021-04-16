package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignRequestDto {

    private String uuid;

    @NotBlank(message = "Department Name cannot be empty")
    private String departmentName;

    private String comments;

    @Valid
    private CampaignDetailsDto campaignDetails;

    @Valid
    private TemplateDetailsDto templateDetails;

    @Valid
    private SchedulingDto notificationScheduling;

    @Valid
    private CampaignAudienceDto campaignAudience;

    private SurveyDto surveyDto;
}
