package com.stanzaliving.core.operations.dto.serviceset.transport;

import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.BrandAvailabilityDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TransportBrandServiceDto extends BrandAvailabilityDto {

	private List<TransportBrandDetailDto> serviceDetails;
}