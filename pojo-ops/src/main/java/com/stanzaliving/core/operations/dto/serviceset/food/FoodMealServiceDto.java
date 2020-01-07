package com.stanzaliving.core.operations.dto.serviceset.food;

import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.ServiceMetadata;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodMealServiceDto extends ServiceMetadata {

	private List<FoodMealResidenceDto> foodMealResidenceDtos;

}