package com.stanzaliving.core.food.dto.response;

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
public class FoodShortageDetailsDto {

	private String menuOptionName;
	private Integer vegQuantity;
	private Integer nonVegQuantity;

}
