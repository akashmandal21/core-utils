package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum StorageType {

    PROPERTY_STORAGE("Property/MM Storage"),
    CITY_STORAGE("City Storage"),
    VENDOR_DEPLOYMENT("Vendor Deployment"),
    NO_STORAGE("No Storage");

    private String storageTypeText;

    public static Map<String, StorageType> storageTypeByNameMap = new HashMap<>();

    static {

        for (StorageType storageType : StorageType.values()) {
            storageTypeByNameMap.put(storageType.getStorageTypeText(), storageType);
        }
    }

    public static StorageType getStorageTypeByName(String storageTypeTypeName) {
        return storageTypeByNameMap.get(storageTypeTypeName);
    }

}
