package com.stanzaliving.core.food.dto.menurating.response;

import com.stanzaliving.core.base.common.dto.ListingDto;
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
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuMicroMarketRatingResponseDto extends MealRatingsResponseDto {

	private static final long serialVersionUID = 2121372728438446L;

	private ListingDto micromarket;

	private List<ResidenceRatingResponseDto> residenceRatings;
}
