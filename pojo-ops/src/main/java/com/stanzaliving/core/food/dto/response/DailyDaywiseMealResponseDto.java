package com.stanzaliving.core.food.dto.response;

import java.time.DayOfWeek;
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
public class DailyDaywiseMealResponseDto {

	private DayOfWeek dayOfWeek;

	private Set<MealType> meals;
}