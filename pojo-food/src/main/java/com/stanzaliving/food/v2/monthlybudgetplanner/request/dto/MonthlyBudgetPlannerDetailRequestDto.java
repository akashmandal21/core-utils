package com.stanzaliving.food.v2.monthlybudgetplanner.request.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MonthlyBudgetPlannerDetailRequestDto {

	@NotNull(message = "month cannot be null")
	private Integer month;

	@NotNull(message = "year cannot be null")
	private Integer year;

	private String menuCategoryId;

	@NotBlank(message = "category version id cannot be null")
	private String categoryVersionId;

	@NotBlank(message = "vendorId cannot be blank")
	private String vendorId;

}
