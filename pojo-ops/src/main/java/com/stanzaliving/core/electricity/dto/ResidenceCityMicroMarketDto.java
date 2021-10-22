package com.stanzaliving.core.electricity.dto;

import java.io.Serializable;

import com.stanzaliving.core.enums.ApartmentType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ResidenceCityMicroMarketDto implements Serializable {
    private String residenceId;
    private String name;
    private String mmId;
    private String mmName;
    private String cityId;
    private String cityName;
	private String apartmentTypeName;
	private ApartmentType apartmentType;
	private String addressLine1;
	private String addressLine2;
    
}
