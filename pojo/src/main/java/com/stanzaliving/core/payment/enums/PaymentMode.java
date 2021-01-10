package com.stanzaliving.core.payment.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author animesh.bajpai
 */
@Getter
@AllArgsConstructor
public enum PaymentMode {

	NET_BANKING("Netbanking", 3),
	CC("CC", 0),
	CHEQUE("Cheque", 2),
	CASH("Cash", 1),
	MPOS("MPOS", 6),
	QR("QR Code", 4),
	PAYTM("PAYTM", 9),
	ICICI("ICICI", 10),
	PINE_LAB("PINE LAB", 12),
	RAZORPAY("Razorpay", 13),
	PAYTM_SDK("PAYTM SDK", 14);

	private String paymentModeDesc;
	private int paymentModeId;

	private static Map<String, PaymentMode> paymentDescModeMap = new HashMap<>();

	static {
		for(PaymentMode paymentMode : PaymentMode.values()) {
			paymentDescModeMap.put(paymentMode.getPaymentModeDesc(), paymentMode);
		}
		
	}
	
	
	public static List<PaymentMode> getOfflinePaymentModes() {
    	return Arrays.asList(CHEQUE, CASH, PINE_LAB);
    }
    
    public static PaymentMode getPaymentModeByDesc(String desc) {
    	return paymentDescModeMap.get(desc);
    }
}