package com.stanzaliving.housekeepingservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 19-Aug-21
 **/
@Getter
@AllArgsConstructor
public enum HKPlanningTemplateStatus {
	COPY_FROM("Copy from"),SAVE_AS_DRAFT("Save as draft"),PUBLISH("Publish");

	private String hkPlanningTemplateStatus;

	private static final List<EnumListing<HKPlanningTemplateStatus>> enumListing = new ArrayList<>();

	public static List<EnumListing<HKPlanningTemplateStatus>> getEnumListing() {
		return enumListing;
	}

	static {
		for (HKPlanningTemplateStatus hkPlanningTemplateStatus : HKPlanningTemplateStatus.values()) {
			EnumListing<HKPlanningTemplateStatus> listing = EnumListing.of(hkPlanningTemplateStatus, hkPlanningTemplateStatus.getHkPlanningTemplateStatus());
			enumListing.add(listing);
		}
	}


}
