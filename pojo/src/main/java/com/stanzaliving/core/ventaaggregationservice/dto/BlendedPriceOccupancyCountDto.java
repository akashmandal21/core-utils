package com.stanzaliving.core.ventaaggregationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlendedPriceOccupancyCountDto {

    private String occupancyName;
    private String bedCount;
    private String averageOccupancyPrice;
}
