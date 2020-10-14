
package com.stanzaliving.core.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorType {

    IN_KITCHEN("Internal - Kitchen",VendorClassification.INTERNAL,"KC","IN"),
    IN_STORE("Internal - Store",VendorClassification.INTERNAL,"ST","IN"),
    IN_CAFE("Internal - Cafe",VendorClassification.INTERNAL,"CF","IN"),
    IN_WAREHOUSE("Internal - Warehouse",VendorClassification.INTERNAL,"WH","IN"),
    IN_HOUSE("Internal - House",VendorClassification.INTERNAL,"SH","IN"),
    IN_HOUSE_WAREHOUSE("Internal - House Warehouse",VendorClassification.INTERNAL,"HW","IN"),
    IN_CORPORATE_OFFICE("Internal - Corporate Office",VendorClassification.INTERNAL,"HQ","IN"),
    IN_CITY_OFFICE("Internal - City Office",VendorClassification.INTERNAL,"CO","IN"),
    EX_DOMESTIC("External - Domestic Vendor",VendorClassification.EXTERNAL,"DV","EX"),
    EX_ONLINE_VENDOR("External - Online Vendor",VendorClassification.EXTERNAL,"OV","EX"),
    EX_INTL_VENDOR("External - International Vendor",VendorClassification.EXTERNAL,"OV","EX");

    private String vendorTypeName;
    private VendorClassification classfication;
    private String shortCode;
    private String shortClassCode;
}

