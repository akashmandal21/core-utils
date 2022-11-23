package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum LandlordReceivablesCalculationEnum {
    ONLY_ON_TANKER("Only On Tanker"), OVERALL("Overrall");
    String name;

    static List<DropDownDto> dropDownDtoList = new ArrayList<>();

    public static List<DropDownDto> getLandLordReceivableCalculationType(){
        return dropDownDtoList;
    }

    static {
        for(LandlordReceivablesCalculationEnum landlordReceivablesCalculationEnum : LandlordReceivablesCalculationEnum.values()){
            dropDownDtoList.add(new DropDownDto(landlordReceivablesCalculationEnum.toString(), landlordReceivablesCalculationEnum.getName()));
        }
    }


}
