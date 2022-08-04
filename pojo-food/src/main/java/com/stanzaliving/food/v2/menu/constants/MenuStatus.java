package com.stanzaliving.food.v2.menu.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum MenuStatus {
	DRAFT("In Draft"),
	SUBMITTED("Submitted"),
	APPROVED("Approved");
	private final String status;

	public static boolean showOnApprovalDashboard(MenuStatus menuStatus) {
		return SUBMITTED.equals(menuStatus) || APPROVED.equals(menuStatus);
	}
	
	public static boolean isEditable(MenuStatus menuStatus) {
		return menuStatus == DRAFT || menuStatus == APPROVED ;
	}

	public static List<MenuStatus> getApprovalDashboardStatusList() {
		List<MenuStatus> menuStatusList = new ArrayList<>();
		menuStatusList.add(MenuStatus.APPROVED);
		menuStatusList.add(MenuStatus.SUBMITTED);
		return menuStatusList;
	}
	
	private static final List<EnumListing<MenuStatus>> enumListing = new ArrayList<>();
	
	static {
		for (MenuStatus curStatus : MenuStatus.values()) {
			enumListing.add(EnumListing.of(curStatus, curStatus.getStatus()));
		}
	}
	
	public static List<EnumListing<MenuStatus>> getEnumListing() {
		return enumListing;
	}
}
