package com.stanzaliving.core.electricity.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ApartmentElectricityBillSortingField {

	BILL_NUMBER("Bill Number"),
	BILL_TYPE("Bill Type"),
	BILL_AMOUNT("Bill Amount"),
	RESIDENT_SHARE("Resident Share"),
	APPROVAL_STATUS("Approval Status"),
	ADDED_AT("Added At");
	
    private final String field;
}
