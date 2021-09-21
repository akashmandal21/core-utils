package com.stanzaliving.food.v2.category.constant;


import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum CategoryStatus {
	DRAFT("In Draft"),
	SUBMITTED("Submitted"),
	APPROVED("Approved");
	private final String status;
	
	public static boolean isEditable(CategoryStatus categoryStatus) {
		return categoryStatus == DRAFT || categoryStatus == APPROVED;
	}
	
	public static boolean showOnApprovalDashboard(CategoryStatus categoryStatus) {
		return SUBMITTED.equals(categoryStatus) || APPROVED.equals(categoryStatus);
	}
	
	public static boolean createNewVersion(CategoryStatus categoryStatus) {
		return categoryStatus == APPROVED;
	}
	
	public static List<CategoryStatus> draftStatus() {
		return Arrays.asList(DRAFT, SUBMITTED);
	}
	
	
	private static final List<EnumListing<CategoryStatus>> enumListings = new ArrayList<>();
	
	static {
		for (CategoryStatus curStatus : CategoryStatus.values()) {
			enumListings.add(EnumListing.of(curStatus, curStatus.getStatus()));
		}
	}
	
	public static List<EnumListing<CategoryStatus>> getEnumListings() {
		return enumListings;
	}
	
	public static List<CategoryStatus> allowedCopyStatus() {
		return Arrays.asList(APPROVED, SUBMITTED);
	}
	
	public static List<CategoryStatus> clonableStatus() {
		return Arrays.asList(APPROVED, SUBMITTED);
	}
	
	public static boolean submissionAllowed(CategoryStatus categoryStatus) {
		return categoryStatus == null || categoryStatus == DRAFT;
	}
}
