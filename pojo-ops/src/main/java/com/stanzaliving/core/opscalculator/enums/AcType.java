package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum AcType {
    SPLIT("Split"), WINDOW("Window"), CENTRAL("Central");
    String name;

    static List<DropDownDto> dropDownDtoList = new ArrayList<>();

    static {
        for(AcType acType : AcType.values()){
            dropDownDtoList.add(new DropDownDto(acType.toString(), acType.getName()));
        }
    }

    public static List<DropDownDto> getAllAcTypeValues(){
        return dropDownDtoList;
    }

}
