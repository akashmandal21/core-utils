package com.stanzaliving.boq_service.enums;

import com.stanzaliving.boq_service.dto.PropertyBoqListingGroupByItem;
import com.stanzaliving.boq_service.dto.groundrequest.ItemDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GroupByEnum {
    SUBCATEGORY ("Subcategory"),
    AREA_OF_USE ("Area of use");

    private final String label;

    public String getData(PropertyBoqListingGroupByItem item) {
        switch (this) {
            case SUBCATEGORY:
                return item.getSubCategory();

            case AREA_OF_USE:
                return item.getAreaOfUse().getName();

            default:
                break;
        }
        return "";
    }
}
