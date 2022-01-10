package com.stanzaliving.boq_service.enums;

import com.stanzaliving.boq_service.dto.PropertyBoqListingGroupByItem;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GroupByEnum implements KeyInterface {
    SUBCATEGORY ("Subcategory") {
        @Override
        public String getKey(PropertyBoqListingGroupByItem item) {
            return item.getSubCategory();
        }
    },
    AREA_OF_USE ("Area of use") {
        @Override
        public String getKey(PropertyBoqListingGroupByItem item) {
            return item.getAOU();
        }
    };

    private final String label;
}

interface KeyInterface {
    String getKey(PropertyBoqListingGroupByItem item);
}
