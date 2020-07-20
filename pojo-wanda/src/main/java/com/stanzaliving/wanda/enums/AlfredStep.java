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

	PROFILE_COMPLETION(0,Arrays.asList("PROFILE")),
	SELFBOOKING(1, Arrays.asList("AWAITING CONFIRMATION")),
	PAYMENT_PENDING(2, Arrays.asList("PAYMENT PENDING")),
	ONBOARDING(3, Arrays.asList("ONBOARDING PENDING", "ONBOARDING IN PROGRESS")),
	AGREEMENT(4, Arrays.asList("ONBOARDING COMPLETED")),
	KYC(5, Arrays.asList("AGREEMENT SENT")),
	UPDATE_BY_SALES_POC(6, Arrays.asList("REFUND INITIATED")),
	HOMESCREEN(7, Arrays.asList("REFUND INITIATED"));

	private Integer sequenceId;
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