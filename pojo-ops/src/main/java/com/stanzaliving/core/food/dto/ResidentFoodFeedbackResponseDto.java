package com.stanzaliving.core.food.dto;

import java.util.Map;

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
public class ResidentFoodFeedbackResponseDto {

	private String userUuid;

	private String residenceUuid;

	private String campaignUuid;

	private String campaignResponseType;

	private String campaignSubType;

	private Map<String, Object> responseMap;

}
