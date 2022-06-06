package com.stanzaliving.wanda.enums;

import java.util.ArrayList;
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
	SELFBOOKING_COMMERCIAL_DETAILS(2, new ArrayList<>()),
	SELFBOOKING_PAYMENT(3, new ArrayList<>()),
	PAYMENT_PENDING(4, Arrays.asList("PAYMENT PENDING")),
	PAYMENT_COLLECTION_PENDING(5,Arrays.asList("COLLECT PAYMENT FROM RESIDENT")),
	ONBOARDING(6, Arrays.asList("AGREEMENT PENDING","AWAITING CONFIRMATION")),
	AGREEMENT(7, Arrays.asList("AGREEMENT SENT")),
	KYC(8, Arrays.asList("ONBOARDING PENDING", "ONBOARDING IN PROGRESS")),
	KYC_REJECTED(9,Arrays.asList("KYC REJECTED")),
	UPDATE_BY_SALES_POC(10, Arrays.asList("NEEDS ATTENTION")),
	HOMESCREEN(11, Arrays.asList("REFUND INITIATED","ONBOARDING COMPLETED","VERIFICATION PENDING")),
	SECOND_AGREEMENT(12,Arrays.asList("SUBCONTRACT 2 AGREEMENT SENT")),
	RETENTION_BOOKING(13,Arrays.asList("RETENTION BOOKING")),
	CONTRACT_MODIFICATION_PENDING(14,Arrays.asList("CONTRACT MODIFICATION PENDING")),
	SELFIE(15,Arrays.asList("SELFIE"));
	private Integer sequenceId;
	private List<String> bookingStatuses;

	private static final Map<AlfredStep, List<String>> bookingStatusMap = new HashMap<AlfredStep, List<String>>();
	private static final List<String> retentionNonBlockerStatus = new ArrayList<>();
	private static final Map<AlfredStep, List<String>> bookingSubStatusMap = new HashMap<AlfredStep, List<String>>();
	
	static {
		bookingSubStatusMap.put(PROFILE_COMPLETION, Arrays.asList("PROFILE"));
		bookingSubStatusMap.put(PAYMENT_PENDING, Arrays.asList("PAYMENT PENDING"));
		bookingSubStatusMap.put(PAYMENT_COLLECTION_PENDING, Arrays.asList("COLLECT PAYMENT FROM RESIDENT"));
		bookingSubStatusMap.put(KYC_REJECTED, Arrays.asList("KYC REJECTED"));
		bookingSubStatusMap.put(UPDATE_BY_SALES_POC, Arrays.asList("NEEDS ATTENTION"));
		bookingSubStatusMap.put(KYC_REJECTED, Arrays.asList("KYC REJECTED"));
		bookingSubStatusMap.put(HOMESCREEN, Arrays.asList("PENDING KYC VERIFICATION"));
		bookingSubStatusMap.put(KYC, Arrays.asList("PENDING KYC SUBMISSION"));
		bookingSubStatusMap.put(CONTRACT_MODIFICATION_PENDING, Arrays.asList("CONTRACT MODIFICATION PENDING"));
		bookingSubStatusMap.put(SELFIE, Arrays.asList("SELFIE"));
		bookingSubStatusMap.put(SELFBOOKING_COMMERCIAL_DETAILS, Arrays.asList("COMMERCIAL DETAILS PENDING"));
		bookingSubStatusMap.put(SELFBOOKING_PAYMENT, Arrays.asList("PAYMENT_PENDING"));
	}
	
	static {
		for (AlfredStep as : AlfredStep.values()) {
			bookingStatusMap.put(as, as.bookingStatuses);
		}
	}
	
	static {
		retentionNonBlockerStatus.addAll(Arrays.asList("EXPIRED","CANCELLED","DRAFT","IN PROGRESS","REFUND INITIATED","ONBOARDING COMPLETED",
				"VERIFICATION PENDING","ONBOARDING PENDING", "ONBOARDING IN PROGRESS"));
	}

	public static AlfredStep getByBookingStatus(String bookingStatus) {
		for (Map.Entry<AlfredStep, List<String>> entry : bookingStatusMap.entrySet()) {
			if (entry.getValue().contains(bookingStatus)) {
				return entry.getKey();
			}
		}
		return SELFBOOKING;
	}
	
	public static boolean checkRetentionScreen(String bookingStatus) {
		for (String status : retentionNonBlockerStatus) {
			if (status.equals(bookingStatus)) {
				return false;
			}
		}
		return true;
	}
	
	public static AlfredStep getAlfredStep(String bookingSubStatus) {
		
		for (Map.Entry<AlfredStep, List<String>> entry : bookingSubStatusMap.entrySet()) {
			if (entry.getValue().contains(bookingSubStatus)) {
				return entry.getKey();
			}
		}
		return SELFBOOKING;
	}

}