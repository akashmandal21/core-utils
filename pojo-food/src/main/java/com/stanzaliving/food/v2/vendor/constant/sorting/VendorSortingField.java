package com.stanzaliving.food.v2.vendor.constant.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorSortingField {
    NAME("Name"),
    RESIDENCE_SERVED("Residence Served"),
    MENU_CATEGORY("Menu Categories"),
    CITY("City"),
    MM("Micromarket"),
    STATUS("Active Status"),
    FPS("FPS");

    private final String field;
}
