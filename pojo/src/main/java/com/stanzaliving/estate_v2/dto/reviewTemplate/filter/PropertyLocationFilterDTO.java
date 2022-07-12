package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;

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
