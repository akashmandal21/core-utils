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

/**
 * @author piyush srivastava
 *
 * @date 12-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class WeeklyDaywiseMealResponseDto {

	private DayOfWeek dayOfWeek;

	private Set<MealType> meals;
}
