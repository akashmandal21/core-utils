package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WandaPaymentMode {
	
	ONLINE("Online"),
	CHEQUE("Cheque"),
	PINELABS("Pine Labs"),
	CASH("Cash");

	private String name;
}
