package com.stanzaliving.core.operations.dto.serviceset.food;

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
public class FoodMealBrandDetailsDto {

	private String componentId;

	private boolean available;

	private boolean availableAsVas;
}