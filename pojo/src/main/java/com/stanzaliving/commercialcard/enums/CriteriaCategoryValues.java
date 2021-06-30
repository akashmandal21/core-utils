package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Getter
public enum CriteriaCategoryValues {
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    ELEVEN("11"),
    TWELVE("12");

    private  String value;

    public static Set<Object> ENUM_NAME_MAP = new HashSet<>();
    static {
        for (CriteriaCategoryValues a: CriteriaCategoryValues.values()) {
            Map<Object,Object > map = new HashMap<>();
            map.put("label" , a.value);
            map.put("value",a.value);
            ENUM_NAME_MAP.add(map);
        }
    }

    public static Set<String> getAllValues() {
        Set<String> criteria = new HashSet<>();

        criteria.add(CriteriaCategoryValues.THREE.getValue());
        criteria.add(CriteriaCategoryValues.FOUR.getValue());
        criteria.add(CriteriaCategoryValues.FIVE.getValue());
        criteria.add(CriteriaCategoryValues.SIX.getValue());
        criteria.add(CriteriaCategoryValues.SEVEN.getValue());
        criteria.add(CriteriaCategoryValues.EIGHT.getValue());
        criteria.add(CriteriaCategoryValues.NINE.getValue());
        criteria.add(CriteriaCategoryValues.TEN.getValue());
        criteria.add(CriteriaCategoryValues.ELEVEN.getValue());
        criteria.add(CriteriaCategoryValues.TWELVE.getValue());
        return criteria;
    }
}
