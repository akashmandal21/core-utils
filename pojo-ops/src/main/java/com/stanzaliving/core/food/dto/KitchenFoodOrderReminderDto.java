package com.stanzaliving.core.food.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenFoodOrderReminderDto {
	private String vendorName;
	private String breakfastCutoffTime;
	private String lunchCutoffTime;
	private String snacksCutoffTime;
	private String dinnerCutoffTime;
	private String residenceList;
}