package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.DayOfWeek;
import java.util.List;

@Getter
@Setter
@Builder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WeeklyMenuRequestDto {

	@NotNull(message = "meal type cannot be null")
	private MealType mealType;

	@NotEmpty(message = "day of week list cannot be empty")
	private List<DayOfWeek> dayOfWeeks;

}
