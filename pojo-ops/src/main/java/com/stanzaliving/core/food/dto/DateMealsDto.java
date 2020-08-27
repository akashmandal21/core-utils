package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.Set;

import com.stanzaliving.core.operations.enums.MealType;

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
public class DateMealsDto {
	
	private LocalDate date;
	
	private Set<MealType> meals;

}
