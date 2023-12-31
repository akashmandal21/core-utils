package com.stanzaliving.qrcode.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum QRContextType {

    FOODTABLE_VEG,
    FOODTABLE_NONVEG,
    VASTABLE,
    DISPATCHSUMMARY,
    VASORDERSUMMARY,
    CAFE_ORDER,
    CAFE_BATCH_DISPATCH_SUMMARY;
}
