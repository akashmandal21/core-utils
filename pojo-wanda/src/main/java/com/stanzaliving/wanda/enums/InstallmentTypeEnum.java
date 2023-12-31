package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum InstallmentTypeEnum {
    STANDARD_MONTHLY("Standard Monthly"),
    ONE_INSTALLMENT("1 Instalment"),
    TWO_INSTALLMENTS("2 Instalments"),
    THREE_INSTALLMENTS("3 Instalments"),
    FOUR_INSTALLMENTS("4 Instalments"),
    STAGGERED_MONTHLY("Staggered Monthly");
    String name;
}
