package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.dtos.PaymentModeDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class PaymentModeResponse {

	private List<PaymentModeDto> onlinePaymentMode;
	
	private List<PaymentModeDto> salesPocPaymentMode;
}
