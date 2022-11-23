
package com.stanzaliving.core.opscalculatorv2.dto;

import java.math.BigDecimal;
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

	@Builder.Default
	private BigDecimal menuPricePerDay = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal weekDays = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal weekdayUtilization = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal weekendDays = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal weekendUtilization = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal holidays = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal holidayUtilization = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal specialMealDays = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal specialDayUtilization = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal opsSLStaffPerDay = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal nonSlStaffMenuPricePerDayForMorning = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal nonSlStaffMenuPricePerDayForEvening = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal opsNonSLMorningStaffPerDay = new BigDecimal(0);
	
	@Builder.Default
	private BigDecimal opsNonSLEveningStaffPerDay = new BigDecimal(0);

	@Builder.Default
    private BigDecimal utilizationNonLeaveDays = new BigDecimal(0);

	@Builder.Default
	private BigDecimal utilizationNonLeaveDaysSuggested = new BigDecimal(0);

	private String utilizationNonLeaveDaysSuggestedReason;

	List<SMLevelFoodCategoryDto> smLevelFoodCategoryDtoList;

	@Builder.Default
	private int gst = Constants.GST_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private boolean isStanzaKitchen = false;

}
