package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.food.v2.menu.constants.MonthlyBudgetStatus;
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
public class StatsDto implements Serializable {
	
	private String name;
	private MonthlyBudgetStatus filterStatus;
	private long count;

}
