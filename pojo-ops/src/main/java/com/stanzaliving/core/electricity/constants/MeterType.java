package com.stanzaliving.core.electricity.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
public enum MeterType {

    IOT("Smart"),
    NON_IOT("Regular");

    private String meterType;

    private static List<EnumListing<MeterType>> meterTypes = new ArrayList<>();
    static {
        for(MeterType metertype: MeterType.values()){
            meterTypes.add(EnumListing.of(metertype, metertype.getMeterType()));
        }
    }

    public static  List<EnumListing<MeterType>> getMeterTypes(){
        return meterTypes;
    }
}
