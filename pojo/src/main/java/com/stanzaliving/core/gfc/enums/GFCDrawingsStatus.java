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

	GFC_DRAWING_NOT_STARTED("Not Started","#e5e3e3"),
	GFC_DRAWING_PENDING("Pending","#e5e3e3"),
	GFC_DRAWINGS_UPLOADED("Uploaded","#FFC300"),
	GFC_DRAWING_COMPLETED("Completed","#FFC300"),

	GFC_DRAWINGS_APPROVED("Approved","#77baa6"), 
	GFC_DRAWINGS_REJECTED("Rejected","#d41111");

	private String status;
	private String color;

	private static EnumMap<GFCDrawingsStatus, String> gfcDrawingsStatusMap = new EnumMap<>(GFCDrawingsStatus.class);

	static {
		gfcDrawingsStatusMap.put(GFC_DRAWING_PENDING, GFCDrawingsStatus.GFC_DRAWING_PENDING.getStatus());
		gfcDrawingsStatusMap.put(GFC_DRAWINGS_UPLOADED, GFCDrawingsStatus.GFC_DRAWINGS_UPLOADED.getStatus());
		gfcDrawingsStatusMap.put(GFC_DRAWING_COMPLETED, GFCDrawingsStatus.GFC_DRAWING_COMPLETED.getStatus());

		gfcDrawingsStatusMap.put(GFC_DRAWINGS_APPROVED, GFCDrawingsStatus.GFC_DRAWINGS_APPROVED.getStatus());
		gfcDrawingsStatusMap.put(GFC_DRAWINGS_REJECTED, GFCDrawingsStatus.GFC_DRAWINGS_REJECTED.getStatus());
	}

	public static Map<GFCDrawingsStatus, String> getAll() {
		return gfcDrawingsStatusMap;
	}

}
