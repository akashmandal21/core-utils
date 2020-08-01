/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 17-Jun-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealFoodMenuDto {

	private FoodRegion foodRegion;
	
	private FoodItemBasePreference preference;
	
	private Float mealRating;

	private Double mealCost;

	private Double budgetedCost;
	
	private boolean defaultMenu;
	
	private String menuName;

	private List<MenuItemDto> menuItems;
}