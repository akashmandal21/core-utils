package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

@Getter
@AllArgsConstructor
public enum CriteriaCondition {

    GREATER_THAN("GREATER THAN","GREATER_THAN", "Is greater than "),
    GREATER_THAN_OR_EQUAL_TO("GREATER THAN OR EQUAL TO", "GREATER_THAN_OR_EQUAL_TO","Is greater than or equal to "),
    LESS_THAN("LESS THAN","LESS_THAN", "Is less than "),
    LESS_THAN_OR_EQUAL_TO("LESS THAN OR EQUAL TO","LESS_THAN_OR_EQUAL_TO" , "Is less than or equal to "),
    EQUAL_TO("EQUAL TO","EQUAL_TO", "Equal to "),
    BETWEEN("BETWEEN","BETWEEN", "Between "),
    IS("IS","IS", "Is "),
    NOT_IN("NOT IN","NOT_IN", "Not in "),
    IS_ONE_OF("IS ONE OF","IS_ONE_OF", "Is one of ");


    private String value;
    private String key;


    public static Set<Object> ENUM_MAP = new HashSet<>();
    static {
        for (CriteriaCondition a: CriteriaCondition.values()) {
            Map<Object,Object > map = new HashMap<>();
            map.put("label" , a.value);
            map.put("value",a);
            ENUM_MAP.add(map);
        }
    }

    String description;

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
