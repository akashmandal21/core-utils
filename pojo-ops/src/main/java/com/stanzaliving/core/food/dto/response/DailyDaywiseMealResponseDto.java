package com.stanzaliving.core.food.dto.response;


import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DailyDaywiseMealResponseDto {
	private DayOfWeek dayOfWeek;
//	private List<DailyRuleMealResponseDto> rules;
	private List<MealType> meals;
}
