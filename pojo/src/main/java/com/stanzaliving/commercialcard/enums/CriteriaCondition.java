package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum CriteriaCondition {
    GREATER_THAN("GREATER THAN", " is greater than "),
    GREATER_THAN_OR_EQUAL_TO("GREATER THAN OR EQUAL TO",  " is greater than or equal to "),
    LESS_THAN("LESS THAN"," is less than "),
    LESS_THAN_OR_EQUAL_TO("LESS THAN OR EQUAL TO", " is less than or equal to "),
    EQUAL_TO("EQUAL TO"," equal to ");

    String name;

    String description;

    public static Set<String> getAllConditions() {
        Set<String> conditions = new HashSet<>();

        conditions.add(CriteriaCondition.GREATER_THAN.getName());
        conditions.add(CriteriaCondition.GREATER_THAN_OR_EQUAL_TO.getName());
        conditions.add(CriteriaCondition.LESS_THAN.getName());
        conditions.add(CriteriaCondition.LESS_THAN_OR_EQUAL_TO.getName());
        conditions.add(CriteriaCondition.EQUAL_TO.getName());

        return conditions;
    }
}
