package com.stanzaliving.food.v2.category.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RuleDuration {
    IN_WEEK("within the week"),
    IN_DAY("within a day"),
    CONSECUTIVE_MEALS("in consecutive meals"),
    CONSECUTIVE_DAYS("in consecutive days"),
    IN_OPTIONS("within options");
    private final String rule;
}
