package com.stanzaliving.campaign.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
public enum CampaignType {

    FOOD_FEEDBACK("foodFeedbackCampaignService"), GENERIC("genericCampaignService");

    private String serviceBeanName;

}
