package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodComplaintSource {

	SOCIAL_MEDIA("Social Media"),
	APP_STORE("Apple App Store"),
	PLAY_STORE("Google Play Store"),
	EMAIL("Email"),
	RESIDENT_APP("Resident App");

	private String sourceName;

}