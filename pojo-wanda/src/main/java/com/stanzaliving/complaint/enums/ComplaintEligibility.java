package com.stanzaliving.complaint.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ComplaintEligibility {

	VENTA("Venta"),
	CORE("Core");

	private String eligibility;

}