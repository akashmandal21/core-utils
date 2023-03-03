package com.stanzaliving.core.opscalculator.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculator.dto.RepairCategoryDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EquipmentType {
    AC("AC") {
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setAcAmcCostApplicable(true);
        }
    },
    DG("DG"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setDgAmcCostApplicable(true);
        }
    },
    LIFT("Lift") {
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setLiftAmcCostApplicable(true);
        }
    },
    CENTRAL_HEATER("Central Heater"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setCentralHeatersAmcCostApplicable(true);
        }
    },
    RO("RO"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setRoAmcCostApplicable(true);
        }
    },
    MANPOWER_AMC("Manpower AMC"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setManPowerAmcCostApplicable(true);
        }
    },
    WASHING_MACHINE("Washing Machine"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setWashingMachineAmcCostApplicable(true);
        }
    },
    FIRE_EXTINGUISHER("Fire Extinguisher"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setFireExtinguisherAmcCostApplicable(true);
        }
    },
    FIRE_PANEL("Fire Panel"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto){
            repairCategoryDto.setFirePanelAmcCostApplicable(true);
        }
    },
    OTHERS("Others"){
        public void setSelectedApplicableOption(RepairCategoryDto repairCategoryDto) {
        }
    };
    String name;
    public static List<DropDownDto> getAllEquipmentTypeValues(){
        List<DropDownDto> dropDownDtoList = new ArrayList<>();
        for(EquipmentType equipmentType : EquipmentType.values()){
            dropDownDtoList.add(new DropDownDto(equipmentType.toString(), equipmentType.getName()));
        }
        return dropDownDtoList;
    }
    
    public static void setDefaultSelectedApplicableOption(RepairCategoryDto repairCategoryDto) {
		repairCategoryDto.setAcAmcCostApplicable(false);
		repairCategoryDto.setDgAmcCostApplicable(false);
		repairCategoryDto.setLiftAmcCostApplicable(false);
		repairCategoryDto.setCentralHeatersAmcCostApplicable(false);
		repairCategoryDto.setRoAmcCostApplicable(false);
		repairCategoryDto.setManPowerAmcCostApplicable(false);
		repairCategoryDto.setWashingMachineAmcCostApplicable(false);
		repairCategoryDto.setFireExtinguisherAmcCostApplicable(false);
		repairCategoryDto.setFirePanelAmcCostApplicable(false);
	}

    public abstract void  setSelectedApplicableOption(RepairCategoryDto repairCategoryDto);
}
