/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.operations.dto.opscalculator;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.operations.constants.opscalculator.WaterSupplySource;

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
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst" })
public class UtilitiesWaterCategoryDto extends CategoryDto {

	private int drinkingWater;
	private int dependability;
	private int avgStudentConsumptionPerDay;

	@Builder.Default
	private WaterSupplySource waterSupplySource = WaterSupplySource.BOREWELL;

	@Builder.Default
	private boolean waterTanker = false;

	@Builder.Default
	private List<WaterTankerSlotDetail> waterTankerSlotDetails = new ArrayList<WaterTankerSlotDetail>();

}
