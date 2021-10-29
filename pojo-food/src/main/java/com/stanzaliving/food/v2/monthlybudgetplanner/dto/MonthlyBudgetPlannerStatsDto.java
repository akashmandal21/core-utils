package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MonthlyBudgetPlannerStatsDto implements Serializable {
	private StatsDto overAllMenuCategories;
	private StatsDto pending;
	private StatsDto underApproval;
	private StatsDto approved;
}
