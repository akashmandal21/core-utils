package com.stanzaliving.core.food.dto.grammage.response;

import com.stanzaliving.core.food.enums.ThaliOption;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Set;

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
public class GrammageMasterRuleRatioResponseDto {
	private Set<CategorySubCategoryResponseDto> controllingSubCategory;

	private Set<CategorySubCategoryResponseDto> derivedSubCategory;

	private double controllingRatio;

	private double derivedRatio;

	private Set<EnumListing<MealType>> applicableMeals;

	private Set<EnumListing<ThaliOption>> applicableThalis;
}
