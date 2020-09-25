/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.opscalculator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stanzaliving.core.opscalculator.constants.Constants;
import com.stanzaliving.core.opscalculator.constants.PassThrough;

import com.stanzaliving.core.opscalculator.enums.ElectricityEquipmentType;
import com.stanzaliving.core.opscalculator.enums.UnitRate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
@JsonIgnoreProperties({ "count", "rate", "utilization", "margin", "gst", "elecricityRoomMeterCost" })
public class UtilitiesElectricityCategoryDto extends CategoryDto {

	private int totalCharges;
	private int fixedCharges;
	private int variableCharges;

	private int acRoomsWithRoomPassThroughCharges;
	private int acRoomsWithAcPassThroughCharges;
	private int nonAcRoomsWithRoomPassThroughCharges;
	private int studentReceivablesUnitRate;
	private int landlordReceivablesCharges;

	private int totalChargesBeforePassThrough;

	private UnitRate unitRate;
	private double unitRateValue;

	@Builder.Default
	private int daysInMonth = 30;

	private List<DropDownDto> equipmentTypeOptions = new ArrayList<>();
	@Builder.Default
	private List<ElectricityEquipmentType> selectedEquipmentType = new ArrayList<>();

	@Builder.Default
	private List<ElectricitySlotDetailsDto> electricitySlotDetailsDtos = new ArrayList<ElectricitySlotDetailsDto>();

	private int unitsConsumedByLiftPerDay;
	private int unitsConsumedByHeatPumpPerDay;
	private int unitsConsumedByAcPerDay;
	private int unitsConsumedByWashingMachinePerDay;
	private int unitsConsumedByMicrowavePerDay;
	private int unitsConsumedByBrainMariePerDay;
	private int unitsConsumedByOthersEquipPerDay;


	private int acRoomsCount;
	private double landlordReceivablesInPercent;

	private int totalUnitsInRoom;

	private double unitInAcRoomPerDay;
	private double unitInNonAcRoomPerDay;
	private double unitInCommonAreaPerDay;
	private double unitEquipmentsPerDay;
	private double unitsAcPerDay;

	private double otherChargesPercent;
	private double variableCostPerNonACRoom;

	private int roomPassThroughCharges;
	private int acPassThroughCharges;

	private int totalBillableUnitPerMonthForNonAcRoom;
	private int totalBillableUnitPerMonthForAcRoom;
	private int totalBillableUnitPerMonthForCA;
	private int totalBillableUnitPerMonthForEquipment;

	private boolean roomMeterRequired;
	private int roomMeterOpexCost;

}