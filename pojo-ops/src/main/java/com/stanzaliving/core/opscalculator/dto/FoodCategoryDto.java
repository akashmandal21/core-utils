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

	Double menuPricePerDay;

	Integer weekDays;
	Integer weekdayUtilization;
	Integer weekendDays;
	Integer weekendUtilization;
	Integer holidays;
	Integer holidayUtilization;
	Integer specialDayUtilization;
	Integer opsSLStaffPerDay;
	Integer opsNonSLMorningStaffPerDay;
	Integer opsNonSLEveningStaffPerDay;
	Integer overallUtilization;





	@Builder.Default
	private int gst = Constants.GST_FOOD_VENDOR_PERCENT;

	@Builder.Default
	private int margin = Constants.MARGIN_FOOD_VENDOR_PERCENT;
	
	@Builder.Default
	private boolean isStanzaKitchen = false;

}
