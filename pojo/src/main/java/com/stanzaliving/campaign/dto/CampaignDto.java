package com.stanzaliving.campaign.dto;

import java.util.Date;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.stanzaliving.campaign.dto.request.FoodFeedbackCampaignRequestDto;
import com.stanzaliving.campaign.dto.request.GenericCampaignRequestDto;
import com.stanzaliving.campaign.enums.CampaignType;
import com.stanzaliving.core.base.StanzaConstants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "campaignType", visible = true)
@JsonSubTypes({
		@JsonSubTypes.Type(value = FoodFeedbackCampaignRequestDto.class, name = "FOOD_FEEDBACK"),
		@JsonSubTypes.Type(value = GenericCampaignRequestDto.class, name = "TIFFIN_RECEIVE"),
		@JsonSubTypes.Type(value = GenericCampaignRequestDto.class, name = "GENERIC")
})
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class CampaignDto {

	String name;

	@NotNull(message = "campaignType is mandatory")
	CampaignType campaignType;

	String campaignSubType;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = StanzaConstants.IST_TIMEZONE)
	Date startTime;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = StanzaConstants.IST_TIMEZONE)
	Date endTime;

	@Builder.Default
	String submitText = "Submit";

	@Builder.Default
	boolean pushNotification = true;

	Map<String, Object> responseMergeData;

	@Builder.Default
	String responseTopic = "campaignResponse";

	String residenceUuid;

	String webEngageAccountId;

	String webEngageCampaignId;

}
