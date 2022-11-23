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

    CITY( "City","CITY"),
    RESIDENCE("Residence","RESIDENCE"),
    MICROMARKET( "Micromarket","MICROMARKET"),
    CONTRACTTENURE("CONTRACT TENURE","CONTRACTTENURE"),
    LOCKIN( "LOCK IN","LOCKIN"),
    PAYMENT( "PAYMENT","PAYMENT");;

    private String name;
    private String value;

    public  static Map< CommercialCodeType,String> CATEGORY_VALUES_MAP = new HashMap<>();
    static {
        for (CommercialCodeType a: CommercialCodeType.values()) {
            Map<Object,Object > map = new HashMap<>();
            map.put(a,a.name);
        }
    }


    public static Set<String> getAllCriteria() {
        Set<String> criteria = new HashSet<>();

        criteria.add(CommercialCodeType.CONTRACTTENURE.getName());
        criteria.add(CommercialCodeType.LOCKIN.getName());

        return criteria;
    }
}