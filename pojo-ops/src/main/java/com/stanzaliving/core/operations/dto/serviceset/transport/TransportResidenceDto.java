package com.stanzaliving.core.operations.dto.serviceset.transport;

import java.util.List;

import com.stanzaliving.core.enums.ResidenceType;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TransportResidenceDto {

	private ResidenceType residenceType;

	private List<TransportDto> transportDtos;

	private List<TransportBrandDetailDto> transportBrandDetailDtoList;

}