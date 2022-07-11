
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

	private BigDecimal menuPricePerDay;
	private BigDecimal weekDays;
	private BigDecimal weekdayUtilization;
	private BigDecimal weekendDays;
	private BigDecimal weekendUtilization;
	private BigDecimal holidays;
	private BigDecimal holidayUtilization;
	private BigDecimal specialMealDays;
	private BigDecimal specialDayUtilization;
	private BigDecimal opsSLStaffPerDay;
	private BigDecimal nonSlStaffMenuPricePerDayForMorning;
	private BigDecimal nonSlStaffMenuPricePerDayForEvening;
	private BigDecimal opsNonSLMorningStaffPerDay;
	private BigDecimal opsNonSLEveningStaffPerDay;
	private BigDecimal overallUtilization;
	private BigDecimal overallUtilizationSuggested;
	private String overallUtilizationSuggestedReason;

	List<SMLevelFoodCategoryDto> smLevelFoodCategoryDtoList;

	@Builder.Default
	private int gst = Constants.GST_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private boolean isStanzaKitchen = false;

}
