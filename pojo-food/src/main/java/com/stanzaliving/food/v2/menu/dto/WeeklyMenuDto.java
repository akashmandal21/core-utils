package com.stanzaliving.food.v2.menu.dto;


import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.food.v2.menu.constants.MenuStatus;

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
public class WeeklyMenuDto extends AbstractDto {
	private static final long serialVersionUID = 726075754816567584L;
	
	private String categoryId;

	private String categoryVersion;

	private String vendorId;

	private LocalDate startDate;

	private MenuStatus menuStatus;

	private boolean compositionRulesSatisfied;

	private boolean comboRulesSatisfied;

	private boolean budgetUtilizationInLimit;

	private boolean mealOfDayDefined;

	private boolean onceApproved;

	private boolean menuDefined;

	private Double newnessPercentage;

	private Double ratings;

	private Double cogs;

	private Double budgeted;

	private boolean vendorApproved;
}
