package com.stanzaliving.core.payment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
    N("NEFT"),
    R("RTGS"),
    I("INTERNAL"),
    IMPS("IMPS"),
    FT("FT");

    private String msg;
}
