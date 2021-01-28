/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.WaterSupplySource;
import com.stanzaliving.core.opscalculator.enums.DrinkingWaterSupplySources;
import com.stanzaliving.core.opscalculator.enums.LandlordReceivablesCalculationEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

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
	private int fixedCharges;
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
	private double govtSupplyUnitRate;
	private int govtSupplyBillCharges;



	@Builder.Default
	private WaterSupplySource[] allWaterSupplySources = WaterSupplySource.values();

	@Builder.Default
	private DrinkingWaterSupplySources[] allDrinkingWaterSupplySources = DrinkingWaterSupplySources.values();

	@Builder.Default
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
	
	
	public UtilitiesWaterCategoryDto clone() {
		return UtilitiesWaterCategoryDto.builder()
				.overallCharges(this.overallCharges)
				.fixedCharges(this.fixedCharges)
				.variableCharges(this.variableCharges)
				.landlordReceivables(this.landlordReceivables)
				.tankerCost(this.tankerCost)
				.waterSupplySource(this.waterSupplySource)
				.drinkingWaterSource(this.drinkingWaterSource)
				.avgStudentConsumptionPerDay(this.avgStudentConsumptionPerDay)
				.govtSupplyDependencyWithoutTanker(this.govtSupplyDependencyWithoutTanker)
				.govtSupplyDependencyWithTanker(this.govtSupplyDependencyWithTanker)
				.govtSupplyFixedCharges(this.govtSupplyFixedCharges)
				.govtSupplyUnitRate(this.govtSupplyUnitRate)
				.govtSupplyBillCharges(this.govtSupplyBillCharges)
				.allWaterSupplySources(this.allWaterSupplySources)
				.allDrinkingWaterSupplySources(this.allDrinkingWaterSupplySources)
				.waterTankerSlotDetails(this.waterTankerSlotDetails)
				.waterJarCapacity(this.waterJarCapacity)
				.waterJarCost(this.waterJarCost)
				.waterJarCount(this.waterJarCount)
				.landlordReceivablePercent(this.landlordReceivablePercent)
				.landLordReceivablesOptions(this.landLordReceivablesOptions)
				.landlordReceivableCalculatedOn(this.landlordReceivableCalculatedOn)
				.dependability(this.dependability)
				.waterTanker(this.waterTanker)
				.categoryName(this.categoryName)
				.costPerAvailableBed(this.costPerAvailableBed)
				.costPerOccupiedBed(this.costPerOccupiedBed)
				.contribution(this.contribution)
				.enabled(this.enabled)
				.build();
	}
}
