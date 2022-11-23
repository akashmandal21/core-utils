package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 28-Oct-2020
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealWiseRatingDto {
	private MealType mealType;

	private String mealTypeName;

	private Double weeklyRating;
}
