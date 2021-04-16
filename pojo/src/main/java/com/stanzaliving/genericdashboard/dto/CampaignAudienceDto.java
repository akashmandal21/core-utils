package com.stanzaliving.genericdashboard.dto;

import com.stanzaliving.genericdashboard.enums.CampaignAudienceType;
import lombok.*;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignAudienceDto {

    @NotNull(message = "Campaign Audience cannot be empty")
    private CampaignAudienceType campaignAudienceType;

    private AudienceLocationDto userLocationData;

    private FileUploadDto fileUploadDto;

    private Long distributionDays;

    private Long numberOfUsers;

    private String uuid;
}
