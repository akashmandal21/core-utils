package com.stanzaliving.core.operations.dto.serviceset.electricity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import com.stanzaliving.core.enums.ResidenceType;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ElectricityResidenceDto {

	private ResidenceType residenceType;

	private List<ElectricityDto> electricityDto;

	private List<ElectricityBrandDetailDto> electricityBrandDetailDtoList;

}