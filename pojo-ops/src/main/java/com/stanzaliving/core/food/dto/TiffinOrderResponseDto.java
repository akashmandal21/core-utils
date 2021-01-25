package com.stanzaliving.core.food.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TiffinOrderResponseDto {

	private String userUuid;

	private String campaignUuid;

	private String campaignResponseType;

	private Map<String, Object> responseMap;

}
