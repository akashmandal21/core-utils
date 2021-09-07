package com.stanzaliving.wanda.venta.request;

import java.util.Set;

import com.stanzaliving.wanda.venta.response.ResidenceServiceDtoV2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceServicesRequestDtoV2 {
	private String bookingUuid;
	private Set<ResidenceServiceDtoV2> selectedValueAddedServices;
}
