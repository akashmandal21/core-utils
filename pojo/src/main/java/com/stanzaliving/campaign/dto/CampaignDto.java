package com.stanzaliving.campaign.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.stanzaliving.campaign.dto.request.FoodFeedbackCampaignRequestDto;
import com.stanzaliving.campaign.enums.CampaignType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "campaignType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FoodFeedbackCampaignRequestDto.class, name = "FOOD_FEEDBACK")
})
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CampaignDto {

    @NotNull CampaignType campaignType;

    @NotNull Date expiryTime;

    String campaignSubType;

    String name;

    @Builder.Default
    String submitText = "Submit";

    @Builder.Default
    boolean pushNotification = true;

    Map<String, Object> responseMergeData;

    @Builder.Default
    String responseTopic = "campaignResponse";

    String residenceUuid;

    List<String> userUuidList;


}
