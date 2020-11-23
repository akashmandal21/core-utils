package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InvoiceSectionEnum {
	
	BASIC("Basic", false),
	PO_ITEMS("PO Items and Rates", false);
	
	private String sectionName;
	private boolean isApproved;

}
