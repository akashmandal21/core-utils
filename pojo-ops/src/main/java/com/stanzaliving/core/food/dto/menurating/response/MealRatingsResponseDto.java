package com.stanzaliving.core.food.dto.menurating.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
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
public class MealRatingsResponseDto implements Serializable {

	private static final long serialVersionUID = 5526172728438446L;

	private Float avgRating;

	private List<MealRatingResponseDto> mealRatings;
}
