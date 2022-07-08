package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeeCollectionStrategy {
	
	MONTHLY("Monthly"),
	ONE_TIME_UPFRONT("One Time Upfront"),

	ADD_TO_SD_AND_DEDUCT_MONTHLY("Add to SD & deduct monthly"),
	DEDUCT_FROM_SD("Deduct from SD");

   private String strategy;
}
