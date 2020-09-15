package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.VasServicesDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class ExtraVasServicesDtos {

	private List<VasServicesDto> optedServices;
	
	private List<VasServicesDto> offeredServices;
}
