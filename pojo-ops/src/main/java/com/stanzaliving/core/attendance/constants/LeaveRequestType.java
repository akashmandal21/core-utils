package com.stanzaliving.core.attendance.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum LeaveRequestType {

	FULL_DAY("Full Day Leave"),
	LATE_ENTRY("Late Entry");

	private String leaveType;

	private static List<EnumListing<LeaveRequestType>> leaveTypes = new ArrayList<>();
	static {
		for(LeaveRequestType leaveRequestType: LeaveRequestType.values()){
			leaveTypes.add(EnumListing.of(leaveRequestType, leaveRequestType.getLeaveType()));
		}
	}

	public static  List<EnumListing<LeaveRequestType>> getLeaveTypes(){
		return leaveTypes;
	}
}

