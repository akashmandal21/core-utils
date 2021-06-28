package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Getter
public enum CommercialCodeType {

    CITY( "City"),
    RESIDENCE("Residence"),
    MICROMARKET( "Micromarket"),
    CONTRACTTENURE("CONTRACT TENURE"),
    LOCKIN( "LOCK IN ");

    private String name;

    public  static Map< CommercialCodeType,String> CATEGORY_VALUES_MAP = new HashMap<>();
    static {
        for (CommercialCodeType a: CommercialCodeType.values()) {
            CATEGORY_VALUES_MAP.put(a,a.name);
        }
    }


    public static Set<String> getAllCriteria() {
        Set<String> criteria = new HashSet<>();

        criteria.add(CommercialCodeType.CONTRACTTENURE.getName());
        criteria.add(CommercialCodeType.LOCKIN.getName());

        return criteria;
    }
}