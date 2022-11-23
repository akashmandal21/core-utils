package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.base.common.dto.ListingCountDto;
import com.stanzaliving.core.base.common.dto.PageResponse;

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
public class MonthlyBudgetPlannerListingDto implements Serializable {

	private static final long serialVersionUID = 3538768605666556421L;
	private MonthlyBudgetPlannerStatsDto monthlyBudgetPlannerStatsDto;
	private List<ListingCountDto> stats;
	private PageResponse<MonthlyBudgetPlannerDto> plannerData;
}
