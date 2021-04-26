package com.stanzaliving.food.version.v2.dto.vendor;

import com.stanzaliving.food.version.v2.contants.sorting.VendorSortingField;
import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
public class FoodVendorSearchPDto implements Serializable {
    private String name;
    private String cityId;
    private VendorType vendorType;
    private Boolean activeStatus;
    private VendorSortingField sortingField;
}
