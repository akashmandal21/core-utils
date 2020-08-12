package com.stanzaliving.wanda.dtos;

import javax.persistence.SecondaryTable;

import com.stanzaliving.wanda.enums.WandaPaymentMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
@Setter
public class PaymentModeDto {

	private WandaPaymentMode wandaPaymentMode;
	
	private String paymentModeName;
	
	private String paymentModeText;
	
	private boolean enabled;
}
