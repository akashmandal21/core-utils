package com.stanzaliving.food.v2.grammage.response;

import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 21-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealGrammageResponseDto {

	private EnumListing<MealType> mealType;

	private EnumListing<FoodServeType> foodServeType;

	private Integer grammage;
}
