package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentMode {

    NET_BANKING("NetBanking"),
    CHEQUE("Cheque"),
    CASH("Cash"),
    MPOS("MPOS"),
    QR("Qr Code"),
    PAYTM("Paytm"),
    ICICI("ICICI"),
    PINE_LAB("PINE LAB"),
    I_SURE_PAY("I SurePay");

    String name;
}
