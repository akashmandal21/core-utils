package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 31-Aug-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class NextApplicableMealDto {
	private MealType nextMeal;

	private String nextMealName;

	private LocalDate mealDate;
}
