package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.BuildMaintenanceCategoryDto;
import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculator.dto.RepairCategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ServiceType {
    PEST_CONTROL("Pest Control"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setPestControlApplicable(true);
        }
    },
    FLOOR_CLEANING("Floor Cleaning"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setFloorCleaningApplicable(true);
        }
    },
    OVERHEAD_TANK_CLEANING("Overhead Tank Cleaning"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setOverheadTankCleaningInfoApplicable(true);
        }
    },
    UNDERGROUND_TANK_CLEANING("Underground Tank Cleaning"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setUnderGroundTankCleaningInfoApplicable(true);
        }
    },
    FACADE_CLEANING("Facade Cleaning"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setFacadeCleaningApplicable(true);
        }
    },
    UPHOLSTERY_CLEANING("Upholstery Cleaning"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setUpholsteryCleaningApplicable(true);
        }
    },
    FUMIGATION_PER_BED_BUGS("Fumigation/Bed bugs"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setFumigationPerBedBugsApplicable(true);
        }
    },
    GARBAGE_COST("Garbage Cost"){
        public void setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto){
            buildMaintenanceCategoryDto.setGarbageCostApplicable(true);
        }
    };

    String name;
    
    public static List<DropDownDto> getAllServiceTypeValues(){
        return dropDownDtoList;
    }

    static List<DropDownDto> dropDownDtoList = new ArrayList<>();

    static {
        for(ServiceType serviceType : ServiceType.values()){
            dropDownDtoList.add(new DropDownDto(serviceType.toString(), serviceType.getName()));
        }
    }

    public abstract void  setSelectedApplicableOption(BuildMaintenanceCategoryDto buildMaintenanceCategoryDto);
}
