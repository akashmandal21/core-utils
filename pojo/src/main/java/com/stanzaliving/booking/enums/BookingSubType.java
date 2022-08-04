package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingSubType {
	NEW("NEW"), RETENTION("RETENTION"), ALL("ALL");

	private String bookingStatus;

	public String getDescription() {
		return bookingStatus;
	}
}
