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
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst", "elecricityRoomMeterCost" })
public class UtilitiesElectricityCategoryDto extends CategoryDto {

	private int totalCharges;
	private int fixedCharges;
	private int variableCharges;
	private int acPassThroughCharges;
	private int roomPassThroughCharges;
	private int landlordReceivables;

	private PassThrough passThrough;

	@Builder.Default
	private boolean roomMeterRequired = false;

	@Builder.Default
	private int roomMeterOpexCostPerMonth = Constants.ELECTRICITY_ROOM_METER_OPEX_COST_PER_MONTH;

	@Builder.Default
	private double loadForAcRooms = Constants.LOAD_FOR_AC_ROOMS;

	@Builder.Default
	private double loadForNonAcRooms = Constants.LOAD_FOR_NON_AC_ROOMS;

	private int acRoomsCount;
	private int avgFreeUnitsProvidedPerBed;
	private double landlordReceivablesInPercent;

	private int unitsInRoom;
	private int unitsInCommonArea;
	private int unitsForACPassThrough;
	private double unitRateOfElectricityBoard;
	private double unitRateForResidents;
	private int electricityFixedCharges;
	private double otherChargesPercent;
	private double variableCostPerNonACRoom;
	private double commonAreaVariableCostPerNonACRoom;
	private double acVariableCostPerACRoom;

	private int fixedElectricityChargesPerKwh;

	@Builder.Default
	private PassThrough[] allPassThroughs = PassThrough.values();



	private int variableCostsForRoomPerMonth;
	private int variableCostsForCommonAreaPerMonth;
	private int acCostsForRoomForMonth;
	private int elecricityRoomMeterCost;





}
