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

    PAYTM("Paytm", 1),
    BANKTRANSFER("Bank Transfer", 2),
    VPA("UPI", 3);

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
