package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TiffinOrderType {

	PICKUP("Residence Pickup"),
	DELIVERY("Vendor Delivery");

	private String typeName;

}