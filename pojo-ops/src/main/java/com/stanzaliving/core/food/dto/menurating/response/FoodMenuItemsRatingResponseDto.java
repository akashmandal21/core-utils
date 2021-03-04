package com.stanzaliving.core.food.dto.menurating.response;

import com.stanzaliving.core.food.dto.menurating.RatingFpsDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
public class FoodMenuItemsRatingResponseDto extends RatingFpsDto {

	private String itemId;

	private String name;

}
