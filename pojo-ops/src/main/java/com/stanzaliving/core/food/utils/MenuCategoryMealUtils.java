/**
 *
 */
package com.stanzaliving.core.food.utils;

import com.stanzaliving.core.base.utils.StanzaUtils;
import com.stanzaliving.core.food.dto.DayWiseFoodMenuDto;
import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMealDto;
import com.stanzaliving.core.food.dto.request.FoodMenuCategoryMetadataDto;
import com.stanzaliving.core.food.dto.request.FullCategoryDto;
import com.stanzaliving.core.food.dto.request.WeekWiseMenu;
import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.experimental.UtilityClass;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public Double getFnBPaxPrice(FullCategoryDto foodMenuCategory) {
        return getFnBPaxPrice(foodMenuCategory, foodMenuCategory.getMeals());
    }

    public Double getFnBPaxPrice(FullCategoryDto foodMenuCategory, List<FoodMenuCategoryMealDto> mealDtos) {

        FoodMenuCategoryMetadataDto categoryMetadataDto = foodMenuCategory.getCategory();
        return getFnBPaxPrice(mealDtos, categoryMetadataDto.getUtilityCost(), categoryMetadataDto.getPackagingCost(), categoryMetadataDto.getFoodMargin());

    }

    public Double getFnBPaxPrice(List<FoodMenuCategoryMealDto> mealDtos, Double utilityCost, Double packagingCost, Double foodMargin) {

        double fnbCost = 0d;

        int totalMealsInWeek = getWeeklyMealCount(mealDtos);

        if (totalMealsInWeek > 0) {

            for (FoodMenuCategoryMealDto categoryMealDto : mealDtos) {

                double mealCost = getMealFnBCost(categoryMealDto, utilityCost, packagingCost, foodMargin, totalMealsInWeek);

                fnbCost += mealCost;
            }
        }

        return StanzaUtils.roundOff(fnbCost);
    }

    public Double getTruePaxPrice(FullCategoryDto foodMenuCategory) {
        return getTruePaxPrice(foodMenuCategory, foodMenuCategory.getMeals());
    }

    public Double getTruePaxPrice(FullCategoryDto foodMenuCategory, List<FoodMenuCategoryMealDto> mealDtos) {

        FoodMenuCategoryMetadataDto categoryMetadataDto = foodMenuCategory.getCategory();
        return getTruePaxPrice(mealDtos, categoryMetadataDto.getUtilityCost(), categoryMetadataDto.getPackagingCost(), categoryMetadataDto.getFoodMargin());

    }

    public Double getTruePaxPrice(List<FoodMenuCategoryMealDto> mealDtos, Double utilityCost, Double packagingCost, Double foodMargin) {

        double trueCost = 0d;

        int totalMealsInWeek = getWeeklyMealCount(mealDtos);

        if (totalMealsInWeek > 0) {

            for (FoodMenuCategoryMealDto categoryMealDto : mealDtos) {

                double mealCost = getMealTrueCost(categoryMealDto, utilityCost, packagingCost, foodMargin, totalMealsInWeek);

                trueCost += mealCost;
            }

        }

        return StanzaUtils.roundOff(trueCost);
    }

    public double getMealFnBCost(FoodMenuCategoryMealDto categoryMealDto, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {
        return getMealFnBCost(categoryMealDto, categoryMealDto.getExpectedVegCost(), utilityCost, packagingCost, foodMargin, totalMealsInWeek);
    }

    public double getMealFnBCost(
            FoodMenuCategoryMealDto categoryMealDto, Double mealPrice, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {

        int mealActiveDays = getDaysPerWeekCount(categoryMealDto);

        return getMealFnBCost(mealActiveDays, mealPrice, utilityCost, packagingCost, foodMargin, totalMealsInWeek);
    }

    public double getMealFnBCost(int mealActiveDays, Double mealPrice, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {

        if (mealPrice <= 0) {
            return mealPrice;
        }

        utilityCost = ObjectUtils.defaultIfNull(utilityCost, 0d);
        packagingCost = ObjectUtils.defaultIfNull(packagingCost, 0d);
        foodMargin = ObjectUtils.defaultIfNull(foodMargin, 0d);

        double mealUtilityCost = utilityCost * ((double) mealActiveDays / (double) totalMealsInWeek);
        double mealPackagingCost = packagingCost * ((double) mealActiveDays / (double) totalMealsInWeek);

        double mealCost = (mealPrice + mealUtilityCost + mealPackagingCost) / (1 - foodMargin / 100);

        return StanzaUtils.roundOff(mealCost);
    }

    public double getMealTrueCost(FoodMenuCategoryMealDto categoryMealDto, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {
        return getMealTrueCost(categoryMealDto, categoryMealDto.getExpectedVegCost(), utilityCost, packagingCost, foodMargin, totalMealsInWeek);
    }

    public double getMealTrueCost(
            FoodMenuCategoryMealDto categoryMealDto, Double mealPrice, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {

        int mealActiveDays = getDaysPerWeekCount(categoryMealDto);

        return getMealTrueCost(mealActiveDays, mealPrice, utilityCost, packagingCost, foodMargin, totalMealsInWeek);
    }

    public double getMealTrueCost(
            int mealActiveDays, Double mealPrice, Double utilityCost, Double packagingCost, Double foodMargin, int totalMealsInWeek) {

        double mealCost = getMealFnBCost(mealActiveDays, mealPrice, utilityCost, packagingCost, foodMargin, totalMealsInWeek);

        mealCost = mealCost * ((double) 7 / (double) mealActiveDays);

        return StanzaUtils.roundOff(mealCost);
    }

    public static int getSpecialMealDaysCountInWeek(FullCategoryDto fullCategoryDto) {
        return getSpecialMealDaysInWeek(fullCategoryDto).size();
    }
    public static List<DayOfWeek> getSpecialMealDaysInWeek(FullCategoryDto fullCategoryDto) {
        List<DayOfWeek> specialDaysList = new ArrayList<>();
        if (fullCategoryDto == null) {
            return specialDaysList;
        }
        WeekWiseMenu weekWiseMenu = fullCategoryDto.getWeekMenus().stream().filter(menu -> menu.getWeekNumber().equals(1)).findAny().orElseGet(null);
        if (null == weekWiseMenu) {
            return specialDaysList;
        }
        for (DayWiseFoodMenuDto dayWiseFoodMenuDto : weekWiseMenu.getDayWiseFoodMenu()) {
            boolean specialDay = dayWiseFoodMenuDto.getMealWiseFoodMenus().stream().flatMap(mealWiseMenu -> mealWiseMenu.getMenuItems().stream())
                    .filter(menuItemDto -> FoodItemType.NON_VEG.equals(menuItemDto.getItemType()) || FoodItemType.SPECIAL_VEG.equals(menuItemDto.getItemType())).findAny().isPresent();
            if (specialDay) {
                specialDaysList.add(dayWiseFoodMenuDto.getDayOfWeek());
            }
        }
        return specialDaysList;
    }

    public static double getNonSlStaffMenuPricePerDay(FullCategoryDto fullCategoryDto, List<MealType> mealTypeList) {
        if (fullCategoryDto == null || CollectionUtils.isEmpty(mealTypeList) || CollectionUtils.isEmpty(fullCategoryDto.getMeals())) {
            return 0d;
        }
        List<FoodMenuCategoryMealDto> foodMenuCategoryMealDtoList = fullCategoryDto.getMeals().stream().filter(dto -> dto.isStatus() && mealTypeList.contains(dto.getMealType())).collect(Collectors.toList());
        double effectiveCost = 0;
        for (FoodMenuCategoryMealDto foodMenuCategoryMealDto : foodMenuCategoryMealDtoList) {
            int mealActiveDays = getMealActiveDays(foodMenuCategoryMealDto);
            double nonSlCost = foodMenuCategoryMealDto.getNonStanzaStaffCost() == null ? 0d : foodMenuCategoryMealDto.getNonStanzaStaffCost();
            effectiveCost += ((nonSlCost * (double) mealActiveDays)/7d);
        }
        return effectiveCost;
    }

    private static Integer getMealActiveDays(FoodMenuCategoryMealDto foodMenuCategoryMealDto) {
        return getDaysPerWeekCount(foodMenuCategoryMealDto);
    }
}