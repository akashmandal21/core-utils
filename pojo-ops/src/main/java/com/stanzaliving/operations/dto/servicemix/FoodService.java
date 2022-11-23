package com.stanzaliving.operations.dto.servicemix;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodService extends BooleanService {
	
	@JsonProperty("BREAKFAST")
	private Meal breakfast;
	
	@JsonProperty("BRUNCH")
	private Meal brunch;
	
	@JsonProperty("LUNCH")
	private Meal lunch;
	
	@JsonProperty("DINNER")
	private Meal dinner;
	
	@JsonProperty("EVENING_SNACKS")
	private Meal eveningSnacks;
	
	@JsonProperty("LUNCH_TIFFIN")
	private LunchTiffin lunchTiffin;
}
