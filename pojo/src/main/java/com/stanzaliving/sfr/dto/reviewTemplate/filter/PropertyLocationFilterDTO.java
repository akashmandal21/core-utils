package com.stanzaliving.sfr.dto.reviewTemplate.filter;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PropertyLocationFilterDTO {
    private Set<CityNameFilterDto> cityFilter;
    private Set<MicroMarketWithCityDTO> micromarketFilter;
}
