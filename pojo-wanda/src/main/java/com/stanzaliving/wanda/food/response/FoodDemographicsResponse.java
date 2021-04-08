package com.stanzaliving.wanda.food.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FoodDemographicsResponse {
   
	private String residenceName;
	private List<FoodPreferenceDto> foodDemographics;
}
