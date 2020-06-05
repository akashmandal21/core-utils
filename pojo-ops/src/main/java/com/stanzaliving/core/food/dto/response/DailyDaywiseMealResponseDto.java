package com.stanzaliving.core.food.dto.response;


import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.util.Collection;
import java.util.List;
import java.util.Set;

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
