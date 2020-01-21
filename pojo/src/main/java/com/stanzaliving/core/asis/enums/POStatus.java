package com.stanzaliving.core.asis.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * POStatus status enum.
 * 
 * <p>
 * Used basically on AsIsDrawings.
 * </p>
 * 
 * @author debendra.dhinda
 */

@Getter
@AllArgsConstructor
public enum POStatus {

	PO_PENDING("PO Pending"), PO_ISSUED("PO issued"), PO_REJECTED("PO rejected"), PO_APPROVED("PO Approved");

	private String status;

	private static EnumMap<POStatus, String> poStatusMap = new EnumMap<>(POStatus.class);

	static{
		poStatusMap.put(PO_PENDING, POStatus.PO_PENDING.getStatus());
		poStatusMap.put(PO_ISSUED, POStatus.PO_ISSUED.getStatus());
		poStatusMap.put(PO_REJECTED, POStatus.PO_REJECTED.getStatus());
		poStatusMap.put(PO_APPROVED, POStatus.PO_APPROVED.getStatus());
	}
	public static Map<POStatus, String> getAll() {
		return poStatusMap;
	}

}
