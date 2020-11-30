package com.stanzaliving.core.ims.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author harman
 */
@Getter
@AllArgsConstructor
public enum BrokerPreferredPaymentMode {

    PAYTM("Paytm", 0),
    BANKTRANSFER("Bank Transfer", 1),
    VPA("UPI", 2);

    private String paymentModeDesc;
    private int paymentModeId;

    private static Map<String, BrokerPreferredPaymentMode> paymentDescModeMap = new HashMap<>();

    static {
        for(BrokerPreferredPaymentMode imsPaymentMode : BrokerPreferredPaymentMode.values()) {
            paymentDescModeMap.put(imsPaymentMode.getPaymentModeDesc(), imsPaymentMode);
        }

    }

    public static BrokerPreferredPaymentMode getPaymentModeByDesc(String desc) {
        return paymentDescModeMap.get(desc);
    }
}
