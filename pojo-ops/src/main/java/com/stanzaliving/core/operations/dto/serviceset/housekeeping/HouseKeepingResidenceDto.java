package com.stanzaliving.core.operations.dto.serviceset.housekeeping;

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
public class HouseKeepingResidenceDto extends ResidenceTypeAvailaibilityDto {

	private List<HouseKeepingDto> categoryDtos;

	private List<HouseKeepingBrandServiceDto> brandDetails;
}