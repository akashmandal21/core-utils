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
public class UtilitiesElectricityCategoryDto extends CategoryDto {

	private int totalCharges;
	private double fixedCharges;

	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}

	public void setVariableCharges(int variableCharges) {
		this.variableCharges = variableCharges;
	}

	private int calculatedFixCharges;
	private int variableCharges;

	private int acRoomsWithRoomPassThroughCharges;
	private int acRoomsWithAcPassThroughCharges;
	private int nonAcRoomsWithRoomPassThroughCharges;
	private double studentReceivablesUnitRate;

	public void setLandlordReceivablesCharges(int landlordReceivablesCharges) {
		this.landlordReceivablesCharges = landlordReceivablesCharges;
	}

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

	private double unitsConsumedByLiftPerDay;
	private double unitsConsumedByHeatPumpPerDay;
	private double unitsConsumedByAcPerDay;
	private double unitsConsumedByWashingMachinePerDay;
	private double unitsConsumedByMicrowavePerDay;
	private double unitsConsumedByBrainMariePerDay;
	private double unitsConsumedByOthersEquipPerDay;


	private int acRoomsCount;
	private int landlordReceivablesInPercent;

	private int totalUnitsInRoom;

	private double unitInAcRoomPerDay;
	private double unitInNonAcRoomPerDay;
	private double unitInCommonAreaPerDay;
	private double unitEquipmentsPerDay;
	private double unitsAcPerDay;

	private double otherChargesPercent;
	private double variableCostPerNonACRoom;

	public void setRoomPassThroughCharges(int roomPassThroughCharges) {
		this.roomPassThroughCharges = roomPassThroughCharges;
	}

	public void setAcPassThroughCharges(int acPassThroughCharges) {
		this.acPassThroughCharges = acPassThroughCharges;
	}

	private int roomPassThroughCharges;
	private int acPassThroughCharges;

	private int totalBillableUnitPerMonthForNonAcRoom;
	private int totalBillableUnitPerMonthForAcRoom;
	private int totalBillableUnitPerMonthForCA;
	private int totalBillableUnitPerMonthForEquipment;

	private boolean roomMeterRequired;
	private int roomMeterOpexCost;
	private int rentalRoomMeterCount;
	private int elecricityRoomMeterCost;

	private int netElectricityBillAfterPassthrough;

	private int fixedChargesPerAvailableBed;
	private int variableChargesPerAvailableBed;
	private int acPassThroughChargesPerAvailableBed;
	private int roomPassThroughChargesPerAvailableBed;
	private int landlordReceivablesChargesPerAvailableBed;



}