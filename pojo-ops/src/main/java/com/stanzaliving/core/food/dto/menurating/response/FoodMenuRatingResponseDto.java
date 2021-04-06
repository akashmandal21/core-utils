package com.stanzaliving.core.food.dto.menurating.response;

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
 * @version 2.0
 *
 * @since 24-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuRatingResponseDto {

	private String menuGroupId;

	private FoodMenuMicroMarketRatingResponseDto micromarketRating;

	private Long ratingDays;

	private Integer topServings;
}
