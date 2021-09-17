package com.stanzaliving.wanda.venta.request;

import java.util.Set;

import com.stanzaliving.wanda.venta.response.ResidenceServiceDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceServicesRequestDto {
	private String bookingUuid;
	private Set<ResidenceServiceDto> selectedValueAddedServices;
}
