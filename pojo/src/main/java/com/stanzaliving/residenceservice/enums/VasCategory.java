package com.stanzaliving.residenceservice.enums;

import com.stanzaliving.operations.enums.ServiceMixServiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum VasCategory {

    FOOD("Food"),
    ROOM("Room"),
    LAUNDRY("Laundry"),
    ELECTRICITY("Electricity"),
    TRANSPORT("Transport"),
    MAINTENANCE("Maintenance"),
    PARKING("Parking"),
    HOUSEKEEPING("Housekeeping"),
    INTERNET("Internet"),
    SECURITY("Security"),
    FITNESS("Fitness"),
    TESTING("Testing"),
    OTHER("Other");

    private final String value;

    public static Map<VasCategory, ServiceMixServiceType> getServiceMixServiceTypeMap(){
        Map<VasCategory, ServiceMixServiceType> serviceMixTypeMap = new HashMap<>();
        serviceMixTypeMap.put(VasCategory.FOOD, ServiceMixServiceType.FOOD);
        serviceMixTypeMap.put(VasCategory.LAUNDRY, ServiceMixServiceType.LAUNDRY);
        serviceMixTypeMap.put(VasCategory.ELECTRICITY, ServiceMixServiceType.ELECTRICITY);
        serviceMixTypeMap.put(VasCategory.TRANSPORT, ServiceMixServiceType.TRANSPORT);
        serviceMixTypeMap.put(VasCategory.HOUSEKEEPING, ServiceMixServiceType.HOUSE_KEEPING);
        serviceMixTypeMap.put(VasCategory.INTERNET, ServiceMixServiceType.INTERNET);
        serviceMixTypeMap.put(VasCategory.SECURITY, ServiceMixServiceType.SECURITY);
        serviceMixTypeMap.put(VasCategory.OTHER, ServiceMixServiceType.OTHERS);
        return serviceMixTypeMap;
    }

    public static ServiceMixServiceType getServiceMixType(VasCategory vasCategory){
        Map<VasCategory, ServiceMixServiceType> serviceMixServiceTypeMap = getServiceMixServiceTypeMap();
        return serviceMixServiceTypeMap.getOrDefault(vasCategory, null);
    }
}
