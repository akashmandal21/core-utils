package com.stanzaliving.core.attendance.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum LeaveMarkedBy {
	USER("User"),
	PARENTS("Parents"),
	AUTO_APPROVED("Auto Approved");

	private String markedBy;

	private static List<EnumListing<LeaveMarkedBy>> leaveMarkedByList = new ArrayList<>();

	static {
		for (LeaveMarkedBy leaveMarkedBy : LeaveMarkedBy.values()) {
			leaveMarkedByList.add(EnumListing.of(leaveMarkedBy, leaveMarkedBy.getMarkedBy()));
		}
	}

	public static List<EnumListing<LeaveMarkedBy>> getLeaveMarkedByList() {
		return leaveMarkedByList;
	}

}
