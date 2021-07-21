package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Set;

import com.stanzaliving.wanda.dtos.AmenitiesDto;
import com.stanzaliving.wanda.enums.PropertyCategory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceServicesDetailsDto {

	private Set<ResidenceServiceDto> residenceServices;
    private List<ResidenceServiceDto> packagedServices;
    private Set<ResidenceServiceDto> allValueAddedServices;
    private Set<ResidenceServiceDto> preSelectedValueAddedServices;
    private String packagedServicesText;
    private String valueAddedServicesText;
}
