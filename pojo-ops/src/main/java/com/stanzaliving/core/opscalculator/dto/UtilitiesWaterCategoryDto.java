/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.WaterSupplySource;

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

	private int drinkingWater;
	private int dependability;
	private int avgStudentConsumptionPerDay;
	private WaterSupplySource waterSupplySource;

	@Builder.Default
	private WaterSupplySource[] allWaterSupplySources = WaterSupplySource.values();

	@Builder.Default
	private boolean waterTanker = false;

	@Builder.Default
	private List<WaterTankerSlotDetail> waterTankerSlotDetails = new ArrayList<WaterTankerSlotDetail>();

}
