package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DateCostDto {

	private LocalDate date;

	private double totalCost;

	private double vendorVegCost;

	private List<MealPaxCostDto> mealPaxCostDtos;
}