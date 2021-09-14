package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityMigrationDTO {
    @JsonSetter(value = "NAME")
    private String cityName;

    @JsonSetter(value = "CITY_ID")
    private Integer cityId;
}
