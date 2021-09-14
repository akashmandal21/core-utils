package com.stanzaliving.wanda.response;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.payment.enums.PaymentMode;
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
	@Builder.Default
	private List<PaymentMode> convenienceFeePaymentModes=new ArrayList<>();
	@Builder.Default
	private List<PaymentMode> withoutConvenienceFeePaymentModes=new ArrayList<>();;

}
