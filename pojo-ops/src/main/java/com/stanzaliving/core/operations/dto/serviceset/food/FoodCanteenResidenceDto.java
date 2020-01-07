package com.stanzaliving.core.operations.dto.serviceset.food;

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
public class FoodCanteenResidenceDto extends ResidenceTypeAvailaibilityDto {

	private List<FoodCanteenDto> categoryDtos;

	private List<FoodCanteenBrandServiceDto> brandDetails;
}