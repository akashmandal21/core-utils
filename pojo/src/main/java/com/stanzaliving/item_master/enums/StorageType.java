package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StorageType {

    PROPERTY_STORAGE("Property/MM Storage"),
    CITY_STORAGE("City Storage"),
    VENDOR_DEPLOYMENT("Vendor Deployment"),
    NO_STORAGE("No Storage");

    private String storageTypeText;

}
