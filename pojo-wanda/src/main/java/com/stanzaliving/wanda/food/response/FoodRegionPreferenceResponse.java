package com.stanzaliving.wanda.food.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FoodRegionPreferenceResponse {
	private String residenceUuid;

	private List<FoodRegionPreference> foodRegionPreference;
}