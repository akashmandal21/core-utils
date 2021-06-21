package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
public enum CommercialCodeType {

    CITY("CITY"),
    RESIDENCE("RESIDENCE"),
    MICROMARKET("MICROMARKET"),
    CONTRACTTENURE("CONTRACT TENURE"),
    LOCKIN("LOCK IN");


    private String name;
    public static Set<String> getAllCriteria() {
        Set<String> criteria = new HashSet<>();

        criteria.add(CommercialCodeType.CONTRACTTENURE.getName());
        criteria.add(CommercialCodeType.LOCKIN.getName());

        return criteria;
    }
}