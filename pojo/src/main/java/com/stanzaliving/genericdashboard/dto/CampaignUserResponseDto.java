package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignUserResponseDto {
    @NotNull @NotBlank private String userId;

    @NotNull private List<UserSurveyResponseDto> surveyResponseDto;

    @NotNull @NotBlank private Long campaignId;

    private Date responseTimeStamp;
}
