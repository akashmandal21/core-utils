package com.stanzaliving.core.food.dto.menurating.response;

import com.stanzaliving.core.food.dto.menurating.RatingFpsDto;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
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
public class MenuRatingResponseDto extends RatingFpsDto {

	private boolean defaultMenu;

	private List<FoodMenuItemsRatingResponseDto> items;

	private FoodRegion foodRegion;

	private FoodItemBasePreference basePreference;
}
