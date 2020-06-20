package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodService {
	private boolean active;
	private Meal BREAKFAST;
	private Meal BRUNCH;
	private Meal LUNCH;
	private Meal DINNER;
	private Meal EVENING_SNACKS;
	private LunchTiffin LUNCH_TIFFIN;
}
