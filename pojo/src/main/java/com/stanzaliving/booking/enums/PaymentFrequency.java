package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentFrequency {
    ALL("ALL","All"),
    MONTHLY("MONTHLY","Monthly"),
    INSTALMENT_1("ONE INSTALMENT","1 Instalment"),
    INSTALMENT_2("TWO INSTALMENT","2 Instalments"),
    INSTALMENT_3("THREE INSTALMENT","3 Instalments"),
    INSTALMENT_4("FOUR INSTALMENT","4 Instalments"),
    ONE_INSTALMENT("ONE INSTALMENT","1 Instalment"),
    TWO_INSTALMENT("TWO INSTALMENT","2 Instalments"),
    THREE_INSTALMENT("THREE INSTALMENT","3 Instalments"),
    FOUR_INSTALMENT("FOUR INSTALMENT","4 Instalments"),
    //FIVE_INSTALMENT("FIVE INSTALMENT","5 Instalments"),
    STAGGERED_MONTHLY("STAGGERED MONTHLY", "Staggered Monthly");

    private String name;
    private String view;

    public String getName() {
        return name;
    }
}
