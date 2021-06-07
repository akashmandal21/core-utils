package com.stanzaliving.core.venta_aggregation;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityAggregationDto {

    @JsonSetter(value = "id")
    private Integer id;

    @JsonSetter(value = "city_name")
    private String city;


}
