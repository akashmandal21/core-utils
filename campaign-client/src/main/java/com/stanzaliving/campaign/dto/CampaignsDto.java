package com.stanzaliving.campaign.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampaignsDto {

	private String residenceUuid;

	private Map<String, Boolean> userBlockerMap;

	private List<String> items;

	private String campaignType;

	private String campaignSubType;// mealName

	private Date startTime;

	private Date endTime;

	private String responseTopic; // foodFeedbackResponse

	private Map<String, Object> responseMergeData;

	private String submitText;

}
