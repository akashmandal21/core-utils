package com.stanzaliving.food.v2.vendor.dto;


import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class FoodVendorSearchRDto extends FoodVendorDTO {
    private boolean activeStatus;
    private Long noOfMenuCategories;
    private Long noOfResidenceServed;
    private Long noOfMarketServed;
    private List<ListingDto> microMarketServed;
    private List<ResidenceRDto> residenceServed;
}
