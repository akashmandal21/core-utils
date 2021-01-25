package com.stanzaliving.campaign.dto.response;

import com.stanzaliving.campaign.enums.CampaignType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class KafkaUserCampaignResponseDto extends UserCampaignResponseDto {

    String residenceUuid;

    CampaignType campaignType;

    String campaignSubType;
}
