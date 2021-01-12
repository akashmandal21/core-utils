package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentChargeType {
    FLAT("Flat Amount","Flat"),
    PCT("%","Month"),
    PCT_GST("100 % with Tax",null);

    private String chargeText;
    private String refundableSDText;
}
