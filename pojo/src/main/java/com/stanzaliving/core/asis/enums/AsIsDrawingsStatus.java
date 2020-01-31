package com.stanzaliving.core.asis.enums;

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
public enum AsIsDrawingsStatus {

	AS_IS_PENDING("Pending"),
	AS_IS_COMPLETED("Completed"),
	
	AS_IS_DRAWINGS_PENDING("Pending"),
	AS_IS_DRAWINGS_UPLOADED("Uploaded"),
	AS_IS_DRAWINGS_APPROVED("Approved"),
	AS_IS_DRAWINGS_REJECTED("Rejected");

	private String status;

	private static EnumMap<AsIsDrawingsStatus, String> asIsDrawingsStatusMap = new EnumMap<>(AsIsDrawingsStatus.class);


	static {
		asIsDrawingsStatusMap.put(AS_IS_PENDING, AsIsDrawingsStatus.AS_IS_PENDING.getStatus());
		asIsDrawingsStatusMap.put(AS_IS_COMPLETED, AsIsDrawingsStatus.AS_IS_COMPLETED.getStatus());
		
		asIsDrawingsStatusMap.put(AS_IS_DRAWINGS_PENDING, AsIsDrawingsStatus.AS_IS_DRAWINGS_PENDING.getStatus());
		asIsDrawingsStatusMap.put(AS_IS_DRAWINGS_UPLOADED, AsIsDrawingsStatus.AS_IS_DRAWINGS_UPLOADED.getStatus());
		asIsDrawingsStatusMap.put(AS_IS_DRAWINGS_APPROVED, AsIsDrawingsStatus.AS_IS_DRAWINGS_APPROVED.getStatus());
		asIsDrawingsStatusMap.put(AS_IS_DRAWINGS_REJECTED, AsIsDrawingsStatus.AS_IS_DRAWINGS_REJECTED.getStatus());
	}
	
	public static Map<AsIsDrawingsStatus, String> getAll() {
		return asIsDrawingsStatusMap;
	}
	
}
