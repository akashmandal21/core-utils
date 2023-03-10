package com.stanzaliving.core.payment.enums;

import java.util.ArrayList;
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
	PAYTM("Paytm", 9),
	ICICI("ICICI", 10),
	PINE_LAB("PINE LAB", 12),
	RAZORPAY("Razorpay", 13),
	PAYTM_SDK("PAYTM SDK", 14),
	VIRTUAL_ACCOUNT("Virtual Account", 15),
	RETENTION_CARRY_FORWARD("Retention Carry Forward", 16),
	RETENTION_SECURITY_CARRY_FORWARD("Retention Security Carry Forward", 17),
	SECURITY_CARRY_FORWARD("Security Carry Forward", 18),
	MANUAL_UPLOADS("Manual Uploads", 19),
	BULK_PAYMENT("Bulk Payment", 20),
	I_SUREPAY("I SurePay", 21),
	EMI_RAZORPAY("Emi Razorpay", 22),
	RAZORPAY_PAYMENT_LINK("RAZORPAY_PAYMENT_LINK", 23),
	BOOKING_AMOUNT_CARRY_FORWARD("Booking Amount Carry Forward", 24),
	CASHFREE("CASHFREE", 25),
	PAY_U("Pay u", 26);

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

	public static List<Integer> paymentModeList = Arrays.asList(new Integer[]{3,2,1,6,4,9,10,12});

	public static Map<Integer , PaymentMode> getPaymentModeList(){
		Map<Integer, PaymentMode> paymentModeMap = new HashMap<>();
		for(PaymentMode paymentMode : PaymentMode.values()){
			paymentModeMap.put(paymentMode.getPaymentModeId() , paymentMode);
		}
		return paymentModeMap;
	}

	public static PaymentMode getMigratedPaymentMode(Integer paymentMode) {
		if(paymentModeList.contains(paymentMode)){
			return getPaymentModeList().get(paymentMode);
		}
		else if(paymentMode == 9) return PaymentMode.PAYTM_SDK;
		else if(paymentMode == 5) return PaymentMode.VIRTUAL_ACCOUNT;
		else return null;
	}

    public static List<PaymentMode> getPaymentModeConfigurationList() {
    	List<PaymentMode> paymentMode = new ArrayList<>();
    	paymentMode.add(CHEQUE);
    	paymentMode.add(CASH);
    	paymentMode.add(PAYTM);
    	paymentMode.add(RAZORPAY);
    	paymentMode.add(VIRTUAL_ACCOUNT);
    	paymentMode.add(CC);
    	paymentMode.add(CASHFREE);
    	paymentMode.add(PAY_U);
    	return paymentMode;
    }
}
