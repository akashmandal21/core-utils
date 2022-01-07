package com.stanzaliving.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GroupByEnum {
    SUBCATEGORY ("Subcategory",  "getSubCategory"),
    AREA_OF_USE ("Area of use", "getAOU");

    private final String label;
    private final String  getterName;
}
