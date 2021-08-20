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
	PAYTM_SDK("PAYTM SDK", 14),
	VIRTUAL_ACCOUNT("Virtual Account" , 15),
	RETENTION_CARRY_FORWARD("Retention Carry Forward" , 16),
	RETENTION_SECURITY_CARRY_FORWARD("Retention Security Carry Forward" , 17),
	SECURITY_CARRY_FORWARD("Security Carry Forward" , 18),
	MANUAL_UPLOADS("Manual Uploads" , 19),
	BULK_PAYMENT("Bulk Payment",20),
	I_SUREPAY("I SurePay",21);


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

	public static List<PaymentMode> getActivePaymentModes() {
		return Arrays.asList(CHEQUE, CASH, VIRTUAL_ACCOUNT);
	}
    
    public static PaymentMode getPaymentModeByDesc(String desc) {
    	return paymentDescModeMap.get(desc);
    }
}