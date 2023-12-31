package com.stanzaliving.core.food.dto.response;

import java.util.List;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class MealItemSummaryDto {

	private MealType meal;

	private String mealName;

	private List<MealItemCategoryCountDto> categoryCountDtos;

	@Builder.Default
	private Integer mealItemCount = 0;

}