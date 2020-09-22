package com.stanzaliving.core.opscalculator.enums;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;
import com.stanzaliving.core.opscalculator.dto.WaterTankerSlotDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum SecurityType {
    IN_HOUSE_SECURITY("In House Security Guard"), SECURITY("Security");
    String name;

    public static List<DropDownDto> getAllServiceTypeValues(){
       List<DropDownDto> dropDownDtoList = new ArrayList<>();
        for(SecurityType securityType : SecurityType.values()){
            dropDownDtoList.add(new DropDownDto(securityType.toString(), securityType.getName()));
        }
        return dropDownDtoList;
    }
}

