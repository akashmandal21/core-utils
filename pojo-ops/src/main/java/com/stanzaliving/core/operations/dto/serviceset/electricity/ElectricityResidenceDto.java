package com.stanzaliving.core.operations.dto.serviceset.electricity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.enums.ResidenceType;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ElectricityResidenceDto {

	private ResidenceType residenceType;

	private List<ElectricityDto> electricityDtos;

	private Map<ResidenceBrand, List<ElectricityBrandDetailDto>> brandDetailsMap;

}