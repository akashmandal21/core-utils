package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SMLevelFoodCategoryDto {

	private double menuPricePerDay;	//totalPrice from foodMenu in service-mix (after checking for enabled)  			//menu categoryId from Service Mix -> 	FoodServiceClientApi->getFullCategoryById  --> MenuCategoryMealUtils->getFnBPaxPrice

	private int weekDays;
	private int weekendDays;
	private int holidays;
	private int specialMealDays; //menu categoryId from Service Mix -> 	FoodServiceClientApi->getFullCategoryById -> FullCategoryDto -> WeekWiseMenu -> weekNumber1 -> DayWiseFoodMenuDto -> MealWiseFoodMenuDto -> MenuItemDto -> itemType is either NON-Veg or special
	private double nonSlStaffMenuPricePerDayForMorning;		//FullCategoryDto -> FoodMenuCategoryMealDto (if status) -> nonStanzaStaffCost based on mealType
	private double nonSlStaffMenuPricePerDayForEvening;		//FullCategoryDto -> FoodMenuCategoryMealDto (if status) -> nonStanzaStaffCost based on mealType

}
