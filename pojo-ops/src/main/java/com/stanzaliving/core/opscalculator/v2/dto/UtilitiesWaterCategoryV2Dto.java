/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculator.V2.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.dto.CategoryDto;

import lombok.AllArgsConstructor;
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
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class UtilitiesWaterCategoryV2Dto extends CategoryDto {
	
	private int waterRequirementPerPersonPerDay;
	private int waterRequirementPerPersonPerDaySuggestedValue;
	private int waterRequirementPerPersonPerDaySuggestedValueReason;
	private int tankerRequirementPercent;
	private double tankerCostPerLtr;
	private double landlordReceivablePercent;
	private double waterCost;
	private double waterCostPerAvailableBed;
	private double jalBoardWaterCostPerMonth;
	private double jalBoardWaterCostPerAvailableBed;
	

}
