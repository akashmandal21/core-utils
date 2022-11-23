package com.stanzaliving.campaign.dto;

import com.stanzaliving.campaign.enums.CampaignType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserActiveNudgeCampaignDto {

  private List<String> userUuidIds;

  private CampaignType campaignType;
}
