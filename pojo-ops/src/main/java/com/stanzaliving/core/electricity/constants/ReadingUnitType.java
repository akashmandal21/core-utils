package com.stanzaliving.core.electricity.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ReadingUnitType {

    KVH("KvH"),
    KWH("KwH");

    private String readingUnitName;

    private static List<EnumListing<ReadingUnitType>> unitTypes = new ArrayList<>();

    static {
        for (ReadingUnitType unitType : ReadingUnitType.values()){
            unitTypes.add(EnumListing.of(unitType, unitType.getReadingUnitName()));
        }
    }

    public static List<EnumListing<ReadingUnitType>> getUnitTypes(){
        return unitTypes;
    }
}
