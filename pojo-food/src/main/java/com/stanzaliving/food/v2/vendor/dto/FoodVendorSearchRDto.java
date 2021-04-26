package com.stanzaliving.food.v2.vendor.dto;


import com.stanzaliving.core.leadership.dto.ListingDto;
import com.stanzaliving.core.vendor.enums.VendorType;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
public class FoodVendorSearchRDto implements Serializable {
    private String vendorId;
    private VendorType vendorType;
    private String name;
    private String cityId;
    private String cityName;
    private boolean activeStatus;
    private Long noOfMenuCategories;
    private Long noOfResidenceServed;
    private List<ListingDto> microMarketServed;
    private List<ResidenceRDto> residenceServed;
}
