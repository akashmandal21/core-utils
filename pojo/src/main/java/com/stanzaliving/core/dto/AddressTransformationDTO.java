package com.stanzaliving.core.dto;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressTransformationDTO {
    private Integer addressId;

    private String addressLine1;

    private String addressLine2;

    private String cityId;

    private String stateId;

    private Integer zipcode;

    private String cityName;

    private String stateName;
}