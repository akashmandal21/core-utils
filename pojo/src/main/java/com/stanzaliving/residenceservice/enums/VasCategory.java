package com.stanzaliving.residenceservice.enums;


import com.stanzaliving.operations.enums.ServiceMixServiceType;
import com.stanzaliving.operations.enums.ServiceMixServiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

import static com.stanzaliving.residenceservice.enums.VasCategory.getServiceMixType;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum VasCategory {

    FOOD("Food", "Additive", "FOOD"),
    LAUNDRY("Laundry", "Update", "LAUNDRY"),
    INTERNET("Internet", "Update", "INTERNET"),
    ELECTRICITY("Electricity", "Update", "ELECTRICITY"),
    HOUSEKEEPING("Housekeeping", "Update", "HOUSEKEEPING"),
    MAINTENANCE("Maintenance", "Update", "MAINTENANCE"),
    SECURITY("Security", "Update", "SECURITY"),
    TRANSPORT("Transport", "Update", "TRANSPORT"),
    FITNESS("Fitness", "Update", "FITNESS"),
    PARKING("Parking", "Update", "PARKING"),
    ROOM("Room", "Update", "ROOM"),
    TESTING("Testing", "Update", "TESTING"),
    OTHER("Other", "Additive", "OTHER");

    private final String value;
    private final String nature;
    private final String name;

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
        return serviceMixServiceTypeMap.getOrDefault(vasCategory, ServiceMixServiceType.OTHERS);
    }

    private static Map<String, VasCategory> vasCategoryNameMap = new HashMap<>();

    static {
        for (VasCategory vasCategory : VasCategory.values()) {
            vasCategoryNameMap.put(vasCategory.getValue(), vasCategory);
        }
    }

    public static VasCategory getVasCategoryByName(String name) {
        return vasCategoryNameMap.getOrDefault(name, OTHER);
    }
}
