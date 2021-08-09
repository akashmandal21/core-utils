package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 @Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressDTO {

    @JsonSetter("ADDRESS_ID")
    private Integer addressId;

    @JsonSetter("LINE_1")
    private String line1;

    @JsonSetter("LINE_2")
    private String line2;

    @JsonSetter("CITY_ID")
    private Integer cityId;

    @JsonSetter("cityName")
    private String cityName;

    @JsonSetter("STATE_ID")
    private Integer stateId;

    @JsonSetter("stateName")
    private String stateName;

    @JsonSetter("ZIPCODE")
    private Integer zipCode;
}
