package com.stanzaliving.food.v2.vendor.dto;

import com.stanzaliving.food.v2.common.constant.SortingType;
import com.stanzaliving.food.v2.vendor.constant.sorting.VendorSortingField;
import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class FoodVendorSearchPDto implements Serializable {
    private String name;
    private String cityId;
    private VendorType vendorType;
    private Boolean activeStatus;
    private VendorSortingField sortingField;
    private SortingType sortingType;
}
