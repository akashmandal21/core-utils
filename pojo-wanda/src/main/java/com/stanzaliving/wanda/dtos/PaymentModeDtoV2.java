package com.stanzaliving.wanda.dtos;

import com.stanzaliving.core.payment.enums.PaymentMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
@Setter
@NoArgsConstructor
public class PaymentModeDtoV2 {

	private PaymentMode wandaPaymentMode;
	
	private String paymentModeName;
	
	private String paymentModeText;
	@Builder.Default
	private boolean enabled=true;
	
	private Boolean isEndUserPayingFee;
}
