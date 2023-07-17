package com.stanzaliving.core.electricity.dto;


import com.stanzaliving.core.payment.enums.PaymentMode;
//import com.stanzaliving.core.payment.enums.StanzaPaymentService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PrepaidMeterRechargeOrderResonseDto {

	private double amount;
	private String txnId;
	private String userId;
	private String userCode;

//	private StanzaPaymentService stanzaPaymentService;
	private PaymentMode paymentMode;
}