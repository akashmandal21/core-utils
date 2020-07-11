package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InstallmentTypeEnum {
    STANDARD_MONTHLY("Monthly"),
    ONE_INSTALLMENT("1 Installment"),
    TWO_INSTALLMENTS("2 installments"),
    THREE_INSTALLMENTS("3 Installments"),
    FOUR_INSTALLMENTS("4 Installments"),
    STAGGERED_MONTHLY("Staggered Monthly");
    String name;


}
