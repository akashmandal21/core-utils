package com.stanzaliving.search.food.search.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 02-Mar-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuRatingAggRequestDto extends MenuCategoryAggregateRequestDto {

	private String menuGroupId;

	private String micromarketId;

	private List<DateWiseMealsRequestDto> dateMeals;
}
