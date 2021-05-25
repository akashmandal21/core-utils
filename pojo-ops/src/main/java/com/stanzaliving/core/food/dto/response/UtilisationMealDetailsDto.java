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
	int consumptionPercentage;
	int wastagePercentage;
	boolean isHoliday;
	boolean isSpecialMeal;

}
