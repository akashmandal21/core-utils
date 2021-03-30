package com.stanzaliving.search.food.search.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 16-Mar-2021
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuMealItemRequestDto extends MenuMicromarketAggregateRequestDto {
	private List<MealItemRequestDto> mealItems;

	private Double minAvgRating;
}
