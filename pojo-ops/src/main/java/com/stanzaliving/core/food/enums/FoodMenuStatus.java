package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodMenuStatus {

	UNDER_DRAFT("Under Draft"),
	SUBMITTED("Submitted for Review"),
	APPROVED("Approved"),
	CENTRAL_F_AND_B_APPROVED("Central F&B Approved"),
	CENTRAL_F_AND_B_REJECTED("Central F&B Rejected"),
	VENDOR_APPROVED("Vendor Approved"),
	VENDOR_REJECTED("Vendor Rejected");

	private String statusName;

	public static boolean isStatusEditable(FoodMenuStatus menuStatus) {
		return UNDER_DRAFT == menuStatus || CENTRAL_F_AND_B_REJECTED == menuStatus || VENDOR_REJECTED == menuStatus;
	}

	public static boolean isStatusCentralFAndBApproved(FoodMenuStatus menuStatus) {
		return APPROVED == menuStatus || CENTRAL_F_AND_B_APPROVED == menuStatus || VENDOR_REJECTED == menuStatus;
	}

	public static boolean isStatusVendorApproved(FoodMenuStatus menuStatus) {
		return APPROVED == menuStatus || VENDOR_APPROVED == menuStatus;
	}

	public static boolean isStatusCentralApprovable(FoodMenuStatus menuStatus) {
		return SUBMITTED == menuStatus;
	}
}