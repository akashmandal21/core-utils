package com.stanzaliving.food.v2.monthlybudgetplanner.request.dto;

import java.util.List;

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
public class MonthlyBudgetPlannerRequestDto {

	private Integer month;

	private Integer year;

	private String vendorId;

	private List<String> menuCategoryIds;

	private List<String> residenceIds;

	private List<String> planningStatus;  

}
