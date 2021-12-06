package com.stanzaliving.core.inventory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AwlItemStatus {

    OK("okQuantity"),
    PD("pieceDamage"),
    CD("cartonDamage"),
    QC("qcChk"),
    RP("rePck");

    private final String text;
}
