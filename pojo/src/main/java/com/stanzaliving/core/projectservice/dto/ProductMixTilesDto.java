package com.stanzaliving.core.projectservice.dto;

import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.SubBrandName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductMixTilesDto {
    private Integer designRoomCount;

    private Integer designBedCount;

    private BrandName propertyType;

    private SubBrandName propertyBrand;

    private String propertyName;
}
