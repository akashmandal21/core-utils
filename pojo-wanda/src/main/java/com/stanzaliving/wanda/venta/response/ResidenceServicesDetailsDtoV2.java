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
public class ResidenceServicesDetailsDtoV2 {

	private List<ResidenceServiceDtoV2> residenceServices;
	private List<ResidenceServiceDtoV2> packagedServices;
	private List<ResidenceServiceDtoV2> allValueAddedServices;
	private Set<ResidenceServiceDtoV2> preSelectedValueAddedServices;
	private String packagedServicesText;
	private String valueAddedServicesText;
}
