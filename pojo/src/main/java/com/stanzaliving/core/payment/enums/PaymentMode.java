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

	CC("CC", 0),
	CASH("Cash", 1),
	CHEQUE("Cheque", 2),
	NET_BANKING("Netbanking", 3),
	QR("QR Code", 4),
	VIRTUAL_ACCOUNT("Virtual Account", 5),
	MPOS("MPOS", 6),
	SECURITY_CARRY_FORWARDS("Security Carry Forwards", 7),
	MANUAL_UPLOADS("Manual Uploads", 8),
	PAYTM("PAYTM", 9),
	ICICI("ICICI", 10),
	BULK_PAYMENT("BULK PAYMENT", 11),
	PINE_LAB("PINE LAB", 12),
	I_SUREPAY("I SurePay", 13),
	RETENTION_CARRY_FORWARD("Retention Carry Forward",14),
	RETENTION_SECURITY_CARRY_FORWARD("Retention Security Carry Forward",15),
	RAZORPAY("Razorpay", 16);



	private String paymentModeDesc;
	private int paymentModeId;

	private static Map<String, PaymentMode> paymentDescModeMap = new HashMap<>();

	private static Map<Integer, PaymentMode> paymentIdModeMap = new HashMap<>();

	static {
		for(PaymentMode paymentMode : PaymentMode.values()) {
			paymentDescModeMap.put(paymentMode.getPaymentModeDesc(), paymentMode);
		}
		
	}

	static {
		for(PaymentMode paymentMode : PaymentMode.values()) {
			paymentIdModeMap.put(paymentMode.getPaymentModeId(), paymentMode);
		}

	}
	
	
	public static List<PaymentMode> getOfflinePaymentModes() {
    	return Arrays.asList(CHEQUE, CASH, PINE_LAB);
    }
    
    public static PaymentMode getPaymentModeByDesc(String desc) {
    	return paymentDescModeMap.get(desc);
    }

	public static PaymentMode getPaymentModeById(int id) {
		return paymentIdModeMap.get(id);
	}
}