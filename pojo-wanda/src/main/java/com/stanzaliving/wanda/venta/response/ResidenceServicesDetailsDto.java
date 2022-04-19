package com.stanzaliving.wanda.venta.response;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResidenceServicesDetailsDto {

	private Set<ResidenceServiceDto> residenceServices;
    private List<ResidenceServiceDto> packagedServices;
    private Set<ResidenceServiceDto> allValueAddedServices;
    private Set<ResidenceServiceDto> preSelectedValueAddedServices;
    private String packagedServicesText;
    private String valueAddedServicesText;
}
