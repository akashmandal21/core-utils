package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FeeCollectionStrategy {
    ONE_TIME_UPFRONT("ONE TIME UPFRONT"),
    MONTHLY_PAYMENTS("MONTHLY PAYMENT");

   private String strategy;
}
