package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodEventCategory {
	FEEDBACK_GIVEN_FOR_CAFE_VAS_ORDER("feedback given for Cafe (VAS) Order"),
	CAFE_VAS_ORDER_PLACED("Cafe (VAS) Order Placed"),
	RC_RECEIVED_BATCH_CAFE_ORDERS_IN_JARVIS_APP("RC received the Batch Cafe Orders in Jarvis app"),
	REGULAR_MEAL_QR_SCANNED_SUCCESS("Regular Meal QR Scanned (Success)"),
	FEEDBACK_GIVEN_FOR_REGULAR_MEAL("Feedback given for regular meal"),
	CAFE_ORDER_MARKED_READY("Cafe Order Marked as ready"),
	MEAL_PREFERENCE_SUBMITTED("Meal Preference Submitted"),
	CAFE_ORDER_PARTIALLY_CANCELLED_BY_CAFE("Cafe Order partially cancelled (by cafe)"),
	RC_RECEIVED_BATCH_CAFE_ORDER_IN_JARVIS_APP("RC received the Batch Cafe Orders in Jarvis app");

	String foodEventCategoryValue;
}
