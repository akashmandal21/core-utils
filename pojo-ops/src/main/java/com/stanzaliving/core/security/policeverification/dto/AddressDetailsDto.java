package com.stanzaliving.core.security.policeverification.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class AddressDetailsDto {

    private String roomNumber;

    private String residenceNumber;

    private String residenceName;

    private String societyOrVillage;

    private String policeStation;

    private String addressLine1;

    private String addressLine2;

    private String cityName;

    private String stateName;

    private String countryName;

    private Integer zipCode;
}
