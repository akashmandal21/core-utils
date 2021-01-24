package com.stanzaliving.core.food.dto.menufps.response;

import com.stanzaliving.core.food.dto.menurating.response.DishRating;
import com.stanzaliving.core.food.dto.menurating.response.FoodMenuMicroMarketRatingResponseDto;
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
public class FoodMenuFpsResponseDto {

	private String menuGroupId;

	private FoodMenuMicroMarketFpsDto micromarketFps;

	private List<DishFps> dishFps;
}
