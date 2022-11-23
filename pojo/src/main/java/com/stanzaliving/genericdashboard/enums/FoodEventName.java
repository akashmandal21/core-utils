package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodEventName {

	FEEDBACK_GIVEN_FOR_CAFE_VAS_ORDER("Feedback given for Cafe (VAS) Order"),
	CAFE_VAS_ORDER_PLACED("Cafe (VAS) Order Placed"),
	CAFE_VAS_ORDER_QR_SCANNED("Cafe (VAS) Order QR Scanned"),
	CAFE_VAS_ORDER_PICKED("Cafe (VAS) Order Picked"),
	REGULAR_MEAL_QR_SCANNED("Regular Meal QR Scanned"),
	FEEDBACK_GIVEN_FOR_REGULAR_MEAL("Feedback given for regular meal"),
	CAFE_ORDER_MARKED_READY("Cafe Order Marked as ready"),
	MEAL_PREFERENCE_SUBMITTED("Meal Preference Submitted"),
	CAFE_ORDER_PARTIALLY_CANCELLED_BY_CAFE("Cafe Order partially cancelled)"),
	RC_RECEIVED_REGULAR_MEALS_IN_JARVIS_APP("RC received the Regular meals in Jarvis app"),
	RC_RECEIVED_BATCH_CAFE_ORDER_IN_JARVIS_APP("RC received the Batch Cafe Orders in Jarvis app");

	String eventName;
}