package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodMenuStatus {

	UNDER_DRAFT("Under Draft"),
	SUBMITTED("Submitted for Review"),
	APPROVED("Approved"),
	CHEF_APPROVED("Chef Approved"),
	CHEF_REJECTED("Chef Rejected"),
	VENDOR_APPROVED("Vendor Approved"),
	VENDOR_REJECTED("Vendor Rejected"),
	WAITING_FOR_CHEF_APPROVAL("Waiting for Chef Approval"),
	WAITING_FOR_VENDOR_APPROVAL("Waiting for Vendor Approval");

	private String statusName;
}