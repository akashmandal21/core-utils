package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum BookingSubType {

	NEW("NEW"), RETENTION("RETENTION"), REPEAT("REPEAT"), ALL("ALL");

	private final String bookingStatus;

	public String getDescription() {
		return bookingStatus;
	}

	public static List<BookingSubType> renewalSubtypeList(){
		List<BookingSubType> renewalSubTypeList = new ArrayList<>();
		renewalSubTypeList.add(RETENTION);
		renewalSubTypeList.add(REPEAT);
		return renewalSubTypeList;
	}

}