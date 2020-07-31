/**
 * 
 */
package com.stanzaliving.core.food.utils.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMealDto;
import com.stanzaliving.core.food.utils.MenuCategoryMealUtils;
import com.stanzaliving.core.operations.enums.MealType;

/**
 * @author naveen.kumar
 *
 * @date 31 Jul, 2020
 *
 **/
public class MenuCategoryMealUtilsTest {

	@Test
	public void testTrueCost() {

		List<FoodMenuCategoryMealDto> categoryMealDtos = new ArrayList<>();

		categoryMealDtos.add(getMealDto(MealType.BREAKFAST, 9.7));
		categoryMealDtos.add(getMealDtoPartial(MealType.LUNCH, 5.1));
		//categoryMealDtos.add(getMealDto(MealType.EVENING_SNACKS, 7.1));
		categoryMealDtos.add(getMealDto(MealType.DINNER, 22.9));

		double trueCost = MenuCategoryMealUtils.getTruePaxPrice(categoryMealDtos, true, 5.0, 3.0, 23.0);

		System.out.println(trueCost);

	}

	private FoodMenuCategoryMealDto getMealDto(MealType mealType, double vegCost) {
		return FoodMenuCategoryMealDto.builder()
				.mealType(mealType)
				.expectedVegCost(vegCost)
				.status(true)
				.mondayActive(true)
				.tuesdayActive(true)
				.wednesdayActive(true)
				.thursdayActive(true)
				.fridayActive(true)
				.saturdayActive(true)
				.sundayActive(true)
				.build();
	}
	
	
	private FoodMenuCategoryMealDto getMealDtoPartial(MealType mealType, double vegCost) {
		return FoodMenuCategoryMealDto.builder()
				.mealType(mealType)
				.expectedVegCost(vegCost)
				.status(true)
				.mondayActive(true)
				.tuesdayActive(true)
				.build();
	}
}