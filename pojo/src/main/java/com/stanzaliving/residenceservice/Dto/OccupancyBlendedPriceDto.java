package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OccupancyBlendedPriceDto implements Serializable {

    private Integer bedCount;
    private Integer occupancy;

    private String occupancyName;

    private double blendedPrice;
    private double minimumPrice;
    private double maximumPrice;
    private double blendedCityHeadBufferPrice;

}