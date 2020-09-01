package com.stanzaliving.core.food.dto.response;

import java.time.Month;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodBudgetPlanningSummaryDto {

	private Integer persons;

	private Double personsAvg;

	private Double budgetPerPerson;

	private Double monthlyBudget;

	private Double utilization;

	private Month currentMonth;

	private Month lastMonth;

	private Month secondLastMonth;

	private Month thirdLastMonth;

	private Double lastMonthBudgetPerPerson;

	private Double lastMonthUtilization;

	private Double secondLastMonthBudgetPerPerson;

	private Double secondLastMonthUtilization;

	private Double thirdLastMonthBudgetPerPerson;

	private Double thirdLastMonthUtilization;

	private Double maxCost;

	private Double lastMonthmaxCost;

	private Double secondLastMonthmaxCost;

	private Double thirdLastMonthmaxCost;

	private Double lastMonthBudget;

	private Double secondLastMonthBudget;

	private Double thirdLastMonthBudget;

	private Integer lastMonthPersons;

	private Integer secondLastMonthPersons;

	private Integer thirdLastMonthPersons;

	private Double lastMonthPersonsAvg;

	private Double secondLastMonthPersonsAvg;

	private Double thirdLastMonthPersonsAvg;

}