package com.stanzaliving.item_master.enums;

import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum  AcquisitionType {

    RENT("Rent"),
    BUY("Buy");

    public static Map<String, AcquisitionType> acquisitionTypeMap = new HashMap<>();

    static {

        acquisitionTypeMap.put("Buy", AcquisitionType.BUY);
        acquisitionTypeMap.put("Rent", AcquisitionType.RENT);

    }
    private String acTypeText;
}
