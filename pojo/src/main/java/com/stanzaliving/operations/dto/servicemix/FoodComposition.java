package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodComposition {
	private boolean active;
	private Tag Tea;
	private Tag Milk;
	private Tag Egg;
	private Tag Paneer;
	private Tag Chicken;
	private Tag Desserts;
	private Tag Coffee;
	
	private Supplies SUPPLIES;
}
