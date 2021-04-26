package com.stanzaliving.food.version.v2.contants.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorSortingField {
    NAME("Name"),
    RESIDENCE_SERVED("Residence Served"),
    MENU_CATEGORY("Menu Categories"),
    ;
    private final String field;
}
