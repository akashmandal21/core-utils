/**
 * 
 */
package com.stanzaliving.food.v2.common.dto;

import java.io.Serializable;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import com.stanzaliving.core.food.enums.FoodServeType;
import com.stanzaliving.core.food.enums.GrammageHeavynessLevel;
import com.stanzaliving.core.food.enums.MenuCategoryType;
import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author manish.pareek
 *
 * @date 3rd Aug, 2021
 *
 **/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemQuantityCombinationDto extends AbstractDto implements Serializable {

	private String itemId;

	private ResidenceBrand residenceBrand;

	private FoodRegion foodRegion;

	private FoodServeType foodServeType;

	private MealType mealType;

	private FoodItemBasePreference foodItemBasePreference;

	private MenuCategoryType categoryType;

	private GrammageHeavynessLevel grammageHeavynessLevel;

	private Integer itemWeight;

	private Integer itemQuantity;
}