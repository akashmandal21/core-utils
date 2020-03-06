package com.stanzaliving.campaign.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserCampaignStatusResponseDto {
    private String userUuid;
    private boolean campaignTriggered;
}
