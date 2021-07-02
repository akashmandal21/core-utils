package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeeCollectionStrategy {
    ONE_TIME_UPFRONT("One Time Upfront"),
    MONTHLY_PAYMENTS("Monthly Payment");

   private String strategy;
}
