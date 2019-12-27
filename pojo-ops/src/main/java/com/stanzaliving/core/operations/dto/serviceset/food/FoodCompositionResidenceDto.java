package com.stanzaliving.core.operations.dto.serviceset.food;

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
public class FoodCompositionResidenceDto {

	private ResidenceType residenceType;

	private List<FoodCompositionDto> foodCompositionDtos;

	private List<FoodCompositionBrandDetailDto> foodCompositionBrandDetailDtos;
}