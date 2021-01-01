package com.stanzaliving.payment.paytm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaytmTxnAmountDto {

	private double value;

	private String currency;

}
