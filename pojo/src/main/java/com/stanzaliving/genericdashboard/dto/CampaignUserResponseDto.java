package com.stanzaliving.genericdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignUserResponseDto {
    @NotNull
    @NotBlank
    private String userUuid;

    @NotNull
    private List<UserSurveyResponseDto> surveyResponseDto;

    @NotNull
    @NotBlank
    private String campaignUuid;

    private Date responseTimeStamp;
}

