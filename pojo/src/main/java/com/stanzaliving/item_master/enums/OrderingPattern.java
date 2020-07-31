package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderingPattern {

    ONE_TIME("One Time"),
    MULTIPLE("Multiple");

    private String orderingPatternText;

}
