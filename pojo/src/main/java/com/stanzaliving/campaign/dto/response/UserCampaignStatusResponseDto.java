package com.stanzaliving.campaign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserCampaignStatusResponseDto {
    private String userUuid;
    private boolean campaignTriggered;
}
