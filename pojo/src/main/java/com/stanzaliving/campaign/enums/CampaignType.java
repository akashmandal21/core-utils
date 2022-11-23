package com.stanzaliving.campaign.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CampaignType {

	FOOD_FEEDBACK("foodFeedbackCampaignService"),
	GENERIC("genericCampaignService"),
	CAFE_FOOD_FEEDBACK("CafeFoodFeedbackCampaignService"),
	TIFFIN_RECEIVE("tiffinReceiveCampaignService");

	private String serviceBeanName;

}