package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FoodMenu {
	private boolean active;
	private String category;
	private boolean stanzaKitchen;
	private Double BREAKFAST;
	private Double LUNCH;
	private Double EVENING_SNACKS;
	private Double DINNER;
	private Double totalPrice;
}
