package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.DispatchSummaryItemType;
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
public class DispatchInfoDto {

	private String residenceId;
	private String uuid;
	private DispatchSummaryItemType dispatchSummaryItemType;
	private MealType mealType;

}