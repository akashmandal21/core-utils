package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityTransformationMigrationDTO {
    @JsonSetter(value = "city_name")
    private String cityName;

    @JsonSetter(value = "uuid")
    private String cityId;
}

