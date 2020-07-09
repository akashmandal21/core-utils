package com.stanzaliving.wanda.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlfredStep {

	SELFBOOKING(Arrays.asList("PAYMENT PENDING" )),
	ONBOARDING(Arrays.asList("ONBOARDING PENDING","ONBOARDING IN PROGRESS","AGREEMENT SENT","AWAITING CONFIRMATION","ONBOARDING COMPLETED")),
	HOMESCREEN(Arrays.asList("REFUND INITIATED"));

	private List<String> bookingStatuses;

	private static final Map<AlfredStep, List<String>> bookingStatusMap = new HashMap<AlfredStep, List<String>>();

	static {
		for (AlfredStep as : AlfredStep.values()) {
			bookingStatusMap.put(as, as.bookingStatuses);
		}
	}

	public static AlfredStep getByBookingStatus(String bookingStatus) {
		for (Map.Entry<AlfredStep, List<String>> entry : bookingStatusMap.entrySet()) {
			if (entry.getValue().contains(bookingStatus)) {
				return entry.getKey();
			}
		}
		return SELFBOOKING;
	}

}