package com.stanzaliving.wanda.venta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Builder
@AllArgsConstructor
@Getter
public class UpdatePreferredPaymentMode {
	private String payoutMode;
	private String mobileNumber;
}
