package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceType {

	REGULAR("Regular"),ADVANCE("Advance");
	
	private String status;

}
	