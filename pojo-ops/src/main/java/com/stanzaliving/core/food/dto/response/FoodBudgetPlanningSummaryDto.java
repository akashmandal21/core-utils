package com.stanzaliving.core.food.dto.response;

import java.time.Month;

import com.stanzaliving.core.base.enums.AccessLevel;

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

	private AccessLevel accessLevel;

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;

	private Integer persons;

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
	
	private boolean approvalStatus;

}
