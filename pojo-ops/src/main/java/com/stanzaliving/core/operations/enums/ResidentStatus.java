package com.stanzaliving.core.operations.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResidentStatus {
	MOVED_IN("Moved In"),
	MOVED_OUT("Moved Out"),
	PENDING("Pending");

	private String statusName;

	private static List<EnumListing<ResidentStatus>> movedStatusMap = new ArrayList<>();
	private static final Map<ResidentStatus, String> statusMap = new HashMap<>();
	private static final List<EnumListing<ResidentStatus>> allStatusMap = new ArrayList<>();

	static {
		for (ResidentStatus movedStatus : ResidentStatus.values()) {
			if (movedStatus != PENDING) {
				statusMap.put(movedStatus, movedStatus.statusName);
				movedStatusMap.add(EnumListing.of(movedStatus, movedStatus.statusName));
			}
			allStatusMap.add(EnumListing.of(movedStatus, movedStatus.statusName));
		}
	}

	public static Map<ResidentStatus, String> getMovedStatusMap() {
		return statusMap;
	}

	public static List<EnumListing<ResidentStatus>> getAllMovedStatusMap() {
		return allStatusMap;
	}

}
