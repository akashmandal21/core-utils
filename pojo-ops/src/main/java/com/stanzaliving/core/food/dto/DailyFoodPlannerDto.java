package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

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
public class DailyFoodPlannerDto {

	private LocalDate date;

	private Integer mir;

	private Double budgetedCost;

	private Double maxCost;

}