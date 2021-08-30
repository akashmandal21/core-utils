/**
 * 
 */
package com.stanzaliving.food.v2.menu.dto;

import java.util.Collection;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.food.dto.FoodMenuCategoryDto;
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
public class FoodItemQuantityCombinationRequest {

	private Collection<String> items;
	private ResidenceMenuDto menu; 
	private FoodMenuCategoryDto menuCategory;
	
	private ResidenceBrand residenceBrand;
	private FoodRegion foodRegion;
	private FoodServeType foodServeType;
	private MealType mealType;
	private FoodItemBasePreference foodItemBasePreference;
	private MenuCategoryType menuCategoryType;
	private GrammageHeavynessLevel grammageHeavynessLevel;

}