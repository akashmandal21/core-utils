/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.EnumMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 09-Dec-2019
 *
 **/
@Getter
public enum HiringStatus {

	OFFERED("Offered"),
	JOINED("Joined"),
	DECLINED("Declined");

	private String statusName;

	private HiringStatus(String statusName) {
		this.statusName = statusName;
	}

	private static Map<HiringStatus, String> hiringStatusMap = new EnumMap<>(HiringStatus.class);

	static {

		for (HiringStatus hiringStatus : HiringStatus.values()) {
			hiringStatusMap.put(hiringStatus, hiringStatus.getStatusName());
		}

	}

	public static Map<HiringStatus, String> getHiringStatuses() {
		return hiringStatusMap;
	}
}