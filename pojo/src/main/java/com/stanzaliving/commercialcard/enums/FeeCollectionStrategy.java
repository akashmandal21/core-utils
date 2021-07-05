package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeeCollectionStrategy {
	
	MONTHLY("Monthly"),
	ONE_TIME_UPFRONT("One time upfront");

   private String strategy;
}
