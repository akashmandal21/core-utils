
package com.stanzaliving.core.opscalculator.V2.dto;

import java.util.List;

import com.stanzaliving.core.opscalculator.constants.Constants;
import com.stanzaliving.core.opscalculator.dto.SMLevelFoodCategoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class FoodCategoryV2Dto extends CategoryV2Dto {

	private double menuPricePerDay;	

	private double weekDays;
	private int weekdayUtilization;
	private double weekendDays;
	private int weekendUtilization;
	private double holidays;
	private int holidayUtilization;
	private double specialMealDays; 
	private int specialDayUtilization;
	private int opsSLStaffPerDay;
	private double nonSlStaffMenuPricePerDayForMorning;		
	private double nonSlStaffMenuPricePerDayForEvening;		
	private int opsNonSLMorningStaffPerDay;
	private int opsNonSLEveningStaffPerDay;
	public int overallUtilization;
	public int overallUtilizationSuggested;
	public String overallUtilizationSuggestedReason;

	List<SMLevelFoodCategoryDto> smLevelFoodCategoryDtoList;

	@Builder.Default
	private int gst = Constants.GST_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_FOOD_VENDOR_PERCENT;
	
	@Builder.Default
	private boolean isStanzaKitchen = false;

}
