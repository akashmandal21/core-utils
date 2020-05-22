package com.stanzaliving.core.food.dto.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.food.dto.VasItemDto;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasMenuResponseDto {

	private Map<MealType, List<VasItemDto>> menuMap;
	
	private Map<MealType, String> mealMapByMealType;
	
}
