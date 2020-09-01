package com.stanzaliving.wanda.response;

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
public class FoodHomeScreenResponse {

	private String tomorrowMealTime;
	
	private String foodString;
	
	private String foodIcon;
	
	private String foodTitle;
	
	private String foodItems;
	
	private boolean today;
}