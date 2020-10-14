package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentChargeType {
    FLAT("Flat Amount"),
    PCT("%");

    private String chargeText;
}
