
package com.stanzaliving.core.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SupportingDocType {

    AADHAR_CARD("Aadhar Card"),
    TRADE_LICENSE("Trade License"),
    OTHERS("Others");

    private String supportingDocTypeName;

}

