package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MealRequestReplacementStatus {

	REPLACEMENT_REQUESTED("Replacement Requested"),
	REPLACEMENT_APPROVED("Replacement Approved"),
	REPLACEMENT_PICKED("Replacement Picked"),
	REQUEST_Expired("Request Expired");

	private String statusDesc;

}