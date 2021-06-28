package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@AllArgsConstructor
public enum CriteriaCondition {
    GREATER_THAN("GREATER THAN"),
    GREATER_THAN_OR_EQUAL_TO("GREATER THAN OR EQUAL TO"),
    LESS_THAN("LESS THAN"),
    LESS_THAN_OR_EQUAL_TO("LESS THAN OR EQUAL TO"),
    EQUAL_TO("EQUAL TO");

    private String name;

    public static Set<Object> ENUM_MAP = new HashSet<>();
    static {
        Map<Object,Object > map = new HashMap<>();
        for (CriteriaCondition a: CriteriaCondition.values()) {
            map.put("label" , a.name);
            map.put("value",a);
            ENUM_MAP.add(map);
        }
    }



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
