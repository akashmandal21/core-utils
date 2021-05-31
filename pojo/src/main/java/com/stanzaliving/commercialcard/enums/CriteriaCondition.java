package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CriteriaCondition {
    GREATERTHANOREQUALTO("GREATER THAN OR EQUAL TO"),
    LESSTHANOREQUALTO("LESS THAN OR EQUAL TO"),
    GREATERTHAN("GREATER THAN "),
    LESSTHAN("LESS THAN"),
    EQUALTO(" EQUAL TO");

    String operator;
}
