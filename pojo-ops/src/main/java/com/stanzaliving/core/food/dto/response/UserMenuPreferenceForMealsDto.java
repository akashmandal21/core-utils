package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalTime;

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
public class UserMenuPreferenceForMealsDto implements Serializable {

	private MealType nextMeal;

	private String nextMealName;

	private long nextMealItemsCount;

	private UserMenuPreferenceResponseDto nextMealPreferences;

	private LocalTime preferenceWindowCloseTime;

	private NextApplicableMealDto nextVasMeal;

}
