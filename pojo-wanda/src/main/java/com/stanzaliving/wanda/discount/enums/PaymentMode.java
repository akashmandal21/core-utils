package com.stanzaliving.wanda.discount.enums;


public enum PaymentMode {

    NET_BANKING("NetBanking")
    , CHEQUE("Cheque")
    , CASH("Cash")
    , MPOS("MPOS")
    , QR("Qr Code")
    , PAYTM("Paytm")
    , ICICI("ICICI")
    ,PINE_LAB("PINE LAB")
    ,I_SURE_PAY("I SurePay");

    String name;

    PaymentMode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
