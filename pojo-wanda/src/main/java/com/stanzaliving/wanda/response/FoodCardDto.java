package com.stanzaliving.wanda.response;

import com.stanzaliving.core.food.enums.FoodItemType;

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
public class FoodCardDto {

	private FoodItemType foodItemType;
	
	private String foodItemImage;
	
	private String foodName;
	
	private String foodItems;
	
	private Boolean selected;
	
	private Boolean defaultChoice;
	
	private String residenceFoodMenuId;
	
	private String userResidenceFoodMenuId;
	
	private Integer quantity;
	
	private double price;
}
