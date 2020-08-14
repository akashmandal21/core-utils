package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class MealReceivingReportRequestDto {

	@NotBlank(message = "Sumary ItemId can not be empty")
	private String dispatchSummaryItemsId;

	@NotNull(message = "Number of meals can not be null")
	private Integer meals;

}
