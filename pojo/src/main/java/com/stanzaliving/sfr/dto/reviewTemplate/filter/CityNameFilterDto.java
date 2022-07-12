package com.stanzaliving.sfr.dto.reviewTemplate.filter;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CityNameFilterDto {
    private String cityName;
    private long cityId;
    private String cityUuid;
}
