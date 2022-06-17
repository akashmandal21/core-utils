package com.stanzaliving.core.opscalculator.V2.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HouseKeepingType {
    PREMIUM("PREMIUM");
    String name;

    public static List<DropDownDto> getAllRCTypeValues(){
        return hkDropDownDtoList;
    }

    static List<DropDownDto> hkDropDownDtoList = new ArrayList<>();

    static {
        for(HouseKeepingType type : HouseKeepingType.values()){
        	hkDropDownDtoList.add(new DropDownDto(type.toString(), type.getName()));
        }
    }
}

