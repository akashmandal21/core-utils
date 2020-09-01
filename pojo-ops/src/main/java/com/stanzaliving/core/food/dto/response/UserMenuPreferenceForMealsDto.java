package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 31-Aug-2020
 */


@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserMenuPreferenceForMealsDto {

	private MealType nextMeal;

	private UserMenuPreferenceResponseDto nextMealPreferences;

	private List<UserMenuPreferenceResponseDto> userPreferenceForNextDay;

	private ApplicableMealDto nextVasMeal;

}
