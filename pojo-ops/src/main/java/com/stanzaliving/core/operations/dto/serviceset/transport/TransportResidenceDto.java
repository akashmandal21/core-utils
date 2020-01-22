package com.stanzaliving.core.operations.dto.serviceset.transport;

import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.ResidenceTypeAvailaibilityDto;

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
public class TransportResidenceDto extends ResidenceTypeAvailaibilityDto {

	private List<TransportDto> categoryDtos;

	private List<TransportBrandServiceDto> brandDetails;

}