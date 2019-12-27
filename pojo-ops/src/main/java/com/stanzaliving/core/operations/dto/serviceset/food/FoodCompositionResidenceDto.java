package com.stanzaliving.core.operations.dto.serviceset.food;

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
public class FoodCompositionResidenceDto {

	private ResidenceType residenceType;

	private List<FoodCompositionDto> foodCompositionDtos;

	private Map<ResidenceBrand, List<FoodCompositionBrandDetailDto>> brandDetailsMap;
}