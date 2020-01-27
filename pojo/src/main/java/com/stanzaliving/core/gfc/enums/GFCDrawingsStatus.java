package com.stanzaliving.core.gfc.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * AsIsDrawingsStatus status enum.
 * 
 * <p>
 * Used basically on AsIsDrawings.
 * </p>
 * 
 * @author debendra.dhinda
 */

@Getter
@AllArgsConstructor
public enum GFCDrawingsStatus {

	GFC_DRAWING_PENDING("Pending"), GFC_DRAWING_COMPLETED("Completed"),

	GFC_DRAWINGS_APPROVED("Approved"), GFC_DRAWINGS_REJECTED("Rejected");

	private String status;

	private static EnumMap<GFCDrawingsStatus, String> gfcDrawingsStatusMap = new EnumMap<>(GFCDrawingsStatus.class);

	static {
		gfcDrawingsStatusMap.put(GFC_DRAWING_PENDING, GFCDrawingsStatus.GFC_DRAWING_PENDING.getStatus());
		gfcDrawingsStatusMap.put(GFC_DRAWING_COMPLETED, GFCDrawingsStatus.GFC_DRAWING_COMPLETED.getStatus());

		gfcDrawingsStatusMap.put(GFC_DRAWINGS_APPROVED, GFCDrawingsStatus.GFC_DRAWINGS_APPROVED.getStatus());
		gfcDrawingsStatusMap.put(GFC_DRAWINGS_REJECTED, GFCDrawingsStatus.GFC_DRAWINGS_REJECTED.getStatus());
	}

	public static Map<GFCDrawingsStatus, String> getAll() {
		return gfcDrawingsStatusMap;
	}

}
