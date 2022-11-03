/**
 * @author manish.pareek
 *
 */
package com.stanzaliving.core.opscalculatorv2.dto;

import java.util.ArrayList;
import java.util.List;

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
public class UtilitiesElectricityCategoryV2Dto extends CategoryV2Dto {

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
	
	public double otherEquipCount;
	public double unitsConsumedByOthersEquipPerDay;
	
	public double totalUnitsPerMonth;
	public double totalPassThroughUnitsPerMonth;
	public double totalElectricityCost;
	
	public int landlordReceivablesInPercent;
	
	public double finalElectricityCost;
	    	
	public void setFixedCharges(double fixedCharges) {
		this.fixedCharges = fixedCharges;
	}

	@Builder.Default
	public int daysInMonth = 30;

	@Builder.Default
	public List<DropDownDto> equipmentTypeOptions = new ArrayList<>();
	
	@Builder.Default
	public List<ElectricityEquipmentType> selectedEquipmentType = new ArrayList<>();

	@Builder.Default
	public List<ElectricitySlotDetailsDto> electricitySlotDetailsDtos = new ArrayList<ElectricitySlotDetailsDto>();

	public int totalUnitsInRoom;

	public double unitInAcRoomPerDay;
	public double unitInNonAcRoomPerDay;
	
	public double unitInAcRoomPerDaySuggestedValue;
	public double unitInNonAcRoomPerDaySuggestedValue;

	public String unitInAcRoomPerDaySuggestedValueReason;
    public String unitInNonAcRoomPerDaySuggestedValueReason;

	public double unitInCommonAreaPerDay;
	public double unitEquipmentsPerDay;
	public double unitsAcPerDay;

	public void setRoomPassThroughCharges(int roomPassThroughCharges) {
		this.roomPassThroughCharges = roomPassThroughCharges;
	}

	public void setAcPassThroughCharges(int acPassThroughCharges) {
		this.acPassThroughCharges = acPassThroughCharges;
	}

	public int roomPassThroughCharges;
	public int acPassThroughCharges;

}