package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculator.dto.RepairCategoryDto;
import com.stanzaliving.core.opscalculator.dto.UtilitiesElectricityCategoryDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ElectricityEquipmentType {
    LIFT("units consumed by Lifts/day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByLiftPerDay();
        }
    },
    HEAT_PUMP("units consumed by heat pump/day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByHeatPumpPerDay();
        }
    },
    CENTRAL_AC("units consumed by Central AC/day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByAcPerDay();
        }
    },
    WASHING_MACHINE("units consumed by Washing Machine/day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByWashingMachinePerDay();
        }
    },
    MICROWAVE("units consumed by Microwave/day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByMicrowavePerDay();
        }
    },
    BRAIN_MARIE("units consumed by Braine Marie/day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByBrainMariePerDay();
        }
    },
    OTHERS_EQUIPMENT("units consumed by Others Equip./day"){
        public int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto){
            return utilitiesElectricityCategoryDto.getUnitsConsumedByOthersEquipPerDay();
        }
    };
    String name;
    public static List<DropDownDto> getAllEquipmentTypeValues(){
        List<DropDownDto> dropDownDtoList = new ArrayList<>();
        for(ElectricityEquipmentType electricityEquipmentType : ElectricityEquipmentType.values()){
            dropDownDtoList.add(new DropDownDto(electricityEquipmentType.toString(), electricityEquipmentType.getName()));
        }
        return dropDownDtoList;
    }

    public abstract int unitConsumed(UtilitiesElectricityCategoryDto utilitiesElectricityCategoryDto);

}
