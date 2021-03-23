package com.stanzaliving.core.operations.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CopyToAction {
	
	APPROVED("Send for Approval");

	private String actionName;
	
	private static List<EnumListing<CopyToAction>> enumListings = new ArrayList<>();

	static {
		enumListings.add(EnumListing.of(CopyToAction.APPROVED, CopyToAction.APPROVED.getActionName()));
	}

	public static List<EnumListing<CopyToAction>> getCopyToActionListing() {
		return enumListings;
	}
	
}