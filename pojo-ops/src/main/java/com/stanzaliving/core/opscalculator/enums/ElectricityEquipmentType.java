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
    LIFT(" # Units consumed by Lifts/day"),
    HEAT_PUMP(" # Units consumed by Heat pump/day"),
    CENTRAL_AC(" # Units consumed by Central AC/day"),
    WASHING_MACHINE(" # Units consumed by Washing Machine/day"),
    MICROWAVE(" # Units consumed by Microwave/day"),
    BAIN_MARIE(" # Units consumed by Bain Marie/day"),
    OTHERS_EQUIPMENT(" # Units consumed by Others Equip./day");
    String name;
    public static List<DropDownDto> getAllEquipmentTypeValues(){
        List<DropDownDto> dropDownDtoList = new ArrayList<>();
        for(ElectricityEquipmentType electricityEquipmentType : ElectricityEquipmentType.values()){
            dropDownDtoList.add(new DropDownDto(electricityEquipmentType.toString(), electricityEquipmentType.getName()));
        }
        return dropDownDtoList;
    }

}
