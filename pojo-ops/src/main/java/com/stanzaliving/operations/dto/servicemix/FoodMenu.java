package com.stanzaliving.operations.dto.servicemix;

import java.util.Map;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FoodMenu extends BooleanService {
	private String category;
	private boolean stanzaKitchen;
	private Map<MealType, Double> meals;
	private Double totalPrice;
}
