package com.stanzaliving.core.attendance.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum LeaveRequestStatus {
	PENDING("Pending"),
	APPROVED("Approved"),
	REJECTED("Rejected"),
	CANCELLED("Cancelled");


	private String leaveRequestStatus;

	private static List<EnumListing<LeaveRequestStatus>> requestTypes = new ArrayList<>();
	static {
		for(LeaveRequestStatus requestStatus: LeaveRequestStatus.values()){
			requestTypes.add(EnumListing.of(requestStatus, requestStatus.getLeaveRequestStatus()));
		}
	}

	public static  List<EnumListing<LeaveRequestStatus>> getRequestTypes(){
		return requestTypes;
	}
}
