
package com.stanzaliving.core.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorClassification {

    EXTERNAL("External"),INTERNAL("Internal");

    private String vendorTypeName;
}

