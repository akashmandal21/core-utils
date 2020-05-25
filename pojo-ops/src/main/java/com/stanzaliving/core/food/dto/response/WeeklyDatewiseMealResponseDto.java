package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;
import java.util.List;

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
public class WeeklyDatewiseMealResponseDto {

	private LocalDate date;
	
	private List<MealType> meals;
}