package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ConsumptionPattern {

    TIME_BASED("Time Based"),
    ONE_TIME("One Time"),
    MULTIPLE("Multiple");

    private String consumptionPatternText;

}
