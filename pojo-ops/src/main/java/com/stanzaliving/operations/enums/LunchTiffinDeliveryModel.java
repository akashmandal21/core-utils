package com.stanzaliving.operations.enums;

import com.stanzaliving.core.enums.helpers.EnumValue;

import lombok.Getter;

@Getter
public enum LunchTiffinDeliveryModel implements EnumValue {
	BREAKFAST_PICKUP("Breakfast pick-up"),
	LUNCH_PICKUP("Lunch pick-up"),
	LUNCH_DELIVERY_IN_SELECTED_COLLEGES("Lunch Delivery in select colleges");
	
	private String value;
	
	private LunchTiffinDeliveryModel(String value) {
		this.value = value;
	}
}
