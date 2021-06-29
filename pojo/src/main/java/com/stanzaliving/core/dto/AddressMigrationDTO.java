package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressMigrationDTO {

    //@JsonSetter(value = "ADDRESS_ID")
    private Integer addressId;

    //@JsonSetter(value = "LINE_1")
    private String addressLine1;

    //@JsonSetter(value = "LINE_2")
    private String addressLine2;

    //@JsonSetter(value = "CITY_ID")
    private String cityId;

    //@JsonSetter(value = "STATE_ID")
    private String stateId;

    //@JsonSetter(value = "ZIPCODE")
    private Integer zipcode;

    private String cityName;

    private String stateName;
}
