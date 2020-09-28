/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.WaterSupplySource;

import com.stanzaliving.core.opscalculator.enums.DrinkingWaterSupplySources;
import com.stanzaliving.core.opscalculator.enums.LandlordReceivablesCalculationEnum;
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
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class UtilitiesWaterCategoryDto extends CategoryDto {

	private int overallCharges;
	private int variableCharges;
	private int landlordReceivables;
	private int tankerCost;


	@Builder.Default
	private List<WaterSupplySource> waterSupplySource = new ArrayList<>();
	@Builder.Default
	private List<DrinkingWaterSupplySources> drinkingWaterSource = new ArrayList<>();
	private int avgStudentConsumptionPerDay;

	private int govtSupplyDependencyWithoutTanker;
	private int govtSupplyDependencyWithTanker;
	private int govtSupplyFixedCharges;
	private int govtSupplyUnitRate;
	private int govtSupplyBillCharges;



	@Builder.Default
	private WaterSupplySource[] allWaterSupplySources = WaterSupplySource.values();

	@Builder.Default
	private DrinkingWaterSupplySources[] allDrinkingWaterSupplySources = DrinkingWaterSupplySources.values();

	private List<WaterTankerSlotDetail> waterTankerSlotDetails =  new ArrayList<>();


	private int waterJarCapacity;
	private int waterJarCost;
	private int waterJarCount;

	private int landlordReceivablePercent;
	@Builder.Default
	private List<DropDownDto> landLordReceivablesOptions = new ArrayList<>();
	private LandlordReceivablesCalculationEnum landlordReceivableCalculatedOn;


	private int dependability;

	@Builder.Default
	private boolean waterTanker = false;
}
