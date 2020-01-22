package com.stanzaliving.core.operations.dto.serviceset.electricity;

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
public class ElectricityResidenceDto extends ResidenceTypeAvailaibilityDto {

	private List<ElectricityDto> categoryDtos;

	private List<ElectricityBrandServiceDto> brandDetails;

}