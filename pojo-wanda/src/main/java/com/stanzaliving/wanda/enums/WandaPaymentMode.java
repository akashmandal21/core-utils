package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WandaPaymentMode {
	
	ONLINE("Online"),
	CHEQUE("Cheque"),
	PINELABS("POS Terminal (Credit / Debit Cards)"),
	CASH("Cash");

	private String name;
}