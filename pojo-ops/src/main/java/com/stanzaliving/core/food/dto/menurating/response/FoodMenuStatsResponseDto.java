package com.stanzaliving.core.food.dto.menurating.response;

import com.stanzaliving.core.food.dto.menufps.response.FoodMenuMicroMarketFpsDto;
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
 * @since 02-Mar-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuStatsResponseDto {

	private String micromarketId;

	private String menuCategoryId;

	//using existing dto instead of making simpler as to make frontend effort less
	private FoodMenuMicroMarketRatingResponseDto micromarketRating;

	//using existing dto instead of making simpler as to make frontend effort less
	private FoodMenuMicroMarketFpsDto micromarketFps;

	private Double newnessIndex;

	private List<DateWiseRatingResponseDto> dateWiseRatings;
}
