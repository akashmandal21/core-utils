package com.stanzaliving.core.food.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 23-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdatedCategoryDto {

	private String mealName;

	private MealCostTimingDto current;

	private MealCostTimingDto requested;

}
