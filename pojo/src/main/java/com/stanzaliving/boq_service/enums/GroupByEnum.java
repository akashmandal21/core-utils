package com.stanzaliving.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GroupByEnum {
    SUBCATEGORY ("Subcategory"),
    AREA_OF_USE ("Area of use");

    private final String label;
}
