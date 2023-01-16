package com.stanzaliving.operations.enums;

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
	MOVED_OUT("Moved Out");

	private String statusName;

	private static List<EnumListing<ResidentStatus>> movedStatusMap = new ArrayList<>();
	private static final Map<ResidentStatus, String> statusMap = new HashMap<>();

	static {
		for(ResidentStatus movedStatus: ResidentStatus.values()){
			statusMap.put(movedStatus, movedStatus.statusName);
		}
	}
	static {
		for(ResidentStatus movedStatus: ResidentStatus.values()){
			movedStatusMap.add(EnumListing.of(movedStatus, movedStatus.statusName));
		}
	}

	public static Map<ResidentStatus, String> getMovedStatusMap() {
		return statusMap;
	}
	
	
}
