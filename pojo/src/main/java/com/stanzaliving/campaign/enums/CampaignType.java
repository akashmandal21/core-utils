package com.stanzaliving.campaign.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CampaignType {

	FOOD_FEEDBACK("foodFeedbackCampaignService"),
	GENERIC("genericCampaignService"),
	TIFFIN_RECEIVE("tiffinReceiveCampaignService");

	private String serviceBeanName;

}