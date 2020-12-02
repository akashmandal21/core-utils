package com.stanzaliving.core.attendance.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum  AttendanceStatus {

	ABSENT("Absent"),
	PRESENT("Present"),
	LEAVE("Leave");

	private String attendanceStatus;

	private static List<EnumListing<AttendanceStatus>> attendanceStatusList = new ArrayList<>();

	static {
		for (AttendanceStatus status : AttendanceStatus.values()) {
			attendanceStatusList.add(EnumListing.of(status, status.getAttendanceStatus()));
		}
	}

	public static List<EnumListing<AttendanceStatus>> getAttendanceStatusList() {
		return attendanceStatusList;
	}

}
