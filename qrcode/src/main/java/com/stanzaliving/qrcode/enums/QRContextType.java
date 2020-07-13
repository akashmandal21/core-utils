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
    COMBO_VEG,
    COMBO_NONVEG;	
}
