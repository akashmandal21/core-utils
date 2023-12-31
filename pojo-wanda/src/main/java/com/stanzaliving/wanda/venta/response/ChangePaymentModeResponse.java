package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePaymentModeResponse {

	private boolean status;
	
	private String message;
	
	private boolean takeToPaymentScreen;
	
	private double amount;
}
