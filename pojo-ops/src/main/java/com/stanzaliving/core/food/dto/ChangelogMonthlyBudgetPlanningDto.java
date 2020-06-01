package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

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
public class ChangelogMonthlyBudgetPlanningDto {

	private String residenceId;

	private String residenceName;

	private String changelogType;

	private Double budgetPerMir;

	private LocalDate changedDate;

	private String changedBy;

}
