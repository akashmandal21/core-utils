package com.stanzaliving.core.food.dto.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.food.dto.VasOrderHistoryDto;
import com.stanzaliving.core.food.enums.PackageCollectionStatus;
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
public class VasOrderHistoryResponseDto {

	private Map<MealType, List<VasOrderHistoryDto>> menuMap;
	
	private Map<MealType, String> mealMapByMealType;

	private Map<MealType, PackageCollectionStatus> mealMapByPaymentStatus;

}