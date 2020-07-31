/**
 * 
 */
package com.stanzaliving.core.food.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;

import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMealDto;
import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMetadataDto;
import com.stanzaliving.core.food.dto.request.FullCategoryDto;

import lombok.experimental.UtilityClass;

/**
 * @author naveen.kumar
 *
 * @date 31 Jul, 2020
 *
 **/
@UtilityClass
public class MenuCategoryMealUtils {

	public int getWeeklyMealCount(List<FoodMenuCategoryMealDto> categoryMealDtos) {

		if (CollectionUtils.isEmpty(categoryMealDtos)) {
			return 0;
		}

		return categoryMealDtos.stream().collect(Collectors.summingInt(MenuCategoryMealUtils::getDaysPerWeekCount));
	}

	public int getDaysPerWeekCount(FoodMenuCategoryMealDto dto) {

		int count = 0;

		if (dto.isStatus()) {

			count += (dto.isMondayActive() ? 1 : 0);
			count += (dto.isTuesdayActive() ? 1 : 0);
			count += (dto.isWednesdayActive() ? 1 : 0);
			count += (dto.isThursdayActive() ? 1 : 0);
			count += (dto.isFridayActive() ? 1 : 0);
			count += (dto.isSaturdayActive() ? 1 : 0);
			count += (dto.isSundayActive() ? 1 : 0);
		}

		return count;
	}

	public Double getTruePaxPrice(FullCategoryDto foodMenuCategory, List<FoodMenuCategoryMealDto> mealDtos) {

		FoodMenuCategoryMetadataDto categoryMetadataDto = foodMenuCategory.getCategory();
		return getTruePaxPrice(
				mealDtos, categoryMetadataDto.getStanzaKitchen(), categoryMetadataDto.getUtilityCost(), categoryMetadataDto.getPackagingCost(), categoryMetadataDto.getFoodMargin());

	}

	public Double getTruePaxPrice(List<FoodMenuCategoryMealDto> mealDtos, boolean stanzaKitchen, Double utilityCost, Double packagingCost, Double foodMargin) {

		double trueCost = 0d;

		if (stanzaKitchen) {

			int totalMealsInWeek = MenuCategoryMealUtils.getWeeklyMealCount(mealDtos);

			if (totalMealsInWeek > 0) {

				for (FoodMenuCategoryMealDto categoryMealDto : mealDtos) {

					double mealCost = getMealTrueCost(categoryMealDto, utilityCost, packagingCost, foodMargin, totalMealsInWeek);

					trueCost += mealCost;
				}

			}
		}

		return StanzaUtils.roundOff(trueCost);
	}

	public double getMealTrueCost(FoodMenuCategoryMealDto categoryMealDto, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {

		int mealActiveDays = MenuCategoryMealUtils.getDaysPerWeekCount(categoryMealDto);

		double mealUtilityCost = utilityCost * ((double) mealActiveDays / (double) totalMealsInWeek);
		double mealPackagingCost = packagingCost * ((double) mealActiveDays / (double) totalMealsInWeek);

		double mealCost =
				(categoryMealDto.getExpectedVegCost() + mealUtilityCost + mealPackagingCost) / (1 - foodMargin / 100);

		mealCost = mealCost * (7 / mealActiveDays);

		return StanzaUtils.roundOff(mealCost);
	}

}