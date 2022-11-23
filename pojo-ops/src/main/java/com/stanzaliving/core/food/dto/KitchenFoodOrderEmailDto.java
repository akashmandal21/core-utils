package com.stanzaliving.core.food.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenFoodOrderEmailDto {

	private String staffType;
	private Integer breakfastCount;
	private Integer lunchCount;
	private Integer snacksCount;
	private Integer dinnerCount;
}
