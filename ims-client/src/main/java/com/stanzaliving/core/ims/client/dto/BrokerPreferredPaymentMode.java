package com.stanzaliving.core.ims.client.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections.map.HashedMap;

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

    private String name;
    private int payoutModeId;

    private static Map<String, BrokerPreferredPaymentMode> paymentDescModeMap = new HashMap<>();

    static {
        for(BrokerPreferredPaymentMode imsPaymentMode : BrokerPreferredPaymentMode.values()) {
            paymentDescModeMap.put(imsPaymentMode.getName(), imsPaymentMode);
        }

    }

    private static Map<Integer,BrokerPreferredPaymentMode> paymentModeMap = new HashMap<>();

    static {
        for(BrokerPreferredPaymentMode imsPaymentMode : BrokerPreferredPaymentMode.values()) {
            paymentModeMap.put(imsPaymentMode.getPayoutModeId(), imsPaymentMode);
        }

    }

    public static BrokerPreferredPaymentMode getPaymentModeByDesc(String name) {
        return paymentDescModeMap.get(name);
    }

    public static BrokerPreferredPaymentMode getPaymentModeByModeId(int modeId) {
        return paymentModeMap.get(modeId);
    }

}
