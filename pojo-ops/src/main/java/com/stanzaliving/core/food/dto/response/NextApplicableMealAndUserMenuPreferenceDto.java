package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 20-Oct-2020
 */


@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NextApplicableMealAndUserMenuPreferenceDto {
	private EnumListing<MealType> nextMeal;

	private long nextMealItemsCount;

	private UserMenuPreferenceResponseDto nextMealPreferences;

	private LocalTime preferenceWindowCloseTime;

	private NextApplicableMealV2Dto nextVasMeal;
}
