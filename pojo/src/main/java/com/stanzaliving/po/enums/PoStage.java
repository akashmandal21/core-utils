package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PoStage {

	PO_SUBMITTED("PO SUBMITTED"), TRANSFORMATIONS("TRANSFORMATIONS"), FINANCE("FINANCE"), PO_APPROVED("PO APPROVED"),
	INVOICE_SUBMITTED("INVOICE SUBMITTED"), ADVANCE_PAYMENT("ADVANCE PAYMENT"), WORK_COMPLETED("WORK COMPLETED"),
	FINAL_PAYMENT("FINAL PAYMENT"), CENTRAL_TEAM("CENTRAL TEAM"), CITY_TEAM("CITY TEAM"), GC("GC"), PROCUREMENT("PROCUREMENT"),
	GRN_STARTED("GRN STARTED");
	
	private String stage;

}
