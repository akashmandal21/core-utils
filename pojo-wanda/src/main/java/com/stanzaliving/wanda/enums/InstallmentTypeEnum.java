package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InstallmentTypeEnum {
    STANDARD_MONTHLY("Monthly"),
    ONE_INSTALLMENT("1 instalment"),
    TWO_INSTALLMENTS("2 instalments"),
    THREE_INSTALLMENTS("3 instalments"),
    FOUR_INSTALLMENTS("4 Instalments"),
    STAGGERED_MONTHLY("Staggered Monthly");
    String name;


}
