package com.stanzaliving.campaign_dashboard.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class CampaignUserResponseDto {
    @NotNull @NotBlank String userId;

    @NotNull List<UserSurveyResponseDto> surveyResponseDto;

    @NotNull @NotBlank Long campaignId;

    Date responseTimeStamp;
}
