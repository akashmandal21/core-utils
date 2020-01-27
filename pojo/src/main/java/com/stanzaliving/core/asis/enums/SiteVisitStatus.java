package com.stanzaliving.core.asis.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SiteVisit status enum.
 * 
 * <p>
 * Used basically on AsIsDrawings.
 * </p>
 * 
 * @author debendra.dhinda
 */

@Getter
@AllArgsConstructor
public enum SiteVisitStatus {

	SITE_VISIT_PENDING("Pending"), SITE_VISIT_COMPLETED("Completed");

	private String status;

	private static EnumMap<SiteVisitStatus, String> siteVisitStatusMap = new EnumMap<>(SiteVisitStatus.class);

	static {
		siteVisitStatusMap.put(SITE_VISIT_PENDING, SiteVisitStatus.SITE_VISIT_PENDING.getStatus());
		siteVisitStatusMap.put(SITE_VISIT_COMPLETED, SiteVisitStatus.SITE_VISIT_COMPLETED.getStatus());
	}

	public static Map<SiteVisitStatus, String> getAll() {
		return siteVisitStatusMap;
	}
}
