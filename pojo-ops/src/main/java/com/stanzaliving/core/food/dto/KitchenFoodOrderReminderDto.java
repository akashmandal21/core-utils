package com.stanzaliving.core.food.dto;


import lombok.*;

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
}