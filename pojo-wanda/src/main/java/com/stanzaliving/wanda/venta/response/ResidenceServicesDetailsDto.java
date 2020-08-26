package com.stanzaliving.wanda.venta.response;

import java.util.Set;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResidenceServicesDetailsDto {

	private Set<ResidenceServiceDto> residenceServices;
    private Set<ResidenceServiceDto> packagedServices;
    private Set<ResidenceServiceDto> allValueAddedServices;
    private Set<ResidenceServiceDto> preSelectedValueAddedServices;
}
