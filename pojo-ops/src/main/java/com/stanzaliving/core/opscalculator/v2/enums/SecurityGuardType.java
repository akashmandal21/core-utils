package com.stanzaliving.core.opscalculator.V2.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SecurityGuardType {
    PREMIUM("PREMIUM");
    String name;

    public static List<DropDownDto> getAllRCTypeValues(){
        return sgDropDownDtoList;
    }

    static List<DropDownDto> sgDropDownDtoList = new ArrayList<>();

    static {
        for(SecurityGuardType sgType : SecurityGuardType.values()){
        	sgDropDownDtoList.add(new DropDownDto(sgType.toString(), sgType.getName()));
        }
    }
}

