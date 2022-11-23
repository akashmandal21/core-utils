package com.stanzaliving.core.food.dto;

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
public class MealShortageReportDto {
	
	private String dispatchSummaryItemId;
	
	private MealType meal;
	
	private Integer shortage;

}
