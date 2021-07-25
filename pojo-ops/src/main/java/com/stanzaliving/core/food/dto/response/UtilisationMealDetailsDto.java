package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UtilisationMealDetailsDto {

	private LocalDate date;
	private int consumptionPercentage;
	private int wastagePercentage;
	private boolean isHoliday;
	private boolean isSpecialMeal;

}
