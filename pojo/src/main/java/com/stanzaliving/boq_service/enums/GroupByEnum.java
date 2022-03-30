package com.stanzaliving.boq_service.enums;

import com.stanzaliving.boq_service.dto.PropertyBoqListingGroupByItem;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GroupByEnum {
    SUBCATEGORY ("Subcategory"),
    AREA_OF_USE ("Area of use");

    private final String label;
}
