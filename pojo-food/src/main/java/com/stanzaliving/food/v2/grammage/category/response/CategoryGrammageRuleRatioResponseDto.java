package com.stanzaliving.food.v2.grammage.category.response;

import com.stanzaliving.core.dto.KeyValuePairDto;
import com.stanzaliving.food.v2.grammage.response.CategorySubCategoryResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Set;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 15-Jun-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CategoryGrammageRuleRatioResponseDto {

	private CategorySubCategoryResponseDto controllingSubCategory;

	private CategorySubCategoryResponseDto derivedSubCategory;

	private double controllingRatio;

	private double derivedRatio;

	private Set<KeyValuePairDto> applicableMeals;

	private Set<KeyValuePairDto> applicableThalis;

}
