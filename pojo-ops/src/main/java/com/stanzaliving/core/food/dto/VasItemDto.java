package com.stanzaliving.core.food.dto;

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
public class VasItemDto extends FoodMenuItemDto {

	private String itemId;
	
	private String itemCost;
	
	private String itemQuantity;
	
}
