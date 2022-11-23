package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InvoiceSectionEnum {
	
	BASIC("Basic", false),
	PO_ITEMS("PO Items and Rates", false),
	OTHER_FEE("Other Fees", false);

	private String sectionName;
	private boolean isApproved;

}
