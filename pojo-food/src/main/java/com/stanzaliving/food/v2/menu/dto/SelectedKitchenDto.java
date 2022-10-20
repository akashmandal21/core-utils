package com.stanzaliving.food.v2.menu.dto;

import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectedKitchenDto {

    private String vendorId;
    private VendorType vendorType;
    private String name;
    private String cityId;
    private String cityName;

}
