package com.stanzaliving.core.attendance.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum  AttendanceMarkedBy {

	SELF("Self"),
	RC("RC");

	private String displayName;

	private static List<EnumListing<AttendanceMarkedBy>> attendanceMarkedByList = new ArrayList<>();

	static {
		for (AttendanceMarkedBy attendanceMarkedBy : AttendanceMarkedBy.values()) {
			attendanceMarkedByList.add(EnumListing.of(attendanceMarkedBy, attendanceMarkedBy.getDisplayName()));
		}
	}

	public static List<EnumListing<AttendanceMarkedBy>> getAttendanceMarkedByList() {
		return attendanceMarkedByList;
	}


}
