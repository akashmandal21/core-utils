package com.stanzaliving.core.food.dto;

import java.util.List;

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
public class DetailFoodOrderSummaryDto {

	private BudgetStatusDto budgetStatusDto;

	private HolidayAndUtilzationDto holidayAndUtilzationDto;

	private List<FoodOrderSummaryDto> residentsFoodOrderSummaries;

}
