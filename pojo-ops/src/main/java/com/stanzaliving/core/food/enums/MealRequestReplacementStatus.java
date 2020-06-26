package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MealRequestReplacementStatus {

	REPLACEMENT_REQUESTED("Replacement Requested", "Take Action", ""),
	REPLACEMENT_APPROVED("Request Approved", "Approved", "To be picked by student"),
	REPLACEMENT_PICKED("Replacement Picked", "Approved", "Picked by student"),
	REPLACEMENT_REJECTED("Request Rejected", "Rejected", "Requested by mistake"),
	REQUEST_EXPIRED("Request Expired", "Expired", "Student didn't pick");

	private String statusDesc;
	private String rcStatus;
	private String rcStatusText;

}