/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculator.V2.dto;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;
import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculator.dto.ElectricitySlotDetailsDto;
import com.stanzaliving.core.opscalculator.enums.ElectricityEquipmentType;
import com.stanzaliving.core.opscalculator.enums.UnitRate;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class UtilitiesElectricityCategoryV2Dto extends CategoryDto {

	public int unitForEquipmentsPerDay;
	
	public int totalCharges;
	
	public double fixedCharges;
	public UnitRate unitRate;
	public double unitRateValue;
	public double taxPercent;
	
	
	public int acRoomsCount;
	public int acRoomsWithRoomPassThroughCount;
	public int acRoomsWithAcPassThroughCount;
	public int nonAcRoomsWithRoomPassThroughCount;
	
	
	public double passThroughUnitRate;
	public double acRunningMonthsPerYear;
	public double commonAreaAcCount;
	public double commonAreaAcConsumptionPerDay;
	public double boilerCount;
	public double boilerConsumptionPerDay;
	
	    
	public double totalUnitsPerMonth;
	public double totalPassThroughUnitsPerMonth;
	public double totalElectricityCost;
	
	public int landlordReceivablesInPercent;
	
	public double finalElectricityCost;
	    	
	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}

	public void setVariableCharges(int variableCharges) {
		this.variableCharges = variableCharges;
	}

	public int calculatedFixCharges;
	public int variableCharges;

	
	public int acRoomsWithRoomPassThroughCharges;
	public int acRoomsWithAcPassThroughCharges;
	public int nonAcRoomsWithRoomPassThroughCharges;
	public double studentReceivablesUnitRate;

	public void setLandlordReceivablesCharges(int landlordReceivablesCharges) {
		this.landlordReceivablesCharges = landlordReceivablesCharges;
	}

	public int landlordReceivablesCharges;
	public int totalChargesBeforePassThrough;



	@Builder.Default
	public int daysInMonth = 30;

	public List<DropDownDto> equipmentTypeOptions = new ArrayList<>();
	@Builder.Default
	public List<ElectricityEquipmentType> selectedEquipmentType = new ArrayList<>();

	@Builder.Default
	public List<ElectricitySlotDetailsDto> electricitySlotDetailsDtos = new ArrayList<ElectricitySlotDetailsDto>();

	public double unitsConsumedByLiftPerDay;
	public double unitsConsumedByHeatPumpPerDay;
	public double unitsConsumedByAcPerDay;
	public double unitsConsumedByWashingMachinePerDay;
	public double unitsConsumedByMicrowavePerDay;
	public double unitsConsumedByBrainMariePerDay;
	public double unitsConsumedByOthersEquipPerDay;


	
	

	public int totalUnitsInRoom;

	public double unitInAcRoomPerDay;
	public double unitInNonAcRoomPerDay;
	
	public double unitInAcRoomPerDaySuggestedValue;
	public double unitInNonAcRoomPerDaySuggestedValue;
	
	public double unitInAcRoomPerDaySuggestedValueReason;
	public double unitInNonAcRoomPerDaySuggestedValueReason;
	
	
	public double unitInCommonAreaPerDay;
	public double unitEquipmentsPerDay;
	public double unitsAcPerDay;

	public double otherChargesPercent;
	public double variableCostPerNonACRoom;

	public void setRoomPassThroughCharges(int roomPassThroughCharges) {
		this.roomPassThroughCharges = roomPassThroughCharges;
	}

	public void setAcPassThroughCharges(int acPassThroughCharges) {
		this.acPassThroughCharges = acPassThroughCharges;
	}

	public int roomPassThroughCharges;
	public int acPassThroughCharges;

	public int totalBillableUnitPerMonthForNonAcRoom;
	public int totalBillableUnitPerMonthForAcRoom;
	public int totalBillableUnitPerMonthForCA;
	public int totalBillableUnitPerMonthForEquipment;

	public boolean roomMeterRequired;
	public int roomMeterOpexCost;
	public int rentalRoomMeterCount;
	public int elecricityRoomMeterCost;

	public int netElectricityBillAfterPassthrough;

	public int fixedChargesPerAvailableBed;
	public int variableChargesPerAvailableBed;
	public int acPassThroughChargesPerAvailableBed;
	public int roomPassThroughChargesPerAvailableBed;
	public int landlordReceivablesChargesPerAvailableBed;



}