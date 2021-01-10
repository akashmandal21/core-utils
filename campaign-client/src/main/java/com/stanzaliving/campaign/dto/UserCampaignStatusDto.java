package com.stanzaliving.campaign.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserCampaignStatusDto {

	private String userUuid;

	private boolean campaignTriggered;
}
