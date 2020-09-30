/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "count" })
public class FoodCategoryDto extends CategoryDto {

	private double menuPricePerDay;	//totalPrice from foodMenu in service-mix (after checking for enabled)  			//menu categoryId from Service Mix -> 	FoodServiceClientApi->getFullCategoryById  --> MenuCategoryMealUtils->getFnBPaxPrice

	private int weekDays;
	private int weekdayUtilization;
	private int weekendDays;
	private int weekendUtilization;
	private int holidays;
	private int holidayUtilization;
	private int specialMealDays; //menu categoryId from Service Mix -> 	FoodServiceClientApi->getFullCategoryById -> FullCategoryDto -> WeekWiseMenu -> weekNumber1 -> DayWiseFoodMenuDto -> MealWiseFoodMenuDto -> MenuItemDto -> itemType is either NON-Veg or special
	private int specialDayUtilization;
	private int opsSLStaffPerDay;
	private double nonSlStaffMenuPricePerDayForMorning;		//FullCategoryDto -> FoodMenuCategoryMealDto (if status) -> nonStanzaStaffCost based on mealType
	private double nonSlStaffMenuPricePerDayForEvening;		//FullCategoryDto -> FoodMenuCategoryMealDto (if status) -> nonStanzaStaffCost based on mealType
	private int opsNonSLMorningStaffPerDay;
	private int opsNonSLEveningStaffPerDay;
	private int overallUtilization;





	@Builder.Default
	private int gst = Constants.GST_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_FOOD_VENDOR_PERCENT;
	
	@Builder.Default
	private boolean isStanzaKitchen = false;

}
