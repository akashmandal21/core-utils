package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum  AcquisitionType {

    RENT("Rent"),
    BUY("Buy");

    private String acTypeText;
}
