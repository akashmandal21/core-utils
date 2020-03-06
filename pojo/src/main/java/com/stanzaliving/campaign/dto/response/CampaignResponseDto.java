package com.stanzaliving.campaign.dto.response;

import com.stanzaliving.campaign.dto.CampaignDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CampaignResponseDto extends CampaignDto {

    Long campaignId;

    String campaignUuid;
}
