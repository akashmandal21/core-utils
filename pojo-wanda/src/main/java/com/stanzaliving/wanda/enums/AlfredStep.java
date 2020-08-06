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
	SELFBOOKING(1, Arrays.asList("SHARED WITH RESIDENT")),
	PAYMENT_PENDING(2, Arrays.asList("PAYMENT PENDING")),
	PAYMENT_COLLECTION_PENDING(3,Arrays.asList("COLLECT PAYMENT FROM RESIDENT")),
	ONBOARDING(4, Arrays.asList("AWAITING CONFIRMATION")),
	AGREEMENT(5, Arrays.asList("AGREEMENT SENT")),
	KYC(6, Arrays.asList("ONBOARDING PENDING", "ONBOARDING IN PROGRESS","VERIFICATION PENDING")),
	UPDATE_BY_SALES_POC(7, Arrays.asList("REFUND INITIATED")),
	HOMESCREEN(8, Arrays.asList("REFUND INITIATED"));

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