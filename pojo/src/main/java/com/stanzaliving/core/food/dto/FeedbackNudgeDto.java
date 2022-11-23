package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackNudgeDto {

	private String userId;

	private String webEngageAccountId;

	private String webEngageCampaignId;

	private String orderType;

	private String mobileNumber;
}