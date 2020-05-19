/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;
import com.stanzaliving.core.opscalculator.constants.PassThrough;

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
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst", "elecricityRoomMeterCost" })
public class UtilitiesElectricityCategoryDto extends CategoryDto {

	private PassThrough passThrough;
	private boolean roomMeterRequired;
	private int acRooms;
	private int fixedElectricityChargesPerKwh;
	private int roomMeterOpexCostPerMonth;
	private int variableCostsForRoomPerMonth;
	private int variableCostsForCommonAreaPerMonth;
	private int acCostsForRoomForMonth;
	private int avgFreeUnitsProvidedPerBed;
	private int elecricityRoomMeterCost;
	private int roomPassThroughAmount;
	private int acPassThroughAmount;

	@Builder.Default
	private double loadForAcRooms = Constants.LOAD_FOR_AC_ROOMS;

	@Builder.Default
	private double loadForNonAcRooms = Constants.LOAD_FOR_NON_AC_ROOMS;

}
