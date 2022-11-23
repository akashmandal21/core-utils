package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentTerm {

	MONTHLY("MONTHLY","Monthly"),
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

	public static Map<String , PaymentTerm> getPaymentTermList(){
		Map<String, PaymentTerm> paymentTermMap = new HashMap<>();
		for(PaymentTerm paymentTerm : PaymentTerm.values()){
			paymentTermMap.put(paymentTerm.getName() , paymentTerm);
		}
		return paymentTermMap;
	}

	public static PaymentTerm getPaymentTerm(String paymentTerm){
		Map<String, PaymentTerm> paymentTermMap = getPaymentTermList();
		if("Standard Monthly".equals(paymentTerm)) return PaymentTerm.MONTHLY;
		if(paymentTermMap.containsKey(paymentTerm)) return paymentTermMap.get(paymentTerm);
		else return null;
	}

}
