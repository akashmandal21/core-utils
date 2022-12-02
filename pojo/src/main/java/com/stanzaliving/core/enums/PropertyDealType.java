package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum PropertyDealType {

    HOUSE("House", "1"),
    WAREHOUSE("Warehouse", "2"),
    KITCHEN("Kitchen","3"),
    MANAGED_APARTMENTS("Managed Apartments", "4"),
    CAFE("Cafe", "5"),
    POCO("Poco", "6"),
    COCO("Coco", "7"),
    TEST("Test", "8");

    private String propertyDealTypeName;

    private String propertyDealTypeId;

    private static Map<String, String> propertyDealTypeMap = new HashMap<>();

    static {

        for (PropertyDealType propertyDealType : PropertyDealType.values()) {
            propertyDealTypeMap.put(propertyDealType.getPropertyDealTypeId(), propertyDealType.getPropertyDealTypeName());
        }

    }

    public static Map<String, String> getAll() {
        return propertyDealTypeMap ;
    }


}
