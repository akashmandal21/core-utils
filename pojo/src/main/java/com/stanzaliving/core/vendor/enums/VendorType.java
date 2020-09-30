
package com.stanzaliving.core.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorType {

    IN_KITCHEN("Internal - Kitchen","Internal","KC","IN"),
    IN_STORE("Internal - Store","Internal","ST","IN"),
    IN_CAFE("Internal - Cafe","Internal","CF","IN"),
    IN_WAREHOUSE("Internal - Warehouse","Internal","WH","IN"),
    IN_HOUSE("Internal - House","Internal","SH","IN"),
    IN_HOUSE_WAREHOUSE("Internal - House Warehouse","Internal","HW","IN"),
    IN_CORPORATE_OFFICE("Internal - Corporate Office","Internal","HQ","IN"),
    IN_CITY_OFFICE("Internal - City Office","Internal","CO","IN"),
    EX_DOMESTIC("External - Domestic Vendor","External","DV","EX"),
    EX_ONLINE_VENDOR("External - Online Vendor","External","OV","EX"),
    EX_INTL_VENDOR("External - International Vendor","External","OV","EX");

    private String vendorTypeName;
    private String classfication;
    private String shortCode;
    private String shortClassCode;
}