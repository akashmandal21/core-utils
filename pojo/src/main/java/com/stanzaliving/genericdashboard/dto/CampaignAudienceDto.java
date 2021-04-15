package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignAudienceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CampaignAudienceDto {
    @NotNull(message = "Campaign Audience cannot be empty")
    private CampaignAudienceType campaignAudienceType;

    private AudienceLocationDto userLocationData;

    private FileUploadDto fileUploadDto;

    private Long distributionDays;

    private Long numberOfUsers;

    private String id;
}
