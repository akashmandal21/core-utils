package com.stanzaliving.food.v2.vendor.dto;

import com.stanzaliving.core.vendor.enums.VendorType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class FoodVendorDTO implements Serializable {
    private String vendorId;
    private String vendorMasterId;
    private VendorType vendorType;
    private String name;
    private String cityId;
    private String cityName;
    private Double fps;
    private String vendorCode;
    private boolean active;
    private Double latitude;
    private Double longitude;
}
