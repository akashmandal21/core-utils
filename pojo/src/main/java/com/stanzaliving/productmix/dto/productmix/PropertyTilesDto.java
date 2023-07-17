package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyTilesDto {
    private Integer totalRooms;

    private Integer totalBeds;

    private String propertyType;

    private String propertyBrand;

    private String propertyName;
}
