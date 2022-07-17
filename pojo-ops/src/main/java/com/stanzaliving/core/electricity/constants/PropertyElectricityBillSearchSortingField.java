package com.stanzaliving.core.electricity.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PropertyElectricityBillSearchSortingField {

	BILL_ID("Bill Id"),
	BILL_TYPE("Bill Type"),
	BILL_AMOUNT("Bill Amount"),
	RESIDENT_SHARE("Resident Share"),
	APPROVAL_SHARE("Approval Status"),
	ADDED_BY("Added By");
	
    private final String field;
}
