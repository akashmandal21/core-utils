package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.food.v2.menu.constants.MonthlyBudgetStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MonthlyBudgetPlannerDetailsDto implements Serializable {

	private static final long serialVersionUID = 9129236210318749280L;

	private String budgetPlannerUuid;
	private String budgetPlannerVersionUuid;
	private MonthlyBudgetStatus monthlyBudgetStatus;
	private LocalDate startDate;
	private String updatedBy;
	private Date updatedAt;
}
