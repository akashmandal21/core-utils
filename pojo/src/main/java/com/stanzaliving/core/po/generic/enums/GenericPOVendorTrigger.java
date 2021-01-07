package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenericPOVendorTrigger {
    PO_APPROVED("On PO Approval"),DONT_SEND("Don't Send"),SEND_LATER("Send Later");


    private String triggerText;
}
