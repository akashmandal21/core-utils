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
public class FoodOrderSummaryDto {

	private List<ResidentsFoodOrderSummary> residentsFoodOrderSummaries;

	private BudgetStatusDto budgetStatusDto;

	private HolidayAndUtilzationDto holidayAndUtilzationDto;

}
