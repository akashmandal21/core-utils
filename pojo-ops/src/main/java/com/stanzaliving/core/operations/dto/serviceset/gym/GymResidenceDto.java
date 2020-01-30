package com.stanzaliving.core.operations.dto.serviceset.gym;

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
public class GymResidenceDto extends ResidenceTypeAvailaibilityDto {

	private List<GymDto> categoryDtos;

	private List<GymBrandServiceDto> brandDetails;
}