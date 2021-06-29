package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum CriteriaCondition {
    GREATER_THAN("GREATER THAN"),
    GREATER_THAN_OR_EQUAL_TO("GREATER THAN OR EQUAL TO"),
    LESS_THAN("LESS THAN"),
    LESS_THAN_OR_EQUAL_TO("LESS THAN OR EQUAL TO"),
    EQUAL_TO("EQUAL TO");

    private String value;


    public static Set<Object> ENUM_MAP = new HashSet<>();
    static {
        for (CriteriaCondition a: CriteriaCondition.values()) {
            Map<Object,Object > map = new HashMap<>();
            map.put("label" , a.value);
            map.put("value",a);
            ENUM_MAP.add(map);
        }
    }

    public static Set<String> getAllConditions() {
        Set<String> conditions = new HashSet<>();

        conditions.add(CriteriaCondition.GREATER_THAN.getValue());
        conditions.add(CriteriaCondition.GREATER_THAN_OR_EQUAL_TO.getValue());
        conditions.add(CriteriaCondition.LESS_THAN.getValue());
        conditions.add(CriteriaCondition.LESS_THAN_OR_EQUAL_TO.getValue());
        conditions.add(CriteriaCondition.EQUAL_TO.getValue());

        return conditions;
    }
}
